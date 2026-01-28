package Servlets.Patient;

import logic.Controller;
import logic.Patient;
import logic.Responsible;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "SvUpdatePatient", urlPatterns = "/UpdatePatient")
public class SvUpdatePatient extends HttpServlet {

    Controller controller = new Controller();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        Patient patient = controller.findPatient(id);

        HttpSession mySession = req.getSession();
        mySession.setAttribute("updatePatient", patient);

        resp.sendRedirect("updatePatient.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        try {

            Patient patient = (Patient) req.getSession().getAttribute("updatePatient");

            String name = req.getParameter("name");
            String lastname = req.getParameter("lastname");
            String dni = req.getParameter("dni");
            String phone = req.getParameter("phone");
            String address = req.getParameter("address");
            String dateString = req.getParameter("date");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(dateString);
            Boolean medium_insurance = Boolean.parseBoolean(req.getParameter("medium_insurance"));
            Responsible responsible = controller.findResponsible(Integer.parseInt(req.getParameter("responsible")));
            String blood_group = req.getParameter("bloodGroup");

            patient.setFirst_name(name);
            patient.setLast_name(lastname);
            patient.setDni(dni);
            patient.setPhone(phone);
            patient.setAddress(address);
            patient.setDate(date);
            patient.setMedium_insurance(medium_insurance);
            patient.setResponsible(responsible);
            patient.setBlood_group(blood_group);

            controller.updatePatient(patient);

            resp.sendRedirect("SvPatient");


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
