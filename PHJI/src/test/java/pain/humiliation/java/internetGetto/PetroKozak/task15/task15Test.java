package pain.humiliation.java.internetGetto.PetroKozak.task15;

import org.junit.Test;

public class task15Test {

    Task15 task15 = new Task15("{\"users\":[{\"surname\":\"Novicov\",\"name\":\"Calllka\",\"age\":25},{\"surname\":\"Kozak\",\"name\":\"Petya\",\"age\":22}]}");

    @Test
    public void testConvertToObject(){
        System.out.println(task15.convertJsonToObject());

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
        task15.convertMapToJson();
    }

    @Test
    public void testConvertJsonToXml(){
        System.out.println(task15.convertJsonToXml());
    }

    @Test
    public void testConvertXMLToJson(){
        System.out.println(task15.convertXMLToJson(task15.convertJsonToXml()));
    }
}
