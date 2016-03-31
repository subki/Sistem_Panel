package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    
    private String url = "jdbc:h2:C://SSM/db/panel;MODE=MYSQL;AUTO_SERVER=TRUE;IFEXISTS=TRUE";
 
    private String username = "root";
 
    private String password = "rahasia";
 
    public Connection connection(){
        try {
            Class.forName("org.h2.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("berhasil");
            return con;
        }catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e.getMessage());
            return null;
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e.getMessage());
            return null;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e.getMessage());
            return null;
        }
    }
//    static Connection connection;
//    public static Connection connection() throws SQLException{
//        try {
//            String host  = "jdbc:derby://localhost:1527/panel";
//            String uName = "root";
//            String uPass = "rahasia";
//            connection = DriverManager.getConnection(host, uName, uPass);
//     }catch ( SQLException err ) {
//            System.out.println(err.getMessage());
//     }
//         
//    public static Connection connection() throws SQLException{
//        if(connection == null){
//            DriverManager.registerDriver(new Driver());
//            String url = "jdbc:mysql://localhost:3306/panel";
//            String user = "root";
//            String password = "";
//            connection = DriverManager.getConnection(url, user, password);
//        }
//        return connection;
//    }
//    }
}
