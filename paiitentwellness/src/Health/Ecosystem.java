/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health;

import Health.Network.NetworkSystem;
import Health.Organization.Org;
import Health.Role.Role;
import Health.Role.Sys_AdminRole;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class Ecosystem extends Org {
     private static Ecosystem business;
    private ArrayList<NetworkSystem> networkList;
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
  
    public NetworkSystem createAndAddNetwork(){
        NetworkSystem network=new NetworkSystem();
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(NetworkSystem network)
    {
        networkList.remove(network);
    }
   
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new Sys_AdminRole());
        return roleList;
    }
    private Ecosystem(){
        super(null);
        networkList=new ArrayList<NetworkSystem>();
    }

    public ArrayList<NetworkSystem> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<NetworkSystem> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
           return false;
        }
        for(NetworkSystem network:networkList){
            
        }
        return true;
    }
}
