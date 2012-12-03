/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.g13.BasePage;
import itucs.blg361.pojo.Message;
import itucs.blg361.pojo.Person;

import java.util.List;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 *
 * @author ozan
 */
public final class MessagePage extends BasePage {
    
   private Form form;
   private PageableListView messageListView;
   private List<Message> messageList;
   Person sender;

    public MessagePage() {
        super();
    }
    
    public MessagePage(PageParameters params) {
        //TODO:  process page parameters
    }
}
