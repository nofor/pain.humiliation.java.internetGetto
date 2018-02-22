package pain.humiliation.java.internetGetto.Calllka.task9;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//TODO you time calculation is not correct. You print time before threads has finish works. REWORK !!!

public class Task9 {
    static long timeOne, timeTwo;    //todo if you create static variable. you must create getter and setter or call it as "Task9.timeOne" But here using static variables - excessive. Remove please.
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
        Thread.sleep(1000);  //todo WTF ??? Why are you need it here ? Also, add extra line
        System.out.println(TimeUnit.NANOSECONDS.toMillis(timeOne));    //todo Just print time, without any comments ??
        System.out.println(TimeUnit.NANOSECONDS.toMillis(timeTwo));    //todo Just print time, without any comments ??
        System.out.println("TIMEEEEEEEE !!!!!!!!!!!!!!!!  ____________--------------___________:    " +  //todo WTF ???
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
                System.out.println(Thread.currentThread().getName());    //todo why are you need it here ??? You duplicate this peace of code "Thread.currentThread().getName()".
                // todo add extra line
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
