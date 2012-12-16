
package itucs.blg361.g13.Animal;

/**
 *
 * @author Razi
 */

import itucs.blg361.g13.Animal.Animal;
import itucs.blg361.g13.Animal.Animal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class AnimalList {
    private Connection conn = null;
    
    public AnimalList(){
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
    
    public List<Animal> getList(){
        List<Animal> list = new LinkedList<Animal>();
        try{
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from animal");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String kind = rs.getString("animalKind");
                  Integer age = rs.getInt("age");
                  Integer productperday = rs.getInt("productivityPerDay");
               Integer number = rs.getInt("nOfAnimal");
                Double expense = rs.getDouble("expense");
                
                Animal animal = new Animal(id,kind,age,productperday,number,expense);
                list.add(animal);
            }
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        return list;
    }
    
    public void addAnimal(Animal animal){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Animal(ANIMALKIND, AGE,PRODUCTIVITYPERDAY,NOFANIMAL,EXPENSE)"
                    + "VALUES(?,?,?,?,?)");
            stmt.setString(1, animal.getKind());
            stmt.setInt(2, animal.getAge());
            stmt.setInt(3, animal.getProduct());
            stmt.setInt(4, animal.getNumber());
            stmt.setDouble(5, animal.getExpense());
            stmt.executeUpdate();
            
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public void deleteAnimal(Animal animal){
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM animal WHERE (ID=?)");
            stmt.setInt(1, animal.getId());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
}
