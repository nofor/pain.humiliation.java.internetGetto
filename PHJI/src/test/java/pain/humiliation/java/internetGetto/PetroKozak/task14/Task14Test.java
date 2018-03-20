package pain.humiliation.java.internetGetto.PetroKozak.task14;

import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task14.model.Model;
import pain.humiliation.java.internetGetto.PetroKozak.task14.dao.imp.ModelServiceImpl;

public class Task14Test {
    ModelServiceImpl implementation = new ModelServiceImpl();

    @Test
    public void testInsertToTheTable() {
        implementation.insert(new Model("Calllka", "Al Capone", 25));
        implementation.insert(new Model("Artem", "Zaycev", 27));
        implementation.insert(new Model("Don Pedro", "Sanchez Rodriguez", 22));
    }

    @Test
    public void testDeleteUser() {implementation.delete(1);
    }

    @Test
    public void testSelectAll() {
        implementation.select();
    }
}