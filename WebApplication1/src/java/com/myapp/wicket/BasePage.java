/*
 * WicketExamplePage.java
 *
 * Created on October 16, 2012, 12:21 PM
 */
 
package com.myapp.wicket;           

import org.apache.wicket.markup.html.WebPage;

/** 
 *
 * @author ozan
 * @version 
 */

public abstract class BasePage extends WebPage {

    public BasePage() { 
        super(); 
        add(new HeaderPanel("headerpanel", "Welcome To Wicket")); 
        add(new FooterPanel("footerpanel", "Powered by Wicket and the NetBeans Wicket Plugin"));
    } 

}
