package Server.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/db_qts?useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String password = "JMV@xrms9";

    protected Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return null;
        }
    }

}
