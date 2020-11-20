
package Hotal;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Customer extends javax.swing.JFrame {

  
    public Customer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        SaveButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAZAN HOTAL Booking room");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOKING ROOM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 390, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Select Room");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Select Adult");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Select Childern");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, -1));

        cb1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ", "1 Room", "2 Room", "3 Room", "4 Room", "5 Room", "More than 5 ...." }));
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 137, -1));

        cb2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1  Adult", "2  Adult", "3  Adult", "4  Adult", "5  Adult", "6  Adult", "More than 6 ..." }));
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 137, -1));

        cb3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1 Child", "2 Childern", "3 Childern", "4 Childern", "5 Childern", "6 Childern", "More than 6 ..." }));
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 137, -1));

        SaveButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iamges/Save.jpeg"))); // NOI18N
        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 110, 43));

        ExitButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iamges/Exit.jpeg"))); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 114, 41));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Your name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Your Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        t1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 137, -1));

        t2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 137, -1));

        t3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 137, -1));

        ClearButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCD\\Desktop\\FirstTerm\\Java Programming\\icon images\\Clear11.jpeg")); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 109, 42));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date book");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, -1));

        t4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 137, 24));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCD\\Desktop\\hotel_room_bed_stylish_modern_39745_1920x1200.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -90, 1450, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    cb1.setSelectedIndex(0);
    cb2.setSelectedIndex(0);
    cb3.setSelectedIndex(0);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed

    String Name=t1.getText();
    String MobilNumber=t2.getText();
    String Email=t3.getText();
    String Date=t4.getText();
    String Room=cb1.getSelectedItem().toString();
    String Adult=cb2.getSelectedItem().toString();
    String Childern=cb3.getSelectedItem().toString();
    try{
     
        Connection con=MyConnection.getConnection();
        PreparedStatement pst=con.prepareStatement("insert into Customer(Name,MobilNumber,Email,Date,Room,Adult,Childern)Values(?,?,?,?,?,?,?)");
        pst.setString(1, Name);
        pst.setString(2,MobilNumber);
        pst.setString(3, Email);
        pst.setString(4, Date);
        pst.setString(5, Room);
        pst.setString(6, Adult);
        pst.setString(7, Childern);
        int ok=JOptionPane.showConfirmDialog(rootPane,"Confirm","Do You wnat to save",JOptionPane.YES_NO_CANCEL_OPTION);
        if(ok==0)
        {
            pst.execute();
        JOptionPane.showConfirmDialog(rootPane,"Data Store SuccessFully","Done",1 );
        }// if colse
    }//try cloes
    catch(HeadlessException | SQLException ex)
    {
        System.out.println(ex);
    }
        
        
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
