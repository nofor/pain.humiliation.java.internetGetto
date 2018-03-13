package pain.humiliation.java.internetGetto.Calllka.task12;

import org.junit.Test;

//todo create separate tests
public class Task12Test {
    private Task12 task12 = new Task12("filename.txt");

    @Test
    public void testException() {
        task12.methodToCheckHowToWorksTryCatchFinally();
    }

    @Test
    public void testEvokeStackOverFlow() {
        task12.evokeStackOverFlow();
    }

    @Test
    public void testEvokeOutOfMemoryError() {
        task12.evokeOutOfMemoryError();
    }

    @Test
    public void testEvokeArithmeticException() {
        task12.evokeArithmeticException();
    }

    @Test
    public void testEvokeArrayIndexOutOfBoundsException() {
        task12.evokeArrayIndexOutOfBoundsException();
    }

    @Test
    public void testEvokeClassCastException() {
        task12.evokeClassCastException();
    }

    @Test
    public void testEvokeArrayStoreException() {
        task12.evokeArrayStoreException();
    }

    @Test
    public void testEvokeIllegalArgumentException() {
        task12.evokeIllegalArgumentException();
    }

    @Test
    public void testEvokeIndexOutOfBoundsException() {
        task12.evokeIndexOutOfBoundsException();
    }

    @Test
    public void testEvokeNegativeArraySizeException() {
        task12.evokeNegativeArraySizeException();
    }

    @Test
    public void testEvokeNullPointerException() {
        task12.evokeNullPointerException();
    }
}
