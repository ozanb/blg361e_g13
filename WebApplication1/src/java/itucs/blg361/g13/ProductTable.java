/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;
/**
 *
 * @author Razi
 */
public final class ProductTable extends BasePage {

    public ProductTable() {
        
        //super();
           ProductTableForm form = new ProductTableForm("product_list_form");
           this.add(form);
    }
    
   
}
