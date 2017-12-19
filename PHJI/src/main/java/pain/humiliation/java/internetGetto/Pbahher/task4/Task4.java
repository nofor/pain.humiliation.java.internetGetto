package pain.humiliation.java.internetGetto.Pbahher.task4;

/**
 * Created by pbahher on 12/16/17.
 */
public class Task4 {

    public void runIterationMethod(String [] incomingArray) {  //todo Add index for deleting
        arrayItteration(incomingArray);

    }

    public void arrayItteration (String [] incomingArray) {
        String a = "";

        for (String str : incomingArray) {
            a = a + str;
        }

        System.out.println(a);
    }

    public String [] reverseArray (String [] incomingArray) {  //todo why return "String []"
        String a = "";

        for (String str : incomingArray) {
            a = a + str;
        }

        System.out.println(a);

        return null;
    }

}

