package pain.humiliation.java.internetGetto.Calllka.task10;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

//todo do not use concatenation during constant creating DONE
//todo use UPPER case DONE
public class Task10Test {

    private String PATH_TO_FILE = "/home/calllka/Programming/Kurs/pain.humiliation.java.internetGetto/PHJI/src/main/java/pain/humiliation/java/internetGetto/Calllka/task11/sourcePackage/temp";
    private Task10 task10 = new Task10(PATH_TO_FILE);

    @Test
    public void runOutputFile() {
        task10.outputFileWithScanner();
        task10.outputFileWithBufferReader();
    }

}
