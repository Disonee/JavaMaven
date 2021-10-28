package ru.sapteh;

import ru.sapteh.dao.Dao;
import ru.sapteh.dao.impl.UserDaoImpl;
import ru.sapteh.model.User;
import ru.sapteh.util.Connector;

import java.sql.Connection;

public class Test {
    public static void main (String[]args) {
        Connection connection = Connector.getInstance();
        Dao<User, Long> userIntegerDao = new UserDaoImpl(connection);

        System.out.println(userIntegerDao.findById(1L));

        User user = userIntegerDao.findById(2L);
        user.setFirstName("Маша");
        user.setLastName("Владимировна");
        userIntegerDao.update(user);

        User user1 = new User("Никита", "Олегович");
        userIntegerDao.save(user1);

        userIntegerDao.deleteById(3L);

        userIntegerDao.findAll().forEach(System.out::println);

    }

}
