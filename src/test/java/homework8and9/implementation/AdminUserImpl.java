package homework8and9.implementation;

import homework8and9.abstraction.AbstractUser;
import homework8and9.interfaces.AdminUser;
import homework8and9.interfaces.User;

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
