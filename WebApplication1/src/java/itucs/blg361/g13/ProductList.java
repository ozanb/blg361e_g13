/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.entityBean.Product;
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
public class ProductList {
    private Connection conn = null;
    
    public ProductList(){
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
    
    public List<Product> getList(){
        List<Product> list = new LinkedList<Product>();
        try{
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product");
            while(rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("productKind");
                Double weight = rs.getDouble("weight");
                Double price = rs.getDouble("price");
                Integer want = rs.getInt("productPerDay");
                Product prod = new Product(id,name,weight,price,want);
                list.add(prod);
            }
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
        return list;
    }
    
    public void addProduct(Product prod){
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO PRODUCT(PRODUCTKIND, WEIGHT, PRICE, PRODUCTPERDAY)"
                    + "VALUES(?,?,?,?)");
            stmt.setString(1, prod.getKind());
            stmt.setDouble(2, prod.getWeight());
            stmt.setDouble(3, prod.getPrice());
            stmt.setInt(4, prod.getProductPerDay());
            stmt.executeUpdate();
            
        }catch(SQLException ex) {
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
    public void deleteProduct(Product prod){
        try{
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM product WHERE (ID=?)");
            stmt.setInt(1, prod.getId());
            stmt.executeUpdate();
        }catch (SQLException ex){
            throw new UnsupportedOperationException(ex.getMessage());
        }
    }
    
}
