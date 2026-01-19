package Servlets.Odontologo;

import logic.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SvDeleteOdontolo", urlPatterns = {"/SvDeleteOdo"})
public class SvDeleteOdo extends HttpServlet {

    Controller controller = new Controller();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        controller.deleteOdonto(id);

        resp.sendRedirect("registerOdonto");
    }
}
