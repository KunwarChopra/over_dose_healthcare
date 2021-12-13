/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Enterprises;

import Health.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class PharmacyEnterprises extends Enterprise {

    public PharmacyEnterprises(String name) {
        super(name, Enterprise.EnterpriseType.Pharmacies);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
