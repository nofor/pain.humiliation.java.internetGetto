package pain.humiliation.java.internetGetto.PetroKozak.task13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//todo move closing of connection and statement to separate method and use it
//todo you reinitialize you connection in every method, move it to separate method and initialize it only once
//todo you no need separate method (insertIntoDatabase(), deleteFromId(), dropTable()) because all of them use doSomeOperationAccordingToTheInputQuery() method. Difference only int passed query string.
//todo you must not have any duplicate code !!!
public class Task13 {

    private static Connection connection = null;
    private static Statement statement = null;

    //todo really, again extra line ?
    public void createTable(String creatingTableQuery) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");  //todo as you have commited your DB in GIT repository, you need set this path into resource folder
            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            statement.executeUpdate(creatingTableQuery);
            //todo add extra line because of closing and executing is different operations
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());  //todo you can use e.printStackTrace(); instead of sout
            System.exit(0);    //todo why are you need it here ?
        }
        //todo add extra line again
        System.out.println("Table created successfully");    //todo this log will be printed in any case (fail or true) of table creating. This is BUG
    }

    public void selectInDatabase(String selectionQuery) {    //todo what does mean "selectInDatabase", you select from database
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");    //todo as you have commited your DB in GIT repository, you need set this path into resource folder
            connection.setAutoCommit(false);    //todo why are you need it here ?
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
            //todo add extra line
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());    //todo you can use e.printStackTrace(); instead of sout
            System.exit(0);
        }
        //todo add extra line again
        System.out.println("Operation done successfully");    //todo this log will be printed in any case (fail or true) of operation. This is BUG
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
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Java\\Project\\pain.humiliation.java.internetGetto\\PHJI\\src\\main\\resources\\pedroDB.db");  //todo as you have commited your DB in GIT repository, you need set this path into resource folder
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");

            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.commit();

            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());    //todo you can use e.printStackTrace(); instead of sout
            System.exit(0);    //todo why are you need it here ?
        }
        //todo add extra line again
        System.out.println("Operation done successfully");    //todo this log will be printed in any case (fail or true) of operation. This is BUG
    }
}
