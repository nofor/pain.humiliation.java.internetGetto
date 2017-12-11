package pain.humiliation.java.internetGetto.Calllka;

import org.junit.Test;
import pain.humiliation.java.internetGetto.Calllka.task1.Task2;

public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void workWithStringTest(){
        System.out.println(task2.workWithString(true,"1","2","3","1","2","3"));
        System.out.println(task2.workWithString(false,"1","2","3","1","2","3"));
        System.out.println(task2.deleteSymbol("delete some symbol","d","l","e"," ", "m", "1"));
    }

}
