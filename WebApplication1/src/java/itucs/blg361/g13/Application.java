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
    
    private RawList list;
    public Application() {
        this.list = new RawList();
        Raw Milk = new Raw("Milk");
        Milk.setAmount(500);
        this.list.addRaw(Milk);
        Raw Package = new Raw("Package",1000,0.5,250);
        this.list.addRaw(Package);


    }

    @Override
    public Class getHomePage() {
        return HomePage.class;
    }
    
    public RawList getList(){
        return this.list;
    }
    
}
