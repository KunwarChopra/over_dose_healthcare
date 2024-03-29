
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Health.Enterprises;

import Health.Organization.Org;
import Health.Organization.OrgDirectory;

/**
 *
 * @author kunwa
 */
public abstract class Enterprise extends Org{
    
    private EnterpriseType enterpriseType;
    private OrgDirectory organizationDirectory;

    public OrgDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        RehabCenters("RehabCenters"),
        Pharmacies("Pharmacies"),
        Suppliers("Suppliers");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }
    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrgDirectory();
    }
}
