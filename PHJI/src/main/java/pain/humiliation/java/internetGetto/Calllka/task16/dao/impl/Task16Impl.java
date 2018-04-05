package pain.humiliation.java.internetGetto.Calllka.task16.dao.impl;

import pain.humiliation.java.internetGetto.Calllka.task16.configuration.HibernateConfiguration;
import pain.humiliation.java.internetGetto.Calllka.task16.dao.ITask16;
import pain.humiliation.java.internetGetto.Calllka.task16.model.Users;

import java.util.List;

public class Task16Impl extends HibernateConfiguration implements ITask16 {

    @Override
    public void insertInToTheTable(Users userModel) {
        getSessionFactory().save(userModel);
        getSessionFactory().beginTransaction().commit();
    }

    @Override
    public void deleteUser(int id) {
        checkRange(id, false);

        getSessionFactory().delete(getSessionFactory().find(Users.class, id));
        getSessionFactory().beginTransaction().commit();
    }

    public void deleteAllFields(){
        int entitySize = getSessionFactory().createQuery("FROM Users").list().size();

        while (entitySize > 0){
            deleteUser(entitySize);

            entitySize--;
        }

        System.out.println("All fields was deleted");
    }

    @Override
    public void selectAllFromTable() {
        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        for (Users user : userList) {
            System.out.println(user);
        }
    }

    @Override
    public void selectInsterest(int id, boolean isSelectAll) {
        checkRange(id, isSelectAll);

        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        if(isSelectAll){
            for (Users users : userList){
                System.out.printf("Name of user: %s - %s", users.getName(), users.getInterestsId());
            }
        } else {
            System.out.printf("Name of user: %s - %s", userList.get(id).getName(), userList.get(id).getInterestsId());
        }
    }

    @Override
    public void selectWork(int id, boolean isSelectAll) {
        checkRange(id, isSelectAll);

        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        if(isSelectAll){
            for (Users users : userList){
                System.out.printf("Name of user: %s - %s", users.getName(), users.getWorkID());
            }
        } else {
            System.out.printf("Name of user: %s - %s", userList.get(id).getName(), userList.get(id).getWorkID());
        }
    }

    @Override
    public void selectSocialNetwork(int id, boolean isSelectAll) {
        checkRange(id, isSelectAll);

        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        if(isSelectAll){
            for (Users users : userList){
                System.out.printf("Name of user: %s - %s", users.getName(), users.getSocialNetworkId());
            }
        } else {
            System.out.printf("Name of user: %s - %s", userList.get(id).getName(), userList.get(id).getSocialNetworkId());
        }
    }

    @Override
    public void selectUserCredentials(int id, boolean isSelectAll) {
        checkRange(id, isSelectAll);

        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        if(isSelectAll){
            for (Users users : userList){
                System.out.printf("Name of user: %s - %s", users.getName(), users.getUserCredentialsId());
            }
        } else {
            System.out.printf("Name of user: %s - %s", userList.get(id).getName(), userList.get(id).getUserCredentialsId());
        }
    }

    private void checkRange(int id, boolean isSelectAll) {
        if(id < 0 && !isSelectAll){
            System.out.println("Id cannot be '0' or less");
        }
    }
}
