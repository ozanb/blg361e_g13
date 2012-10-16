/*
 * HomePage.java
 *
 * Created on October 16, 2012, 12:21 PM
 */

package com.myapp.wicket;           

import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {

    public HomePage() {
        add(new Label("message", "Hello, World!"));
    }

}
