/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Raw;

/**
 *
 * @author Nadir
 */

import itucs.blg361.g13.Raw.Raw;
import Raw.RawList;
import itucs.blg361.g13.Application;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class AddRawForm extends Form{
    
    public AddRawForm(String id, Raw aRaw){
        super(id);
        
        CompoundPropertyModel model = new CompoundPropertyModel(aRaw);
        this.setModel(model);
        
        this.add(new TextField("name"));
        this.add(new TextField("weight"));
        this.add(new TextField("price"));
        this.add(new TextField("want"));
    }
    
    @Override
    public void onSubmit(){
        Raw raw = (Raw) this.getModelObject();
        Application app = (Application) this.getApplication();
        RawList list = app.getRawList();
        list.addRaw(raw);
        this.setResponsePage(new RawInfo(raw));
        
    }
    
    
}
