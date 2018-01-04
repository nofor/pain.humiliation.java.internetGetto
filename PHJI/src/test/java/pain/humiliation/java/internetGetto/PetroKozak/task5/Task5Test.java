package pain.humiliation.java.internetGetto.PetroKozak.task5;

import org.junit.Test;

public class Task5Test {

    Task5 task5 = new Task5();

    @Test
    public void task1Test() {
        int[] a = {3, 2, 3, 5, 4, 4, 5, 4, 3, 5};
        task5.printNullElements(a);
    }

    @Test
    public void task2Test() {
        int[] b = {1, 2, 3, 56, 87, 56, 6};
        task5.printMaxElement(b);
    }

    @Test
    public void task3Test() {
        int[] c = {3, 4, 5, 6, 6, 7, 7, 8, 8};
        task5.printFirstInput(c, 4);
    }

    @Test
    public void task4Test() {
        int[] d = {5, 4, 5, 6, 6, 6, 6, 999, 999, 999};
        task5.printAmountOfMaxElements(d);
    }

    @Test
    public void task5Test() {
        int[] e = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        task5.reverseArray(e);
    }

    @Test
    public void task6Test() {
        int[] f = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        task5.sortArray(f);
    }

    @Test
    public void task7Test() {
        int[] d = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        task5.checkIfPalindrome(d);
    }

    @Test
    public void task8Test() {
        int[] f = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        task5.moveElementOn1Pos(f);
    }

    @Test
    public void task9Test() {
        int[] f = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        task5.moveOnXElemets(f, 3);
    }

    @Test
    public void task10Test() {
        double[] test10 = {1, 2, 7, 4, 8, 6, 7, 6};
        task5.replaceWithNeighDividedIn2(test10);
    }

    @Test
    public void task11Test() {
        double[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] array2 = {9, 3, 1, 2, 4, 5, 7, 6, 8};
        task5.printDifferenceOfTwoEqualArrays(array1, array2);
    }

    @Test
    public void task12Test() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 11, 12, 13};

        task5.putArraysTogether(array1, array2);
    }

    @Test
    public void task13Test() {
        int[] array1 = {1, 2, 3, 4, 6};
        int[] array2 = {3, 4, 5, 6, 7, 8};
        task5.printOnlyElementsFromBothArrays(array1, array2);
    }

    @Test
    public void task14Test() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6, 7, 8};
        task5.printElementsOnlyFromOneArray(array1, array2);
    }

    @Test
    public void task15Test() {
        task5.numbersThatDivideOn13And17();
    }

    @Test
    public void task16Test() {
        int[] test16 = {9, 3, 5, 2, 7, 4, 8, 6, 10};
        task5.printAmountOfLocalMax(test16);
    }
}
