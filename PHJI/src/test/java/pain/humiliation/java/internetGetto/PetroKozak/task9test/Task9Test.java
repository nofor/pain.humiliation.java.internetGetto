package pain.humiliation.java.internetGetto.PetroKozak.task9test;

import org.junit.Before;
import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task9.Task9;

import java.util.ArrayList;

public class Task9Test {

    Task9 task9 = new Task9();
    ArrayList <Object> arrayList = new ArrayList<Object>();

    @Before
    public void initialize() {
        task9.addingToCollection(arrayList);
    }

    @Test
    public void  testTimeOfPrintingOutWithCode(){
        long startTimeLinkedList = System.nanoTime();
        task9.printingOut25TimesWithCode(arrayList);

        System.out.print("Time spent to complete the method is: " + (System.nanoTime() - startTimeLinkedList));
    }
}
