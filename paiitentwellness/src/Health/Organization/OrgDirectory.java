/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Organization;

import Health.Organization.Org.Type;
import java.util.ArrayList;

/**
 *
 * @author saura
 */
public class OrgDirectory {

    private ArrayList<Org> organizationList;

    public OrgDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Org> getOrganizationList() {
        return organizationList;
    }

    public Org createOrganization(Type type) {
        Org organization = null;
        if (null != type) {
            switch (type) {
                case Doctor:
                    organization = new DoctorConsultantOrg();
                    organizationList.add(organization);
                    break;
                case Patient:
                    organization = new PatientPersonOrg();
                    organizationList.add(organization);
                    break;
                case Lab:
                    organization = new LabOrg();
                    organizationList.add(organization);
                    break;
                case Pharmacist:
                    organization = new PharmacistOrg();
                    organizationList.add(organization);
                    break;
                case Psychiatrist:
                    organization = new PsychiatristOrg();
                    organizationList.add(organization);
                    break;
                case Physiotherapist:
                    organization = new PhysiotherapistOrg();
                    organizationList.add(organization);
                    break;
                case Supplier:
                    organization = new SupplyManagerOrg();
                    organizationList.add(organization);
                    break;
                default:
                    break;
            }
        }
        return organization;
    }

    public void deleteOrganization(Org org) {
        organizationList.remove(org);
    }
}
