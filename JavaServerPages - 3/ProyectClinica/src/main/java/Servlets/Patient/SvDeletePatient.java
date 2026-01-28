package Servlets.Patient;

import logic.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SvDeletePatient", urlPatterns = {"/DeletePatient"})
public class SvDeletePatient extends HttpServlet {

    Controller controller = new Controller();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        controller.deletePatient(id);

        resp.sendRedirect("SvPatient");

    }
}
