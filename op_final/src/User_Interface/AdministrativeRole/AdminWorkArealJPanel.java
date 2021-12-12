/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package User_Interface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author saura
 */
public class AdminWorkArealJPanel extends javax.swing.JPanel {
    

    /**
     * Creates new form AdminWorkArealJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    
    
    public AdminWorkArealJPanel() {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
        FillGraph();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        lblmanageorganization = new java.awt.Button();
        lblmanageemployee = new java.awt.Button();
        lblmanageuser = new java.awt.Button();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Admin Area ");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Enterprise:");

        valueLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        valueLabel.setText("Value");

        lblmanageorganization.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblmanageorganization.setLabel("Manage Organization");

        lblmanageemployee.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblmanageemployee.setLabel("Manage Employee");

        lblmanageuser.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        lblmanageuser.setLabel("Manage User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblmanageorganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmanageuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmanageemployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(61, 61, 61)
                .addComponent(lblmanageorganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblmanageemployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblmanageuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

     private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }                                           

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }                                                     

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }          
    private void FillGraph() {
        if (!(enterprise instanceof Enterprise)) {
            JOptionPane.showMessageDialog(null, "Please add Enterprises.");
            return;
        }
        int org_count = 0;
        int per_count = 0;
        int user_count = 0;

        for (Organization orgs : enterprise.getOrganizationDirectory().getOrganizationList()) {
            org_count++;

            for (Person person : orgs.getPersonDirectory().getPersonList()) {
                per_count++;
            }

            for (UserAccount usr : orgs.getUserAccountDirectory().getUserAccountList()) {
                user_count++;
            }
        }
    
        DefaultCategoryDataset DCategorydata = new DefaultCategoryDataset();

        DCategorydata.setValue(org_count, "Organizations", "Total of Organizations");
        DCategorydata.setValue(per_count, "Persons", "Total Persons");
        DCategorydata.setValue(user_count, "Users", "Total Accounts");

        JFreeChart jfreechart = ChartFactory.createBarChart3D("ENTERPRISE STATISTICS", "ENTITIES", "COUNT", DCategorydata, PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = jfreechart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel chartp = new ChartPanel(jfreechart, true);

        chartp.setVisible(true);
        barchart.removeAll();
        barchart.setLayout(new java.awt.BorderLayout());
        barchart.add(chartp, BorderLayout.CENTER);
        barchart.validate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Button lblmanageemployee;
    private java.awt.Button lblmanageorganization;
    private java.awt.Button lblmanageuser;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
