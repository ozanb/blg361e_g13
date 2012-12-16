/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Product;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Nadir
 */
public final class ProductEdit extends BasePage {

    public ProductEdit(Product prod) {
        this.add(new AddProductForm("prod_edit",prod,false));
        
    }
}
