/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Role.AdminmainRole;
import Health.Role.Role;
import Health.Role.Supply_ManagerRole;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class SupplyManagerOrg extends Org {

    public SupplyManagerOrg() {
        super(Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Supply_ManagerRole());
        return roles;
    }
}
