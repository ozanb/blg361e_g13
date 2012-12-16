/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Product;

import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class ProductInfo extends BasePage {

     public ProductInfo(Product product) {
        this.add(new Label("name",product.getKind()));
        this.add(new Label("kind",product.getKind()));
        this.add(new Label("weight",product.getWeight().toString()));
        this.add(new Label("price",product.getPrice().toString()));
        this.add(new Label("productperday",product.getProductPerDay().toString()));
        
    }
    
    
    }
    
    
