package pain.humiliation.java.internetGetto.PetroKozak.task16.dao;

import pain.humiliation.java.internetGetto.PetroKozak.task16.models.User;

public interface IUser {

    void insert(User user);

    void delete(long id);

    void select();

}
