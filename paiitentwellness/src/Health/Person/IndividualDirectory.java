/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Person;

import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class IndividualDirectory {
    
      private ArrayList<Individual> personList;

    public IndividualDirectory() {
        personList = new ArrayList();
    }

    public ArrayList<Individual> getPersonList() {
        return personList;
    }
    
    public Individual createPerson(String name){
        Individual person = new Individual();
        person.setName(name);
        personList.add(person);
        return person;
    }
    
    public void deletePerson(Individual name){
        personList.remove(name);
    }
    
}
