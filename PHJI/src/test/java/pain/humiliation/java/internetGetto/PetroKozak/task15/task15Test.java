package pain.humiliation.java.internetGetto.PetroKozak.task15;

import org.junit.Test;

import java.io.IOException;

public class task15Test {
    Converter converter = new Converter();
    Task15 task15 = new Task15();

    @Test
    public void testConverter() throws IOException {
        System.out.println(converter.convertToObjeect());

    }
    @Test
    public void test(){
        task15.insertToDB();
    }

    @Test
    public void selectAllInDB(){
      task15.select();
    }

}
