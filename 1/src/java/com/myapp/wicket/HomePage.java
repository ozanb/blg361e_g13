/*
 * HomePage.java
 *
 * Created on October 22, 2012, 12:01 PM
 */

package com.myapp.wicket;           

import java.util.Date;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage{

    public HomePage() {
        Date now = new Date();
        Label labelDateTime = new Label("datetime", now.toString());
        this.add(labelDateTime);
    }

}
