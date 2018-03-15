package pain.humiliation.java.internetGetto.PetroKozak.task13;

import java.io.File;
import java.sql.*;

public class Task13 {

    private static final String PATH = new StringBuilder("jdbc:sqlite:").append(new File("src/main/resources/pedroDB").getAbsolutePath()).toString();  //todo the same for Callka
    private static Connection connection = null;

    static {
        try {
            connection = DriverManager.getConnection(PATH);

            System.out.println("Opened database successfully");
        } catch (SQLException e) {
            e.printStackTrace();
            //todo close your app
        }
    }

    public void createTable(String creatingTableQuery) {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(creatingTableQuery);  //todo use execute

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectFromDatabase(String selectionQuery) {
        try (Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(selectionQuery);  //todo use execute

            while (rs.next()) {
                System.out.println("ID = " + rs.getInt("id"));
                System.out.println("NAME = " + rs.getString("name"));
                System.out.println("SURNAME = " + rs.getString("surname"));
                System.out.println("AGE = " + rs.getInt("age"));
                System.out.println("SEX = " + rs.getString("sex"));
                System.out.println();
            }

            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);  //todo DELETE it
        }
    }

    public void doSomeOperationAccordingToTheInputQuery(String query) {  //todo rename it
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);

            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
