package supermen_security;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class suppermen extends javax.swing.JFrame {
String attack;

    public suppermen() {
        initComponents();
        
         Thread t1 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(300);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  jLabel1.setVisible(false);
                                                  jLabel4.setVisible(false);
                                          }
                 };
          Thread t2 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(600);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  
                                                  jLabel1.setVisible(true);
                                                  jLabel4.setVisible(true);
                                          }
                 };
          Thread t3 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(800);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  jLabel3.setVisible(false);
                                                  jLabel6.setVisible(false);
                                          }
                 };
          Thread t4 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(1100);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                   attack=routee.attt;
                                                  jLabel3.setText(attack);
                                                  jLabel3.setVisible(true);
                                                  jLabel6.setVisible(true);
                                          }
                 };
           Thread t5 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(1300);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  jLabel2.setVisible(false);
                                                  jLabel5.setVisible(false);
                                          }
                 };
          Thread t6 = new Thread(){  
					  public void run(){ 
                  try {
                      try {
                            sleep(1600);
                    } catch (InterruptedException e) {

                            e.printStackTrace();
                    }
                      jLabel2.setVisible(true);
                      jLabel5.setVisible(true);
                      
                       String snamee=login.susernames;
                        String dnamee=selectdes.desuseer;
                         String path=routee.Node;
                         attack=routee.attt;
                      Connection conn = dbcon.getConne();
Statement st = conn.createStatement();
int j;
j = st.executeUpdate("insert into attackdet (source,desti,attacknode)values ('" + snamee + "', '" + dnamee + "', '" + attack + "' )");
                  } catch (SQLException ex) {
                      Logger.getLogger(suppermen.class.getName()).log(Level.SEVERE, null, ex);
                  }
                                          }
                 };
           
           
                 
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
         t6.start();
         
         
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/routt.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, 151));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\pavi project works\\jpinfotech\\suppp.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 170, 150));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("node");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 154, 100, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Acces control");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 190, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("superman");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 140, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Find Attack Node");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 224, 140, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Network Access Control and Node Authentication");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 550, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/bbb.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 670, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new suppermen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
