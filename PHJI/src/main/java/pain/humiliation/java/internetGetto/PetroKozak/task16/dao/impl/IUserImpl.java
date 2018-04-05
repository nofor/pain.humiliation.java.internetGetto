package pain.humiliation.java.internetGetto.PetroKozak.task16.dao.impl;

import pain.humiliation.java.internetGetto.PetroKozak.task16.configuration.HibernateConfigurationTask16;
import pain.humiliation.java.internetGetto.PetroKozak.task16.dao.IUser;
import pain.humiliation.java.internetGetto.PetroKozak.task16.models.User;

import java.util.List;

public class IUserImpl extends HibernateConfigurationTask16 implements IUser {
    @Override
    public void insert(User user) {
        getSession().persist(user.getWork().iterator().next());
        getSession().persist(user.getSocialNetworks().iterator().next());
        getSession().persist(user.getInterests().iterator().next());
        getSession().persist(user.getUserCredentials());
        getSession().persist(user.getUserCredentials().getUserPassword());
        getSession().save(user);
        getSession().beginTransaction().commit();
    }

    @Override
    public void delete(int id) {
        getSession().delete(getSession().find(User.class,id));
        getSession().beginTransaction().commit();
    }

    @Override
    public void select() {
        for (User user : getUserList()) {
            System.out.println(user);
        }
    }

    public void selectWorks(){
        for (User user : getUserList()) {
            System.out.println(user.getWork());
        }
    }

    public void selectInterests(){
        for (User user : getUserList()) {
            System.out.println(user.getInterests());
        }
    }

    public void selectSocialNetworks(){
        for (User user : getUserList()) {
            System.out.println(user.getInterests());
        }
    }

    public void selectUsersCredentials(){
        for (User user : getUserList()) {
            System.out.println(user.getUserCredentials());
        }
    }

    public void selectUsersPassword(){
        for (User user : getUserList()) {
            System.out.println(user.getUserCredentials().getUserPassword());
        }
    }
    private List<User> getUserList(){
        List<User> userList = getSession().createQuery("FROM users").list();
        return userList;
    }
}
