package pain.humiliation.java.internetGetto.Pbahher.task4;

import javax.xml.bind.SchemaOutputResolver;  //todo remove unusefull import

/**
 * Created by pbahher on 12/21/17.
 */
public class Task4 {

    public void runIterationMethod(String [] incomingArray) {  //todo 1. Add index for deleting 2. Use this method for all 3 methods from above list
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

    public void indexArrayDelete (String [] incomingArray) {  //todo 1. make it dinamic.
        String a = "";
        int b = 11;  //todo remove it, we need dinamic index for deletion

        for (int i = 0; i <= incomingArray.length; i++) {
            if (i == b)
                break;
            System.out.print(a + incomingArray[i]);
        }
    }
}
