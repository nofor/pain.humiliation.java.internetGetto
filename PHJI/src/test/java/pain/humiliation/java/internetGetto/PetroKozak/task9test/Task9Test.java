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
            Runnable worker = new MyThread();
            executor.execute(worker);
        }
        executor.shutdown();
    }

    public class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "Start");
            task9.printOutForThread(arrayList);
            System.out.println(Thread.currentThread().getName() + "End");
        }
    }

}
