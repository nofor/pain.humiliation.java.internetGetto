package pain.humiliation.java.internetGetto.PetroKozak.task10;

import java.io.*;
import java.util.Scanner;

public class Task10 {
    public void outPutWithFileReader(File file) throws IOException {
        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputWithBufferedReader(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
