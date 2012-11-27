/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.pojo.Machine;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class MachineInfo extends BasePage {

     public MachineInfo(Machine machine) {
        
         this.add(new Label("kind",machine.getKind()));
        
    }
    
    
    }
    
    
