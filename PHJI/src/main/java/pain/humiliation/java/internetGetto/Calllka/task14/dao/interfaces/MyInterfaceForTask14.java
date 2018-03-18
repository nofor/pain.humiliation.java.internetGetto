package pain.humiliation.java.internetGetto.Calllka.task14.dao.interfaces;

import pain.humiliation.java.internetGetto.Calllka.task14.tableModel.UserModel;

public interface MyInterfaceForTask14 {

    void insertInToTheTable(UserModel userModel);

    void deleteUser(int id);

    void selectAllFromTable();
}
