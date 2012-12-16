/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ozan
 */
public class Connect {
    
    private Connection conn;
    private String userName = "root";
    private String password = "root";
    private String server = "jdbc:mysql://localhost:3306/milkyweb";
    public Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(this.server,this.userName,this.password);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
    public Connection getConn() {
        return this.conn;
    }
    
    public void closeConn() {
        try {
            conn.close();
        } catch (Exception error) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, error);
        }
    }
    
    
    
}
