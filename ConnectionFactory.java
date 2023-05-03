import java.sql.*;

public class ConnectionFactory {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3360/jaime",
                    "root", 
                    "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Connection con = getConnection();
        System.out.println (" Ok");
    }

}

