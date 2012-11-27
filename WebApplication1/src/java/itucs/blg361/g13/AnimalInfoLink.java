
package itucs.blg361.g13;

import itucs.blg361.pojo.Animal;
import org.apache.wicket.markup.html.link.Link;

/**
 *
 * @author Razi
 */
public class AnimalInfoLink extends Link{
    private Animal animal;
    public AnimalInfoLink(String id, Animal aAnimal){
        super(id);
        this.animal= aAnimal;
    }
    @Override
    public void onClick(){
        this.setResponsePage(new AnimalInfo(this.animal));
    }
    
}
