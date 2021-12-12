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
public class RehabEnterprises extends Enterprise {

  public RehabEnterprises(String name) {
        super(name, Enterprise.EnterpriseType.RehabCenters);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
