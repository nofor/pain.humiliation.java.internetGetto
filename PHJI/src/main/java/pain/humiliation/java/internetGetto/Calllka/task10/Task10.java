package pain.humiliation.java.internetGetto.Calllka.task10;

import java.io.*;
import java.util.Scanner;

//todo you make this method without creating "fr" variable DONE
//todo you make this method without creating "scan" variable
//todo rework it with TRY..CATCH DONE
//todo use recursive dir creating DONE can see in Task11
//todo NEVER use try in try DONE
//todo do not create two different new files. Use "file" from constructor DONE
public class Task10 {
    private String path;
    private File file;

    Task10(String path) {
        this.path = path;
    }

    public void outputFileWithScanner() {
        checkDirectoryAndFileName();

        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputFileWithBufferReader() {
        checkDirectoryAndFileName();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String stringLine;

            while ((stringLine = bufferedReader.readLine()) != null) {
                System.out.println(stringLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkDirectoryAndFileName() {
        file = new File(path);

        if (!file.getParentFile().isDirectory()) {
            try {
                throw new FileNotFoundException("Incorrect path or directory isn't exists");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Your path to directory: " + file.getParentFile());

                System.exit(1);
            }
        } else if (!file.exists()) {
            try {
                throw new FileNotFoundException("Incorrect filename or file isn't exists");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Your filename: " + file.getName());

                System.exit(1);
            }
        } else {
            System.out.println("File is found");
        }
    }
}
