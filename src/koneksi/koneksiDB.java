/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author sigit masaid
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksiDB {
    private static Connection conn;
    
     public static Connection getkoneksi(){
        
     String  host = "jdbc:mysql://localhost/rentalmobil",
                user = "root",
                pass = "";
     try{
            conn = (Connection) DriverManager.getConnection(host, user, pass);
        }
     catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return conn;
    }
}
    

