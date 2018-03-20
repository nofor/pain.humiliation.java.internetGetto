package pain.humiliation.java.internetGetto.PetroKozak.task15;

import org.junit.Test;

public class task15Test {
    Task15 task15 = new Task15("{  \n" +
            "   \"users\":[  \n" +
            "      {  \n" +
            "         \"name\":\"Calllka\",\n" +
            "         \"surname\":\"Novicov\",\n" +
            "         \"age\":25\n" +
            "      },\n" +
            "      {  \n" +
            "         \"name\":\"Petya\",\n" +
            "         \"surname\":\"Kozak\",\n" +
            "         \"age\":22\n" +
            "      }\n" +
            "   ]\n" +
            "}");

    @Test
    public void testConverter(){
        System.out.println(task15.convertToObject());

    }

    @Test
    public void test() {
        task15.insertToDB();
    }

    @Test
    public void selectAllInDB() {
        task15.select();
    }

    @Test
    public void testConvertToJson() {
        task15.convertToJson();
    }

}
