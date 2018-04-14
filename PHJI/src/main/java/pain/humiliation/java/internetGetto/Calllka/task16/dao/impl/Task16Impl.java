package pain.humiliation.java.internetGetto.Calllka.task16.dao.impl;

import pain.humiliation.java.internetGetto.Calllka.task16.configuration.HibernateConfiguration;
import pain.humiliation.java.internetGetto.Calllka.task16.dao.ITask16;
import pain.humiliation.java.internetGetto.Calllka.task16.model.Users;

import java.util.List;

/**
 * Task 16. Output information from database with @OneToOne or OneToMany relationships.
 * This class serves to insert data in to DB, delete one or all fields from DB,
 * output of all users information or a specific linked table.
 *
 * @author calllka
 * @version 1.0
 * @since 4.4.2018
 */
public class Task16Impl extends HibernateConfiguration implements ITask16 {

    /**
     * This method is used to insert data into DB
     *
     * @param userModel the userModel to be saved in DB
     */
    @Override
    public void insertInToTheTable(Users userModel) {
        getSessionFactory().save(userModel);
        getSessionFactory().beginTransaction().commit();
    }

    /**
     * This method is used to delete one of user from DB.
     * If you need to delete all data about user form DB,
     * take the ID number from main table(Users), and write them into input @param id
     *
     * @param id the identity number of user in main table
     */
    @Override
    public void deleteUser(int id) {
        checkRange(id, false);

        getSessionFactory().delete(getSessionFactory().find(Users.class, id));
        getSessionFactory().beginTransaction().commit();
    }

    /**
     * This method is used to delete all users
     */
    @Override
    public void deleteAllFields() {
        int entitySize = getSessionFactory().createQuery("FROM Users").list().size();

        while (entitySize > 0) {
            deleteUser(entitySize);

            entitySize--;
        }

        System.out.println("All fields was deleted");
    }

    /**
     * This method is used to output data about all users
     */
    @Override
    public void selectAllFromTable() {
        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        for (Users user : userList) {
            System.out.println(user);
        }
    }

    /**
     * This method output data be linked table Interests.
     * To output information about User Interests, used this method.
     * To display information about one of users, used them identity number
     *
     * @param id          the identity number of user in main table
     * @param isSelectAll the isSelectAll use to chose how to output information
     *                    (for output information about one of user, used 'false',
     *                    (for output information about all users, used 'true')
     */
    @Override
    public void selectInsterest(int id, boolean isSelectAll) {
        if (!isSelectAll) {
            checkRange(id, isSelectAll);
        }

        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        if (isSelectAll) {
            for (Users users : userList) {
                System.out.printf("Name of user: %s - %s", users.getName(), users.getInterestsId());
            }
        } else {
            System.out.printf("Name of user: %s - %s", userList.get(id).getName(), userList.get(id).getInterestsId());
        }
    }

    /**
     * This method output data be linked table Work.
     * To output information about User Work, used this method.
     * To display information about one of users, used them identity number
     *
     * @param id          the identity number of user in main table
     * @param isSelectAll the isSelectAll use to chose how to output information
     *                    (for output information about one of user, used 'false',
     *                    (for output information about all users, used 'true')
     */
    @Override
    public void selectWork(int id, boolean isSelectAll) {
        if (!isSelectAll) {
            checkRange(id, isSelectAll);
        }

        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        if (isSelectAll) {
            for (Users users : userList) {
                System.out.printf("Name of user: %s - %s", users.getName(), users.getWorkID());
            }
        } else {
            System.out.printf("Name of user: %s - %s", userList.get(id).getName(), userList.get(id).getWorkID());
        }
    }

    /**
     * This method output data be linked table Social Network.
     * To output information about User Social Network, used this method.
     * To display information about one of users, used them identity number
     *
     * @param id          the identity number of user in main table
     * @param isSelectAll the isSelectAll use to chose how to output information
     *                    (for output information about one of user, used 'false',
     *                    (for output information about all users, used 'true')
     */
    @Override
    public void selectSocialNetwork(int id, boolean isSelectAll) {
        if (!isSelectAll) {
            checkRange(id, isSelectAll);
        }

        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        if (isSelectAll) {
            for (Users users : userList) {
                System.out.printf("Name of user: %s - %s", users.getName(), users.getSocialNetworkId());
            }
        } else {
            System.out.printf("Name of user: %s - %s", userList.get(id).getName(), userList.get(id).getSocialNetworkId());
        }
    }

    /**
     * This method output data be linked table Credentials.
     * To output information about User Credentials, used this method.
     * To display information about one of users, used them identity number
     *
     * @param id          the identity number of user in main table
     * @param isSelectAll the SelectAll use to chose how to output information
     *                    (for output information about one of user, used 'false',
     *                    (for output information about all users, used 'true')
     */
    @Override
    public void selectUserCredentials(int id, boolean isSelectAll) {
        if (!isSelectAll) {
            checkRange(id, isSelectAll);
        }

        List<Users> userList = getSessionFactory().createQuery("FROM Users").list();

        if (isSelectAll) {
            for (Users users : userList) {
                System.out.printf("Name of user: %s - %s", users.getName(), users.getUserCredentialsId());
            }
        } else {
            System.out.printf("Name of user: %s - %s", userList.get(id).getName(), userList.get(id).getUserCredentialsId());
        }
    }

    private void checkRange(int id, boolean isSelectAll) {
        if (id < 0 && !isSelectAll) {
            System.out.println("Id cannot be '0' or less");
        }
    }
}
