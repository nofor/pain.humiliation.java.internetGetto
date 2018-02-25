package pain.humiliation.java.internetGetto.Calllka.task10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//todo you make this method without creating "fr" variable DONE
//todo you make this method without creating "scan" variable
//todo rework it with TRY..CATCH DONE
public class Task10 {
    private String path, fileName;
    private File file;

    public Task10(String path, String fileName) {
        this.path = path;
        this.fileName = fileName;
        this.file = new File(path, fileName);
    }

    public void outputFileWithScanner(){
        checkDirectoryAndFileName(this.path, this.fileName);

        try(Scanner scanner = new Scanner(new FileReader(file))){
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void outputFileWithBufferReader(){
        checkDirectoryAndFileName(this.path, this.fileName);

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String stringLine;

            while ((stringLine = bufferedReader.readLine()) != null){
                System.out.println(stringLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void checkDirectoryAndFileName(String path, String fileName){

        if(!new File(path).isDirectory()){
            new File(path).mkdir();
        }

        if(!file.exists()){
            try {
                new File(path + "/" + fileName).createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
