/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.entityBean.Animal;


/**
 *
 * @author Razi
 */
public final class AddAnimal extends BasePage {

    public AddAnimal(Animal aAnimal) {
        this.add(new AddAnimalForm("add_animal",aAnimal));


    }
    

}
