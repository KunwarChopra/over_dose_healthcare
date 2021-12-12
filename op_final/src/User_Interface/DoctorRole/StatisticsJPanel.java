/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package User_Interface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author saura
 */
public class StatisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StatisticsJPanel
     */
     JPanel userProcessContainer;
   WorkRequest patientrequest;
   Network network;
   Enterprise enterprise;
   UserAccount userAccount;
   DoctorOrganization organization;
    public StatisticsJPanel(JPanel userProcessContainer, UserAccount userAccount, DoctorOrganization organization, Enterprise enterprise, Network network) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = organization;
       Loadbarchart();
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
        barchartRequeststatistics = new javax.swing.JPanel();
        btnBack = new java.awt.Button();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Request Statics");

        javax.swing.GroupLayout barchartRequeststatisticsLayout = new javax.swing.GroupLayout(barchartRequeststatistics);
        barchartRequeststatistics.setLayout(barchartRequeststatisticsLayout);
        barchartRequeststatisticsLayout.setHorizontalGroup(
            barchartRequeststatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
        );
        barchartRequeststatisticsLayout.setVerticalGroup(
            barchartRequeststatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
        );

        btnBack.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBack.setLabel(">>Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(barchartRequeststatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(132, 132, 132)
                .addComponent(barchartRequeststatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barchartRequeststatistics;
    private java.awt.Button btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
 private void Loadbarchart() {
//        if (!(enterprise instanceof Enterprise)) {
//            JOptionPane.showMessageDialog(null, "Please add Enterprises.");
//            return;
//        };
           int count =0;
       
        int medhistcollected_count = 0;
        int resultfound_count = 0;
        int assigntodoc_count = 0;
        int sent_count = 0;
         int assigntophysio_count = 0;
           int assigntopsy_count = 0;
         //Assigned to psychiatrist
         for(WorkRequest workreq :organization.getWorkQueue().getWorkRequestList())
        {
            if(workreq.getStatus().equalsIgnoreCase("sent"))
            {
                sent_count++;
            }
            else if(workreq.getStatus().equalsIgnoreCase("result found"))
            {
                resultfound_count++;
            }
             else if(workreq.getStatus().equalsIgnoreCase("assigned to doc"))
            {
                assigntodoc_count++;
            }
             else if(workreq.getStatus().equalsIgnoreCase("Med Hist Collected For Lab"))
            {
                medhistcollected_count++;
            }
             else if(workreq.getStatus().equalsIgnoreCase("Assigned to pharmacotherapist"))
            {
                assigntophysio_count++;
            }
             else if(workreq.getStatus().equalsIgnoreCase("Assigned to psychiatrist"))
            {
                assigntopsy_count++;
            }
            
           // workreq
        }
        DefaultCategoryDataset DCategorydata = new DefaultCategoryDataset();

        DCategorydata.setValue(sent_count, "sent", "sent");        
        DCategorydata.setValue(assigntodoc_count, "assignedto doc", "assignedto doc");
        DCategorydata.setValue(resultfound_count, "Result Found", "Result Found");
        DCategorydata.setValue(medhistcollected_count, "Med hist collected lab", "Med hist collected lab");
        DCategorydata.setValue(assigntophysio_count, "Assigned to pharmacotherapist", "Assigned to pharmacotherapist");
        DCategorydata.setValue(assigntophysio_count, "Assigned to psychiatrist", "Assigned to psychiatrist");


        JFreeChart jfreechart = ChartFactory.createBarChart3D("PATIENT REQUEST STATISTICS", "ENTITIES", "COUNT", DCategorydata, PlotOrientation.VERTICAL, true, true, false);

        CategoryPlot plot = jfreechart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

        ChartPanel chartp = new ChartPanel(jfreechart, true);

        chartp.setVisible(true);
        barchartRequeststatistics.removeAll();
        barchartRequeststatistics.setLayout(new java.awt.BorderLayout());
        barchartRequeststatistics.add(chartp, BorderLayout.CENTER);
        barchartRequeststatistics.validate();
    }
}
