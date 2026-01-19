package Servlets.User;

import logic.Controller;
import logic.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SvUser", urlPatterns = {"/SvUser"})
public class SvUser extends HttpServlet {

    Controller controller = new Controller();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> userList = controller.getUsers();

        // Obetenemos la session actual y le asignamos como valor la 'userList' sirve para enviar como respuesta al front-end o request la lista de usuarios
        HttpSession mySession = req.getSession();
        mySession.setAttribute("listUsu", userList);

        // Rendericionamos al jsp junto con la "Session" que ahi va la lista de User (o sea la respond)
        resp.sendRedirect("showUser.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String rol = req.getParameter("rol");

        controller.createUser(name, password, rol);

        resp.sendRedirect("index.jsp");


    }
}
