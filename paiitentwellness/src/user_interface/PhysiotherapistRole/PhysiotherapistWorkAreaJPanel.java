/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interface.PhysiotherapistRole;

import Health.Enterprises.Enterprise;
import Health.Network.NetworkSystem;
import Health.Organization.DoctorConsultantOrg;
import Health.Organization.Org;
import Health.Organization.PhysiotherapistOrg;
import Health.UserAccount.User_Account;
import Health.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import user_interface.PsychiatristRole.PsychiatristWorkAreaJPanel;

/**
 *
 * @author ANUSHA
 */
public class PhysiotherapistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhysiotherapistWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private PhysiotherapistOrg organization;
    private Enterprise enterprise;
    private User_Account userAccount;
    private NetworkSystem network;

    public PhysiotherapistWorkAreaJPanel(JPanel userProcessContainer, User_Account account, Org organization, Enterprise enterprise, NetworkSystem network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (PhysiotherapistOrg) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        populatePhysiodata();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        physiotherapistJTable = new javax.swing.JTable();
        assignJButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(188, 194, 223));

        physiotherapistJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Request Intended By", "Request Received By", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(physiotherapistJTable);

        assignJButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        assignJButton2.setText("Assign to me");
        assignJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Treat Patient");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Pharmacotherapist Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton2)
                    .addComponent(jButton1))
                .addGap(206, 206, 206))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton2ActionPerformed
 //   System.out.println("assign to me pressed ");
        String status;

        int selectedRow = physiotherapistJTable.getSelectedRow();

        //    System.out.println(docWorkRequestJTable.getValueAt(selectedRow, 3));
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select patient request first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            status = (String) physiotherapistJTable.getValueAt(selectedRow, 3);
          
                WorkRequest request = (WorkRequest) physiotherapistJTable.getValueAt(selectedRow, 0);
                request.setReceiver(userAccount);
                request.setStatus("Assigned to physiotherapist");
                populatePhysiodata();
                
           

        }

    }//GEN-LAST:event_assignJButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        WorkRequest request;
        int selectedRow = physiotherapistJTable.getSelectedRow();

        //    System.out.println(docWorkRequestJTable.getValueAt(selectedRow, 3));
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "please select patient request first.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
           
          
                request = (WorkRequest) physiotherapistJTable.getValueAt(selectedRow, 0);
                request.setReceiver(userAccount);
                request.setStatus("Assigned to physiotherapist");
                populatePhysiodata();
                
           

        }

        
        treatJPanel TreatJPanel = new treatJPanel(userProcessContainer, userAccount, organization, enterprise, network,request);
        userProcessContainer.add("treatJPanel", TreatJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable physiotherapistJTable;
    // End of variables declaration//GEN-END:variables

    private void populatePhysiodata() {
        DefaultTableModel model = (DefaultTableModel) physiotherapistJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            //    row[0] = request.getMessage();
            row[0] = request;
            row[1] = request.getSender().getUsername();
            row[2] = request.getReceiver() == null? "" :request.getReceiver().getUsername();
            String result = request.getStatus();
            // System.out.println(result);
            row[3] = result == null ? "Waiting" : result;

            row[4] = request.getRequestDate();

            model.addRow(row);

        }

    }
}