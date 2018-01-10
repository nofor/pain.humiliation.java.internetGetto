package pain.humiliation.java.internetGetto.Pbahher.task5;

/**
 * Created by pbahher on 1/10/18.
 */
@SuppressWarnings("Duplicates")
public class Utils {

    public static void printDoubleMass(double[] a) {
        String result = "";

        for (Object o : a) {
            result = result + o + ", ";
        }

        System.out.println(result);
    }


    public static int[] sortMass(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_i = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < min) {
                    min = a[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = a[i];
                a[i] = a[min_i];
                a[min_i] = tmp;
            }
        }

        return a;
    }

    public static void printIntMass(int[] a) {
        String result = "";

        for (int i : a) {
            result = result + i + ", ";
        }

        System.out.println(result);
    }
}
