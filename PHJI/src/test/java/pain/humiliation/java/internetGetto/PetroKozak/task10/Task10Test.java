package pain.humiliation.java.internetGetto.PetroKozak.task10;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Task10Test {

    private File file = new File("C:\\Users\\Acer\\Desktop\\new.txt");
    private Task10 task10 = new Task10();


    @Test
    public void testOutputWithFileReader()  {
        long start = System.nanoTime();

        try {
            task10.outPutWithFileReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime()-start;

        System.out.println("Output with FileReader took " + TimeUnit.NANOSECONDS.toMicros(end)+" microseconds");
    }

    @Test
    public void testOutputWithBufferedReader(){
        try {
            task10.outputWithBufferedReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
