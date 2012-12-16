/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Machine;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Razi
 */
public final class MachineTable extends BasePage {

    public MachineTable() {
        
        //super();
           MachineTableForm form = new MachineTableForm("machine_list_form");
           this.add(form);
    }
    
   
}
