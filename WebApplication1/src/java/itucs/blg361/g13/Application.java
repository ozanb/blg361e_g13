/*
 * Application.java
 *
 * Created on 04 Kasım 2012 Pazar, 15:43
 */
 
package itucs.blg361.g13;           

import org.apache.wicket.protocol.http.WebApplication;
/** 
 *
 * @author Nadir
 * @version 
 */

public class Application extends WebApplication {
    
    private RawList rawList;
    private EmpList empList;
    
    public Application() {
        this.empList = new EmpList();
        this.rawList = new RawList();
        Raw Milk = new Raw("Milk");
        Milk.setAmount(500);
        this.rawList.addRaw(Milk);
        Raw Package = new Raw("Package",1000,0.5,250);
        this.rawList.addRaw(Package);
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
    
}
