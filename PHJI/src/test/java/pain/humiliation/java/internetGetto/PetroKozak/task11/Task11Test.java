package pain.humiliation.java.internetGetto.PetroKozak.task11;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Task11Test {

    private  String pathOfOriginalFile = "C:\\Users\\Acer\\Desktop";
    private String nameOfOriginalFile = "task11.txt";
    private  String pathOfResultFile = "C:\\Users\\Acer\\Desktop";
    private String nameOfResultFile = "result.txt";
    private ArrayList <String> values = new ArrayList<>();

    Task11 task11 = new Task11(pathOfOriginalFile,nameOfOriginalFile);

    @Test
    public void testCountingValuesAndPrintingItInANewFile() throws IOException {
        Collections.addAll(values,"Java", "C++","Python","PHP" );
        task11.writeResultInANewFile(task11.countValues(task11.writeRandomValues(values,pathOfOriginalFile,nameOfOriginalFile)),
                new File(pathOfResultFile,nameOfResultFile));
    }
}
