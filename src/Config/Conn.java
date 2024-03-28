package Config;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Conn {
    static String MyDriver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/db_aplikasi";
    static String user = "root";
    static String pwd = "";
    static Connection cn;
    
    public static Connection GetConn(){
        try {
            Class.forName(MyDriver);
            cn = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
        }
        return cn;
    }
}
