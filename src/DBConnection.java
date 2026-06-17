import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String url = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String user = "root";
    private static final String password = "your_password";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url, user, password);
    }
}