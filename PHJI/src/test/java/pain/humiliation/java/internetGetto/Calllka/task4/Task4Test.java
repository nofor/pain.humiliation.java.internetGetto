package pain.humiliation.java.internetGetto.Calllka.task4;

import org.junit.Test;

public class Task4Test {
    Task4 task4 = new Task4();

    @Test
    public void setTestMassive() {
        String[] massiveForTask = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};

        task4.runMethod(massiveForTask, 11);
    }
}