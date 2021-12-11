/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kunwa
 */
public class ConfigureASystem {
    
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        //Create a network, create an enterprise, initialize some organizations, have some employees, create user account
        Person person = system.getPersonDirectory().createPerson("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole(),"");
        
        return system;
    }
}
