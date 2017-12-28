package pain.humiliation.java.internetGetto.PetroKozak.task5;
import java.util.Arrays;

public class Task5 {

    //TODO try to name methods by they logic


    public void mainTask5(int[] a, int[] palindrome, int indexT3) {  //todo move to test
        task1(a);
        System.out.println("Task2");
        task2(a);
        System.out.println("Task3");
        task3(a, indexT3);
        System.out.println("Task4");
        task4(a);
        System.out.println("Task5");
        task5(a);
        System.out.println("Task6");
        task6(a);
        System.out.println("Task7");
        task7(palindrome);
        System.out.println("Task10");
        task10(a);
        System.out.println("Task16");
        task16(a);

    }

    public void task1(int[] t1) {
        int count = 0;
        //todo add extra line
        for (int i = 0; i < t1.length; i++) {  //todo do it with for each
            if (t1[i] == 0)
                count++;
        }
        //todo add extra line
        System.out.println(count);
    }

    public void task2(int[] t2) {
        int max = t2[0];
        //todo Where is check if array is not empty ???
        //todo add extra line
        for (int i = 0; i < t2.length; i++) { //todo do it with for each
            if (max < t2[i]) {
                max = t2[i];
            }
        }
        //todo add extra line
        System.out.println(max);
    }

    public void task3(int[] t3, int x) {  //todo do it with for each
        for (int i = 0; i < t3.length; i++) {
            if (t3[i] == x) {
                System.out.println(i);
                break;
            }
        }
    }

    public void task4(int[] t4) {  //todo WRONG !!! FIX IT.
        int max = 0;
        int count = 0;

        for (int i = 0; i < t4.length; i++) {  //todo do it with for each
            if (max < t4[i]) {
                max = t4[i];
                count++;
            }
        }
        //todo add extra line
        System.out.println(count);
    }

    public void task5(int[] t5) {
        for (int i = t5.length - 1; i >= 0; i--) {
            System.out.println(t5[i]);  //todo print it in one line
        }
    }

    public void task6(int[] t6) {
        for (int i = 0; i < t6.length; i++) {
            System.out.println(t6[i]);
        }
        //todo print it in one line
        Arrays.sort(t6);  //todo its cool, but you need to do it yourself
        System.out.println(Arrays.toString(t6));

    }

    public void task7(int[] t7) {  //todo FIX it with bool variable
        for (int i = 0; i < t7.length; i++) {
            if (t7[i] != t7[t7.length - i - 1]) {
                System.out.println("It's not a palindrome");
                break;
            }
        }
        System.out.println("It is a palindrome");
    }

    public void task8(int[] t8) {
        //todo todo. Use task 4 for this
    }

    //todo task9

    public void task10(int[] t10) {
        for (int i = 1; i < t10.length - 1; i++) {  //todo do it for first and last element
            t10[i] = (t10[i + 1] + t10[i - 1]) / 2;
        }

        for (int i = 0; i < t10.length; i++) {
            System.out.println(t10[i]);  //todo print array in one line
        }
    }


    public void task16(int[] t16) {

        for (int i = 1; i < t16.length - 1; i++) {  //todo do it for first and last element
            if (t16[i] > t16[i + 1] && t16[i] > t16[i - 1]) {
                System.out.println(t16[i]);  //todo print array in one line
            }
        }
    }
}



