package bg.proxiad.initaluserproj;

import bg.proxiad.initaluserproj.entities.User;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class AddUserServlet extends HttpServlet {

  /** */
  private static final long serialVersionUID = 274070900764872929L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    RequestDispatcher dispatcher = req.getRequestDispatcher("/add-user.jsp");
    req.setAttribute("action", "/users-servlets-jsp/user");
    req.setAttribute("method", "POST");
    req.setAttribute("btnValue", "Add User");
    dispatcher.forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    User newUser =
        new User(
            req.getParameter("name").toString(),
            req.getParameter("email").toString(),
            req.getParameter("password").toString());

    ArrayList<User> users = (ArrayList<User>) getServletContext().getAttribute("users");
    users.add(newUser);
    getServletContext().setAttribute("users", users);
    resp.sendRedirect("/users-servlets-jsp/users");
  }
}
