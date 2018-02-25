package pain.humiliation.java.internetGetto.PetroKozak.task10;


import java.io.*;
import java.util.Scanner;

public class Task10 {
    //todo add extra line
    public void outPutWithFileReader(File file) throws IOException {    //todo rework it with TRY..CATCH
        FileReader fr = new FileReader(file);    //todo you make this method without creating "fr" variable
        Scanner scan = new Scanner(fr);    //todo you make this method without creating "scan" variable

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

        fr.close();
    }

    public void outputWithBufferedReader(File file) throws IOException {    //todo rework it with TRY..CATCH
        BufferedReader br = new BufferedReader(new FileReader(file));    //todo you make this method without creating "br" variable
        String line;

        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}
