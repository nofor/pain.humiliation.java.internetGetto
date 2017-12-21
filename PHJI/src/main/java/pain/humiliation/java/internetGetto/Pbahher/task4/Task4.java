package pain.humiliation.java.internetGetto.Pbahher.task4;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by pbahher on 12/21/17.
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

    public void reverseArray (String [] incomingArray) {
        String a = "";

        for (int i = incomingArray.length - 1; i >= 0; i--){
            a = a + incomingArray[i];
        }

        System.out.println(a);
    }

    public void indexArrayDelete (String [] incomingArray) {
        String a = "";
        int b = 11;

        for (int i = 0; i <= incomingArray.length; i++) {
            if (i == b)
                break;
            System.out.print(a + incomingArray[i]);
        }
    }
}
