/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.pojo;

import itucs.blg361.g13.BasePage;
import itucs.blg361.g13.Connect;
import itucs.blg361.pojo.Person;
import itucs.blg361.pojo.PersonCollection;
import itucs.blg361.pojo.Message;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.PageableListView;


/**
 *
 * @author ozan
 */
public final class MessageCollection extends BasePage {
    
   private Form form;
   private PageableListView messageListView;
   private List<Message> messageList;
   Person sender;
   
   
   public void addMessage(Message message) throws SQLException {

        String querry = "INSERT INTO [MESSAGE] (baslik, tarih, icerik, okundu_mu, kimden, kime)"
                + "VALUES ( ?, ?, ?, ?, ?, ?)";
        try {
           
           Connect conn = new Connect();
           PreparedStatement statement = conn.getConn().prepareStatement(querry); 
           

            statement.setInt(6, message.getKime().getId());
            statement.setInt(5, message.getKimden().getId());
            statement.setString(3, message.getIcerik());
            statement.setString(1, message.getBaslik());
            statement.setBoolean(4, message.getOkundu_mu());
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            String reportDate = df.format(sqlDate);
            statement.setString(2, reportDate);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
   
   public void addMessage(Message msg,Integer id) {
        try {
            Connect conn = new Connect();
            PreparedStatement prepStatement = conn.getConn().prepareStatement("insert into Message(baslik, tarih, icerik, okundu_mu, kimden, kime, id) values(?,?,?,?,?,?,?)");
            prepStatement.setString(1, msg.getBaslik());
            prepStatement.setString(2, msg.getTarih());
            prepStatement.setString(3, msg.getIcerik());
            prepStatement.setBoolean(4, msg.getOkundu_mu());
            
            int kimdenId = msg.getKimden().getId();
            int kimeId = msg.getKime().getId();
            
            prepStatement.setInt(5, kimdenId);
            prepStatement.setInt(6, kimeId);
            prepStatement.setInt(7, id);
            
            prepStatement.executeUpdate();
            conn.closeConn();

        } catch (SQLException ex) {
            Logger.getLogger(PersonCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   public void deleteMessage(int messageId) throws SQLException {

        String querry = "DELETE FROM [MESSAGE] WHERE ( ID = ? )";
  
        try {
           Connect conn = new Connect();
           PreparedStatement prepStatement = conn.getConn().prepareStatement(querry);           

         prepStatement.setInt(1, messageId);
         
          prepStatement.executeUpdate();
          conn.closeConn();        

        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
    }
   
   public void updateMessage(Message m) throws SQLException{
        Integer id = m.getId();
        deleteMessage(id);
        addMessage(m, id);
    }
   
   
}
/*   public MessageCollection() {
        super();
        
      
        messageList = new ArrayList<Message>();
        try {
            Connect conn = new Connect();
//            KullaniciDB kulDB=new KullaniciDB();
            Statement statement = conn.getConn().createStatement();
            Message m = new Message();
            
//            int ID=((WSession)getSession()).getKullanici().getId();
            
            int ID = 1;
            String querry="select name, surName, icerik, Message.id, Message.kimden from Message,Person "
                    + "where (Message.kime ='" + ID + " ' and (kimden = Person.id))";
            ResultSet res = statement.executeQuery(querry);
            while(res.next()){
                m.setId(res.getInt("id"));
                Person k = new Person();
                k.setName(res.getString("name"));
                k.setSurName(res.getString("surName"));
                
                m.setIcerik(res.getString("icerik"));
                
                //Kullanici temp = new Kullanici();
                int x=res.getInt("kimden");
                Person temp = (Person)PersonCollection.get
                //m.setKimden(k);
                m.setKimden(temp);
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

                    final Mesaj message = (Mesaj) item.getModelObject();

                    sender =message.getKimden();
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
                               
                               deleteMessage(message.getId()); 
                           } catch (Exception e) {
                           }
                                this.setResponsePage(new MessageBox());
                         }
                    });
                    
                    String status = null;
                    if(message.isOkunduMu())
                        status = "Okundu";
                    else if(!message.isOkunduMu())
                        status = "Okunmadı";
                    item.add(new Label("status", status));
                    item.add(new Label("from", sender.getAd()));
                    item.add(new Label("subject", message.getSubject()));
                    item.add(new Label("date", message.getTarih()));
                

            }
        };
        
        form.add(messageListView);
        form.add(new PagingNavigator("navigator", (IPageable) messageListView));

        this.add(form);
   }
}
*/