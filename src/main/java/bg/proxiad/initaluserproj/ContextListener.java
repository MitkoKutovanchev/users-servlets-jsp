package bg.proxiad.initaluserproj;

import bg.proxiad.initaluserproj.entities.Seed;
import bg.proxiad.initaluserproj.entities.User;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    ArrayList<User> users = Seed.seedUsers();
    sce.getServletContext().setAttribute("users", users);
  }
}
