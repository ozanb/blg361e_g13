
package itucs.blg361.g13;
import org.apache.wicket.markup.html.link.Link;


/**
 *
 * @author Razi
 */
public class TransportationTableLink extends Link{
    
    
      public TransportationTableLink(String id){
    super (id);
}
      @Override
public void onClick(){
    
TransportationTable target=new TransportationTable();
this.setResponsePage(target);
}
      
      
    
    
}
