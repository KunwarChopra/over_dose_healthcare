/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kunwa
 */
public class SuppliersEnterprise extends Enterprise {

    public SuppliersEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Suppliers);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
