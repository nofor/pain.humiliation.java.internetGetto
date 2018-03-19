package pain.humiliation.java.internetGetto.Calllka.task14.dao.imp;

import pain.humiliation.java.internetGetto.Calllka.task14.dao.Task14;
import pain.humiliation.java.internetGetto.Calllka.task14.model.UserModel;
import pain.humiliation.java.internetGetto.Calllka.task14.configuration.HibernateConfiguration;

import java.util.List;

public class Task14Impl extends HibernateConfiguration implements Task14 {

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
