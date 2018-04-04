package pain.humiliation.java.internetGetto.Calllka.task16.dao.impl;

import pain.humiliation.java.internetGetto.Calllka.task16.configuration.HibernateConfiguration;
import pain.humiliation.java.internetGetto.Calllka.task16.dao.ITask16;
import pain.humiliation.java.internetGetto.Calllka.task16.model.User;

import java.util.List;

public class Task16 extends HibernateConfiguration implements ITask16 {

    public void insertInToTheTable(User userModel) {
        getSessionFactory().save(userModel);
        getSessionFactory().beginTransaction().commit();
    }

    public void deleteUser(int id) {
        getSessionFactory().delete(getSessionFactory().find(User.class, id));
        getSessionFactory().beginTransaction().commit();
    }

    @Override
    public void selectAllFromTable() {
        List<User> userList = getSessionFactory().createQuery("FROM User").list();

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
