/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Raw;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

/**
 *
 * @author Nadir
 */
public class RawEditForm extends Form{
    private boolean newraw;
    
    public RawEditForm(String id, Raw aRaw, boolean flag){
        super(id);
        CompoundPropertyModel model= new CompoundPropertyModel(aRaw);
        this.setModel(model);
        this.add(new TextField("name"));
        this.add(new TextField("weight"));
        this.add(new TextField("price"));
        this.add(new TextField("want"));
        this.newraw = flag;
    }
    
}
