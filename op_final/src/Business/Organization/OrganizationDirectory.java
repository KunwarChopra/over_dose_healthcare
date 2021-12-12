/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author saura
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
//        if (null != type) {
//            switch (type) {
//                case Doctor:
//                    organization = new DoctorOrganization();
//                    organizationList.add(organization);
//                    break;
//                case Patient:
//                    organization = new PatientOrganization();
//                    organizationList.add(organization);
//                    break;
//                case Lab:
//                    organization = new LabOrganization();
//                    organizationList.add(organization);
//                    break;
//                case Pharmacist:
//                    organization = new PharmacistOrganization();
//                    organizationList.add(organization);
//                    break;
//                case Psychiatrist:
//                    organization = new PsychiatristOrganization();
//                    organizationList.add(organization);
//                    break;
//                case Physiotherapist:
//                    organization = new PhysiotherapistOrganization();
//                    organizationList.add(organization);
//                    break;
//                case Supplier:
//                    organization = new SupplierManagerOrganization();
//                    organizationList.add(organization);
//                    break;
//                default:
//                    break;
//            }
//        }
        return organization;
    }

    public void deleteOrganization(Organization org) {
        organizationList.remove(org);
    }
}
