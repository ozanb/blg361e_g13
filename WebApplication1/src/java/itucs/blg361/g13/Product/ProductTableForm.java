/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13.Product;

/**
 *
 * @author Razi
 */
import itucs.blg361.g13.Application;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;



public class ProductTableForm extends Form {
     private List<Product> selectedProduct;
    
    public ProductTableForm(String id){
        super(id);
        this.selectedProduct = new LinkedList<Product>();
        
        CheckGroup productCheck = new CheckGroup("selected_product",this.selectedProduct);
        this.add(productCheck);
        
        Application app = (Application) this.getApplication();
       ProductList list = app.getProductList();
        List<Product> productlist = list.getList();
        
        PropertyListView listview = new PropertyListView("product_list",productlist){
            
        
            @Override
            protected void populateItem(ListItem item){
                final Product product = (Product) item.getModelObject();
                item.add(new Link("editlink")
                {
                    @Override
                    public void onClick()
                    {
                        setResponsePage(new ProductEdit(product));
                    }
                });
                item.add(new Check("selected", item.getModel()));
                item.add(new Label("kind",product.getKind()));
                item.add(new Label("weight",product.getWeight().toString()));
                item.add(new Label("price",product.getPrice().toString()));
                item.add(new Label("productperday",product.getProductPerDay().toString()));
            }
        };
        productCheck.add(listview);
        


    }
    public void onSubmit(){
        Application app = (Application) this.getApplication();
       ProductList list = app.getProductList();
        for (Product product : this.selectedProduct)
            list.deleteProduct(product);
        this.setResponsePage(new ProductTable());
            
    }
    
    
    
    
    
    
    
    
    
    
    
}
