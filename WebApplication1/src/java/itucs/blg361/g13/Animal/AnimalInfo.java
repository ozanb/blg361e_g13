
package itucs.blg361.g13.Animal;

import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class AnimalInfo extends BasePage {

    public AnimalInfo(Animal animal) {
        
         this.add(new Label("kind",animal.getKind()));
        this.add(new Label("number",animal.getNumber().toString()));
    }
    

}
