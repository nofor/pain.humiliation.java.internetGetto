package pain.humiliation.java.internetGetto.Calllka.task11;

import org.junit.Test;
//todo UPPER case, Concatenation
public class Task11Test {

    private String fileName = "Course Useful100500.txt";
    private String path = "C:\\Users\\Zaitsev Artem\\Desktop";
    private Task11 task11 = new Task11(path, fileName);

    @Test
    public void writeTextInNewFileTest(){
        String text = "some some some some\ntext text text\ntemp temp\nword";  //todo is this file ?

        task11.writeInToHashMap(path, fileName + "2", text);
    }
}
