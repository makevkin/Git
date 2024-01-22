package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь

        UserService userDao = new UserServiceImpl();

        userDao.createUsersTable();

        userDao.saveUser("Сергей", "Петров", (byte) 20);
        userDao.saveUser("Юрий", "Иванов", (byte) 25);
        userDao.saveUser("Ольга", "Соколова", (byte) 31);
        userDao.saveUser("Иван", "Тихонов", (byte) 38);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();

    }
}
