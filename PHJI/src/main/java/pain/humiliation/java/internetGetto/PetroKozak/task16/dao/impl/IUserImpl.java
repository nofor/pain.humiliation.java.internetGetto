package pain.humiliation.java.internetGetto.PetroKozak.task16.dao.impl;

import pain.humiliation.java.internetGetto.PetroKozak.task16.configuration.HibernateConfigurationTask16;
import pain.humiliation.java.internetGetto.PetroKozak.task16.dao.IUser;
import pain.humiliation.java.internetGetto.PetroKozak.task16.models.User;

import java.util.List;

/**
 * The following class in an implementation of the class IUser
 * It contains also his own methods for selecting according to the different parameters.
 *
 * @author Petro Kozak
 * @version 1.0
 * @since 12.4.2018
 * @see IUser
 */
public class IUserImpl extends HibernateConfigurationTask16 implements IUser {

    /**
     * This method is created for inserting the User class instance and simultaneous
     * inserting of all the instances that User model is related with.
     *
     * Previous persisting of all of the related instances and field is needed to
     * avoid the TransientObjectException because of the unsaved references of instances being inserted.
     *
     * @param user is the instance of the User -class that we get as the incoming parameter to save in the DB
     * @see User
     */
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

    /**
     * This method deletes the model from database using id to select it.
     *
     * @param id the id of the User - instance that we want to delete
     */
    @Override
    public void delete(int id) {
        getSession().delete(getSession().find(User.class,id));
        getSession().beginTransaction().commit();
    }

    /**
     * This method makes the output of all of the fields of the following model on every iteration
     * of the List of User - models, which is created by the getUserList() method
     *
     * @see IUserImpl#getUserList()
     */
    @Override
    public void select() {
        for (User user : getUserList()) {
            System.out.println(user);
        }
    }

    /**
     * This method makes the output of the field "work" of the following model on every iteration
     * of the List of User - models, which is created by the getUserList() method
     *
     * @see IUserImpl#getUserList()
     */
    public void selectWorks(){
        for (User user : getUserList()) {
            System.out.println(user.getWork());
        }
    }

    /**
     * This method makes the output of the field "interests" of the following model on every iteration
     * of the List of User - models, which is created by the getUserList() method
     *
     * @see IUserImpl#getUserList()
     */
    public void selectInterests(){
        for (User user : getUserList()) {
            System.out.println(user.getInterests());
        }
    }

    /**
     * This method makes the output of the field "socialNetworks" of the following model on every iteration
     * of the List of User - models, which is created by the getUserList() method
     *
     * @see IUserImpl#getUserList()
     */
    public void selectSocialNetworks(){
        for (User user : getUserList()) {
            System.out.println(user.getInterests());
        }
    }

    /**
     * This method makes the output of the field "userCredentials" of the following model on every iteration
     * of the List of User - models, which is created by the getUserList() method
     *
     * @see IUserImpl#getUserList()
     */
    public void selectUsersCredentials(){
        for (User user : getUserList()) {
            System.out.println(user.getUserCredentials());
        }
    }

    /**
     * This method makes the output of the field "userPassword" from the field "UserCrdentials"
     * of the following model on every iteration of the List of User - models, which is created by the getUserList() method
     *
     * @see IUserImpl#getUserList()
     */
    public void selectUsersPassword(){
        for (User user : getUserList()) {
            System.out.println(user.getUserCredentials().getUserPassword());
        }
    }

    /**
     * This method creates the List of all User - model being inserted into the Database.
     * @return <code>List</code> if th operation is done successfully.
     */
    private List<User> getUserList(){
        List<User> userList = getSession().createQuery("FROM users").list();
        return userList;
    }
}
