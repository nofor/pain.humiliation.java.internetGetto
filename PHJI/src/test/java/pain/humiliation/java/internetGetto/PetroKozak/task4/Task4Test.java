package pain.humiliation.java.internetGetto.PetroKozak.task4;

import org.junit.Test;

public class Task4Test {

    Task4 task4 = new Task4();

    @Test
    public void testTask4(){
        String[] array= {"I ","dont ","want ","to ","be ","killed ","by ","sensei ","with ","ritual ","bonfire "};
        task4.mainArray(array, 15);
    }
}
