/*
 * To change this ttransportationlate, choose Tools | Ttransportationlates
 * and open the ttransportationlate in the editor.
 */
package itucs.blg361.g13.Transportation;
import java.util.LinkedList;
import java.util.List;
import itucs.blg361.g13.Transportation.Transportation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Razi
 */
public class TransportationList {
    private Connection conn = null;
    
    public TransportationList(){
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
    
    public List<Transportation> getList(){
        List<Transportation> list = new LinkedList<Transportation>();
        try{
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from transportation");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String agenttosend= rs.getString("agenttosend");
                String address = rs.getString("address");
                Integer noforder = rs.getInt("noforder");
                Integer expense = rs.getInt("expense");
                String product = rs.getString("product");
              
                Transportation transportation = new Transportation(id,agenttosend,address,noforder,expense,product);
                list.add(transportation);
            }
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        return list;
    }
    
    public void addTransportation(Transportation transportation){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Transportation(AGENTTOSEND,ADDRESS, NOFORDER,EXPENSE,PRODUCT)"
                    + "VALUES(?,?,?,?,?)");
            stmt.setString(1, transportation.getAgenttosend());
            stmt.setString(2, transportation.getAddress());
            stmt.setInt(3, transportation.getNoforder());
            stmt.setInt(4, transportation.getExpense());
            stmt.setString(5, transportation.getProduct());
            stmt.executeUpdate();
            
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public void deleteTransportation(Transportation transportation){
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM transportation WHERE (ID=?)");
            stmt.setInt(1, transportation.getId());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
}