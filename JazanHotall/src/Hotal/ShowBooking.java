
package Hotal;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class ShowBooking extends javax.swing.JInternalFrame {

    
    public ShowBooking() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Show Detals of Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 43, 215, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "MobilNumber", "Email", "Date", "Room", "Adult", "Childern"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 99, 629, 85));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
       Connection con=MyConnection.getConnection();
       String sql="SELECT * FROM Customer";
       PreparedStatement pst=con.prepareStatement(sql);
       ResultSet rs=pst.executeQuery();
       DefaultTableModel dtm=(DefaultTableModel)jTable2.getModel();
       dtm.setRowCount(0);
       while(rs.next()){
       dtm.addRow(new Object[]{
       rs.getString("Name"),
       rs.getString("MobilNumber"),
       rs.getString("Email"),
       rs.getString("Date"),
       rs.getString("Room"),
       rs.getString("Adult"),
       rs.getString("Childern")
       });
       
       }
       }
       catch(HeadlessException | SQLException ex)
    {
        System.out.println(ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
