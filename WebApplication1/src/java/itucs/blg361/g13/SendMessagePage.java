/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.entityBean.Message;
import itucs.blg361.entityBean.MessageCollection;
import itucs.blg361.entityBean.Person;
import itucs.blg361.entityBean.PersonCollection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;

/**
 *
 * @author ozan
 */
public final class SendMessagePage extends BasePage {

    private DropDownChoice userDropDownChoice;
    private TextField subjectField;
    private TextArea<String> messageTextArea;
    private Form mailForm;
    
    private List<Person> users =null;
    
    public SendMessagePage() {
        super();
            try {
           
            Connect conn = new Connect();      
            PersonCollection kul=new PersonCollection();
            users =new ArrayList<Person>();
            
            Person p =new Person();
            p.setName("deneme");
            users =kul.getAllPerson();
            users.add(p);
            
        }catch (Exception ex) {
            Logger.getLogger(SendMessagePage.class.getName()).log(Level.SEVERE, null, ex);
        }

        mailForm = new Form("form");
        
                userDropDownChoice = new DropDownChoice("user", new Model(""), users, new IChoiceRenderer() {

         @Override
            public Object getDisplayValue(Object object) {
             
                //String s=
                return ((Person) object).getName() + ((Person) object).getSurName();
            }

         @Override
            public String getIdValue(Object object, int index) {
                return Integer.toString(index);
            }
        });
        userDropDownChoice.setRequired(true);
        mailForm.add(userDropDownChoice);

        subjectField = new TextField("subject", new Model(""));
        subjectField.setRequired(true);
        mailForm.add(subjectField);

        messageTextArea = new TextArea<String>("message", new Model<String>(""));
        messageTextArea.setRequired(true);
        mailForm.add(messageTextArea);
        
                mailForm.add(new Button("sendMessage"){
            @Override
            public void onSubmit(){
                try {
                    Person user = (Person) userDropDownChoice.getModelObject();
                    String subject = (String) subjectField.getModelObject();
                    String message = (String) messageTextArea.getModelObject();
                    
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                    String reportDate = df.format(sqlDate);
                    
                    //DatabaseApp db = new DatabaseApp();
                    //db.addMessage(new Message(0, user.getId(), ((SignInSession) getSession()).getUserId(), subject, message, false, null));
                    
                    Connect conn=new Connect();
                    
                    PersonCollection kul=new PersonCollection();
                    MessageCollection mb=new MessageCollection(); 
                    
                    //SESSION YOK O yuzden simdilik ;
                    Person ben=kul.getPersonById(1);        //1 yanlis                   
                    Person sen=kul.getPersonById(2);        //2 yanlis
                    //SESSION YOK O yuzden simdilik ;
                    Message m =new Message();
                    
                    m.setBaslik(subject);
                    m.setIcerik(message);
                    m.setOkundu_mu(false);
                    m.setKimden(ben);
                    m.setKime(user);
                    m.setTarih(reportDate);
                    
                   // Message m=new Message(10, subject, reportDate,  message, false, ben, user );    //10 yanlis
              
                    mb.addMessage(m);
                    
                    
                    info("Mesaj Başarıyla Gönderildi");
                    setResponsePage(new MessagePage());
                    
                }catch (Exception ex) {
                    Logger.getLogger(SendMessagePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        mailForm.add(new FeedbackPanel("fpanel"));

        this.add(mailForm);
        
        
    }
    
}
