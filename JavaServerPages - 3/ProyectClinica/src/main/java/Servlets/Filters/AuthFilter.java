package Servlets.Filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Filtro de autenticación centralizado.
 *
 * Qué resuelve:
 * - Evita que un usuario sin sesión acceda escribiendo a mano URLs como /index.jsp.
 * - Deja pasar sólo páginas públicas (login/errores) y recursos estáticos (css/js/assets).
 * - Si no está autenticado, redirige a sinLogin.jsp.
 *
 * Contrato de sesión:
 * - Se considera "logueado" si existe session.getAttribute("user").
 */
public class AuthFilter implements Filter {

    // Clave de sesión que setea SvLogin cuando las credenciales son correctas.
    private static final String SESSION_KEY = "user";

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // Cast a HTTP para poder leer URL, sesión y redirigir.
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        // Context path = nombre de la app (ej: /ProyectClinica)
        // RequestURI = ruta completa (ej: /ProyectClinica/index.jsp)
        // Path final = ruta dentro de la app (ej: /index.jsp)
        String contextPath = req.getContextPath();
        String uri = req.getRequestURI();
        String path = uri.substring(contextPath.length());

        // Trae la sesión si existe (false evita crear una nueva sesión vacía)
        HttpSession session = req.getSession(false);
        Object sessionUser = (session == null) ? null : session.getAttribute(SESSION_KEY);

        // 1) Si es ruta pública -> no pedimos login
        boolean isPublic = isPublicPath(path);
        // 2) Si hay atributo "user" -> consideramos autenticado
        boolean loggedIn = sessionUser != null;

        // Log de diagnóstico (útil mientras desarrollás)
        System.out.println("[AuthFilter] " + req.getMethod() + " " + path +
                " | public=" + isPublic +
                " | session=" + (session != null) +
                " | user=" + (sessionUser != null ? sessionUser : "null"));

        if (isPublic) {
            // Deja pasar a login.jsp / sinLogin.jsp / loginError.jsp, etc.
            chain.doFilter(request, response);
            return;
        }

        if (loggedIn) {
            // Usuario autenticado: puede navegar normalmente.
            chain.doFilter(request, response);
            return;
        }

        // Usuario NO autenticado: lo mandamos a una página informativa.
        // Importante: se usa contextPath para que funcione con cualquier nombre de app.
        System.out.println("[AuthFilter] REDIRECT -> /sinLogin.jsp (not authenticated)");
        resp.sendRedirect(contextPath + "/sinLogin.jsp");
    }

    @Override
    public void destroy() {
        // No hay recursos que liberar.
    }

    /**
     * Define qué rutas deben ser accesibles sin sesión.
     * - Páginas públicas (login/error)
     * - Endpoint del servlet de login (/Login)
     * - Recursos estáticos (css/js/assets/img)
     */
    private boolean isPublicPath(String path) {
        // La raíz "/" la maneja el welcome-file del web.xml
        if (path == null || path.isEmpty() || "/".equals(path)) {
            return true;
        }

        // Páginas públicas
        if (path.equalsIgnoreCase("/login.jsp")
                || path.equalsIgnoreCase("/loginError.jsp")
                || path.equalsIgnoreCase("/sinLogin.jsp")) {
            return true;
        }

        // Servlet de login (POST desde el form)
        if (path.equalsIgnoreCase("/Login")) {
            return true;
        }

        // Archivos estáticos
        return path.startsWith("/css/")
                || path.startsWith("/js/")
                || path.startsWith("/assets/")
                || path.startsWith("/img/")
                || path.startsWith("/components/")
                || path.equalsIgnoreCase("/favicon.ico");
    }
}
