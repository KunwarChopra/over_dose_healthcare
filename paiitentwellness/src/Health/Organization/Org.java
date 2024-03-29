/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Enterprises.Enterprise;
import Health.Person.IndividualDirectory;
import Health.Role.Role;
import Health.UserAccount.UserAcctDirectory;
import Health.WorkQueue.Work_Queue;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public abstract class Org {

    private String name;
    private Work_Queue workQueue;
    private IndividualDirectory personDirectory;
    private UserAcctDirectory userAccountDirectory;
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

    public Org(String name) {
        this.name = name;
        workQueue = new Work_Queue();
        personDirectory = new IndividualDirectory();
        userAccountDirectory = new UserAcctDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAcctDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public IndividualDirectory getPersonDirectory() {
        return personDirectory;
    }

    public String getName() {
        return name;
    }

    public Work_Queue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(Work_Queue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
