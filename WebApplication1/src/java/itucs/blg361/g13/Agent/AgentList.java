/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13.Agent;

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
public class AgentList {
    private Connection conn = null;
    
    public AgentList(){
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
    
    public List<Agent> getList(){
        List<Agent> list = new LinkedList<Agent>();
        try{
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from agent");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String company = rs.getString("company");
                String comaddress = rs.getString("comaddress");
                String comtel = rs.getString("comtel");
                Double owe = rs.getDouble("owe");
                Agent agent = new Agent(id,name,surname,company,comaddress,comtel,owe);
                list.add(agent);
            }
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        return list;
    }
    
    public void addAgent(Agent agent){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Agent(NAME, SURNAME, COMPANY, COMADDRESS, COMTEL, OWE)"
                    + "VALUES(?,?,?,?,?,?)");
            stmt.setString(1, agent.getName());
            stmt.setString(2, agent.getSurname());
            stmt.setString(3, agent.getCompany());
            stmt.setString(4, agent.getComaddress());
            stmt.setString(5, agent.getComtel());
            stmt.setDouble(6, agent.getOwe());
            stmt.executeUpdate();
            
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public void deleteAgent(Agent agent){
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM agent WHERE (ID=?)");
            stmt.setInt(1, agent.getID());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    public void update(Agent agent){
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE Agent SET NAME=?, SURNAME=?, COMPANY=?, COMADDRESS=?, "
                    + "COMTEL=?, OWE=? WHERE ID=?");
            stmt.setString(1, agent.getName());
            stmt.setString(2, agent.getSurname());
            stmt.setString(3, agent.getCompany());
            stmt.setString(4, agent.getComaddress());
            stmt.setString(5, agent.getComtel());
            stmt.setDouble(6, agent.getOwe());
            stmt.setInt(7, agent.getID());
            stmt.executeUpdate();
            
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public List<String> getNames(){
        List<String> list = new LinkedList<String>();
        try{
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select name from agent");
            while(rs.next()){
                String name = rs.getString("name");
                list.add(name);
            }
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        return list;
    }
    
}
