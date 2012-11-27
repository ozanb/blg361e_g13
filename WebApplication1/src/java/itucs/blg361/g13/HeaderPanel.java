/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.pojo.Machine;
import itucs.blg361.pojo.Agent;
import itucs.blg361.pojo.Employee;
import itucs.blg361.pojo.Animal;
import itucs.blg361.pojo.Transportation;
import itucs.blg361.pojo.Raw;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.Panel;

public final class HeaderPanel extends Panel {

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
        
        
        
        
        Link rawEdit = new Link("rawedit"){
            
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
        
        
        
        
        
        
        
        
 
    }
}
