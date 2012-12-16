/*
 * Application.java
 *
 * Created on 04 Kasım 2012 Pazar, 15:43
 */
 
package itucs.blg361.g13;           

import itucs.blg361.g13.Agent.AgentList;
import itucs.blg361.g13.Animal.AnimalList;
import itucs.blg361.g13.Employee.EmpList;
import itucs.blg361.g13.Machine.MachineList;
import itucs.blg361.g13.Product.ProductList;
import itucs.blg361.g13.Raw.RawList;
import itucs.blg361.g13.Transportation.TransportationList;
import org.apache.wicket.protocol.http.WebApplication;
/** 
 *
 * @author Nadir
 * @version 
 */

public class Application extends WebApplication {
    
    private RawList rawList;
    private EmpList empList;
    private AgentList agentList;
    private MachineList machineList;
    private AnimalList animalList;
    private TransportationList transportationList;
    private ProductList prodList;
    
    public Application() {
        this.empList = new EmpList();
        this.rawList = new RawList();
        this.agentList = new AgentList();
        this.machineList = new MachineList();
        this.animalList = new AnimalList();
        this.transportationList = new TransportationList();
        this.prodList = new ProductList();
        
        
        
        
        //Raw Milk = new Raw("Milk");
        //Milk.setAmount(500);
        //this.rawList.addRaw(Milk);
        //Raw Package = new Raw("Package",1000,0.5,250);
        //this.rawList.addRaw(Package);
      //00 Employee emp = new Employee("Deneme","deneme");
       //this.empList.addEmployee(emp);
        


    }

    @Override
    public Class getHomePage() {
        return HomePage.class;
    }
    
    public RawList getRawList(){
        return this.rawList;
    }
    
    public EmpList getEmpList(){
        return this.empList;
    }

     
    public AgentList getAgentList(){
        return this.agentList;
    }
 public MachineList getMachineList(){
        return this.machineList;
    }
 
 
   public AnimalList getAnimalList(){
        return this.animalList;
    }
   
     public TransportationList getTransportationList(){
        return this.transportationList;
    }
     public ProductList getProductList(){
        return this.prodList;
    }
    
}
