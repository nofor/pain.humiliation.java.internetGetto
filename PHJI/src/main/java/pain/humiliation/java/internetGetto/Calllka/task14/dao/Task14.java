package pain.humiliation.java.internetGetto.Calllka.task14.dao;

import pain.humiliation.java.internetGetto.Calllka.task14.model.UserModel;  //todo do not need create separate package for interfaces DONE

public interface Task14 {  //todo rename correctly

    void insertInToTheTable(UserModel userModel);

    void deleteUser(int id);

    void selectAllFromTable();
}
