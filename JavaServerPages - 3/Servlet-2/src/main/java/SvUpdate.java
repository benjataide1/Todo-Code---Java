import logic.Controller;
import logic.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

@WebServlet(name = "svupdate", urlPatterns = "/SvUpdate")
public class SvUpdate extends HttpServlet {
    Controller controller = new Controller();


    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

        int id_update = Integer.parseInt(request.getParameter("id_userUp"));
        User user = controller.getUser(id_update);

        HttpSession mysession = request.getSession(); //! Cuando busco mi id, esta session o clase que se ejecuta en el momento, guarda en una variable de session el id encontrado, sirve para cuando cambio a otro jsp o redirecciono se mantenga el id y no se borreo o cambie por otro
        mysession.setAttribute("userUpdate", user);

        response.sendRedirect("update.jsp");
    }

    public void doPost(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

        String dni = req.getParameter("dni"); //! Obtengo el valor del input 'dni' --> Para conectar y obtener el valor de dicho campo tengo que colocar su 'name =..'
        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        String phone = req.getParameter("phone");

        User user = (User) req.getSession().getAttribute("userUpdate");

        user.setName(name);
        user.setLastname(lastname);
        user.setPhone(phone);
        user.setDni(dni);

        controller.updateUser(user);

        response.sendRedirect("index.jsp");


    }

}
