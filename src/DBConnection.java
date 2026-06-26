import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String url =
            "jdbc:mysql://localhost:3306/mydatabase";

    private static final String user = "root";

    private static final String password =
            "dnab@1111@";

    public static Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
                url,
                user,
                password
        );
    }
}