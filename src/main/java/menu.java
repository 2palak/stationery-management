/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemsB = new javax.swing.JButton();
        offersB = new javax.swing.JButton();
        reviewsB = new javax.swing.JButton();
        membershipB = new javax.swing.JButton();
        onlinepaymentB = new javax.swing.JButton();
        aboutusB = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel4.setText("CraftTown Stationary!");

        jLabel1.setFont(new java.awt.Font("Garamond", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Creation beyond Imagination :)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 663, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\pencil.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 188, 141));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Pick your Interest...");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 140, -1, -1));

        itemsB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        itemsB.setForeground(new java.awt.Color(204, 0, 204));
        itemsB.setText("Items");
        itemsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsBActionPerformed(evt);
            }
        });
        jPanel4.add(itemsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 200, -1, -1));

        offersB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        offersB.setForeground(new java.awt.Color(204, 0, 204));
        offersB.setText("Offers");
        offersB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offersBActionPerformed(evt);
            }
        });
        jPanel4.add(offersB, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 262, -1, -1));

        reviewsB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reviewsB.setForeground(new java.awt.Color(204, 0, 204));
        reviewsB.setText("Reviews");
        reviewsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewsBActionPerformed(evt);
            }
        });
        jPanel4.add(reviewsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 326, -1, -1));

        membershipB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        membershipB.setForeground(new java.awt.Color(204, 0, 204));
        membershipB.setText("Membership");
        membershipB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipBActionPerformed(evt);
            }
        });
        jPanel4.add(membershipB, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 201, -1, -1));

        onlinepaymentB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        onlinepaymentB.setForeground(new java.awt.Color(204, 0, 204));
        onlinepaymentB.setText("Online Order");
        onlinepaymentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlinepaymentBActionPerformed(evt);
            }
        });
        jPanel4.add(onlinepaymentB, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 262, -1, -1));

        aboutusB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        aboutusB.setForeground(new java.awt.Color(204, 0, 204));
        aboutusB.setText("About Us");
        aboutusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusBActionPerformed(evt);
            }
        });
        jPanel4.add(aboutusB, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 326, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\stationery.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 450, 601, 163));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 660, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 102));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsBActionPerformed
        // TODO add your handling code here:
        items i = new items();
        i.setVisible(true);
    }//GEN-LAST:event_itemsBActionPerformed

    private void offersBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offersBActionPerformed
        // TODO add your handling code here:
        offers o = new offers();
        o.setVisible(true);
    }//GEN-LAST:event_offersBActionPerformed

    private void reviewsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewsBActionPerformed
        // TODO add your handling code here:
        reviews r = new reviews();
        r.setVisible(true);
    }//GEN-LAST:event_reviewsBActionPerformed

    private void membershipBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipBActionPerformed
        // TODO add your handling code here:
        membership m = new membership();
        m.setVisible(true);
        
    }//GEN-LAST:event_membershipBActionPerformed

    private void onlinepaymentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlinepaymentBActionPerformed
        // TODO add your handling code here:
        onlineorder oo = new onlineorder();
        oo.setVisible(true);
    }//GEN-LAST:event_onlinepaymentBActionPerformed

    private void aboutusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusBActionPerformed
        // TODO add your handling code here:
        aboutus a = new aboutus();
        a.setVisible(true);
    }//GEN-LAST:event_aboutusBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        thankyou ty = new thankyou();
        ty.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutusB;
    private javax.swing.JButton itemsB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton membershipB;
    private javax.swing.JButton offersB;
    private javax.swing.JButton onlinepaymentB;
    private javax.swing.JButton reviewsB;
    // End of variables declaration//GEN-END:variables
}
