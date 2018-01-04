package pain.humiliation.java.internetGetto.Calllka.task5;

import org.junit.Test;

public class Task5Test {

    private Task5 task5 = new Task5();

    @Test
    public void zeroElementCountTest(){
        System.out.println("Homework 1: " + task5.zeroElementCount(new int[]{1, 0, 2, 0, 3}));
    }

    @Test
    public void maxElementInArrayTest(){
        System.out.println("Homework 2: " + task5.maxElementInArray(new int[]{1, 0, 2, 0, 3, 7}));
    }

    @Test
    public void searchElementInArrayTest(){
        System.out.println("Homework 3: " + task5.searchElementInArray(new int[]{1, 0, 2, 0, 3, 7}, 3));
    }

    @Test
    public void maxElementCountTest(){
        System.out.println("Homework 4: " + task5.maxElementCount(new int[]{1, 7, 0, 2, 7, 3, 7}));
    }

    @Test
    public void invertsArrayTest(){
        task5.invertsArray(new int[]{1, 7, 0, 2, 7, 3, 7});
    }

    @Test
    public void sortingArrayTest(){
        task5.sortingArray(new int[]{1, 7, 0, 2, 7, 3, 7});
    }

    @Test
    public void isWordPolindromeTest(){
        System.out.println("\nHomework 7: The word is palindrome: " + task5.isWordPolindrome("404"));
    }

    @Test
    public void shiftsTheElementsOnOnePositionTest(){
        task5.shiftsTheElementsOnOnePosition(new int[]{1, 7, 0, 2, 7, 3, 7});
    }

    @Test
    public void shiftsTheElementsOnKPositionTest(){
        task5.shiftsTheElementsOnKPosition(new int[]{1, 7, 0, 2, 7, 3, 7}, 3);
    }

    @Test
    public void changeArrayElementsOnHalfsumTest(){
        task5.changeArrayElementsOnHalfsum(new int[]{1, 7, 0, 2, 7, 3, 7});
    }

    @Test
    public void outputDifferenceTwoArrayTest(){
        task5.outputDifferenceTwoArray();
    }

    @Test
    public void unionOfSetsTest(){
        task5.unionOfSets();
    }

    @Test
    public void intersectionOfSetsTest(){
        task5.intersectionOfSets();
    }

    @Test
    public void differenceOfSetsTest(){
        task5.differenceOfSets();
    }

    @Test
    public void outputNaturalDigitsTest(){
        task5.outputNaturalDigits(10);
    }

    @Test
    public void localMinimumTest() {
        System.out.println(task5.localMinimum(new int[]{1,2,1,1,5,4,3,2,7}));
    }

}
