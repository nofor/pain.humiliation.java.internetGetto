package pain.humiliation.java.internetGetto.Calllka.task10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task10 {

    public void outputFile(String path) throws IOException {    //todo rework it with TRY..CATCH
        FileReader fr = new FileReader(path);    //todo you make this method without creating "fr" variable
        Scanner sc = new Scanner(fr);    //todo you make this method without creating "scan" variable

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        fr.close();
    }
}
