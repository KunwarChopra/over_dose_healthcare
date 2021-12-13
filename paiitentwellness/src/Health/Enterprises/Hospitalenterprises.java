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
public class Hospitalenterprises extends Enterprise{
     public Hospitalenterprises(String name){
        super(name,Enterprise.EnterpriseType.Hospital);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
