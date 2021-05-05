package supermen_security;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class registra extends javax.swing.JFrame {

    public registra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        emailid = new javax.swing.JTextField();
        mobilee = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/bbb.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Batang", 1, 18)); // NOI18N
        jLabel1.setText("Online Internet Traffic Monitoring System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 410, 26));

        jLabel2.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 105, 97, 23));

        jLabel3.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 97, 30));

        jLabel4.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        jLabel4.setText("Emailid");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, 30));

        jLabel5.setFont(new java.awt.Font("Vrinda", 2, 18)); // NOI18N
        jLabel5.setText("Mobilenumber");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 30));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 150, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 150, -1));
        getContentPane().add(emailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 150, -1));
        getContentPane().add(mobilee, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, -1));

        jButton1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 120, 30));

        jButton2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 100, 30));

        jButton3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 100, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/bbb.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 510, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            String name=username.getText();
            String passwordd=password.getText();
            String emailidd=emailid.getText();
            String mobileee=mobilee.getText();
            
             
            try {
                InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
            NetworkInterface nwi = NetworkInterface.getByInetAddress(ipAddr);
            byte[] mac = nwi.getHardwareAddress();

		System.out.print("Current MAC address : ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
		}
		System.out.println(sb.toString());
                

               Connection conn = dbcon.getConne();
               Statement st = conn.createStatement();
              int j;
               JFrame frame = new JFrame();
                Object ipadd = JOptionPane.showInputDialog(frame, "Enter IP-Address:"+ipAddr.getHostAddress());
                Object mack = JOptionPane.showInputDialog(frame, "Enter Mack Address:"+sb.toString());
                
                j = st.executeUpdate("insert into userreg (username,password,emailid,phone,idpadd,mackadd)values ('" + name + "', '" + passwordd + "', '" + emailidd + "', '" + mobileee + "', '" + ipadd + "','" + mack + "')");
                
                JOptionPane.showMessageDialog(null, "Register Succesfully");        
              new login().setVisible(true);
           } catch (SocketException ex) {
            Logger.getLogger(registra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(registra.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
                Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        
        username.setText("");
        password.setText("");
        emailid.setText("");
        mobilee.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
         new login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailid;
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
    private javax.swing.JTextField mobilee;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
