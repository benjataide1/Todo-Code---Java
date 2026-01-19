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


@WebServlet(name = "SvUpdateUser", urlPatterns = {"/SvUpdateUser"})
public class SvUpdateUser extends HttpServlet {

    Controller controller = new Controller();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        User user = controller.findUser(id);

        // Obetenemos la session actual y le asignamos como valor la 'userList' sirve para enviar como respuesta al front-end o request la lista de usuarios
        HttpSession mySession = req.getSession();
        mySession.setAttribute("updateUser", user);

        // Rendericionamos al jsp junto con la "Session" que ahi va la lista de User (o sea la respond)
        resp.sendRedirect("updateUser.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String rol = req.getParameter("rol");


        User user = (User) req.getSession().getAttribute("updateUser");

        user.setName_user(name);
        user.setPassword_user(password);
        user.setRole_user(rol);

        controller.updateUser(user);

        resp.sendRedirect("SvUser");

    }
}
