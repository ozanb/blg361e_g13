
package itucs.blg361.g13;

/**
 *
 * @author Razi
 */
public final class AddTransportation extends BasePage {

     public AddTransportation(Transportation aTransportation) {
        this.add(new AddTransportationForm("add_transportation",aTransportation));

    }
    
   
}
