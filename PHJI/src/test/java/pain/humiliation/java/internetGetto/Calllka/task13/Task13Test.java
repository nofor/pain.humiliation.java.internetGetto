package pain.humiliation.java.internetGetto.Calllka.task13;

import org.junit.Before;
import org.junit.Test;

public class Task13Test {
    String url = "jdbc:sqlite:/home/calllka/Programming/Kurs/pain.humiliation.java.internetGetto/PHJI/src/main/resources/CalllkaDB";
    private Task13 task13 = new Task13(url);

    @Before
    public void createAndInsertTable(){
        task13.createTable();
        task13.insertInToTable("Calllka", "Novikov", 25, "male");
        task13.insertInToTable("Pedro", "Kakoytomeksikanec", 22, "male");
        task13.insertInToTable("Artemiya", "Senceyavna", 27, "female");
        task13.insertInToTable("Thisfieldwill", "Bedeleted", 28, "male");
        task13.insertInToTable("Petro", "Kozak", 22, "male");
        task13.insertInToTable("Artem", "Zaycev", 28, "male");
    }

    @Test
    public void testConn() {
        task13.selectAllFromTable();
        task13.deleteDataFromTable(4);
        task13.selectAllFromTable();
    }
}
