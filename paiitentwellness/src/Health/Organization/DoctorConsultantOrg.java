/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Role.AdminmainRole;
import Health.Role.Doctor_Role;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ANUSHA
 */
public class DoctorConsultantOrg extends Org {

    public DoctorConsultantOrg() {
        super(Org.Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor_Role());
        return roles;
    }
}
