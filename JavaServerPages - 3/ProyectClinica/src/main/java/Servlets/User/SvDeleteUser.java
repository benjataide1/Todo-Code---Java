package Servlets.User;

import logic.Controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(name = "SvDeleteUser", urlPatterns = {"/SvDeleteUser"})
public class SvDeleteUser extends HttpServlet {

    Controller controller = new Controller();

   @Override
   protected void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws IOException {
       int id = Integer.parseInt(req.getParameter("id"));

       controller.deleteUser(id);

       resp.sendRedirect("SvUser");
   }
}
