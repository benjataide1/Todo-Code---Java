package Servlets.Shift;

import logic.Controller;
import logic.Shift;

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

@WebServlet(name = "SvUpdateShift", urlPatterns = "/updateShift")
public class SvUpdateShift extends HttpServlet {
    Controller controller = new Controller();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Shift shift = controller.findShift(Integer.parseInt(req.getParameter("id")));

        HttpSession mySession = req.getSession();
        mySession.setAttribute("updateshift", shift);

        resp.sendRedirect("updateShift.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        try {
            Shift shift = (Shift) req.getSession().getAttribute("updateshift");

            shift.setAfeccion(req.getParameter("affection"));

            String dateString = req.getParameter("date");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(dateString);

            shift.setDate(date);
            shift.setShift_hours(req.getParameter("hour"));
            shift.setOdontologo(controller.findOdontologo(Integer.parseInt(req.getParameter("userOdonto"))));
            shift.setPatient(controller.findPatient(Integer.parseInt(req.getParameter("userPatient"))));

            controller.updateShift(shift);
            resp.sendRedirect("SvShift");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
