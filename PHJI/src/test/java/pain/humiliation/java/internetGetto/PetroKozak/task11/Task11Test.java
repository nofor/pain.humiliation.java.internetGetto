package pain.humiliation.java.internetGetto.PetroKozak.task11;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Task11Test {

    private String pathOfOriginalFile = "C:\\Users\\Acer\\Desktop\\task11.txt";
    private String nameOfOriginalFile = "task11.txt";
    private String pathOfResultFile = "C:\\Users\\Acer\\Desktop\\result.txt";
    private String nameOfResultFile = "result.txt";


    Task11 task11 = new Task11();

    @Test
    public void testCountingValuesAndPrintingItInANewFile() throws IOException {
       task11.writeResultInANewFile(task11.readFile(pathOfOriginalFile),new File(pathOfResultFile));
    }
}
