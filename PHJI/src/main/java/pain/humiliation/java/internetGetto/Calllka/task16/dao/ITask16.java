package pain.humiliation.java.internetGetto.Calllka.task16.dao;

import pain.humiliation.java.internetGetto.Calllka.task16.model.Users;

public interface ITask16 {

    void insertInToTheTable(Users userModel);

    void deleteUser(int id);

    void selectAllFromTable();

    void selectInsterest(int id, boolean isSelectAll);

    void selectWork(int id, boolean isSelectAll);

    void selectSocialNetwork(int id, boolean isSelectAll);

    void selectUserCredentials(int id, boolean isSelectAll);
}
