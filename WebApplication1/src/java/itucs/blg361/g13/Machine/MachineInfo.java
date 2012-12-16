/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Machine;

import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author Razi
 */
public final class MachineInfo extends BasePage {

     public MachineInfo(Machine machine) {
        
         this.add(new Label("name",machine.getKind()));
         this.add(new Label("kind",machine.getKind()));
         this.add(new Label("number",machine.getNumber().toString()));
         this.add(new Label("expense",machine.getExpense().toString()));
         this.add(new Label("productperday",machine.getProductperday().toString()));
        
    }
    
    
    }
    
    
