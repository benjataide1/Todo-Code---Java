package Servlets;

import logic.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SvUser", urlPatterns = {"/SvUser"})
public class SvUser extends HttpServlet {

    Controller controller = new Controller();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String rol = req.getParameter("rol");

        controller.createUser(name,password,rol);

        System.out.println(name);
        System.out.println(password);
        System.out.println(rol);


        HttpSession session = req.getSession();
        System.out.println(session);

        session.setAttribute("usuario", "Suscribite TodoCode");
        session.setAttribute("roll", "ADMIN");


        String usuario = (String) session.getAttribute("usuario");
        String roll = (String) session.getAttribute("rol");






        resp.sendRedirect("index.jsp");


    }
}
