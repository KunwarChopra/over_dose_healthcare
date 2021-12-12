/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Role;

import Health.Ecosystem;
import Health.Enterprises.Enterprise;
import Health.Network.NetworkSystem;
import Health.Organization.Org;
import Health.UserAccount.User_Account;
import javax.swing.JPanel;

/**
 *
 * @author kunwa
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"), 
        Patient("Patient"),
        LabAssistant("LabAssistant"), 
        Pharmacist("Pharmacist"),
        Physiotherapist("Physiotherapist"),
        Psychiatrist("Psychiatrist"),
        SupplierManager("SupplierManager"),
        SysAdminRole("SysAdmin");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            User_Account account,
            Org organization,
            Enterprise enterprise,
            Ecosystem business,
            NetworkSystem network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
