package pain.humiliation.java.internetGetto.Calllka;

import org.junit.Test;
import pain.humiliation.java.internetGetto.Calllka.task2.Task2;

public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void mainTest(){
        System.out.println(task2.concatenationStringWithStringBuilder("abc","abc","abc"));
        System.out.println(task2.reverseStringWithStringBuilder("abc","abc","abc"));
        System.out.println(task2.reverseString("abc","abc","abc"));
        System.out.println(task2.deleteSymbol("delete some symbol","d"," ","o"));
        System.out.println(task2.myDeleteSymbol("delete some symbol","d"," ","o"));
    }

}