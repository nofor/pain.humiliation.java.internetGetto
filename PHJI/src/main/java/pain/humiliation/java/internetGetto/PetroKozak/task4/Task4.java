package pain.humiliation.java.internetGetto.PetroKozak.task4;

public class Task4 {

    public void mainArray(String[] a, int index) {
        returnArray(a);
        reversedArray(a);
        deleteElement(a, index);
    }

    public String returnArray(String[] x) {
        String y = "";

        for (int i = 0; i < x.length; i++) {
            y = y + x[i];
        }

        System.out.println(y);

        return null;  //todo FIX it.
    }

    public String reversedArray(String[] y) {
        String x = "";

        for (int i = y.length - 1; i >= 0; i--) {
            x = x + y[i];
        }

        System.out.println(x);

        return null; //todo FIX it.
    }

    public String  deleteElement(String[] z, int x) {
        int a = z.length;

        for (int i = 0; i < a; i++) {    // loop for array to find the key of element that we are looking for
            if (i == x)
                break;  //todo WTF ???
        }

        for (int k = x; k < a - 1; k++) // moving the elements that are coming after
            z[k] = z[k + 1];
        a--;                            // making array smaller

        for (int i = 0; i < a; i++) {   // showing all elements of array
            System.out.print(z[i].toString() + " ");
        }

        return null;  //todo FIX it.
    }
}
