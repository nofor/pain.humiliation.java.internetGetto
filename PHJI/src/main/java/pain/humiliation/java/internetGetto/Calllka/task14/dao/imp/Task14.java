package pain.humiliation.java.internetGetto.Calllka.task14.dao.imp;

import pain.humiliation.java.internetGetto.Calllka.task14.dao.interfaces.MyInterfaceForTask14;
import pain.humiliation.java.internetGetto.Calllka.task14.tableModel.UserModel;
import pain.humiliation.java.internetGetto.Calllka.task14.utils.HibernateUtils;

import java.util.List;

public class Task14 extends HibernateUtils implements MyInterfaceForTask14 {

    public void insertInToTheTable(UserModel userModel) {
        getSessionFactory().save(userModel);
        getSessionFactory().beginTransaction().commit();
    }

    public void deleteUser(int id) {
        getSessionFactory().delete(getSessionFactory().find(UserModel.class, id));
        getSessionFactory().getTransaction().commit();
    }

    public void selectAllFromTable() {
        //getSessionFactory().beginTransaction();  //todo remove transaction
        List<UserModel> userList = getSessionFactory().createQuery("FROM UserModel").list();

        for (UserModel user : userList) {
            System.out.println(user);
        }
    }
}
