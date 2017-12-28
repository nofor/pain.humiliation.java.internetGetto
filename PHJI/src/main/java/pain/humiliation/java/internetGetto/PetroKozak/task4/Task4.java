package pain.humiliation.java.internetGetto.PetroKozak.task4;

public class Task4 {

    public void mainArray(String[] a, int index) {
        returnArray(a);
        reversedArray(a);
        deleteElement(a, index);
    }

    public void returnArray(String[] x) {
        String y = "";

        for (String i : x) {
            y = y + i;
        }

        System.out.println(y);
    }

    public void reversedArray(String[] y) {
        String x = "";

        for (int i = y.length - 1; i >= 0; i--) {
            x = x + y[i];
        }

        System.out.println(x);
    }

    public void deleteElement(String[] z, int x) {
        int a = z.length;

        for (int k = x; k < a - 1; k++) { // moving the elements that are coming after
            z[k] = z[k + 1];
        }
        a--;                            // making array smaller

        for (int i = 0; i < a; i++) {   // showing all elements of array
            System.out.print(z[i].toString() + " ");
        }
    }
}
