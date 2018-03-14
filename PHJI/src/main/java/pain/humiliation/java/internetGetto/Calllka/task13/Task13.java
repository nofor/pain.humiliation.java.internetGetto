package pain.humiliation.java.internetGetto.Calllka.task13;

import java.io.File;
import java.sql.*;

public class Task13 {
    private static final String PATH_TO_DB = new StringBuilder("jdbc:sqlite:").append(new File("src/main/resources/CalllkaDB").getAbsolutePath()).toString();
    private static Connection dbConnection = null;

    static {
        try {
            dbConnection = DriverManager.getConnection(PATH_TO_DB);

            System.out.println("Opened database successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS CalllkaTable (id integer PRIMARY KEY AUTOINCREMENT, name text NOT NULL, secondName text NOT NULL, age integer, sex text);";

        try (Statement statement = dbConnection.createStatement()) {
            statement.execute(createTableQuery);

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertInToTable(String name, String secondName, int age, String sex) {
        String insertDataQuery = "INSERT INTO CalllkaTable(name, secondName, age, sex) VALUES(?,?,?,?)";

        try (PreparedStatement preparedStatement = dbConnection.prepareStatement(insertDataQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, secondName);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, sex);
            preparedStatement.execute();

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDataFromTable(int id) {
        String insertDataQuery = "DELETE FROM CalllkaTable WHERE id = ?";

        try (PreparedStatement preparedStatement = dbConnection.prepareStatement(insertDataQuery)) {
            System.out.println("Deleting id number: " + id);

            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectAllFieldsFromTable() {
        String insertDataQuery = "SELECT * FROM CalllkaTable";

        try (Statement statement = dbConnection.createStatement();
             ResultSet resultSet = statement.executeQuery(insertDataQuery)) {
            System.out.println("Output all data from table: ");

            while (resultSet.next()) {
                System.out.printf("ID: %d, Name: %s, SecondName: %s, Age: %d, Sex: %s\n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("secondName"),
                        resultSet.getInt("age"),
                        resultSet.getString("sex"));
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
