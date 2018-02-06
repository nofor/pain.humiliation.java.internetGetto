package pain.humiliation.java.internetGetto.Yurii.task2;

import org.junit.Test;

public class Task2Test {
    private Task2 task2 = new Task2();

    @Test
    public void divideIntVariableWithRemainTest() {
        System.out.println("DIVIDE INTEGER VARIABLE");

        task2.divideIntVariableWithRemain(21, 8);
        task2.divideIntVariableWithRemain(12, 0);
        task2.divideIntVariableWithRemain(12, 3);
        task2.divideIntVariableWithRemain(0, 3);
        task2.divideIntVariableWithRemain((int) 'd', 10);

        System.out.println();
    }

    @Test
    public void divideDoubleVariableWithRemainTest() {
        System.out.println("DIVIDE DOUBLE VARIABLE");

        task2.divideDoubleVariableWithRemain(22.5, 5.5);
        task2.divideDoubleVariableWithRemain(12.5, 0.5);
        task2.divideDoubleVariableWithRemain(0.5, .5);
        task2.divideDoubleVariableWithRemain(5, 1.5);

        System.out.println();
    }

    @Test
    public void sumDigitsOfNumberTest() {
        System.out.println("SUM DIGITS OF NUMBER");

        task2.sumDigitsOfNumber(37);
        task2.sumDigitsOfNumber(3);
        task2.sumDigitsOfNumber(15687);
        task2.sumDigitsOfNumber('Q');

        System.out.println();
    }

    @Test
    public void sumDigitsOfNumberWithConvertToStringTest() {
        System.out.println("SUM DIGITS OF NUMBER WITH CONVERT TO STRING");

        task2.sumDigitsOfNumberWithConvertToString(370);
        task2.sumDigitsOfNumberWithConvertToString(30);
        task2.sumDigitsOfNumberWithConvertToString(15687);
        task2.sumDigitsOfNumberWithConvertToString('d');

        System.out.println();
    }

    @Test
    public void roundNumberWithDecimalTest(){
        System.out.println("SUM DIGITS OF NUMBER WITH CONVERT TO STRING");

        task2.roundNumberWithDecimal(2.5);
        task2.roundNumberWithDecimal(2.49);
        task2.roundNumberWithDecimal(.49);
        task2.roundNumberWithDecimal(4.9);

        System.out.println();
    }
}
