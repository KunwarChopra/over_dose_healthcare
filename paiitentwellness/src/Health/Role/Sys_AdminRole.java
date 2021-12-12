/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Role;

import Health.Ecosystem;
import Health.Enterprises.Enterprise;
import Health.Network.NetworkSystem;
import Health.Organization.Org;
import Health.UserAccount.User_Account;
import javax.swing.JPanel;
import user_interface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author kunwa
 */
public class Sys_AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Account account, Org organization, Enterprise enterprise, Ecosystem system, NetworkSystem network) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
