package pain.humiliation.java.internetGetto.Calllka.task9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CalllkaTask9Test {
    private CalllkaTask9 task9 = new CalllkaTask9();
    private ArrayList<Integer> simpleArrayList = new ArrayList<>();
    private long timerArrayList, timeThreadArrayList;

    @Before
    public void addMethodTest(){
        simpleArrayList = task9.addElement();
    }

    @Test
    public void outputElementTest(){
        timerArrayList = System.nanoTime();
        task9.outputElement(simpleArrayList);
        timerArrayList = System.nanoTime() - timerArrayList;

        timeThreadArrayList = System.nanoTime();
        task9.outputElementWithThread(simpleArrayList);
        timeThreadArrayList = System.nanoTime() - timeThreadArrayList;
    }

    @After
    public void outputResult(){
        System.out.println("Result timerArrayList: " + timerArrayList );
        System.out.println("Result timeThreadArrayList: " + timeThreadArrayList );
        System.out.println("Result timerArrayList-timeThreadArrayList: " + (timerArrayList - timeThreadArrayList));
    }
}
