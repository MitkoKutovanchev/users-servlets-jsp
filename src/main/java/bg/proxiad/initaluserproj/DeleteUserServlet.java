package bg.proxiad.initaluserproj;

import bg.proxiad.initaluserproj.entities.User;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete/*")
public class DeleteUserServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    ArrayList<User> users = (ArrayList<User>) getServletContext().getAttribute("users");
    User tempUser = new User();
    for (User user : users) {
      if (user.getId() == Integer.valueOf(req.getPathInfo().substring(1).trim())) {
        tempUser = user;
      }
    }
    users.remove(tempUser);
    getServletContext().setAttribute("users", users);
    resp.sendRedirect("/users-servlets-jsp/users");
  }
}
