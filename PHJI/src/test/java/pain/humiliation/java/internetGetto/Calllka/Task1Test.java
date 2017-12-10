package pain.humiliation.java.internetGetto.Calllka;

import org.junit.Test;
import pain.humiliation.java.internetGetto.Calllka.task1.Task1;

public class Task1Test {

    Task1 task1 = new Task1();

    @Test
    public void naturalNumberTest(){
        System.out.println(task1.naturelNumber(21, 8));
    }

    @Test
    public void sumNumberTest(){
        System.out.println(task1.sumNumber(99));
    }

    @Test
    public void changeTypesTest(){
        System.out.println(task1.changeTypes(99.222));
    }

    @Test
    public void sumNumberTTest(){
        System.out.println(task1.sumNumberT(111));
    }

    @Test
    public void verificationMethodTest(){
        task1.verificationMethod();
    }

}
