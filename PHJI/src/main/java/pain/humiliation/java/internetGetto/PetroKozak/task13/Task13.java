package pain.humiliation.java.internetGetto.PetroKozak.task13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task13 {

    private static Connection connection = null;
    private static Statement statement = null;


    public void createTable(String creatingTableQuery) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");
            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            statement.executeUpdate(creatingTableQuery);
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    public void selectInDatabase(String selectionQuery) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectionQuery);

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
            statement.close();
            connection.close();
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
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.commit();

            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
