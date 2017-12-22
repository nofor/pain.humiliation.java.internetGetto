package pain.humiliation.java.internetGetto.Pbahher.task5;

import com.sun.org.apache.bcel.internal.classfile.FieldOrMethod;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by pbahher on 12/21/17.
 */
public class Task5 {

    public void homework1() {
        int[] a = {2, 3, 0, 4, 0, 3, 0, 0};
        int b = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count++;
            }
        }
        System.out.print(count);
    }

    public void homework2() {
        int[] a = {2, 3, 0, 4, 0, 3, 0, 0};
        int b = a[0];

        for (int i = 0; i < a.length; i++) {
            if (b < a[i]) {
                b = a[i];
            }
        }
        System.out.println(b);
    }

    public void homework3() {
        int[] a = {2, 7, 0, 4, 0, 3, 0, 0};
        int x = 3;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println("First element of occurrence " + i );
                break;
            }
        }
    }

    public void homework4() {
        int[] a = {1, 3, 7, 0, 4, 7, 0, 0};
        int b = a[0];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (b <= a[i]) {
                b = a[i];
                count++;
            }
        }
        System.out.println(count);
    }

    public void homework5() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = a.length -1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    public void homework6() {
        int[] a = {9, 4, 6, 5, 3, 7, 8, 1, 2};

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_i = i;

            for (int j = i; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = a[i];
                a[i] = a[min_i];
                a[min_i] = temp;
            }
        }

        String stringAsArray = "";

        for (int i : a) {
            stringAsArray = stringAsArray + i + " ";
        }

        System.out.println(stringAsArray);
    }

    public void homework7() {

    }

    public void homework8() {

    }

    public void homework9() {

    }

    public void homework10() {

    }

    public void homework11() {

    }

    public void homework12() {

    }

    public void homework13() {

    }

    public void homework14() {

    }

    public void homework15() {

    }

    public void homework16() {

    }
}
