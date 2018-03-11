package pain.humiliation.java.internetGetto.PetroKozak.task12;

import org.junit.Test;

public class Task12Test {
    //todo add separate line
    private Task12 task12 = new Task12();
    private int[] array = new int[5];
    private Object[] arrayObject = new Integer[5];
    private int age = 5;
    private String stringForNullPointer = null;

    @Test
    public void testingOutOfMemoryError() {
        task12.callOutOfMemoryError();
    }

    @Test
    public void testingStackOverFlow() {
        task12.callStackOverFlow(1);
    }

    @Test
    public void testIndexOutOfBoundsException() {
        task12.handleIndexOutOfBoundsException(array);
    }

    @Test
    public void testOwnException() throws Task12.PedroException {
        task12.usingMyExceptionInAgeValidator(age);
    }

    @Test
    public void testArrayIndexOutOfBoundsException() {
        task12.handleArrayIndexOutOfBoundsException(array, 2);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void testArithmeticException() {
        task12.handleArithmeticException(5, 0);
    }

    @Test
    public void testClassCastException() {
        task12.handleClassCastException(age);
    }

    @Test
    public void testArrayStoreException() {
        arrayObject[0] = 1;
        task12.handleArrayStoreException(arrayObject, new String("4"));
    }

    @Test
    public void testIllegalArgumentException() {
        task12.handleIllegalArgumentException(age);
    }

    @Test
    public void testNegativeArraySizeException() {
        task12.handleNegativeArraySizeException(-10);
    }

    @Test
    public void testNullPointerException() {
        task12.handleNullPointerException(stringForNullPointer);    //todo do not create null variable, set just null
    }

    @Test
    public void testNumberFormatException() {
        task12.handleNumberFormatException(array);
    }

}
