package pain.humiliation.java.internetGetto.PetroKozak.task10;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task10 {
    public void outPutWithFileReader(File file) throws IOException {
        FileReader fr = new FileReader(file);
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

        fr.close();
    }
}
