package pain.humiliation.java.internetGetto.Calllka.task10;

import org.junit.Test;


public class Task10Test {

    private String fileName = "temp.txt";
    private String path = "/home/calllka/Programming/Kurs/" +
            "pain.humiliation.java.internetGetto/PHJI/src/main" +
            "/java/pain/humiliation/java/internetGetto/Calllka" +
            "/task10/sourcePackage";
    private Task10 task10 = new Task10(path, fileName);
    private Task10_1 task10_1 = new Task10_1(path, fileName);

    @Test
    public void runOutputFile(){
        task10.outputFileWithScanner();
        task10.outputFileWithBufferReader();
    }

    @Test
    public void ere(){
        task10_1.writeInToHashMap(path, fileName + "2");
    }

}
