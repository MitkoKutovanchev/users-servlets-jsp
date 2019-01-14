package bg.proxiad.initaluserproj;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class AllUsersServlet extends HttpServlet {
  /** */
  private static final long serialVersionUID = 4298218423726282522L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.setAttribute("users", getServletContext().getAttribute("users"));
    RequestDispatcher dispatcher = req.getRequestDispatcher("/list-users.jsp");
    dispatcher.forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    resp.sendRedirect("/users-servlets-jsp/users");
  }
}
