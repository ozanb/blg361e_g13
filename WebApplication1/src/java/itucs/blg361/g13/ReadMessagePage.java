/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

import itucs.blg361.entityBean.Message;
import itucs.blg361.entityBean.Person;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

/**
 *
 * @author ozan
 */
public final class ReadMessagePage extends BasePage {
   private Form form;
   public ReadMessagePage() {
      super();
   }
   
   public ReadMessagePage(final Message message, final Person sender) {
      
      
         Connect conn = new Connect();

         message.setOkundu_mu(true);
         
         form = new Form("form");
         form.add(new Label("from", sender.getName()));
         form.add(new Label("subject", message.getBaslik()));
         form.add(new Label("date", message.getTarih()));
         form.add(new Label("message", message.getIcerik()));
         form.add(new Button("Reply") {
                @Override
                public void onSubmit() {
                    this.setResponsePage(new ReplyMessagePage(message, sender));
                }
            });
            this.add(form);
            
   }
}