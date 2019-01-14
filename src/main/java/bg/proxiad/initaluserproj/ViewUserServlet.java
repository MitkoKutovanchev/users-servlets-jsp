package bg.proxiad.initaluserproj;

import bg.proxiad.initaluserproj.entities.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user/*")
public class ViewUserServlet extends HttpServlet {
  /** */
  private static final long serialVersionUID = -490556382306429124L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    ArrayList<User> users = (ArrayList<User>) getServletContext().getAttribute("users");
    RequestDispatcher dispatcher = req.getRequestDispatcher("/view-user.jsp");
    List<User> users2 =
        users
            .stream()
            .filter(u -> u.getId() == Integer.valueOf(req.getPathInfo().substring(1).trim()))
            .collect(Collectors.toList());
    if (users2.size() == 1) {
      req.setAttribute("user", users2.get(0));
      req.setAttribute("readonly", "readonly");
      req.setAttribute("action", "/users-servlets-jsp/users");
      req.setAttribute("method", "POST");
      req.setAttribute("btnValue", "Back to Users");
    } else {
    }
    dispatcher.forward(req, resp);
  }
}
