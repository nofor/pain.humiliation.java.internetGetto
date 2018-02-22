package pain.humiliation.java.internetGetto.PetroKozak.task10;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Task10Test {

    private File file = new File("C:\\Users\\Acer\\Desktop", "new.txt");  //todo use File constructor with one param "public File(String pathname)"
    private Task10 task10 = new Task10();


    @Test
    public void testOutputWithFileReader() throws IOException {    //todo remove "throws IOException"
        long start = System.nanoTime();
        task10.outPutWithFileReader(file);
        long end = System.nanoTime()-start;

        System.out.println("Output with FileReader took " + TimeUnit.NANOSECONDS.toMicros(end)+" microseconds");
    }

    @Test
    public void testOutputWithBufferedReader()throws IOException{    //todo remove "throws IOException"
        long start = System.nanoTime();
        task10.outputWithBufferedReader(file);
        long end = System.nanoTime()-start;

        System.out.println("Output with BufferedReader took "+ TimeUnit.NANOSECONDS.toMicros(end)+" microseconds");

    }
}
