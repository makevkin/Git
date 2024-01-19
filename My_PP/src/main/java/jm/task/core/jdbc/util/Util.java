package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/dbtest";
    private static final String USERNAME = "makevkin";
    private static final String PASSWORD = "root";

    public static Connection getConnect() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(URL,USERNAME, PASSWORD);
            System.out.println("Соединение установлено");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
