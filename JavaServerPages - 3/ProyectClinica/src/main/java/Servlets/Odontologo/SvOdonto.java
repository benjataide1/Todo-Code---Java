package Servlets.Odontologo;

import logic.Controller;
import logic.Odontologo;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;


@WebServlet(name = "SvOdonto", urlPatterns = {"/registerOdonto"})
public class SvOdonto extends HttpServlet {

    Controller controller = new Controller();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        List<Odontologo> odontoList = controller.getOdonto();
        System.out.println(odontoList);

        HttpSession mySession = req.getSession();
        mySession.setAttribute("listOdonto", odontoList);

        resp.sendRedirect("showOdontologo.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        String dni = req.getParameter("DNI");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String dateString = req.getParameter("date");
        String specialilty = req.getParameter("especiality");
        String start_time = req.getParameter("scheduleBegin");
        String end_time = req.getParameter("scheduleEnd");
        int id = Integer.parseInt(req.getParameter("userOdonto"));


        try {
            controller.createOdontologo(name,lastname,dni,phone,address,dateString,specialilty,start_time,end_time,id);
            resp.sendRedirect("index.jsp");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
