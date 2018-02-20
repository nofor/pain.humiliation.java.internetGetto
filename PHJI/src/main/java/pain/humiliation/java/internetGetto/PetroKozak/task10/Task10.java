package pain.humiliation.java.internetGetto.PetroKozak.task10;


import java.io.*;
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

    public void outputWithBufferedReader(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}
