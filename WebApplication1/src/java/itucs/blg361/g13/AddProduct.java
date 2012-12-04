/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.pojo.Product;

/**
 *
 * @author Razi
 */
public final class AddProduct extends BasePage {

     public AddProduct(Product aProduct) {
        this.add(new AddProductForm("add_product",aProduct));

    }
    
   
}
