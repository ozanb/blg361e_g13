/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13.Machine;

/**
 *
 * @author Razi
 */
import itucs.blg361.g13.Machine.Machine;
import itucs.blg361.g13.Application;
import java.util.LinkedList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Check;
import org.apache.wicket.markup.html.form.CheckGroup;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;



public class MachineTableForm extends Form {
     private List<Machine> selectedMachine;
    
    public MachineTableForm(String id){
        super(id);
        this.selectedMachine = new LinkedList<Machine>();
        
        CheckGroup machineCheck = new CheckGroup("selected_machine",this.selectedMachine);
        this.add(machineCheck);
        
        Application app = (Application) this.getApplication();
        MachineList list = app.getMachineList();
        List<Machine> machinelist = list.getList();
        
        PropertyListView listview = new PropertyListView("machine_list",machinelist){
        
            @Override
            protected void populateItem(ListItem item){
                Machine machine = (Machine) item.getModelObject();
                item.add(new Check("selected", item.getModel()));
                item.add(new Label("kind",machine.getKind()));
                item.add(new Label("number",machine.getNumber().toString()));
                 item.add(new Label("expense",machine.getExpense().toString()));
                 item.add(new Label("productperday",machine.getProductperday().toString()));
            
            }
        };
        machineCheck.add(listview);
        


    }
    public void onSubmit(){
        Application app = (Application) this.getApplication();
       MachineList list = app.getMachineList();
        for (Machine machine : this.selectedMachine)
            list.deleteMachine(machine);
        this.setResponsePage(new MachineTable());
            
    }
    
    
    
    
    
    
    
    
    
    
    
}
