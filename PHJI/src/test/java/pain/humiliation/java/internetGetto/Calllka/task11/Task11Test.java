package pain.humiliation.java.internetGetto.Calllka.task11;

import org.junit.Test;

public class Task11Test {

    private String fileName = "temp.txt";
    private String path = "/home/calllka/Programming/Kurs/" +
            "pain.humiliation.java.internetGetto/PHJI/src/main" +
            "/java/pain/humiliation/java/internetGetto/Calllka" +
            "/task11/sourcePackage";
    private Task11 task11 = new Task11(path, fileName);

    @Test
    public void writeTextInNewFileTest(){
        String text = "some some some some\ntext text text\ntemp temp\nword";

        task11.writeInToHashMap(path, fileName + "2", text);
    }
}
