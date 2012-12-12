/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.pojo.Machine;
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
public class MachineList {
    private Connection conn = null;
    
    public MachineList(){
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
    
    public List<Machine> getList(){
        List<Machine> list = new LinkedList<Machine>();
        try{
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from machine");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("kind");
                Integer number = rs.getInt("nofmach");
                Integer prod = rs.getInt("productperday");
                Double expense = rs.getDouble("expense");
                Machine machine = new Machine(id,name,number,expense,prod);
                list.add(machine);
            }
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        return list;
    }
    
    public void addMachine(Machine machine){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO MACHINE(KIND, NOFMACH, PRODUCTPERDAY, EXPENSE)"
                    + "VALUES(?,?,?,?)");
            stmt.setString(1, machine.getKind());
            stmt.setInt(2, machine.getNumber());
            stmt.setInt(3, machine.getProductperday());
            stmt.setDouble(4, machine.getExpense());
            stmt.executeUpdate();
            
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public void deleteMachine(Machine machine){
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM machine WHERE (ID=?)");
            stmt.setInt(1, machine.getId());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
}
