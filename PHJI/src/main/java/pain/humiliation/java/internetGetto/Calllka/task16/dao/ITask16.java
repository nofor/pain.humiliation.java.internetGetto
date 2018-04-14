package pain.humiliation.java.internetGetto.Calllka.task16.dao;

import pain.humiliation.java.internetGetto.Calllka.task16.model.Users;

/**
 * The following Interface will be used for doing the operations with the Database as part of task16.
 *
 * @author calllka
 * @version 1.0
 * @since 4.4.2018
 */
public interface ITask16 {

    void insertInToTheTable(Users userModel);

    void deleteUser(int id);

    void deleteAllFields();

    void selectAllFromTable();

    void selectInsterest(int id, boolean isSelectAll);

    void selectWork(int id, boolean isSelectAll);

    void selectSocialNetwork(int id, boolean isSelectAll);

    void selectUserCredentials(int id, boolean isSelectAll);
}
