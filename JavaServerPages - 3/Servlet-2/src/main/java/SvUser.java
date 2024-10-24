import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "svusers", urlPatterns = {"/SvUser"}) //? Cuando se ejecuta mi JSP y este esta conectado a un Servlet, se ejecuta o se muestra la direccion "/SvUser""
public class SvUser extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //! Obtengo de mi Formulario HTML sus respectivos valores
        String dni = req.getParameter("dni"); //! Obtengo el valor del input 'dni' --> Para conectar y obtener el valor de dicho campo tengo que colocar su 'name =..'
        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        String phone = req.getParameter("phone");

        System.out.println("phone = " + phone);
        System.out.println("dni = " + dni);
        System.out.println("lastname = " + lastname);
        System.out.println("name = " + name);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
