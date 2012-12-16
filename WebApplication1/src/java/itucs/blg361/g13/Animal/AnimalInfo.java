
package itucs.blg361.g13.Animal;

import itucs.blg361.g13.BasePage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;

/**
 *
 * @author Razi
 */
public final class AnimalInfo extends BasePage {

    public AnimalInfo(Animal animal) {
    this.add(new Label("Name",animal.getKind()));
    this.add(new Label("kind",animal.getKind()));
    this.add(new Label("number",animal.getNumber().toString()));
    this.add(new Label("age",animal.getAge().toString()));
    this.add(new Label("expense",animal.getExpense().toString()));
    this.add(new Label("productperday",animal.getProduct().toString()));
    }
    

}
