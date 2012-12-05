/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.entityBean.Machine;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Razi
 */
public class MachineList {
     private List<Machine> machineList;
    
    public MachineList(){
        machineList = new LinkedList<Machine>();       
    }
    
    public List<Machine> getList(){
        return machineList;
    }
    
    public void addMachine(Machine machine){
        machineList.add(machine);
    }
    
    public void deleteMachine(Machine machine){
       machineList.remove(machine);
    }
    
}
