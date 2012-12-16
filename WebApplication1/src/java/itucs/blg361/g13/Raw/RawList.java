/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Raw;

/**
 *
 * @author Nadir
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class RawList {
    private Connection conn = null;
  
    public RawList(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/milkyweb","root", "root");
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public List<Raw> getList(){
        List<Raw> list = new LinkedList<Raw>();
        try{
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from raw");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("kind");
                Double weight = rs.getDouble("weight");
                Double price = rs.getDouble("price");
                Integer want = rs.getInt("dailyWant");
                Raw raw = new Raw(id,name,weight,price,want);
                list.add(raw);
            }
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        return list;
    }
    
    public void addRaw(Raw raw){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO RAW(KIND, WEIGHT, PRICE, DAILYWANT)"
                    + "VALUES(?,?,?,?)");
            stmt.setString(1, raw.getName());
            stmt.setDouble(2, raw.getWeight());
            stmt.setDouble(3, raw.getPrice());
            stmt.setInt(4, raw.getWant());
            stmt.executeUpdate();
            
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public void deleteRaw(Raw raw){
        
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM raw WHERE (ID=?)");
            stmt.setInt(1, raw.getID());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }

    public void update(Raw raw) {
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE raw SET KIND=?, WEIGHT=?, PRICE=?, DAILYWANT=? WHERE ID=?");
            stmt.setString(1, raw.getName());
            stmt.setDouble(2, raw.getWeight());
            stmt.setDouble(3, raw.getPrice());
            stmt.setInt(4, raw.getWant());
            stmt.setInt(5, raw.getID());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
        
    }
    
    
    
}
