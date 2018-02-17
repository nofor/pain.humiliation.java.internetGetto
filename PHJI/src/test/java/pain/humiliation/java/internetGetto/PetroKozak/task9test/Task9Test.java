package pain.humiliation.java.internetGetto.PetroKozak.task9test;

import org.junit.Before;
import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task9.Task9;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task9Test {

    Task9 task9 = new Task9();
    ArrayList<Object> arrayList = new ArrayList<Object>();

    @Before
    public void initialize() {
        task9.addingToCollection(arrayList);
    }

    @Test
    public void testTimeOfPrintingOutWithCode() {
        long startTime = System.nanoTime();
        task9.printingOut25TimesWithCode(arrayList);

        System.out.print("Time spent to complete the method is: " + (System.nanoTime() - startTime));
    }

    @Test
    public void testThreads() {
        ExecutorService executor = Executors.newFixedThreadPool(25);

        for (int i = 0; i < 25; i++) {
             executor.submit(new Process(i));
        }
        executor.shutdown();
    }

    public class Process implements Runnable {

        private int id;

        public Process(int id){
            this.id=id;
        }

        @Override
        public  void run() {
            System.out.println("Start" +id);
            task9.printOutForThread(arrayList);
            System.out.println("Task completed for" + id);
        }
    }

}
