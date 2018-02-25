package pain.humiliation.java.internetGetto.Calllka.task9;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//todo why are you need it here ??? You duplicate this peace of code "Thread.currentThread().getName()". DONE
// todo add extra line DONE
//TODO you time calculation is not correct. You print time before threads has finish works. REWORK !!! DONE
//todo WTF ??? Why are you need it here ? Also, add extra line DONE
//todo Just print time, without any comments ?? DONE
public class Task9 {
    private static long timeOne, timeTwo, extraTime;
    //todo if you create static variable. you must create getter and setter or call it as "Task9.timeOne" But here using static variables - excessive. Remove please.
    //I use static variable, cause all my methods is STATIC. I'm running my methods through "main". It, "main" method, is STATIC.
    private static ArrayList<Integer> list = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        outputElement(list);
        outputElementWithThread(list);
        System.out.println("Output time by FOR: " + TimeUnit.NANOSECONDS.toMillis(timeOne));
        System.out.println("Output time by Thread: " + TimeUnit.NANOSECONDS.toMillis(timeTwo));
        System.out.println("Time difference" + TimeUnit.NANOSECONDS.toMillis((timeOne - timeTwo)));
    }

    private static void outputElement(ArrayList<Integer> someList) {
        Task9.timeOne = System.nanoTime();

        for (int i = 0; i < 25; i++) {
            for (Integer temp : someList) {
                System.out.println("Cycle number: " + i + " ; " + "Element: " + temp);
            }
        }

        Task9.timeOne = System.nanoTime() - Task9.timeOne;
    }

    private static void outputElementWithThread(final ArrayList<Integer> someList) {
        ThreadPoolExecutor ex = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        Runnable myRun = new Runnable() {
            @Override
            public void run() {
                for (Integer temp : someList) {
                    System.out.println("Thread:" + Thread.currentThread().getName() + " Element: " + temp);
                }
            }
        };

        Task9.timeTwo = System.nanoTime();

        for (int i = 0; i < 25; i++) {
            ex.execute(myRun);
        }

        ex.shutdown();

        while (ex.getActiveCount() != 0) {
            Task9.extraTime = System.nanoTime();
        }

        Task9.timeOne = Task9.extraTime - Task9.timeTwo;
    }
}
