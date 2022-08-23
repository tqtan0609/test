import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = MyConnection.getInstance().getConnection();
        if (conn != null) {
            System.out.println("Kết nối thành công");
        } else {
            System.out.println("Kết nối thất bại");
        }
    }
}
