/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Role.AdminmainRole;
import Health.Role.Pharmacist_Role;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ANUSHA
 */
public class PharmacistOrg extends Org{
       public PharmacistOrg() {
        super(Org.Type.Pharmacist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Pharmacist_Role());
        return roles;
    } 
}
