package pain.humiliation.java.internetGetto.Pbahher.task4;

/**
 * Created by pbahher on 12/21/17.
 */
public class Task4 {

    public void runIterationMethod(String[] incomingArray, int index) {
        arrayItteration(incomingArray);
        reverseArray(incomingArray);
        indexArrayDelete(incomingArray,  index);
    }

    public void arrayItteration(String[] incomingArray) {
        String a = "";

        for (String str : incomingArray) {
            a = a + str;
        }

        System.out.println(a);
    }

    public void reverseArray(String[] incomingArray) {
        String a = "";

        for (int i = incomingArray.length - 1; i >= 0; i--) {
            a = a + incomingArray[i];
        }

        System.out.println(a);
    }

    public void indexArrayDelete(String[] incomingArray, int index) {
        String a = "";

        for (int i = 0; i <= incomingArray.length; i++) {
            if (i == index) {
                incomingArray[i] = "_";
            }
        }

        for (String array : incomingArray) {
            a = a + array;
        }
        System.out.println(a);
    }
}