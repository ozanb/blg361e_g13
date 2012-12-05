/*
 * To change this tagentlate, choose Tools | Tagentlates
 * and open the tagentlate in the editor.
 */
package itucs.blg361.g13;
import itucs.blg361.entityBean.Agent;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author Razi
 */
public class AgentList {
     private List<Agent> agentList;
    
    public AgentList(){
        agentList = new LinkedList<Agent>();       
    }
    
    public List<Agent> getList(){
        return agentList;
    }
    
    public void addAgent(Agent agent){
        agentList.add(agent);
    }
    
    public void deleteAgent(Agent agent){
        agentList.remove(agent);
    }
    
}
