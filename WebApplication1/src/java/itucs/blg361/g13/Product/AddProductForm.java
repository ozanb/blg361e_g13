/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Product;

import itucs.blg361.g13.Application;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

/**
 *
 * @author Nadir
 */
public class AddProductForm  extends Form{
     private boolean flag;
    
     public AddProductForm(String id, Product aProduct, boolean flag){
         super(id);
         
        CompoundPropertyModel model = new CompoundPropertyModel(aProduct);
        
        this.setModel(model);
        this.add(new TextField("kind"));
        this.add(new TextField("weight"));
        this.add(new TextField("price"));
        this.add(new TextField("productPerDay"));
        this.flag=flag;
        
     }
    @Override
    public void onSubmit(){
        Product product = (Product) this.getModelObject();
        Application app = (Application) this.getApplication();
        ProductList list = app.getProductList();
        if(flag){
            list.addProduct(product);
        } else {
            list.update(product);
        }
        this.setResponsePage(new ProductInfo(product));
    
    
}
    
}
