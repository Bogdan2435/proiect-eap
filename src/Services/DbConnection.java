package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static Connection con;
    private DbConnection() {};
    private static void Initiere()
    {
        String url = "jdbc:mysql://localhost:3306/pr_eap";
        String user = "root";
        String pass = "12345678";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        Initiere();
        return con;
    }
}
