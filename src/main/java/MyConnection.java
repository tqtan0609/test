
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

    String hostName;
    String dbName;
    String userName;
    String password;
    String jdbc;
    String port;
    String className;
    String connURL;
    private static MyConnection instance;

    private MyConnection() {
        try {
            hostName = "localhost";
            dbName = "Quanlysinhvien";
            userName = "sa";
            password = "sinhnhat17";
            jdbc = "jdbc:sqlserver://";
            port = "1433";
            className = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            connURL = jdbc + hostName + ":" + port + ";databaseName=" + dbName + ";encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            System.out.println(connURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MyConnection getInstance() {
        if (instance == null) {
            instance = new MyConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(connURL, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public boolean closeConnection(Connection conn) {
        try {
            conn.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
