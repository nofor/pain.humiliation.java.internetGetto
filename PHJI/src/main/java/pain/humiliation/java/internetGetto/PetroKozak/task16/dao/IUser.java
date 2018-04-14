package pain.humiliation.java.internetGetto.PetroKozak.task16.dao;

import pain.humiliation.java.internetGetto.PetroKozak.task16.models.User;

/**
 * The following Interface will be used for doing the operations with the Database as part of task16.
 *
 * @author Petro Kozak
 */
public interface IUser {

    void insert(User user);

    void delete(int id);

    void select();

}
