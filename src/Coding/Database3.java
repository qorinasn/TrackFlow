
package Coding;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database3 {

    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
            try{
    String url ="jdbc:mysql://localhost:3306/tracking";
    String user ="root";
    String pass = "";
    
    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    
    MySQLConfig = DriverManager.getConnection(url, user,pass);
                System.out.println("Koneksi Ke Database Berhasil");
    }catch(SQLException e){
                System.out.println("Koneksi ke Database Gagal"+ e.getMessage());
    }
return MySQLConfig;
}
}
