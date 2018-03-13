package pain.humiliation.java.internetGetto.Calllka.task13;

import java.sql.*;

public class Task13 {
    String url = null;

    Task13(String url) {
        this.url = url;
    }

    public void createTable() {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS CalllkaTable (id integer PRIMARY KEY AUTOINCREMENT, name text NOT NULL, secondName text NOT NULL, age integer, sex text);";

        try (Connection connection = conn();
             Statement statement = connection.createStatement()) {
            statement.execute(createTableQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertInToTable(String name, String secondName, int age, String sex) {
        String insertDataQuery = "INSERT INTO CalllkaTable(name, secondName, age, sex) VALUES(?,?,?,?)";

        try (Connection connection = conn();
             PreparedStatement preparedStatement = connection.prepareStatement(insertDataQuery)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, secondName);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, sex);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDataFromTable(int id) {
        String insertDataQuery = "DELETE FROM CalllkaTable WHERE id = ?";

        try (Connection connection = conn();
             PreparedStatement preparedStatement = connection.prepareStatement(insertDataQuery)) {

            System.out.println("Deleting id number: " + id);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectAllFromTable() {
        String insertDataQuery = "SELECT * FROM CalllkaTable";

        try (Connection connection = conn();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(insertDataQuery)) {

            System.out.println("Output all table");
            while (resultSet.next()){
                System.out.printf("ID: %d, Name: %s, SecondName: %s, Age: %d, Sex: %s\n",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("secondName"),
                        resultSet.getInt("age"),
                        resultSet.getString("sex"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection conn() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Opened database successfully");
        return conn;
    }

}
