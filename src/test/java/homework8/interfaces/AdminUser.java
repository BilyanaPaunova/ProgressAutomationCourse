package homework8.interfaces;

import homework8.interfaces.User;

public interface AdminUser extends User {
    void deleteUser(String username);
    User addUser(String username, boolean isAdmin);
    void viewUsers();

}
