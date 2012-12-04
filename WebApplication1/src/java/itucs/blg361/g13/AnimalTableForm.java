
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */
import itucs.blg361.pojo.Animal;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
        
public class AnimalTableForm extends Form{
    private List<Animal> selectedAnimal;
    
    public AnimalTableForm(String id){
        super(id);
        this.selectedAnimal = new LinkedList<Animal>();
        
        CheckGroup animalCheck = new CheckGroup("selected_animal",this.selectedAnimal);
        this.add(animalCheck);
        
        Application app = (Application) this.getApplication();
        AnimalList list = app.getAnimalList();
        List<Animal> animallist = list.getList();
        
        PropertyListView listview;
        listview = new PropertyListView("animal_list",animallist){
                

@Override
protected void populateItem(ListItem item){
Animal animal = (Animal) item.getModelObject();
item.add(new Check("selected", item.getModel()));
item.add(new Label("id",animal.getId().toString()));
item.add(new Label("kind",animal.getKind()));
item.add(new Label("number",animal.getNumber().toString()));
item.add(new Label("age",animal.getAge().toString()));
item.add(new Label("expense",animal.getExpense().toString()));
item.add(new Label("productperday",animal.getProductperday().toString()));



}
};
        animalCheck.add(listview);
        


    }
    @Override
    public void onSubmit(){
        Application app = (Application) this.getApplication();
        AnimalList list = app.getAnimalList();
        for (Animal animal : this.selectedAnimal) {
            list.deleteAnimal(animal);
        }
        this.setResponsePage(new AnimalTable());
            
    }
    
}