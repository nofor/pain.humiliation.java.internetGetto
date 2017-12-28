package pain.humiliation.java.internetGetto.PetroKozak.task5;
import org.junit.Test;

public class Task5Test {

    Task5 task5 = new Task5();

    @Test
    public void task5Test(){
        int[] palindrome ={1,2,3,4,5,4,3,2,1};
        int [] x= {1,5,2,33,14,97,0,18,27,0,0,97};
        task5.mainTask5(x,palindrome,33);

    }
}
