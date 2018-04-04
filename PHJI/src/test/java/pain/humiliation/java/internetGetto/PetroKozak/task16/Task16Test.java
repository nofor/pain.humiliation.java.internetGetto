package pain.humiliation.java.internetGetto.PetroKozak.task16;

import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task16.dao.impl.IUserImpl;

public class Task16Test {

    IUserImpl implementation = new IUserImpl();

    @Test
    public void testSelect(){
        implementation.select();
    }
}
