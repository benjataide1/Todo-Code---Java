import logic.Controladora;
import logic.User;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "svusers", urlPatterns = {"/SvUser"})
//? Cuando se ejecuta mi JSP y este esta conectado a un Servlet, se ejecuta o se muestra en la direccion "/SvUser""
public class SvUser extends HttpServlet {

    Controladora control = new Controladora();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //! Obtengo de mi Formulario HTML sus respectivos valores
        String dni = req.getParameter("dni"); //! Obtengo el valor del input 'dni' --> Para conectar y obtener el valor de dicho campo tengo que colocar su 'name =..'
        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        String phone = req.getParameter("phone");

        User user = new User(name,dni,lastname,phone);
        control.createUser(user);


        resp.sendRedirect("index.jsp"); //! Redirecciono o envio la respondo a un jsp


    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {


        List<User> userList = control.listUser();



        HttpSession mysession = req.getSession(); //! Clase especial para tomar la sesion del usuario que esta ejecutando la app web en el momento - Es como la identificacion del usuario
        mysession.setAttribute("userList",userList);

        resp.sendRedirect("showUser.jsp"); //! Redirecciono o envio la respondo a un jsp


    }
}
