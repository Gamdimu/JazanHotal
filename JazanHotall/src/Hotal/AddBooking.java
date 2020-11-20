
package Hotal;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AddBooking extends javax.swing.JInternalFrame {

    
    public AddBooking() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbb1 = new javax.swing.JComboBox<>();
        cbb2 = new javax.swing.JComboBox<>();
        cbb3 = new javax.swing.JComboBox<>();
        tx1 = new javax.swing.JTextField();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tx4 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Booking room");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 30, 180, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Mobil Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 82, 170, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("E-mail");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Room");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 50, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Adult");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 253, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Childern");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        cbb1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1 Room", "2 Room", "3 Room", "4 Room", "5 Room", "6 Room", "7 Room" }));
        cbb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cbb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 201, 219, -1));

        cbb2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1  Adult ", "2  Adult", "3  Adult ", "4  Adult ", "5  Adult", "6  Adult ", "More than 6 ..." }));
        getContentPane().add(cbb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 248, 219, -1));

        cbb3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1 Child ", "2 Childern", "3 Childern ", "4 Childern ", "5 Childern ", "6 Childern ", "More than 6 ..." }));
        getContentPane().add(cbb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 307, 219, -1));

        tx1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(tx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 219, -1));

        tx2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(tx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 219, -1));

        tx3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx3ActionPerformed(evt);
            }
        });
        getContentPane().add(tx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 219, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCD\\Desktop\\FirstTerm\\Java Programming\\icon images\\Save.jpeg")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 364, 110, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCD\\Desktop\\FirstTerm\\Java Programming\\icon images\\Clear11.jpeg")); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 364, 100, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCD\\Desktop\\FirstTerm\\Java Programming\\icon images\\Exit.jpeg")); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 364, 90, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 40, -1));

        tx4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(tx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 219, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx3ActionPerformed

    private void cbb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    String Name=tx1.getText();
    String MobilNumber=tx2.getText();
    String Email=tx3.getText();
    String Date=tx4.getText();
    String Room=cbb1.getSelectedItem().toString();
    String Adult=cbb2.getSelectedItem().toString();
    String Childern=cbb3.getSelectedItem().toString();
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
        
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    tx1.setText("");
    tx2.setText("");
    tx3.setText("");
    tx4.setText("");
    cbb1.setSelectedIndex(0);
    cbb2.setSelectedIndex(0);
    cbb3.setSelectedIndex(0);       
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbb1;
    private javax.swing.JComboBox<String> cbb2;
    private javax.swing.JComboBox<String> cbb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    private javax.swing.JTextField tx4;
    // End of variables declaration//GEN-END:variables
}
