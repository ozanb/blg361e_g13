/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Machine;
import itucs.blg361.g13.Machine.MachineTable;
import org.apache.wicket.markup.html.link.Link;


/**
 *
 * @author Razi
 */
public class MachineTableLink extends Link{
    
    
      public MachineTableLink(String id){
    super (id);
}
      @Override
public void onClick(){
    
MachineTable target=new MachineTable();
this.setResponsePage(target);
}
      
      
    
    
}
