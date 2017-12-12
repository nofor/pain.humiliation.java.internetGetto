package pain.humiliation.java.internetGetto.PetroKozak;

import org.junit.Test;
import pain.humiliation.java.internetGetto.PetroKozak.task1.Task3;

public class Task3Test {
    Task3 task3= new Task3();

    @Test
    public void testTask3(){
        System.out.println(task3.putTogetherAndReverse("Hello" ,"from", "the","other","side"));
        System.out.println(task3.symbolDelete("I saw him working hard","s","w","o","h","i"));
    }
}
