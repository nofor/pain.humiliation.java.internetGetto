package pain.humiliation.java.internetGetto.PetroKozak.task13;

import org.junit.Test;

public class Task13Test {

    Task13 task13 = new Task13();

    @Test
    public void testCreatingTable() {
        task13.createTable("CREATE TABLE FIRSTTABLE " +
                "(ID INT PRIMARY KEY     NOT NULL," +
                " NAME           TEXT    NOT NULL, " +
                " SURNAME        TEXT    NOT NULL, " +
                " AGE            INT     NOT NULL, " +
                " SEX            TEXT    NOT NULL)");
    }

    @Test
    public void testDatabaseSelection() {
        task13.selectInDatabase("SELECT * FROM FIRSTTABLE;");
    }

    @Test
    public void testDatabaseInsertion() {
        task13.insertIntoDatabase("INSERT INTO FIRSTTABLE (ID,NAME,SURNAME,AGE,SEX) " +
                "VALUES (1, 'Petro', 'Kozak', 22, 'male' );");
    }

    @Test
    public void testDatabaseDeletion() {
        task13.deleteFromId("DELETE from FIRSTTABLE where ID=1;");
    }

    @Test
    public void testDroppingTable() {
        task13.dropTable("DROP TABLE FIRSTTABLE");
    }
}
