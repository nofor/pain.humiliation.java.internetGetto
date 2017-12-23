package pain.humiliation.java.internetGetto.Calllka.task5;

import org.junit.Test;

public class Task5Test {

    private Task5 task5 = new Task5();

    @Test
    public void testHomework() {
        System.out.println("Homework 1: " + task5.homework1(new int[]{1, 0, 2, 0, 3}));
        System.out.println("Homework 2: " + task5.homework2(new int[]{1, 0, 2, 0, 3, 7}));
        System.out.println("Homework 3: " + task5.homework3(new int[]{1, 0, 2, 0, 3, 7}, 3));
        System.out.println("Homework 4: " + task5.homework4(new int[]{1, 7, 0, 2, 7, 3, 7}));
        task5.homework5(new int[]{1, 7, 0, 2, 7, 3, 7});
        task5.homework6(new int[]{1, 7, 0, 2, 7, 3, 7});
        System.out.println("\nHomework 7: The word is palindrome: " + task5.homework7("404"));
        task5.homework8(new int[]{1, 7, 0, 2, 7, 3, 7});
        task5.homework9(new int[]{1, 7, 0, 2, 7, 3, 7}, 3);
        task5.homework10(new int[]{1, 7, 0, 2, 7, 3, 7});
    }

}
