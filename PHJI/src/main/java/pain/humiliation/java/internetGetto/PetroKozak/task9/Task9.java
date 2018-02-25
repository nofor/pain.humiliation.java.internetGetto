package pain.humiliation.java.internetGetto.PetroKozak.task9;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//todo remove extra line
public class Task9 {
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ThreadPoolExecutor EXECUTOR = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    private static long ITERATION_COUNT = 25;

    //todo remove extra line
    static {
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //todo remove extra line
        Instant start = Instant.now();

        for (int i = 1; i < ITERATION_COUNT; i++) {
            for (Object temp : list) {
                System.out.print(temp + " ");
            }
        }

        Instant end = Instant.now();
        //todo add extra line because of first line is variable creating, second line just printing
        System.out.println("TIME" + Duration.between(start, end));

        //todo remove extra line
        Runnable run = new Runnable() {  //todo replace it with lambda
            @Override
            public void run() {
                for (Integer temp : list) {
                    System.out.println("Thread:" + Thread.currentThread().getName() + " Element: " + temp);
                }
            }
        };

        Instant startThread = Instant.now();

        for (int i = 0; i < 25; i++) {
            EXECUTOR.execute(run);
        }

        EXECUTOR.shutdown();

        while (!EXECUTOR.isTerminated()){
        }

        if (EXECUTOR.getActiveCount() == 0) {  //todo you no need this because of you have "is terminated" condition
            System.out.println("TIMETHREAD" + Duration.between(startThread, Instant.now()));
        }
    }
}
