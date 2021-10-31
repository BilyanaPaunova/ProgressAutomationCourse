package homework8and9.interfaces;

public interface AdminUser extends User {
    void deleteUser(String username);
    User addUser(String username, boolean isAdmin);
    void viewUsers();

}
