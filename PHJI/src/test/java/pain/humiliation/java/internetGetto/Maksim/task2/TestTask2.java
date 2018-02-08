package pain.humiliation.java.internetGetto.Maksim.task2;

import org.junit.Test;


public class TestTask2 {
    private Task2 task2 = new Task2();

    @Test

    public void divisionNumberWithRemainderTest(){
        System.out.println("------------------------- Task 2.1 -------------------------");
        System.out.println(task2.divisionNumberWithRemainder(50,20));
    }

    @Test
    public void sumNumberOfNumberTest(){
        System.out.println("------------------------- Task 2.2 -------------------------");
        System.out.println(task2.sumNumberOfNumber(24));
    }

    @Test
    public void ceilNumberTest(){
        System.out.println("------------------------- Task 2.3 -------------------------");
        task2.ceilNumber(3.5);
    }

    @Test
    public void sumNumOfNumOfNum(){
        System.out.println("------------------------- Task 2.4 -------------------------");
        System.out.println(task2.sumOfNumOfNumOfNum(347));
    }
}
