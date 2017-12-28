package pain.humiliation.java.internetGetto.Pbahher.task4;

import org.junit.Test;

/**
 * Created by pbahher on 12/21/17.
 */
public class Task4Test {

    public Task4 task4 = new Task4();

    @Test
    public void stringMainMethod() {
        String[] a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        task4.runIterationMethod(a, 3);
    }
}
