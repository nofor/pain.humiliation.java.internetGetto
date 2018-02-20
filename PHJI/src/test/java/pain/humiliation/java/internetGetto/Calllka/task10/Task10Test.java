package pain.humiliation.java.internetGetto.Calllka.task10;

import org.junit.Test;

import java.io.IOException;

public class Task10Test {

    private Task10 task10 = new Task10();
    private String path = "/home/calllka/Programming/Kurs/" +
            "pain.humiliation.java.internetGetto/PHJI/src/main" +
            "/java/pain/humiliation/java/internetGetto/Calllka" +
            "/task10/sourcePackage/temp.txt";

    @Test
    public void runOutputFile() throws IOException {
        task10.outputFile(path);
    }

}
