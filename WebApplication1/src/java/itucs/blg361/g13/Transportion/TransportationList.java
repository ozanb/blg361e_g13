/*
 * To change this ttransportationlate, choose Tools | Ttransportationlates
 * and open the ttransportationlate in the editor.
 */
package itucs.blg361.g13.Transportion;
import itucs.blg361.g13.Transportion.Transportation;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Razi
 */
public class TransportationList {
     private List<Transportation> transportationList;
    
    public TransportationList(){
        transportationList = new LinkedList<Transportation>();       
    }
    
    public List<Transportation> getList(){
        return transportationList;
    }
    
    public void addTransportation(Transportation transportation){
        transportationList.add(transportation);
    }
    
    public void deleteTransportation(Transportation transportation){
        transportationList.remove(transportation);
    }
    
}
