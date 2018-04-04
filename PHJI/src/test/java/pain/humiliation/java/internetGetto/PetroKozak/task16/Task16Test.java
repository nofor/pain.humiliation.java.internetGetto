package pain.humiliation.java.internetGetto.PetroKozak.task16;

import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task16.dao.impl.IUserImpl;
import pain.humiliation.java.internetGetto.PetroKozak.task16.models.User;

public class Task16Test {

    IUserImpl implementation = new IUserImpl();

    @Test
    public void testInsert(){
        implementation.insert(new User("Petro","Kozak",23));
    }
}
