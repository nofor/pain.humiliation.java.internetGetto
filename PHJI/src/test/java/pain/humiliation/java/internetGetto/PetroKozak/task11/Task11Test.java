package pain.humiliation.java.internetGetto.PetroKozak.task11;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Task11Test {
    private String pathOfOriginalFile = "C:\\Media\\Dewelopment\\Configs\\Songs";
    private String pathOfResultFile = "C:\\Users\\Zaitsev Artem\\Desktop\\Доки\\result.txt";
    Task11 task11 = new Task11();  //todo why this is default ?

    @Test
    public void testCountingValuesAndPrintingItInANewFile() throws IOException {
        task11.writeResultInANewFile(task11.readFile(pathOfOriginalFile), new File(pathOfResultFile));
    }
}
