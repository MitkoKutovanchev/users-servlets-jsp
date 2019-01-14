package bg.proxiad.initaluserproj.entities;

import java.util.ArrayList;

public class Seed {
  public static ArrayList<User> seedUsers() {
    ArrayList<User> users = new ArrayList<User>();
    users.add(new User("Ivan", "ivan@gmail.com", "123554"));
    users.add(new User("Dragan", "dragan@abv.bg", "asddsa"));
    users.add(new User("Peter", "peter@randommail.com", "qwerty"));
    users.add(new User("Mitaka", "mktovanchev@gmail.com", "789456"));
    return users;
  }
}
