package pain.humiliation.java.internetGetto.Calllka.task9;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CalllkaTask9Test {
    private CalllkaTask9 task9 = new CalllkaTask9();
    private ArrayList<Integer> simpleArrayList = new ArrayList<>();
    private InnerCalllkaClass[] innerCalllkaClass = new InnerCalllkaClass[25];

    @Before
    public void addMethodTest(){
        simpleArrayList = task9.addElement();
    }

    @Test
    public void output(){
        task9.outputElement(simpleArrayList);
    }

    @Test
    public void outputThread(){
        for (int i = 0; i < 25; i++){
            innerCalllkaClass[i] = new InnerCalllkaClass();
            System.out.println("Thread number: " + innerCalllkaClass[i].getName());
            innerCalllkaClass[i].start();
        }
    }

    private class InnerCalllkaClass extends Thread{

        @Override
        public void run() {
            task9.outputPoolThread(simpleArrayList);
        }
    }
}
