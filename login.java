package supermen_security;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public static String susernames,mackadress,ipaddress;
    public login() {
        initComponents();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Batang", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 24, 85, 22));

        jLabel2.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        jLabel2.setText("username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 23));

        jLabel3.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 28));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 150, 30));

        jButton1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 30));

        jButton2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton2.setText("Registration");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, 30));

        jButton3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 100, 30));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/bbb.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 470, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       String username=jTextField1.getText();
       String password=jPasswordField1.getText();
       String Statuss="Yes";
      
        if(username.equals("") || (password.equals("")))
            {
                 JOptionPane.showMessageDialog(null, "Please Enter your Username and Password ");
            }
        else{

            try {
               Connection conn = dbcon.getConne();
               Statement st = conn.createStatement();
              ResultSet ss = st.executeQuery("select * from userreg where username='" + username + "' and password='"+password+"' ");
                if (ss.next()) {
                   susernames=ss.getString("username");
                   mackadress=ss.getString("idpadd");
                   mackadress=ss.getString("mackadd");
                   
               Statement st1 = conn.createStatement();
              ResultSet ss1 = st1.executeQuery("select * from nodes where attack='" + Statuss + "'  ");
                if (ss1.next()) {
                   
                    String  attt=ss1.getString("nodenum");
               Statement st2 =conn.createStatement();
         int i = st2.executeUpdate("update nodes set attack='No' where nodenum='" + attt + "'");
   if (i != 0) {
       new source().setVisible(true);
   } 
                
                }
                else{
                    new source().setVisible(true);
                }
                }
                else{
                new registra().setVisible(true);
            }
              

           } catch (SQLException ex) {
                Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         new registra().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
        jTextField1.setText("");
        jPasswordField1.setText("");
           
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
