/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.UserAccount;


import Health.Person.Individual;
import Health.Role.Role;
import Health.WorkQueue.Work_Queue;

/**
 *
 * @author kunwa
 */
public class User_Account {
    
    private String username;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Individual getPerson() {
        return Person;
    }

    public void setPerson(Individual Person) {
        this.Person = Person;
    }
    private Individual Person;
    private Role role;
    private Work_Queue workQueue;

    public User_Account() {
        workQueue = new Work_Queue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Individual employee) {
        this.Person = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Individual getEmployee() {
        return Person;
    }

    public Work_Queue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}