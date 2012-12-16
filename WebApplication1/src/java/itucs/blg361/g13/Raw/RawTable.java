/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13.Raw;

import itucs.blg361.g13.BasePage;


/**
 *
 * @author Nadir
 */
public final class RawTable extends BasePage {

    public RawTable() {
        RawTableForm form = new RawTableForm("raw_list_form");
        this.add(form);

        

    }
    
}
