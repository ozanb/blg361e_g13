/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Machine;

import itucs.blg361.g13.BasePage;

/**
 *
 * @author Nadir
 */
public final class MachineEdit extends BasePage {

    public MachineEdit(Machine machine) {
        add(new AddMachineForm("machine_edit",machine,false));
    }

}
