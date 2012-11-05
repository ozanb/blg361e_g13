/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itucs.blg361.g13;

/**
 *
 * @author Nadir
 */

import java.util.LinkedList;
import java.util.List;

public class RawList {
    private List<Raw> rawList;
    
    public RawList(){
        rawList = new LinkedList<Raw>();       
    }
    
    public List<Raw> getList(){
        return rawList;
    }
    
    public void addRaw(Raw raw){
        rawList.add(raw);
    }
    
    public void deleteRaw(Raw raw){
        rawList.remove(raw);
    }
    
    
    
}
