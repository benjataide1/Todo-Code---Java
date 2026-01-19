package Servlets.Odontologo;

import logic.Controller;
import logic.Odontologo;
import logic.User;

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


@WebServlet(name = "UpdateOdontologo", urlPatterns = {"/SvUpdateOdonto"})
public class SvUpdateOdontologo extends HttpServlet {

    Controller controller = new Controller();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        Odontologo odon = controller.findOdontologo(id);

        HttpSession mySession = req.getSession();
        mySession.setAttribute("updateOdon", odon);

        resp.sendRedirect("updateOdontologo.jsp");

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String lastName = req.getParameter("lastname");
            String dni = req.getParameter("dni");
            String phone = req.getParameter("phone");
            String address = req.getParameter("address");
            String dateString = req.getParameter("date");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date date = sdf.parse(dateString);
            String startTime = req.getParameter("scheduleStart");
            String endTime = req.getParameter("schedulEnd");
            String speciality = req.getParameter("speciality");
            int userId = Integer.parseInt(req.getParameter("userOdonto"));
            User user = controller.findUser(userId);

            Odontologo odo = (Odontologo) req.getSession().getAttribute("updateOdon");

            odo.setFirst_name(name);
            odo.setLast_name(lastName);
            odo.setDni(dni);
            odo.setPhone(phone);
            odo.setAddress(address);
            odo.setDate(date);
            odo.setSpeciality(speciality);
            odo.getSchedule().setStart_time(startTime);
            odo.getSchedule().setEnd_time(endTime);
            odo.setUser(user);


            controller.updateOdo(odo);

            resp.sendRedirect("registerOdonto");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
