
import java.sql.*;
import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/test";
    public static final String DB_Driver = "org.postgresql.Driver";

    static final String USER = "postgres";
    static final String PASSWORD = "SPORT1999sport";

    public static void main(String[] args){

            UserService userService = new UserService();
            User user = new User("Masha",26);
            userService.saveUser(user);
            Auto ferrari = new Auto("Ferrari", "red");
            ferrari.setUser(user);
            user.addAuto(ferrari);
            Auto ford = new Auto("Ford", "black");
            ford.setUser(user);
            user.addAuto(ford);
            userService.updateUser(user);
            user.setName("Sasha");
            userService.updateUser(user);
            userService.deleteUser(user);


    }
}
