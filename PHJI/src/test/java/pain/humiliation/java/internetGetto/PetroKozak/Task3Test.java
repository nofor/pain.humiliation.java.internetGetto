package pain.humiliation.java.internetGetto.PetroKozak;

import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task3.Task3;

public class Task3Test {
    Task3 task3= new Task3();

    @Test
    public void testTask3(){
        System.out.println(task3.putTogether("Don't" ,"Kill", "Me"));
        System.out.println(task3.reverse("dlrow olleH"));
        System.out.println(task3.symbolDelete("I saw him working hard","s","w","o","h","i"));

    }
}
