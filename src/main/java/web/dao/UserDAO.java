package web.dao;
import web.model.User;
import java.util.List; //попробуй прожать контральтэль

public interface UserDAO {

    List<User>getAllUsers ();
    User getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(long id, User user);
}