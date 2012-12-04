/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.pojo.Product;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Razi
 */
public class ProductList {
     private List<Product> productList;
    
    public ProductList(){
        productList = new LinkedList<Product>();       
    }
    
    public List<Product> getList(){
        return productList;
    }
    
    public void addProduct(Product product){
        productList.add(product);
    }
    
    public void deleteProduct(Product product){
        productList.remove(product);
    }
    
}
