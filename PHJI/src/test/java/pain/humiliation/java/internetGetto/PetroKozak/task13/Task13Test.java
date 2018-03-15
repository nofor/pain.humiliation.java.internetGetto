package pain.humiliation.java.internetGetto.PetroKozak.task13;

import org.junit.Test;

public class Task13Test {

    Task13 task13 = new Task13();

    @Test
    public void testCreatingTable() {  //todo make your id as autoincrement
        task13.createTable("CREATE TABLE FIRSTTABLE " +
                "(ID INT PRIMARY KEY     NOT NULL," +
                " NAME           TEXT    NOT NULL, " +
                " SURNAME        TEXT    NOT NULL, " +
                " AGE            INT     NOT NULL, " +
                " SEX            TEXT    NOT NULL)");
    }

    @Test
    public void testDatabaseSelection() {
        task13.selectFromDatabase("SELECT * FROM FIRSTTABLE;");
    }

    @Test
    public void testDatabaseInsertion() {
        task13.doSomeOperationAccordingToTheInputQuery("INSERT INTO FIRSTTABLE (ID,NAME,SURNAME,AGE,SEX) " +
                "VALUES (2, 'Petro', 'Kozak', 22, 'male' );");
    }

    @Test
    public void testDatabaseDeletion() {
        task13.doSomeOperationAccordingToTheInputQuery("DELETE from FIRSTTABLE where ID=1;");
    }

    @Test
    public void testDroppingTable() {
        task13.doSomeOperationAccordingToTheInputQuery("DROP TABLE FIRSTTABLE");
    }
}
