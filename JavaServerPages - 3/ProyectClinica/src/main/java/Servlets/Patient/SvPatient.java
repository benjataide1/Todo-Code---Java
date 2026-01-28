package Servlets.Patient;

import logic.Controller;
import logic.Patient;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;


@WebServlet(name = "SvPatient", urlPatterns = {"/SvPatient"})
public class SvPatient extends HttpServlet {

    Controller controller = new Controller();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Patient> patients = controller.getPatients();

        HttpSession mySession = req.getSession();
        mySession.setAttribute("patient", patients);

        resp.sendRedirect("showPatient.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        String dni = req.getParameter("DNI");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String date = req.getParameter("date");
        String bloodGroup = req.getParameter("bloodGroup");
        boolean insurance = Boolean.parseBoolean(req.getParameter("insurance"));

        String responsibleName = req.getParameter("responsibleFirstName");
        String responsibleLastName = req.getParameter("responsibleLastName");
        String responsibleDni = req.getParameter("inputResponsibleDNI");
        String responsibleAddress = req.getParameter("responsibleAddress");
        String responsiblePhone = req.getParameter("responsiblePhone");
        String responsibleDate = req.getParameter("responsibleDate");
        String responsibleType = req.getParameter("responsibleType");


        try {
            controller.createPatient(name,lastname,dni,phone,address,date,bloodGroup,insurance,responsibleName,responsibleLastName,responsibleDni,responsibleAddress,responsiblePhone,responsibleDate,responsibleType);
        } catch (ParseException e) {
           e.getCause();
           e.getMessage();
        }


        resp.sendRedirect("index.jsp");
    }
}
