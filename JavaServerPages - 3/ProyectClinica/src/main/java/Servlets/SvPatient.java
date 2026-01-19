package Servlets;

import logic.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "SvPatient", value = "/SvPatient")
public class SvPatient extends HttpServlet {

    Controller controller = new Controller();


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
        String responsibleDni = req.getParameter("responsibleDNI");
        String responsibleAddress = req.getParameter("responsibleAddress");
        String responsiblePhone = req.getParameter("responsiblePhone");
        String responsibleDate = req.getParameter("responsibleDate");
        String responsibleType = req.getParameter("responsibleType");

        System.out.println(name + " " + lastname + " " + dni + " " + phone + " " + address + " " + date + " " + bloodGroup + " " + insurance + " " + responsibleName + " " + responsibleLastName + " " + responsibleDni + " " + responsibleAddress + " " + responsiblePhone + " " + responsibleDate + " " + responsibleType);

//        controller.createPatient(name,lastname,dni,phone,address,date,bloodGroup,insurance,responsibleName,responsibleLastName,responsibleDni,responsibleAddress,responsiblePhone,responsibleDate);


        resp.sendRedirect("index.jsp");
    }
}
