/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author kunwa
 */
public abstract class Role {
    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"), // Added by Dharati 04/10/2019
        Patient("Patient"), // Added by Dharati 04/10/2019
        LabAssistant("LabAssistant"), // Added by Dharati 04/10/2019
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
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}


