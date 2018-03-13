package pain.humiliation.java.internetGetto.PetroKozak.task13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task13 {

    private static Connection c = null;  //todo use full naming, not just "c"
    private static Statement stmt = null;  //todo use full naming, not just "stmt"


    public void createTable(String creatingTableQuery) {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            stmt.executeUpdate(creatingTableQuery);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    public void selectInDatabase(String selectionQuery) {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(selectionQuery);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");
                String sex = rs.getString("sex");

                System.out.println("ID = " + id);
                System.out.println("NAME = " + name);
                System.out.println("SURNAME = " + surname);
                System.out.println("AGE = " + age);
                System.out.println("SEX = " + sex);
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

    public void insertIntoDatabase(String insertQuery) {
        doSomeOperationAccordingToTheInputQuery(insertQuery);
    }

    public void deleteFromId(String deleteQuery) {
        doSomeOperationAccordingToTheInputQuery(deleteQuery);
    }

    public void dropTable(String droppingQuery) {
        doSomeOperationAccordingToTheInputQuery(droppingQuery);
    }

    public void doSomeOperationAccordingToTheInputQuery(String query) {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            stmt.executeUpdate(query);
            c.commit();

            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
