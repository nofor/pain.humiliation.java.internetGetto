package pain.humiliation.java.internetGetto.PetroKozak.task2;

import org.junit.Test;

public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void testTask2() {
        System.out.println(task2.countWithRest(21, 8));
        System.out.println(task2.countAmountOfFigures(2345, 4));
        System.out.println(task2.roundTheDouble(3.7));
    }
}
