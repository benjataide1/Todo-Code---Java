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
import java.util.List;

@WebServlet(name = "SvShift", urlPatterns = {"/SvShift"})
public class SvShift extends HttpServlet {

    Controller controller = new Controller();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Shift> shifts = controller.getShifts();

        HttpSession mySession = req.getSession();
        mySession.setAttribute("shifts", shifts);

        resp.sendRedirect("showShifts.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String affecion = req.getParameter("affecion");
        String date = req.getParameter("date");
        String hour = req.getParameter("hour");

        int id_odo = Integer.parseInt(req.getParameter("userOdonto"));
        int id_patient = Integer.parseInt(req.getParameter("userPatient"));

        try {
            controller.createShift(affecion,date,hour,id_odo,id_patient);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        resp.sendRedirect("index.jsp");
    }
}
