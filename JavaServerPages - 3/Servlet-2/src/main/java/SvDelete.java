import logic.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
 
@WebServlet(name = "svdelete", urlPatterns = "/SvDelete")
public class SvDelete extends HttpServlet {
    Controller controller = new Controller();


    @Override 
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id_user"));

        controller.deleteUser(id);

        resp.sendRedirect("index.jsp");
    }
}
