package pain.humiliation.java.internetGetto.PetroKozak.task12;

import org.junit.Test;

public class Task12Test {
    private Task12 task12 = new Task12();
    private int[] array = new int[5];
    private int age = 0;

    @Test
    public void testingOutOfMemoryError() {
        task12.callOutOfMemoryError();
    }

    @Test
    public void testingStackOverFlow() {
        task12.callStackOverFlow(1);
    }

    @Test
    public void testHowExceptionWorks() {
        task12.tryHowExceptionsAreWorking(array);
    }

    @Test
    public void testOwnException() throws Task12.PedroException {
        task12.usingMyExceptionInAgeValidator(age);
    }
}
