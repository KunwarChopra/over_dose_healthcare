/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Enterprise.Enterprise;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public abstract class Organization {
     private String name;
//    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
//    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type {
        Admin("Admin Organization", null),
        Doctor("Doctor Organization", Enterprise.EnterpriseType.Hospital),
        Lab("Lab Organization", Enterprise.EnterpriseType.Hospital),
        Patient("Patient Organization", Enterprise.EnterpriseType.Hospital),
        Pharmacist("Pharmacist Organization", Enterprise.EnterpriseType.Pharmacies),
        Supplier("Supplier Manager Organization", Enterprise.EnterpriseType.Suppliers), Physiotherapist("Pharmacotherapist Organization", Enterprise.EnterpriseType.RehabCenters),
        Psychiatrist("Psychiatrist Organization", Enterprise.EnterpriseType.RehabCenters);
        private String value;
        private Enterprise.EnterpriseType enterprise;

        private Type(String value, Enterprise.EnterpriseType enterprise) {
            this.value = value;
            this.enterprise = enterprise;
        }

        public String getValue() {
            return value;
        }

        public Enterprise.EnterpriseType getEType() {
            return enterprise;
        }
    }

    public Organization(String name) {
        this.name = name;
//        workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
//        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public String getName() {
        return name;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    @Override
    public String toString() {
        return name;
    }
}
