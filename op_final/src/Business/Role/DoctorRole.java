/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import User_Interface.DoctorRole.DoctorWorkAreaJPannel;
import javax.swing.JPanel;

/**
 *
 * @author ANUSHA
 */
    public class DoctorRole extends Role {

// @Override
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new DoctorWorkAreaJPannel(userProcessContainer, account, organization, enterprise, network);
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
