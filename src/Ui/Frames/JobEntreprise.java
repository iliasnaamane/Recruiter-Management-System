/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui.Frames;

import App.Services.Ui.ServiceJobEntreprise;

/**
 *
 * @author Sony
 */
public class JobEntreprise extends javax.swing.JPanel {

    /**
     * Creates new form JobEntreprise
     */
    public JobEntreprise() {
        initComponents();
        ServiceJobEntreprise.DisplayClientsJob(jobTable,LoginEntre.getIdEntreprise());
    }
    
    private void FenetreCandidatAdmis(int idJob) {
        JobCandidatsEntre C = new JobCandidatsEntre(idJob) ;
        C.setResizable(false);
        C.setVisible(true);
    }
    
    private int getJobId() {
        return (int) jobTable.getValueAt(jobTable.getSelectedRow(),0) ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        visualiser = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(850, 570));
        setMinimumSize(new java.awt.Dimension(850, 570));
        setPreferredSize(new java.awt.Dimension(850, 570));

        jobTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jobTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jobTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jobTable);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Offre d'emploi en cours");

        visualiser.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        visualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ui/Resources/icons/eye.png"))); // NOI18N
        visualiser.setText("Visualiser");
        visualiser.setEnabled(false);
        visualiser.setIconTextGap(10);
        visualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualiserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(visualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(visualiser)
                        .addGap(26, 26, 26))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jobTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jobTableMouseClicked
        if(jobTable.getSelectedRow() != -1) {
            visualiser.setEnabled(true);
        }
        else visualiser.setEnabled(false);
    }//GEN-LAST:event_jobTableMouseClicked

    private void visualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualiserActionPerformed
        new JobCandidatsEntre(getJobId()).setVisible(true);
    }//GEN-LAST:event_visualiserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jobTable;
    private javax.swing.JButton visualiser;
    // End of variables declaration//GEN-END:variables
}
