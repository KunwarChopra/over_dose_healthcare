/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Role.AdminmainRole;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class AdminOrg extends Org {

    public AdminOrg() {
        super(Type.Admin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminmainRole());
        return roles;
    }

}
