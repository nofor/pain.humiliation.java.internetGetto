package pain.humiliation.java.internetGetto.Calllka.task10;

import java.io.*;
import java.util.Scanner;

//todo you make this method without creating "fr" variable DONE
//todo you make this method without creating "scan" variable
//todo rework it with TRY..CATCH DONE
public class Task10 {
    private String path;
    private File file;

    public Task10(String path, String fileName) {
        this.path = path;
        this.file = new File(this.path, fileName);
    }

    public void outputFileWithScanner(String writeText) {
        checkDirectoryAndFileName(this.path, writeText);

        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputFileWithBufferReader(String writeText) {
        checkDirectoryAndFileName(this.path, writeText);

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String stringLine;

            while ((stringLine = bufferedReader.readLine()) != null) {
                System.out.println(stringLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkDirectoryAndFileName(String path, String writeText) {

        if (!new File(path).isDirectory()) {
            new File(path).mkdir();
        }

        if (!file.exists()) {
            try {
                file.createNewFile();

                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                    bufferedWriter.write(writeText);
                    bufferedWriter.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
