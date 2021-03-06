/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Animal;

/**
 *
 * @author Razi
 */

import itucs.blg361.g13.Application;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;

public class AddAnimalForm extends Form{
    private boolean flag;
    public AddAnimalForm(String id, Animal aAnimal,boolean flag){
        super(id);
        
        CompoundPropertyModel model = new CompoundPropertyModel(aAnimal);
        this.setModel(model);
        this.add(new TextField("kind"));
        this.add(new TextField("number"));
        this.add(new TextField("age"));
        this.add(new TextField("expense"));
        this.add(new TextField("productperday"));
        this.flag=flag;
       
        
    }
    @Override
    public void onSubmit(){
        Animal animal = (Animal) this.getModelObject();
        Application app;
        app = (Application) this.getApplication();
        AnimalList list = app.getAnimalList();
        if (flag) {
            list.addAnimal(animal);
        }else{
            list.update(animal);
        }
        this.setResponsePage(new AnimalInfo(animal));
        
    }
    
}
