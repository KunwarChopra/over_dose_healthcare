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
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author kunwa
 */
public class AdminRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business);
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
