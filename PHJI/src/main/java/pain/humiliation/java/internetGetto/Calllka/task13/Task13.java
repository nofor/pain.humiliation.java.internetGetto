package pain.humiliation.java.internetGetto.Calllka.task13;

import java.io.File;
import java.sql.*;

//todo add drop table method DONE
//todo do not use variable DONE
public class Task13 {
    private static Connection dbConnection;

    static {
        try {
            dbConnection = DriverManager.getConnection(new StringBuilder("jdbc:sqlite:").append(new File("src/main/resources/CalllkaDB").getAbsolutePath()).toString());

            System.out.println("Opened database successfully");
        } catch (SQLException e) {
            e.printStackTrace();

            dbConnection = null;
            System.exit(0); //todo close you app DONE
        }
    }

    public void createTable() {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS CalllkaTable (id integer PRIMARY KEY AUTOINCREMENT, name text NOT NULL, secondName text NOT NULL, age integer, sex text);";

        try (Statement statement = dbConnection.createStatement()) {
            boolean checkStatement =  statement.execute(createTableQuery);  //todo check execute results DONE

            if(checkStatement){
                System.out.println("Incorrect SQL Query");
            }

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

            boolean checkPreparedStatement = preparedStatement.execute(); //todo check results DONE

            if(checkPreparedStatement){
                System.out.println("Incorrect SQL Query");
            }

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

            boolean checkPreparedStatement = preparedStatement.execute();

            if(checkPreparedStatement){
                System.out.println("Incorrect SQL Query");
            }

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectAllFieldsFromTable() {
        String insertDataQuery = "SELECT * FROM CalllkaTable";

        try (Statement statement = dbConnection.createStatement();
             ResultSet resultSet = statement.executeQuery(insertDataQuery)) {  //todo remove extra char at the beginning DONE
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

    public void dropTable() {
        String dropTableQuery = "DROP TABLE CalllkaTable";

        try (Statement statement = dbConnection.createStatement()) {
            boolean checkStatement = statement.execute(dropTableQuery);

            if(checkStatement){
                System.out.println("Incorrect SQL Query");
            } else {
                System.out.println("The table deleted");
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
