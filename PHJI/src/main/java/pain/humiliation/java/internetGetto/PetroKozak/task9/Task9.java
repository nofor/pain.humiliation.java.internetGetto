package pain.humiliation.java.internetGetto.PetroKozak.task9;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Task9 {
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ThreadPoolExecutor EXECUTOR = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    private static long ITERATION_COUNT = 25;

    static {
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        long timeLoop = System.nanoTime();

        for (int i = 1; i < ITERATION_COUNT; i++) {
            for (Object temp : list) {
                System.out.print(temp + " ");
            }
        }

        System.out.println("TIME" + TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - timeLoop));


        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (Integer temp : list) {
                    System.out.println("Thread:" + Thread.currentThread().getName() + " Element: " + temp);
                }
            }
        };

        long timeThread = System.nanoTime();

        for (int i = 0; i < 25; i++) {
            EXECUTOR.execute(run);
        }

        EXECUTOR.shutdown();

        if (EXECUTOR.getActiveCount() == 0) {
            System.out.println("TIMETHREAD" + TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - timeThread));
        }
    }
}
