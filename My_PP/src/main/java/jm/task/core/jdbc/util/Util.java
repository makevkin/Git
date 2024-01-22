package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import jm.task.core.jdbc.model.User;
import org.hibernate.cfg.Configuration;

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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    // Hibenate
    private static SessionFactory sessionFactory;

    private static Connection connection;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbtest";

    private static final String DB_USERNAME = "makevkin";

    private static final String DB_PASSWORD = "root";

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration()
                        .addAnnotatedClass(User.class);
                sessionFactory = configuration.buildSessionFactory();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return sessionFactory;
    }
}
