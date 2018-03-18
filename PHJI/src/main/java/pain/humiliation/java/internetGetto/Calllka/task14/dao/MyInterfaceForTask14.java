package pain.humiliation.java.internetGetto.Calllka.task14.dao;

import pain.humiliation.java.internetGetto.Calllka.task14.tableModel.UserModel;  //todo do not need create separate package for interfaces DONE

public interface MyInterfaceForTask14 {

    void insertInToTheTable(UserModel userModel);

    void deleteUser(int id);

    void selectAllFromTable();
}
