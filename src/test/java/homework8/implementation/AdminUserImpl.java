package homework8.implementation;

import homework8.abstraction.AbstractUser;
import homework8.interfaces.AdminUser;
import homework8.interfaces.User;

public class AdminUserImpl extends AbstractUser implements AdminUser {
    @Override
    public void deleteUser(String username) {

    }

    @Override
    public User addUser(String username, boolean isAdmin) {
        return null;
    }

    @Override
    public void viewUsers() {

    }
}
