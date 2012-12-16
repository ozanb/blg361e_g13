/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.g13.Transportation.TransportationTable;
import itucs.blg361.g13.Transportation.AddTransportation;
import itucs.blg361.g13.Raw.RawTable;
import itucs.blg361.g13.Raw.AddRaw;
import itucs.blg361.g13.Product.ProductTable;
import itucs.blg361.g13.Product.AddProduct;
import itucs.blg361.g13.Machine.MachineTable;
import itucs.blg361.g13.Machine.AddMachine;
import itucs.blg361.g13.Employee.EmployeeTable;
import itucs.blg361.g13.Employee.AddEmployee;
import itucs.blg361.g13.Animal.AddAnimal;
import itucs.blg361.g13.Animal.AnimalTable;
import itucs.blg361.g13.Agent.AgentTable;
import itucs.blg361.g13.Agent.AddAgent;
import itucs.blg361.g13.Agent.Agent;
import itucs.blg361.g13.Animal.Animal;
import itucs.blg361.g13.Employee.Employee;
import itucs.blg361.g13.Machine.Machine;
import itucs.blg361.g13.Product.Product;
import itucs.blg361.g13.Raw.Raw;
import itucs.blg361.g13.Transportation.Transportation;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

public final class HeaderPanel extends Panel {
public static int x=0;

    public HeaderPanel(String id) {
        super(id);
        Link homeLink = new Link("home"){

            @Override
            public void onClick() {
                this.setResponsePage(HomePage.class);
            }  
        };
        this.add(homeLink);


        
        Link rawTableLink = new Link("rawtable"){

            @Override
            public void onClick() {
                this.setResponsePage(new RawTable());
            }  
        };
        this.add(rawTableLink);
        
        
        
        
        Link rawEdit = new Link("addraw"){
            
            @Override
            public void onClick(){
                Raw raw = new Raw();
                this.setResponsePage(new AddRaw(raw));
            }
        };
        this.add(rawEdit);
        
        
        
        
        Link empTable = new Link("emptable"){
            
            @Override
            public void onClick(){
                this.setResponsePage(new EmployeeTable());
            }
        };
        
        
        
        
        this.add(empTable);
        Link addEmp = new Link("addemp"){
            
            @Override
            public void onClick(){
                Employee emp = new Employee();
                this.setResponsePage(new AddEmployee(emp));
            }
        };
        this.add(addEmp);
        
        
        
        
                Link agentTable = new Link("agenttable"){
            
            @Override
            public void onClick(){
                this.setResponsePage(new AgentTable());
            }
        };
        this.add(agentTable);
        
        
        
        
        Link addAgent;
        addAgent = new Link("addagent"){
       
       @Override
       public void onClick(){
           Agent agent = new Agent();
           this.setResponsePage(new AddAgent(agent));
       }
   };
        this.add(addAgent);
        
        
        Link machineTable = new Link("machinetable"){
            
            @Override
            public void onClick(){
                this.setResponsePage(new MachineTable());
            }
        };
        this.add(machineTable);
        
        Link addMachine = new Link("addmachine"){
            
            @Override
            public void onClick(){
                Machine machine = new Machine();
                this.setResponsePage(new AddMachine(machine));
            }
        };
        this.add(addMachine);
        
        
        
        
        
                Link animalTable = new Link("animaltable"){
            
            @Override
            public void onClick(){
                this.setResponsePage(new AnimalTable());
            }
        };
        
        
        
        
        this.add(animalTable);
        Link addAnimal = new Link("addanimal"){
            
            @Override
            public void onClick(){
                Animal animal = new Animal();
                this.setResponsePage(new AddAnimal(animal));
            }
        };
        this.add(addAnimal);
        
        
        
        
          Link transportationTable = new Link("transportationtable"){
            
            @Override
            public void onClick(){
                this.setResponsePage(new TransportationTable());
            }
        };
        this.add(transportationTable);
        
        
        
        
        Link addTransportation;
        addTransportation = new Link("addtransportation"){
       
       @Override
       public void onClick(){
           Transportation transportation = new Transportation();
           this.setResponsePage(new AddTransportation(transportation));
       }
   };
        this.add(addTransportation);
        
        Link productTable = new Link("producttable"){
            
            @Override
            public void onClick(){
                this.setResponsePage(new ProductTable());
            }
        };
        this.add(productTable);
        
        
        
        
        Link addProduct;
        addProduct = new Link("addproduct"){
       
       @Override
       public void onClick(){
           Product product = new Product();
           this.setResponsePage(new AddProduct(product));
       }
   };
        this.add(addProduct);
        
        
        
        
        
        
 
    }
}
