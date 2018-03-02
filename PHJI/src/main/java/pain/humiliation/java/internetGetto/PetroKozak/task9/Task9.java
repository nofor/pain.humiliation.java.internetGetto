package pain.humiliation.java.internetGetto.PetroKozak.task9;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Task9 {
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ThreadPoolExecutor EXECUTOR = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    private static long ITERATION_COUNT = 2500;

    static {
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();

        for (int i = 1; i < ITERATION_COUNT; i++) {
            for (Object temp : list) {
                System.out.print(temp + " ");
            }
        }

        Instant end = Instant.now();

        Runnable run = () -> {
            for (Integer temp : list) {
                System.out.println("Thread:" + Thread.currentThread().getName() + " Element: " + temp);
            }
        };

        Instant startThread = Instant.now();

        for (int i = 0; i < 25; i++) {
            EXECUTOR.execute(run);
        }

        shutExecutorDown();

        Instant endThread = Instant.now();

        System.out.println("TIME WITH LOOP FOR:" + Duration.between(start, end).toMillis() + "MILLISECS");
        System.out.println("TIME WITH THREADPOOL" + Duration.between(startThread, endThread).toMillis() + "MILLISECS");
    }

    public static void shutExecutorDown() {
        EXECUTOR.shutdown();

        while (!EXECUTOR.isTerminated()) {
            continue;
        }
    }
}
