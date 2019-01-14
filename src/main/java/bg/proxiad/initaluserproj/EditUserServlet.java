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

@WebServlet("/edit/*")
public class EditUserServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    ArrayList<User> users = (ArrayList<User>) getServletContext().getAttribute("users");
    List<User> users2 =
        users
            .stream()
            .filter(u -> u.getId() == Integer.valueOf(req.getPathInfo().substring(1).trim()))
            .collect(Collectors.toList());
    if (users2.size() == 1) {
      RequestDispatcher dispatcher = req.getRequestDispatcher("/edit-user.jsp");
      req.setAttribute("user", users2.get(0));
      req.setAttribute("action", "/users-servlets-jsp/edit/*");
      req.setAttribute("method", "POST");
      req.setAttribute("btnValue", "Update User");
      dispatcher.forward(req, resp);
    } else {

    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws IOException, ServletException {
    ArrayList<User> users = (ArrayList<User>) getServletContext().getAttribute("users");

    for (User user : users) {
      if (user.getId() == Integer.valueOf(req.getParameter("id"))) {
        user.setName(req.getParameter("name"));
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));
        user.setId(Integer.valueOf(req.getParameter("id")));
      }
      getServletContext().setAttribute("users", users);
      if (!resp.isCommitted()) resp.sendRedirect("/users-servlets-jsp/users");
    }
  }
}
