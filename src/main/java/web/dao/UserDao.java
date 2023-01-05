package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);

//    void deleteUsers();

    List<User> getUsers();

    User getUserById(Integer id);
}
