package pain.humiliation.java.internetGetto.PetroKozak.task11;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Task11Test {
    private String pathOfOriginalFile = "C:\\Users\\Acer\\Desktop\\task11.txt";
    private String pathOfResultFile = "C:\\Users\\Acer\\Desktop\\result.txt";
    private String regex = "[^a-z A-Z 0-9]";
    private Task11 task11 = new Task11();

    @Test
    public void testCountingValuesAndPrintingItInANewFile() throws IOException {
        task11.writeResultInANewFile(task11.readFile(pathOfOriginalFile,regex), new File(pathOfResultFile));
    }
}
