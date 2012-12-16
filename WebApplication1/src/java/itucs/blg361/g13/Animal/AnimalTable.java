
package itucs.blg361.g13.Animal;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Razi
 */
public final class AnimalTable extends BasePage {
public AnimalTable(){
    AnimalTableForm form = new AnimalTableForm("animal_list_form");
    this.add(form);

    
}
}
