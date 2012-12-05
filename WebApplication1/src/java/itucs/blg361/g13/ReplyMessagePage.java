/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.entityBean.Message;
import itucs.blg361.entityBean.Person;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author ozan
 */
public final class ReplyMessagePage extends BasePage {

    public ReplyMessagePage() {
        super();
    }
    
    public ReplyMessagePage(final Message message, final Person user){
       
      }
    
    public ReplyMessagePage(PageParameters params) {
        //TODO:  process page parameters
    }
}
