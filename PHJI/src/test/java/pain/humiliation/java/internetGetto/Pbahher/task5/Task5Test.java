package pain.humiliation.java.internetGetto.Pbahher.task5;

import org.junit.Test;

/**
 * Created by pbahher on 12/21/17.
 */

public class Task5Test {

    public Task5 task5 = new Task5();

    @Test
    public void task1() {
        System.out.println(task5.printNullElements(new int[]{2, 3, 0, 6, 4, 0, 1}));
    }

    @Test
    public void task2() {
        System.out.println(task5.maxArrayElement(new int[]{1, 2, 3, 4, 7, 6}));
    }

    @Test
    public void task3() {
        System.out.println(task5.lastSpecifiedElement(new int[]{1, 3, 4, 5, 3, 7, 3, 6}, 3));
    }

    @Test
    public void task4() {
        System.out.println(task5.amountMaxElement(new int[]{1, 3, 7, 0, 4, 7, 0, 2, 7}));
    }

    @Test
    public void task5() {
        task5.arrayInvert(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void task6() {
        task5.arraySorting(new int[]{2, 5, 6, 1, 4, 3, 7});
    }

    @Test
    public void task7() {
        System.out.println(task5.thisIsPalindrome(new int[]{0, 1, 2, 3, 2, 1, 0}));
    }

    @Test
    public void task8() {
        task5.positionShiftOnOne(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void task9() {
        task5.positionShiftOnK(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void task10() {
        task5.halfSumm(new double[]{2, 4, 5, 6, 1});
    }

    @Test
    public void task11() {
        task5.differenceOfArrays(new int[]{9, 3, 1, 4, 2, 5, 6, 7, 8},
                new int[]{3, 1, 2, 8, 4, 7, 5, 6, 9});
    }

    @Test
    public void task12() {
        task5.unionOfSets(new int[]{1, 2, 3, 4, 5, 11, 20},
                new int[]{1, 2, 7, 14, 20, 21, 70, 60});
    }

    @Test
    public void task13() {
        task5.intersectionOfMany(new int[]{1, 2, 3, 4, 5, 6, 70},
                new int[]{1, 2, 7, 14, 6, 21, 70, 20});
    }

    @Test
    public void task14() {
        task5.symmetricDifferenceOfSets(new int[]{1, 2, 3, 4, 5, 6, 70, 60},
                new int[]{1, 2, 7, 14, 6, 21, 70, 20});
    }

    @Test
    public void task15() {
        task5.divisionOfNumber();
    }

    @Test
    public void task16() {
        task5.localMaximum(new int[]{2, 5, 7, 5, 2, 7, 9, 11});
    }

}
