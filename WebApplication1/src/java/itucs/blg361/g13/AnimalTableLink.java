package itucs.blg361.g13;


import org.apache.wicket.markup.html.link.Link;

/**
 *
 * @author Razi
 */
public class AnimalTableLink extends Link {
   public AnimalTableLink(String id){
    super (id);
}

@Override
public void onClick(){
    
AnimalTable target=new AnimalTable();
this.setResponsePage(target);
}
}