package pain.humiliation.java.internetGetto.Calllka.task10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task10 {

    public void outputFile(String path) throws IOException {
        File directory = new File(path);
        FileReader fr = new FileReader(directory);
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        fr.close();
    }
}
