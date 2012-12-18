/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.entityBean.Message;
import itucs.blg361.entityBean.MessageCollection;
import itucs.blg361.entityBean.Person;
import itucs.blg361.entityBean.PersonCollection;
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
   private PageableListView messageListView;
   private List<Message> messageList;
   private MessageCollection col;
   Person sender;

    public MessagePage() {
        super();
        
        messageList = new ArrayList<Message>();
        sender = new Person();
        
        try {
            Connect conn = new Connect();
//            PersonCollection perCol = new PersonCollection();
            
            Statement statement = conn.getConn().createStatement();
            
//            int ID=((WSession)getSession()).getKullanici().getId();
            //BURA DUZELECEK
            int Id = 1;
            String querry="select name, surName, icerik, baslik, Message.id, "
                    + "Message.kimden, Message.okundu_mu from Message, Person "
                    + "where (Message.kime ='" + Id + " ' and (kimden = Person.id))";
            ResultSet res = statement.executeQuery(querry);
            while(res.next()){
                Message m = new Message();
                m.setId(res.getInt("id"));
                
                int kimdenmMsg =res.getInt("kimden"); 
                
                Person p = null;
                p =new Person();
                p.setName(res.getString("name"));
                p.setSurName(res.getString("surName"));
                
                Boolean okunduMu =false;
                int okundu =res.getInt("okundu_mu"); 
                if(okundu !=0)
                    okunduMu =true;
                m.setOkundu_mu(okunduMu);
                m.setIcerik(res.getString("icerik"));
                m.setBaslik(res.getString("baslik"));
                
                PersonCollection pcol =new PersonCollection();
                
              //  p =(Person)pcol.getPersonById(kimdenmMsg);
                m.setKimden(p);

                messageList.add(m);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MessageCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Form form = new Form("msgForm");
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

                    sender = (Person)message.getKimden();
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
                               col = new MessageCollection();
                               int x =3;
                               col.deleteMessage(message.getId()); 
                           } catch (Exception e) {
                           }
                                this.setResponsePage(new MessagePage());
                         }
                    });
                    
                    String status = "Not Read";
                    
                    if(message.getOkundu_mu() !=false) {
                    status = "Read";
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
