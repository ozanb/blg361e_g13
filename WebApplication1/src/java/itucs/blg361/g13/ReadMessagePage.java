/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.entityBean.Message;
import itucs.blg361.entityBean.MessageCollection;
import itucs.blg361.entityBean.Person;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;

/**
 *
 * @author ozan
 */
public final class ReadMessagePage extends BasePage {
   private Form form;
   private MessageCollection col;
   public ReadMessagePage() {
      super();
   }
   
   public ReadMessagePage(final Message message, final Person sender) {
      
        Link homeLink = new Link("home"){

            @Override
            public void onClick() {
                this.setResponsePage(HomePage.class);
            }  
        };
        this.add(homeLink);
      
         Connect conn = new Connect();

         message.setOkundu_mu(true);
         
         form = new Form("form");
         form.add(new Label("from", sender.getName()));
         form.add(new Label("subject", message.getBaslik()));
         form.add(new Label("date", message.getTarih()));
         form.add(new Label("message", message.getIcerik()));
         form.add(new Button("yanitla") {
                @Override
                public void onSubmit() {
                    this.setResponsePage(new ReplyMessagePage(message, sender));
                }
            });
         
         form.add(new Button("sil") {
                @Override
                public void onSubmit() {
                   try {
                      col = new MessageCollection();
                      int x =3;
                      col.deleteMessage(message.getId()); 
                      } catch (Exception e) {
                      }
                      this.setResponsePage(new MessagePage());
                }
        });
         
            this.add(form);
            
   }
}