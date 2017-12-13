package pain.humiliation.java.internetGetto.Pbahher;

import org.junit.Test;
import org.omg.CORBA.StringHolder;
import pain.humiliation.java.internetGetto.Pbahher.task1.Task3;

/**
 * Created by pbahher on 12/13/17.
 */
public class Task3Test {

    public Task3 task3 = new Task3();

    @Test
    public void stringTest() {
        System.out.println(task3.threeLines("How ","to ","play "));
        System.out.println(task3.deletingLetters("deleted"));
    }
}
