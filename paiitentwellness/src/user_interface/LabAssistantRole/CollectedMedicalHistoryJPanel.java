/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interface.LabAssistantRole;

import Health.Enterprises.Enterprise;
import Health.Network.NetworkSystem;
import Health.Organization.Org;
import Health.UserAccount.User_Account;
import Health.WorkQueue.Doctor_LabRequest;
import Health.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author saura
 */
public class CollectedMedicalHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CollectedMedicalHistoryJPanel
     */
    JPanel userProcessContainer;

    Doctor_LabRequest request;
    User_Account useraccount;
    Enterprise enterprise;
    String result = "";
    String solution = "";
    String type = "";
    // private EcoSystem system;
    // private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public CollectedMedicalHistoryJPanel(JPanel userProcessContainer, Doctor_LabRequest request,
            User_Account useraccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.useraccount = useraccount;
        // system = dB4OUtil.retrieveSystem();
        this.enterprise = enterprise;
        populateMedicalHistory();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMedicalHist = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHealthRisk = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMedConsum = new javax.swing.JTextArea();
        resBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel2.setText("Age");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel13.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("General Information");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel1.setText("Name");

        txtName.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtName.setEnabled(false);

        txtGender.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtGender.setEnabled(false);

        txtAge.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtAge.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Medical History");

        txtMedicalHist.setColumns(20);
        txtMedicalHist.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMedicalHist.setRows(5);
        jScrollPane1.setViewportView(txtMedicalHist);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Current Health Risk Found");

        txtHealthRisk.setColumns(20);
        txtHealthRisk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtHealthRisk.setRows(5);
        jScrollPane2.setViewportView(txtHealthRisk);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Medical Dose Consumption Details ");

        txtMedConsum.setColumns(20);
        txtMedConsum.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMedConsum.setRows(5);
        jScrollPane3.setViewportView(txtMedConsum);

        resBtn.setBackground(new java.awt.Color(49, 84, 140));
        resBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        resBtn.setForeground(new java.awt.Color(255, 255, 255));
        resBtn.setText("Process & Send Result");
        resBtn.setBorder(null);
        resBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resBtnActionPerformed(evt);
            }
        });

        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtResult.setRows(5);
        jScrollPane4.setViewportView(txtResult);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Lab Assessment Result");

        jPanel6.setBackground(new java.awt.Color(36, 47, 65));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Patient's Medical History & Symptoms");

        backBtn.setBackground(new java.awt.Color(71, 120, 197));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_interface/LabAssistantRole/kindpng_78215511111.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(backBtn)
                .addGap(32, 32, 32)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(524, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jLabel9))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4))
                        .addGap(100, 100, 100)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(resBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel lab_wrk_area = (LabAssistantWorkAreaJPanel) component;
        lab_wrk_area.populateLabRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void resBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resBtnActionPerformed

        // Result Criteria - 
        /*  Send to Pharmacotherapist when below conditions are being met 
                Drug history
                Alchohal history
                Heart risk
                Fever
                If any medicines consumed more than limit 
                Injection on hand
                Opioid Intoxication
                Opioid Withdrawal
                Liver Disease


           Send to Psychiatrist when below conditions are being met 
                Depression
                Anxiety
                Bad Social Relationships 
                Blood Pressure Risk
                Resp risk
           
            When symptoms and medical consumtion is normal then patient can be 
            treated medically 
         */
        // Send to Pharmacotherapist when the below criteria is true 
        if (request.isDrug_history() || request.isAlcohol_history()
                || request.isHr_risk() || request.isTemp_risk()
                || (request.isOxycodone_taken() && request.isOxycodone_risk())
                || (request.isFantanyl_taken() && request.isFantanyl_risk())
                || (request.isBupre_taken() && request.isBupre_risk())
                || (request.isMethadone_taken() && request.isMethadone_risk())
                || (request.isOxymorphone_taken() && request.isOxymorphone_risk())
                || (request.isInjection_checked()) || (request.isIntoxication_checked())
                || request.isWithdrawal_checked() || request.isDisease_checked()) {
            type = "Overdose [Pharmacotherapist]";
            result = result + "This is an Opioid Overdose case.";
            solution = "Patient is recommended for Pharmacotherapist.";
            request.setStatus("Lab req done");

        } // Send to Psychiatrist when the below criteria is true 
        else if (request.isDepression_history() || request.isAnxiety_history()
                || request.isDisrupt_history() || request.isBp_risk() || request.isResp_risk()) {
            type = "Overdose [Psychiatrist]";
            result = result + "This is an Opioid Overdose case.";
            solution = "Patient is recommended for Psychiatrist.";
            request.setStatus("Lab req done");

        } // If not any above criteria then patient can be treated medically 
        else {
            type = "Not Overdose [Medical Treatment]";
            result = result + "This is not an Opioid Overdose case." + "\n"
                    + "Patient is recommended for medical treatment .";
            solution = "Patient is recommended for medical treatm.";
            request.setStatus("Lab req done");

        }

        txtResult.setText(result);
        /*-----------------------*/
        int b = request.getHashcode();
        System.out.println("b" + b);
        //Dharati
        Enterprise inEnterprise = null;
        Org inOrganization = null;
        NetworkSystem inNetwork = null;
        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getName().equals("Doctor Organization")) {
                for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
                    //                      System.out.println(work.getHashcode());
                    if (work.getHashcode() == b) {
                        work.setStatus("Lab req done");
                        work.setLabresult(result);
                        work.setResulttype(type);
                        work.setSolution(solution);
                    }

                }
            }
        }

        JOptionPane.showMessageDialog(null, "Result Sent Successfully");
    }//GEN-LAST:event_resBtnActionPerformed
    public void populateMedicalHistory() {

        txtName.setText(request.getName());
        txtGender.setText(request.getGender());
        txtAge.setText(Integer.toString(request.getAge()));
        String med_hist = "";
        String health_risk = "";
        String consum_risk = "";
        if (request.isDrug_history()) {
            med_hist = "Drug History Found" + "\n";

        }

        if (request.isAlcohol_history()) {
            med_hist = med_hist + "Alcohol History Found" + "\n";

        }

        if (request.isDepression_history()) {
            med_hist = med_hist + "Depression History Found" + "\n";
        }

        if (request.isAnxiety_history()) {
            med_hist = med_hist + "Anxiety History Found" + "\n";
        }
        if (request.isDisrupt_history()) {
            med_hist = med_hist + "Bad Social Relationships History Found" + "\n";
        }
        if (med_hist.length() > 0) {
            result = result + med_hist;
            txtMedicalHist.setText(med_hist);
        } else {
            txtMedicalHist.setText("No Severe Medical History Found");
        }

        if (request.isHr_risk()) {
            health_risk = "Heart Risk Found" + "\n";
        }

        if (request.isBp_risk()) {
            health_risk = "High Blood Pressure Diagnosed" + "\n";
        }

        if (request.isTemp_risk()) {
            health_risk = health_risk + "Fever Diagnosed" + "\n";
        }

        if (request.isResp_risk()) {
            health_risk = health_risk + "High Respiratory Rate Diagnosed" + "\n";
        }
        if (health_risk.length() > 0) {
            txtHealthRisk.setText(health_risk);
        } else {
            txtHealthRisk.setText("No Sever Health Risk Detected");
        }

        // Calculating consumption risk 
        if (request.isOxycodone_taken() && request.isOxycodone_risk()) {
            consum_risk = "Above Limit Oxycodone Conspumtion History" + "\n";
        }

        if (request.isFantanyl_taken() && request.isFantanyl_risk()) {
            consum_risk = consum_risk + "Above Limit Fantanyl Conspumtion History" + "\n";
        }

        if (request.isBupre_taken() && request.isBupre_risk()) {
            consum_risk = consum_risk + "Above Limit Buprenorphine Conspumtion History" + "\n";
        }

        if (request.isMethadone_taken() && request.isMethadone_risk()) {
            consum_risk = consum_risk + "Above Limit Methadon Conspumtion History" + "\n";
        }

        if (request.isOxymorphone_taken() && request.isOxymorphone_risk()) {
            consum_risk = consum_risk + "Above Limit Oxymorphone Conspumtion History" + "\n";
        }
        if (consum_risk.length() > 0) {
            txtMedConsum.setText(consum_risk);
        } else {
            txtMedConsum.setText("No severe medicine consumption history found");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton resBtn;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextArea txtHealthRisk;
    private javax.swing.JTextArea txtMedConsum;
    private javax.swing.JTextArea txtMedicalHist;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}
