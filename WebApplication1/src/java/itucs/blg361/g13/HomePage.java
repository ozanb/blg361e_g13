/*
 * HomePage.java
 *
 * Created on 04 Kasım 2012 Pazar, 15:43
 */

package itucs.blg361.g13;           

import java.util.Date;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;



public class HomePage extends BasePage {

    public HomePage() {
        
        Date now = new Date();
        Label labeldatetime= new Label("datetime",now.toString());
        this.add(labeldatetime);
        
    }

}
