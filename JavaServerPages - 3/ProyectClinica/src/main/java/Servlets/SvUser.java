package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SvUser", urlPatterns = {"/SvUser"})
public class SvUser extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("nombre");
        String password = req.getParameter("password");
        String rol = req.getParameter("rol");

        System.out.println(name);
        System.out.println(password);
        System.out.println(rol);
        resp.sendRedirect("index.jsp");


    }
}
