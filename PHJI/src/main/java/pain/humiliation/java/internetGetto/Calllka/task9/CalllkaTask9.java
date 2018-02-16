package pain.humiliation.java.internetGetto.Calllka.task9;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CalllkaTask9 {
    private ArrayList<Integer> list = new ArrayList<>();
    private ExecutorService executorService = Executors.newFixedThreadPool(25);

    public ArrayList<Integer> addElement() {
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }

        return list;
    }

    public void outputElement(ArrayList<Integer> someList) {
        for (int i = 1; i < 26; i++) {
            System.out.println("Cycle number: " + i);

            for (Integer temp : someList) {
                System.out.println("Cycle number: " + i + " ; " + "Element: " + temp);
            }
        }
    }

    public void outputElementWithThread(ArrayList<Integer> someList) {
        for (int i = 0; i < 25; i++) {
            executorService.execute(new CalllkaTask9.InnerCalllkaClass(someList));
        }

        executorService.shutdown();
    }

    private static class InnerCalllkaClass implements Runnable {
        private ArrayList<Integer> innerCalllkaClassList;

        InnerCalllkaClass(ArrayList<Integer> innerCalllkaClassList) {
            this.innerCalllkaClassList = innerCalllkaClassList;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            outputPoolThread(innerCalllkaClassList);
        }
    }

    private static void outputPoolThread(ArrayList<Integer> someList) {
        for (Integer temp : someList) {
            System.out.println("Element: " + temp);
        }
    }
}
