package pain.humiliation.java.internetGetto.Calllka.task9;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task9 {
    static long timeOne, timeTwo;
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ExecutorService executorService = Executors.newCachedThreadPool();

    static{
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        outputElement(list);
        outputElementWithThread(list);
        Thread.sleep(1000);
        System.out.println(TimeUnit.NANOSECONDS.toMillis(timeOne));
        System.out.println(TimeUnit.NANOSECONDS.toMillis(timeTwo));
        System.out.println("TIMEEEEEEEE !!!!!!!!!!!!!!!!  ____________--------------___________:    " +
                + TimeUnit.NANOSECONDS.toMillis((timeOne - timeTwo)));
    }

    private static void outputElement(ArrayList<Integer> someList) {
        timeOne = System.nanoTime();

        for (int i = 0; i < 25; i++) {
            for (Integer temp : someList) {
                System.out.println("Cycle number: " + i + " ; " + "Element: " + temp);
            }
        }

        timeOne = System.nanoTime() - timeOne;
    }

    private static void outputElementWithThread(final ArrayList<Integer> someList) {
        Runnable myRun = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                for (Integer temp : someList) {
                    System.out.println("Thread:" + Thread.currentThread().getName() + " Element: " + temp);
                }
            }
        };

        timeTwo = System.nanoTime();

        for (int i = 0; i < 25; i++) {
            executorService.execute(myRun);
        }

        executorService.shutdown();
        timeTwo = System.nanoTime() - timeTwo;
    }
}
