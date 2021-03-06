/*
 * HomePage.java
 *
 * Created on 04 Kasım 2012 Pazar, 15:43
 */

package itucs.blg361.g13;

import itucs.blg361.g13.HumanResource.HRInsert;
import org.apache.wicket.markup.html.link.Link;




public class HomePage extends BasePage {

    public HomePage() {
        super();
        
        Link mesajOku = (Link) new Link("mesajOku") {
            @Override
            public void onClick() {
               this.setResponsePage(new MessagePage());
            }
        };
        
    this.add(mesajOku);
    
    
            Link hr = (Link) new Link("human") {
            @Override
            public void onClick() {
               this.setResponsePage(new HRInsert());
            }
        };
        
    this.add(hr);

        
    }

}
