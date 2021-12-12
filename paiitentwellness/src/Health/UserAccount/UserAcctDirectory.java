/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.UserAccount;


import Health.Person.Individual;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class UserAcctDirectory {
    
    private ArrayList<User_Account> userAccountList;

    public UserAcctDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<User_Account> getUserAccountList() {
        return userAccountList;
    }
    
    public User_Account authenticateUser(String username, String password){
        for (User_Account ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public User_Account createUserAccount(String username, String password, Individual person, Role role, String email){
        User_Account userAccount = new User_Account();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(person);
        userAccount.setRole(role);
        userAccount.setEmail(email);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (User_Account ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
