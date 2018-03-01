package pain.humiliation.java.internetGetto.Calllka.task9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//todo why are you need it here ??? You duplicate this peace of code "Thread.currentThread().getName()". DONE
//todo add extra line DONE
//TODO you time calculation is not correct. You print time before threads has finish works. REWORK !!! DONE
//todo WTF ??? Why are you need it here ? Also, add extra line DONE
//todo Just print time, without any comments ?? DONE
//todo if you create static variable. you must create getter and setter or call it as "Task9.timeOne" But here using static variables - excessive. Remove please. DONE
//todo use Petya's comments DONE
public class Task9 {
    private static ArrayList<Integer> list = new ArrayList<>();

    static {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        long checkWorkTimeThread, cycleWhileTime;
        long checkWorkTimeCycle = System.nanoTime();

        for (int i = 0; i < 25; i++) {
            for (Integer temp : list) {
                System.out.println("Cycle number: " + i + " ; " + "Element: " + temp);
            }
        }

        checkWorkTimeCycle = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - checkWorkTimeCycle);

        ExecutorService ex = Executors.newCachedThreadPool();
        Runnable myRun = () -> {
            for (Integer temp : list) {
                System.out.println("Thread:" + Thread.currentThread().getName() + " Element: " + temp);
            }
        };

        checkWorkTimeThread = System.nanoTime();

        for (int i = 0; i < 25; i++) {
            ex.execute(myRun);
        }

        ex.shutdown();

        cycleWhileTime = System.nanoTime();

        while (!ex.isTerminated()){
        }

        cycleWhileTime = System.nanoTime() - cycleWhileTime;


        checkWorkTimeThread = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - checkWorkTimeThread - cycleWhileTime);

        System.out.println("Output time by FOR: " + checkWorkTimeCycle + "\n"
                + "Output time by Thread: " + checkWorkTimeThread + "\n"
                + "Time difference: " + (checkWorkTimeCycle - checkWorkTimeThread));
    }
}
