/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package itucs.blg361.g13.HumanResource;
import itucs.blg361.entityBean.HumanResource;
import itucs.blg361.g13.BasePage;
import itucs.blg361.g13.Connect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.markup.html.image.ContextImage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.resource.PackageResourceReference;
import org.apache.wicket.request.resource.ResourceReference;






/**
 *
 * @author ozan
 */
public final class HRInsert extends BasePage {

        private static final List<String> categories = Arrays.asList("Women", "Men");
        private String selected="Men";
        private final String gen ="Men";
        
        private static final ResourceReference RESOURCE_REF = new PackageResourceReference(HRInsert.class,
        "basvur.jpg");
        
    public HRInsert() {

        super();
        
        ContextImage image = new ContextImage("basvur", "img/basvur.jpg");
        add(image);
       // add(new Image("basvur", new ContextRelativeResource("/img/basvur.jpg")) {});



        
        IModel<Date> dateModel = null;
        final Date date = new Date();
        final DropDownChoice<String> listGen = new DropDownChoice<String>("gender", new PropertyModel<String>(this, "selected"), categories);

        final HumanResource HR = new HumanResource();
        FeedbackPanel feedBack = new FeedbackPanel("feedback");
        add(feedBack);
        
        
        TextField name = new TextField("name", new PropertyModel(HR, "name"));
        TextField surname = new TextField("surname", new PropertyModel(HR, "surname"));
        TextField email = new TextField("email", new PropertyModel(HR, "email"));
        TextField address = new TextField("address", new PropertyModel(HR, "address"));
        TextField mobilePhone = new TextField("mobilePhone", new PropertyModel(HR, "mobilePhone"));
        TextField position = new TextField("position", new PropertyModel(HR, "position"));
        TextField tcnumber = new TextField("tcnumber", new PropertyModel(HR, "tcnumber"));
        TextField birthDate = new TextField("birthDate", new PropertyModel(HR, "birthDate"));
//        DateTextField dateTextField = new DateTextField("dateTextField", new PropertyModel<Date>(HR, "birthDate"));
//        DateTextField dateTextField = new DateTextField("dateTextField");
//                , new PropertyModel<Date>(this, "date"), new StyleDateConverter("S-", true))

        //TextArea experience = new TextArea("experience", new PropertyModel(HR, "experience"));
        //TextField gender = new TextField("gender", new PropertyModel(HR, "gender"));

//        add(new TextArea("experience", new PropertyModel(HR, "experience")));
        
        Form f = new Form("HRForm"){
            @Override
            public void onSubmit(){
                try {
                    
                    Connect conn = new Connect();
//                    info("Form başarıyla yollandı");
                    PreparedStatement prepStatement = conn.getConn().prepareStatement
                            ("insert into hrdepartment(name, surname, email, address,"
                            + "mobilePhone, position, tcnumber, birthDate, experience, gender) values(?,?,?,?,?,?,?,?,?,?)");
                    prepStatement.setString(1,HR.getName());
                    prepStatement.setString(2,HR.getSurname());
                    prepStatement.setString(3,HR.getEmail());
                    prepStatement.setString(4,HR.getAddress());
                    prepStatement.setString(5,HR.getMobilePhone());
                    prepStatement.setString(6,HR.getPosition());
                    prepStatement.setString(7,HR.getTcnumber());
                    prepStatement.setString(8,HR.getBirthDate());
                    prepStatement.setString(9,HR.getExperience());
                    prepStatement.setString(10,gen);
                    
                    prepStatement.executeUpdate();
                    setResponsePage(new HRInsert());
                    conn.closeConn();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(HRInsert.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        f.add(name);
        f.add(surname);
        f.add(email);
        f.add(address);
        f.add(mobilePhone);
        f.add(position);
        f.add(tcnumber);
        f.add(birthDate);

//        
//        f.add(new DropDownChoice("gender", new PropertyModel(HR, "gender"), categories));
////        HR.setGender("Erkek");
//        f.add(experience);
        f.add(listGen);
        f.add(new TextArea("experience", new PropertyModel(HR, "experience")));
//        f.add(dateTextField);
        

        
        
        
//         DatePicker datePicker = new DatePicker()
//         {
//            @Override
//            protected String getAdditionalJavaScript()
//            {
//                return "${calendar}.cfg.setProperty(\"navigator\",true,false); ${calendar}.render();";
//            }
//        };
//        datePicker.setShowOnFieldClick(true);
//        datePicker.setAutoHide(true);
//        dateTextField.add(datePicker);
        
        
//        DateTextField dateField = new DateTextField("date", "d-M-yyyy"); 
//        dateField.setRequired(true); 
//        f.add(dateField); 

//        DatePicker dp = new DatePicker("datePicker", dateField); 
////        dp.setDateConverter(new DateConverter() {
////            public DateFormat getDateFormat(Locale locale) { 
////                return new SimpleDateFormat("d-M-yyyy"); 
////            } 
////        }); 
//        f.add(dp); 
        
        
//        TextField df = new TextField("dateTextField", Date.class);
//        add(df);
//        add(new DatePicker("dateTextPicker", df));
////        df.add(createAjaxBehavior());
//        f.add(df);

//        DateTextField df = new DateTextField("wicketID", dateModel, "yy.DD.mm");
//        df.add(new DatePicker());
//        f.add(df);
        
        this.add(f);
            
        //TODO:  process page parameters
    }

//    @Override
//    public Markup getAssociatedMarkup() {
//        return super.getAssociatedMarkup();
//    }
}
