/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13.Machine;
import itucs.blg361.g13.Application;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
/**
 *
 * @author Razi
 */
public class AddMachineForm  extends Form{
     private boolean flag;
     public AddMachineForm(String id, Machine aMachine, boolean flag){
         super(id);
         
        CompoundPropertyModel model = new CompoundPropertyModel(aMachine);
        
        this.setModel(model);
        this.add(new TextField("kind"));
        this.add(new TextField("number"));
        this.add(new TextField("expense"));
        this.add(new TextField("productperday"));
        this.flag=flag;
      
        
     }
    @Override
    public void onSubmit(){
        Machine machine = (Machine) this.getModelObject();
        Application app = (Application) this.getApplication();
        MachineList list = app.getMachineList();
        if (flag) {
            list.addMachine(machine);
        } else {
            list.update(machine);
        }
        this.setResponsePage(new MachineInfo(machine));
    
    
}
    
}
