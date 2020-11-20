
package Hotal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    Connection  con;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        p1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAZAN HOTAL Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 82, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        cb1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 140, -1));

        t1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 140, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, -1));
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\PCD\\Desktop\\sssssssssss.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = t1.getText();
        String Password=String.valueOf(p1.getPassword());
        String option=cb1.getSelectedItem().toString();
        
        if (name.equals("")|| Password.equals("")||option.equals(""))
        {

            JOptionPane.showMessageDialog(rootPane, "Some Field are Empty","Error",1);
        }
        
        else 
        {
        
    try{
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    
    con=MyConnection.getConnection();
    
    PreparedStatement pst=con.prepareStatement("SELECT * FROM Login where UserName=? and Password=?");
    pst.setString(1, name);
    pst.setString(2, Password);
    ResultSet rs=pst.executeQuery();
    
    if(rs.next()){
    String s1=rs.getString("Option");
    if(option.equalsIgnoreCase("Admin")&&s1.equalsIgnoreCase("Admin")){
    
   Admin a=new Admin();
   a.setVisible(true);
   a.setSize(400, 400);
   }
    if(option.equalsIgnoreCase("Customer")&&s1.equalsIgnoreCase("Customer")){
    
   Customer a=new Customer();
   a.setVisible(true);
   a.setSize(400, 400);
        }
   
   
        
    }else JOptionPane.showMessageDialog(rootPane, "User name or Password is incorrect");
    }
    catch(Exception ex)
            {
    System.out.println(ex);
    {
       
            
        }
    
            }}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField p1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
