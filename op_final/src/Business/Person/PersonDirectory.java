/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class PersonDirectory {
    
      private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList();
    }
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    public Person createPerson(String name){
        Person person = new Person();
        person.setName(name);
        personList.add(person);
        return person;
    }
    public void deletePerson(Person name){
        personList.remove(name);
    }
    
}
