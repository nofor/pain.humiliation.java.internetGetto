package pain.humiliation.java.internetGetto.PetroKozak;

import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task1.Task2;

public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void testTask2() {
        System.out.println(task2.countWithRest(21, 8));
        System.out.println(task2.countAmountOfFigures(2345, 4));
        System.out.println(task2.roundTheDouble(3.7));
    }
}
