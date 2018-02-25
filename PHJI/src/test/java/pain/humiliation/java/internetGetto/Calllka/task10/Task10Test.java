package pain.humiliation.java.internetGetto.Calllka.task10;

import org.junit.Test;


public class Task10Test {

    private String fileName = "temp.txt";  //todo use UPPER case
    private String path = "/home/calllka/Programming/Kurs/" +  //todo do not use concatenation during constant creating
            "pain.humiliation.java.internetGetto/PHJI/src/main" +
            "/java/pain/humiliation/java/internetGetto/Calllka" +
            "/task10/sourcePackage";  //todo use UPPER case
    private Task10 task10 = new Task10(path, fileName);  //todo use UPPER case

    @Test
    public void runOutputFile(){
        String writeText = "some some some some\ntext text text\ntemp temp\nword";
        task10.outputFileWithScanner(writeText);
        task10.outputFileWithBufferReader(writeText);
    }

}
