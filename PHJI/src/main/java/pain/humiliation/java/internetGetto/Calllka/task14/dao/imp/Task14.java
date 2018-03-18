package pain.humiliation.java.internetGetto.Calllka.task14.dao.imp;

import pain.humiliation.java.internetGetto.Calllka.task14.dao.MyInterfaceForTask14;
import pain.humiliation.java.internetGetto.Calllka.task14.tableModel.UserModel;
import pain.humiliation.java.internetGetto.Calllka.task14.utils.HibernateConfiguration;

import java.util.List;

public class Task14 extends HibernateConfiguration implements MyInterfaceForTask14 {

    public void insertInToTheTable(UserModel userModel) {
        getSessionFactory().save(userModel);
        getSessionFactory().beginTransaction().commit();
    }

    public void deleteUser(int id) {
        getSessionFactory().delete(getSessionFactory().find(UserModel.class, id));
        getSessionFactory().beginTransaction().commit();
    }

    public void selectAllFromTable() {  //todo remove transaction DONE
        List<UserModel> userList = getSessionFactory().createQuery("FROM UserModel").list();

        for (UserModel user : userList) {
            System.out.println(user);
        }
    }
}
