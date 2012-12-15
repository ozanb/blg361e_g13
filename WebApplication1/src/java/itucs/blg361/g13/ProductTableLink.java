/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;
import org.apache.wicket.markup.html.link.Link;


/**
 *
 * @author Razi
 */
public class ProductTableLink extends Link{
    
    
      public ProductTableLink(String id){
    super (id);
}
      @Override
    public void onClick(){
    
    ProductTable target=new ProductTable();
    this.setResponsePage(target);
      }
    
}
