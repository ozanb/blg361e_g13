/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Machine;
import itucs.blg361.g13.Machine.Machine;
import org.apache.wicket.markup.html.link.Link;
/**
 *
 * @author Razi
 */
public class MachineInfoLink  extends Link{
      private Machine machine;
    public MachineInfoLink(String id, Machine aMachine){
        super(id);
        this.machine= aMachine;
    }
    @Override
    public void onClick(){
        this.setResponsePage(new MachineInfo(this.machine));
    }
}
