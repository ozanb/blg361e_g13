/*
 * Application.java
 *
 * Created on October 22, 2012, 12:01 PM
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

    /**
     *
     * @return
     */
    @Override
    public Class getHomePage() {
        return HomePage.class;
    }

}
