/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.entityBean.Message;
import itucs.blg361.entityBean.MessageCollection;
import itucs.blg361.entityBean.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.markup.html.navigation.paging.IPageable;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;

/**
 *
 * @author ozan
 */
public final class MessagePage extends BasePage {
    
   private Form form;
   private PageableListView messageListView;
   private List<Message> messageList;
   private MessageCollection col;
   Person sender;

    public MessagePage() {
        super();
        
        messageList = new ArrayList<Message>();
        try {
            Connect conn = new Connect();
//            PersonCollection perCol = new PersonCollection();
            
            Statement statement = conn.getConn().createStatement();
            Message m = new Message();
            
//            int ID=((WSession)getSession()).getKullanici().getId();
            
            int Id = 1;
            String querry="select name, surName, icerik, baslik, Message.id, Message.kimden from Message, Person "
                    + "where (Message.kime ='" + Id + " ' and (kimden = Person.id))";
            ResultSet res = statement.executeQuery(querry);
            while(res.next()){
                m.setId(res.getInt("id"));
                Person p = new Person();
                p.setName(res.getString("name"));
                p.setSurName(res.getString("surName"));
                
                m.setIcerik(res.getString("icerik"));
                m.setBaslik(res.getString("baslik"));
                m.setKimden(p);

                messageList.add(m);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MessageCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        form = new Form("form");
        form.add(new Link("sendMessage") {

                @Override
                public void onClick() {
                    this.setResponsePage(new SendMessagePage());
                }
        });
        
        messageListView = new PageableListView("listMessages", messageList, 5) {
            @Override
            protected void populateItem(ListItem item) {

                    final Message message = (Message) item.getModelObject();

                    sender = message.getKimden();
                    item.add(new Link("read") {
                        @Override
                        public void onClick() {
                            this.setResponsePage(new ReadMessagePage(message, sender));
                        }
                    });
                    
                    item.add(new Link("delete") {
                        @Override
                        public void onClick() {
                           try {
                               Connect conn = new Connect();
                               col = new MessageCollection();
                               
                               col.deleteMessage(message.getId()); 
                           } catch (Exception e) {
                           }
                                this.setResponsePage(new MessageCollection());
                         }
                    });
                    
                    String status = null;
                    if(message.getOkundu_mu()) {
                    status = "Okundu";
                }
                    else if(!message.getOkundu_mu()) {
                    status = "Okunmadı";
                }
                    item.add(new Label("status", status));
                    item.add(new Label("from", sender.getName()));
                    item.add(new Label("subject", message.getBaslik()));
                    item.add(new Label("date", message.getTarih()));
                

            }
        };
        
        form.add(messageListView);
        form.add(new PagingNavigator("navigator", (IPageable) messageListView));

        this.add(form);     
    }
    
//    public MessagePage(PageParameters params) {
//        //TODO:  process page parameters
//    }
}