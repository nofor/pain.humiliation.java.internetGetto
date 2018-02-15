package pain.humiliation.java.internetGetto.Calllka.task9;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CalllkaTask9Test {
    private CalllkaTask9 task9 = new CalllkaTask9();
    private ArrayList<Integer> simpleArrayList = new ArrayList<>();
    private ExecutorService executorService = Executors.newFixedThreadPool(25);

    @Before
    public void addMethodTest(){
        simpleArrayList = task9.addElement();
    }

    @Test
    public void output(){
        task9.outputElement(simpleArrayList);
    }

    @Test
    public void outputExecutorService(){
        for (int i = 0; i < 25; i++){
            executorService.submit(new CalllkaTask9.InnerCalllkaClass(simpleArrayList));
        }

        executorService.shutdown();
    }
}
