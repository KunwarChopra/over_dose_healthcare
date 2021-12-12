/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health;

import Health.Person.Individual;
import Health.Role.Sys_AdminRole;
import Health.UserAccount.User_Account;

/**
 *
 * @author kunwa
 */
public class ConfigSystem {
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        //Create a network, create an enterprise, initialize some organization,some employee,User account
        
        Individual person = system.getPersonDirectory().createPerson("RRH");
        User_Account ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new Sys_AdminRole(),"");
        
        return system;
    }
 
}
