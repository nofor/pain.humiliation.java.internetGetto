package pain.humiliation.java.internetGetto.PetroKozak.task10;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Acer\\Desktop", "new.txt");
        FileReader fr = new FileReader(file);
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
}
