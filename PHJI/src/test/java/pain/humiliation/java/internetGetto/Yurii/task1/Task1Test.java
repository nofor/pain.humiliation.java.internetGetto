package pain.humiliation.java.internetGetto.Yurii.task1;

import org.junit.Test;

public class Task1Test {
    private Task1 task1 = new Task1();

    @Test
    public void outputDigitsByLoopTest(){
        task1.outputDigitsByLoop(-5);
        task1.outputDigitsByLoop('a');
    }

    @Test
    public void outputDigitsByWhileDoTest(){
        task1.outputDigitsByWhileDo();
    }

    @Test
    public void outputDigitsByDoWhileTest(){
        task1.outputDigitsByDoWhile();
    }
}
