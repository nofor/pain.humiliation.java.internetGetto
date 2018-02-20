package pain.humiliation.java.internetGetto.PetroKozak.task10;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Task10Test {

    private File file = new File("C:\\Users\\Acer\\Desktop", "new.txt");
    private Task10 task10 = new Task10();


    @Test
    public void testOutputWithFiles() throws IOException {
        task10.outPutWithFileReader(file);
    }
}
