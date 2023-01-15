package app.springboot.service;

import app.springboot.model.User;
import java.util.List;

public interface UserService {

    List<User> listUsers();

    void saveUser(User user);

    User findUserById(Long id);

    User updateUser(User user);

    void deleteUserById(Long id);
}
