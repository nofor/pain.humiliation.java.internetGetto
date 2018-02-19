package pain.humiliation.java.internetGetto.PetroKozak.task9;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task9 {
    private static ArrayList<Integer> list = new ArrayList<>();
    private static ExecutorService executorService = Executors.newCachedThreadPool();
    private static long ITERATION_COUNT = 25;

    static{
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long startTimeLoop = System.currentTimeMillis();
        outputWithLoop(list);
        long outputTimeWithLoop = System.currentTimeMillis()-startTimeLoop;


        long startTimeThread = System.currentTimeMillis();
        outputWithThreads();
        long outputTimeWithThread = System.currentTimeMillis()-startTimeThread;

        System.out.println("Time Loop " +outputTimeWithLoop);
        System.out.println("Time Thread " + outputTimeWithThread);
    }


    private static void outputWithLoop(ArrayList<Integer> x) {
        for (int i = 1; i < ITERATION_COUNT; i++) {
            for (Object temp : x) {
                System.out.print(temp + " ");
            }
            System.out.println("");
        }
    }

    private static void outputWithThreads(){
        for (int i = 0; i < 25; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                    for (Integer temp : Task9.list) {
                        System.out.println("Thread:" + Thread.currentThread().getName() + " Element: " + temp);
                    }
                }
            });
        }
        executorService.shutdown();
    }
}
