/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.entityBean.Machine;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
/**
 *
 * @author Razi
 */
public class AddMachineForm  extends Form{
    
     public AddMachineForm(String id, Machine aMachine){
         super(id);
         
        CompoundPropertyModel model = new CompoundPropertyModel(aMachine);
        
        this.setModel(model);
        this.add(new TextField("kind"));
        this.add(new TextField("number"));
        this.add(new TextField("expense"));
        this.add(new TextField("productperday"));
      
        
     }
    @Override
    public void onSubmit(){
        Machine machine = (Machine) this.getModelObject();
        Application app = (Application) this.getApplication();
        MachineList list = app.getMachineList();
        list.addMachine(machine);
        this.setResponsePage(new MachineInfo(machine));
    
    
}
    
}
