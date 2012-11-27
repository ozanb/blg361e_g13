/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.pojo.Transportation;
import org.apache.wicket.markup.html.link.Link;
/**
 *
 * @author Razi
 */
public class TransportationInfoLink  extends Link{
      private Transportation transportation;
    public TransportationInfoLink(String id, Transportation aTransportation){
        super(id);
        this.transportation= aTransportation;
    }
    @Override
    public void onClick(){
        this.setResponsePage(new TransportationInfo(this.transportation));
    }
}
