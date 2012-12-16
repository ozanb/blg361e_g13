/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Animal;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Nadir
 */
public final class AnimalEdit extends BasePage {

    public AnimalEdit(Animal animal) {
        this.add(new AddAnimalForm("animal_edit",animal,false));
    }

}
