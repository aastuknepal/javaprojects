package mailapi;

import java.sql.*;

public class mailapi {
    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/kaley";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establishing connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // 1. Create table 'student'
            createStudentTable(connection);

            // 2. Insert 5 records into the table
            insertStudentRecords(connection);

            // 3. Update address of student with id 3 to 'kathmandu'
            updateStudentAddress(connection, 3, "kathmandu");

            // 4. Delete student record with id 1
            deleteStudentRecord(connection, 1);

            // 5. Display all student records
            displayAllStudents(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createStudentTable(Connection connection) throws SQLException {
        String createTableQuery = "CREATE TABLE IF NOT EXISTS student (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "name VARCHAR(50)," +
                "address VARCHAR(50))";
        Statement statement = connection.createStatement();
        statement.execute(createTableQuery);
        System.out.println("Table 'student' created successfully!");
    }

    private static void insertStudentRecords(Connection connection) throws SQLException {
        String insertQuery = "INSERT INTO student (id, name, address) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        // Insert 5 records
        insertRecord(preparedStatement, 1, "buddha", "jorpati");
        insertRecord(preparedStatement, 2, "rohan", "snkhu");
        insertRecord(preparedStatement, 3, "astuk", "narayantar");
        insertRecord(preparedStatement, 4, "sulav", "chabahil");
        insertRecord(preparedStatement, 5, "sanjok", "kathamandu");
        System.out.println("Inserted 5 records into 'student' table.");
    }

    private static void insertRecord(PreparedStatement preparedStatement, int id, String name, String address) throws SQLException {
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setString(3, address);
        preparedStatement.executeUpdate();
    }

    private static void updateStudentAddress(Connection connection, int studentId, String newAddress) throws SQLException {
        String updateQuery = "UPDATE student SET address = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
        preparedStatement.setString(1, newAddress);
        preparedStatement.setInt(2, studentId);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Address updated for student with id " + studentId);
        } else {
            System.out.println("No student found with id " + studentId);
        }
    }

    private static void deleteStudentRecord(Connection connection, int studentId) throws SQLException {
        String deleteQuery = "DELETE FROM student WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        preparedStatement.setInt(1, studentId);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Deleted student record with id " + studentId);
        } else {
            System.out.println("No student found with id " + studentId);
        }
    }

    private static void displayAllStudents(Connection connection) throws SQLException {
        String selectQuery = "SELECT * FROM student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectQuery);
        System.out.println("Student Records:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String address = resultSet.getString("address");
            System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address);
        }
    }
}
