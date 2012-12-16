/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.entityBean.Product;
import org.apache.wicket.markup.html.link.Link;
/**
 *
 * @author Razi
 */
public class ProductInfoLink  extends Link{
      private Product product;
    public ProductInfoLink(String id, Product aProduct){
        super(id);
        this.product= aProduct;
    }
    @Override
    public void onClick(){
        this.setResponsePage(new ProductInfo(this.product));
    }
}
