/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */
public final class AddMachine extends BasePage {

     public AddMachine(Machine aMachine) {
        this.add(new AddMachineForm("add_machine",aMachine));

    }
    
   
}
