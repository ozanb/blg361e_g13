
package itucs.blg361.g13.Animal;

/**
 *
 * @author Razi
 */

import itucs.blg361.g13.Animal.Animal;
import java.util.LinkedList;
import java.util.List;

public class AnimalList {
    private List<Animal> animalList;
    
    public AnimalList(){
        animalList = new LinkedList<Animal>();       
    }
    
    public List<Animal> getList(){
        return animalList;
    }
    
    public void addAnimal(Animal animal){
        animalList.add(animal);
    }
    
    public void deleteAnimal(Animal animal){
        animalList.remove(animal);
    }
}