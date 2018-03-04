package pain.humiliation.java.internetGetto.Calllka.task12;

import org.junit.Test;

public class Task12Test {
    private Task12 task12 = new Task12("filename.txt");

    @Test
    public void testException() {
        task12.methodToCheckHowToWorksTryCatchFinally();
        task12.evokeStackOverFlow(1);
        task12.evokeOutOfMemoryError();
        task12.evokeArithmeticException();
        task12.evokeArrayIndexOutOfBoundsException();
        task12.evokeClassCastException();
        task12.evokeArrayStoreException();
        task12.evokeIllegalArgumentException();
        task12.evokeIndexOutOfBoundsException();
        task12.evokeNegativeArraySizeException();
        task12.evokeNullPointerException();
    }
}
