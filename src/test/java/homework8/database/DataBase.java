package homework8.database;

import homework8.interfaces.User;

public class DataBase {
    User[] dataBaseUsers;

    public DataBase(int userArrayMaxCount) {
        this.dataBaseUsers = new User[userArrayMaxCount];
    }

    public User[] getDataBaseUsers() {
        return dataBaseUsers;
    }


}
