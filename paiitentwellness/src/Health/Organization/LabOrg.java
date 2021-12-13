/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Role.AdminmainRole;
import Health.Role.LabAssistRole;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ANUSHA
 */
public class LabOrg extends Org {

    public LabOrg() {
        super(Org.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabAssistRole());
        return roles;
    }
}
