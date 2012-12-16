/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Product;

import itucs.blg361.g13.Product.Product;
import itucs.blg361.g13.BasePage;


/**
 *
 * @author Nadir
 */
public final class AddProduct extends BasePage {

     public AddProduct(Product aProduct) {
        this.add(new AddProductForm("add_product",aProduct));

    }
    
   
}
