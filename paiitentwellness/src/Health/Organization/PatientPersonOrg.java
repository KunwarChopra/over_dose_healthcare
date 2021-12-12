/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Role.AdminmainRole;
import Health.Role.IndividualRole;
import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class PatientPersonOrg extends Org {

    public PatientPersonOrg() {
        super(Org.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IndividualRole());
        return roles;
    }
}
