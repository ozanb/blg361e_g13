/*
 * Application.java
 *
 * Created on October 16, 2012, 12:21 PM
 */
 
package com.myapp.wicket;           

import org.apache.wicket.protocol.http.WebApplication;
/** 
 *
 * @author ozan
 * @version 
 */

public class Application extends WebApplication {

    public Application() {
    }

    public Class getHomePage() {
        return HomePage.class;
    }

}
