package Servlets.Login;

import logic.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "SvLogin", urlPatterns = {"/Login"})
public class SvLogin extends HttpServlet {

    Controller controller = new Controller();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String password = req.getParameter("password");

        //? Necesitamos validar que los datos que nos llega son los correctos
        boolean validation = false;

        validation = controller.validationUser(user,password);

        if(validation == true){

            //? getSession me trae la session del usuario actualmente
            //? Como parametro le pasamos true por la sessiones validada, podemos pasar o ingresar
            HttpSession mysession = req.getSession(true);

            //? La session corresponde a este usuario 'user'
            mysession.setAttribute("user", user);
            resp.sendRedirect("index.jsp");
        }else {
            resp.sendRedirect("loginError.jsp");
        }

    }
}
