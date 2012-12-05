/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */

import itucs.blg361.entityBean.Animal;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class AddAnimalForm extends Form{
    
    public AddAnimalForm(String id, Animal aAnimal){
        super(id);
        
        CompoundPropertyModel model = new CompoundPropertyModel(aAnimal);
        this.setModel(model);
        this.add(new TextField("kind"));
        this.add(new TextField("number"));
        this.add(new TextField("product"));
        
       
        
    }
    @Override
    public void onSubmit(){
        Animal animal = (Animal) this.getModelObject();
        Application app;
        app = (Application) this.getApplication();
        AnimalList list = app.getAnimalList();
        list.addAnimal(animal);
        this.setResponsePage(new AnimalInfo(animal));
        
    }
    
}
