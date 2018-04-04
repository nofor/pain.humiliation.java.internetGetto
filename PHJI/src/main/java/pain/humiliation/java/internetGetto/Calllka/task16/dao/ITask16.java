package pain.humiliation.java.internetGetto.Calllka.task16.dao;

import pain.humiliation.java.internetGetto.Calllka.task16.model.User;

public interface ITask16 {

    void insertInToTheTable(User userModel);

    void deleteUser(int id);

    void selectAllFromTable();
}
