package pain.humiliation.java.internetGetto.PetroKozak;

import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task14.modelOfTable.Model;
import pain.humiliation.java.internetGetto.PetroKozak.task14.serviceImpl.ModelServiceImpl;

public class task14Test {
    ModelServiceImpl implementation = new ModelServiceImpl();

    @Test
    public void testInsertInToTheTable() {
        implementation.insert(new Model("Calllka", "Al Capone", 25, "male"));
        implementation.insert(new Model("Artem", "Zaycev", 27, "male"));
        implementation.insert(new Model("Don Pedro", "Sanchez Rodriguez", 22, "mexican muchacho"));
        implementation.insert(new Model("Hibernate", "Org", 3, "unisex"));
        implementation.insert(new Model("2pac", "Shakur", 25, "male"));
    }

    @Test
    public void testDeleteUser() {implementation.delete(1);
    }

    @Test
    public void testSelectAllFromTable() {
        implementation.select();
    }
}
