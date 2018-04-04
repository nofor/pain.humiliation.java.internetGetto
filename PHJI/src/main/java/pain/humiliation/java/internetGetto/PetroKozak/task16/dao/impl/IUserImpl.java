package pain.humiliation.java.internetGetto.PetroKozak.task16.dao.impl;

import pain.humiliation.java.internetGetto.PetroKozak.task16.configuration.HibernateConfigurationTask16;
import pain.humiliation.java.internetGetto.PetroKozak.task16.dao.IUser;
import pain.humiliation.java.internetGetto.PetroKozak.task16.models.User;

import java.util.List;

public class IUserImpl extends HibernateConfigurationTask16 implements IUser {
    @Override
    public void insert(User user) {
        getSession().save(user);
        getSession().beginTransaction().commit();
    }

    @Override
    public void delete(long id) {
        getSession().delete(getSession().find(User.class,id));
        getSession().beginTransaction().commit();
    }

    @Override
    public void select() {
        List<User> userList = getSession().createQuery("FROM Model").list();

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
