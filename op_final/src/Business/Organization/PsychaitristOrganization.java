/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PsychiatristRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class PsychaitristOrganization extends Organization {

    public PsychaitristOrganization() {
        super(Organization.Type.Psychiatrist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PsychiatristRole());
        return roles;
    }
}
