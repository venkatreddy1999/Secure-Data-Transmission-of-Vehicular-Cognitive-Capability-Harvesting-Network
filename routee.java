package supermen_security;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class routee extends javax.swing.JFrame {
 public static String attt;
 public static String Node;
   public routee() {
        initComponents();
        supp.setVisible(false);
       aa1.setVisible(false);aa2.setVisible(false);aa3.setVisible(false);aa4.setVisible(false);aa5.setVisible(false);aa6.setVisible(false);aa7.setVisible(false);
         aa8.setVisible(false);aa9.setVisible(false);aa10.setVisible(false);aa11.setVisible(false);aa12.setVisible(false);aa13.setVisible(false);
         aa14.setVisible(false);aa15.setVisible(false);aa16.setVisible(false);aa17.setVisible(false);aa18.setVisible(false);
         aa19.setVisible(false);aa20.setVisible(false);aa21.setVisible(false);aa22.setVisible(false);aa23.setVisible(false);
         aa24.setVisible(false);aa25.setVisible(false);aa26.setVisible(false);aa27.setVisible(false);aa28.setVisible(false);aa29.setVisible(false);
aa30.setVisible(false);aa31.setVisible(false);aa32.setVisible(false);aa33.setVisible(false);aa34.setVisible(false);aa35.setVisible(false);aa36.setVisible(false);
         aa37.setVisible(false);aa38.setVisible(false);aa39.setVisible(false);aa40.setVisible(false);aa41.setVisible(false);aa42.setVisible(false);
         aa43.setVisible(false);aa44.setVisible(false);aa45.setVisible(false);aa46.setVisible(false);aa47.setVisible(false);
         aa48.setVisible(false);aa49.setVisible(false);aa50.setVisible(false);
        b1.setVisible(false);b2.setVisible(false);b3.setVisible(false);b4.setVisible(false);b5.setVisible(false);b6.setVisible(false);b7.setVisible(false);
         b8.setVisible(false);b9.setVisible(false);b10.setVisible(false);b11.setVisible(false);b12.setVisible(false);b13.setVisible(false);
         b14.setVisible(false);b15.setVisible(false);b16.setVisible(false);b17.setVisible(false);b18.setVisible(false);
         b19.setVisible(false);b20.setVisible(false);b21.setVisible(false);b22.setVisible(false);b23.setVisible(false);
         b24.setVisible(false);b25.setVisible(false);b26.setVisible(false);b29.setVisible(false);
  b30.setVisible(false);b31.setVisible(false);b32.setVisible(false);b33.setVisible(false);b34.setVisible(false);b35.setVisible(false);b36.setVisible(false);
         b37.setVisible(false);b38.setVisible(false);b39.setVisible(false);b40.setVisible(false);b41.setVisible(false);b42.setVisible(false);
         b43.setVisible(false);b44.setVisible(false);b45.setVisible(false);b46.setVisible(false);b47.setVisible(false);
         b48.setVisible(false);b50.setVisible(false);
        }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        a13 = new javax.swing.JLabel();
        a14 = new javax.swing.JLabel();
        a15 = new javax.swing.JLabel();
        a16 = new javax.swing.JLabel();
        a17 = new javax.swing.JLabel();
        a18 = new javax.swing.JLabel();
        a19 = new javax.swing.JLabel();
        a20 = new javax.swing.JLabel();
        a21 = new javax.swing.JLabel();
        a22 = new javax.swing.JLabel();
        a23 = new javax.swing.JLabel();
        a24 = new javax.swing.JLabel();
        a25 = new javax.swing.JLabel();
        a26 = new javax.swing.JLabel();
        a27 = new javax.swing.JLabel();
        a29 = new javax.swing.JLabel();
        a30 = new javax.swing.JLabel();
        a31 = new javax.swing.JLabel();
        a32 = new javax.swing.JLabel();
        a33 = new javax.swing.JLabel();
        a34 = new javax.swing.JLabel();
        a35 = new javax.swing.JLabel();
        a36 = new javax.swing.JLabel();
        a37 = new javax.swing.JLabel();
        a38 = new javax.swing.JLabel();
        a39 = new javax.swing.JLabel();
        a40 = new javax.swing.JLabel();
        a41 = new javax.swing.JLabel();
        a42 = new javax.swing.JLabel();
        a43 = new javax.swing.JLabel();
        a44 = new javax.swing.JLabel();
        a45 = new javax.swing.JLabel();
        a46 = new javax.swing.JLabel();
        a47 = new javax.swing.JLabel();
        a48 = new javax.swing.JLabel();
        aa1 = new javax.swing.JLabel();
        aa2 = new javax.swing.JLabel();
        aa3 = new javax.swing.JLabel();
        aa4 = new javax.swing.JLabel();
        aa5 = new javax.swing.JLabel();
        aa6 = new javax.swing.JLabel();
        aa7 = new javax.swing.JLabel();
        aa8 = new javax.swing.JLabel();
        aa9 = new javax.swing.JLabel();
        aa10 = new javax.swing.JLabel();
        aa11 = new javax.swing.JLabel();
        aa12 = new javax.swing.JLabel();
        aa13 = new javax.swing.JLabel();
        aa14 = new javax.swing.JLabel();
        aa15 = new javax.swing.JLabel();
        aa16 = new javax.swing.JLabel();
        aa17 = new javax.swing.JLabel();
        aa18 = new javax.swing.JLabel();
        aa19 = new javax.swing.JLabel();
        aa20 = new javax.swing.JLabel();
        aa21 = new javax.swing.JLabel();
        aa22 = new javax.swing.JLabel();
        aa23 = new javax.swing.JLabel();
        aa24 = new javax.swing.JLabel();
        aa25 = new javax.swing.JLabel();
        aa26 = new javax.swing.JLabel();
        aa27 = new javax.swing.JLabel();
        aa28 = new javax.swing.JLabel();
        aa29 = new javax.swing.JLabel();
        aa30 = new javax.swing.JLabel();
        aa31 = new javax.swing.JLabel();
        aa32 = new javax.swing.JLabel();
        aa33 = new javax.swing.JLabel();
        aa34 = new javax.swing.JLabel();
        aa35 = new javax.swing.JLabel();
        aa36 = new javax.swing.JLabel();
        aa37 = new javax.swing.JLabel();
        aa38 = new javax.swing.JLabel();
        aa39 = new javax.swing.JLabel();
        aa40 = new javax.swing.JLabel();
        aa41 = new javax.swing.JLabel();
        aa42 = new javax.swing.JLabel();
        aa43 = new javax.swing.JLabel();
        aa44 = new javax.swing.JLabel();
        aa45 = new javax.swing.JLabel();
        aa46 = new javax.swing.JLabel();
        aa47 = new javax.swing.JLabel();
        aa48 = new javax.swing.JLabel();
        aa49 = new javax.swing.JLabel();
        aa50 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();
        b11 = new javax.swing.JLabel();
        b12 = new javax.swing.JLabel();
        b13 = new javax.swing.JLabel();
        b14 = new javax.swing.JLabel();
        b15 = new javax.swing.JLabel();
        b16 = new javax.swing.JLabel();
        b17 = new javax.swing.JLabel();
        b18 = new javax.swing.JLabel();
        b19 = new javax.swing.JLabel();
        b20 = new javax.swing.JLabel();
        b21 = new javax.swing.JLabel();
        b22 = new javax.swing.JLabel();
        b23 = new javax.swing.JLabel();
        b24 = new javax.swing.JLabel();
        b25 = new javax.swing.JLabel();
        b26 = new javax.swing.JLabel();
        b29 = new javax.swing.JLabel();
        b30 = new javax.swing.JLabel();
        b31 = new javax.swing.JLabel();
        b32 = new javax.swing.JLabel();
        b33 = new javax.swing.JLabel();
        b34 = new javax.swing.JLabel();
        b35 = new javax.swing.JLabel();
        b36 = new javax.swing.JLabel();
        b37 = new javax.swing.JLabel();
        b38 = new javax.swing.JLabel();
        b39 = new javax.swing.JLabel();
        b40 = new javax.swing.JLabel();
        b41 = new javax.swing.JLabel();
        b42 = new javax.swing.JLabel();
        b43 = new javax.swing.JLabel();
        b44 = new javax.swing.JLabel();
        b45 = new javax.swing.JLabel();
        b46 = new javax.swing.JLabel();
        b47 = new javax.swing.JLabel();
        b48 = new javax.swing.JLabel();
        b50 = new javax.swing.JLabel();
        supp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a1.setText("Node1");
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 40, -1));

        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a2.setText("Node2");
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 40, -1));

        a3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a3.setText("Node3");
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 40, -1));

        a4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a4.setText("Node4");
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 40, -1));

        a5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a5.setText("Node5");
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 40, -1));

        a6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a6.setText("Node6");
        getContentPane().add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 40, -1));

        a7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a7.setText("Node7");
        getContentPane().add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 40, -1));

        a8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a8.setText("Node8");
        getContentPane().add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 40, -1));

        a9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a9.setText("Node9");
        getContentPane().add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 40, -1));

        a10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a10.setText("Node10");
        getContentPane().add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 40, -1));

        a11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a11.setText("Node11");
        getContentPane().add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 40, -1));

        a12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a12.setText("Node12");
        getContentPane().add(a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 40, -1));

        a13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a13.setText("Node13");
        getContentPane().add(a13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 40, -1));

        a14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a14.setText("Node14");
        getContentPane().add(a14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 40, -1));

        a15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a15.setText("Node15");
        getContentPane().add(a15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 40, -1));

        a16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a16.setText("Node16");
        getContentPane().add(a16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 40, -1));

        a17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a17.setText("Node17");
        getContentPane().add(a17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 40, -1));

        a18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a18.setText("Node18");
        getContentPane().add(a18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 50, -1));

        a19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a19.setText("Node19");
        getContentPane().add(a19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 40, -1));

        a20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a20.setText("Node20");
        getContentPane().add(a20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 40, -1));

        a21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a21.setText("Node21");
        getContentPane().add(a21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, -1));

        a22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a22.setText("Node22");
        getContentPane().add(a22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 40, -1));

        a23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a23.setText("Node23");
        getContentPane().add(a23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 40, -1));

        a24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a24.setText("Node24");
        getContentPane().add(a24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 40, -1));

        a25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a25.setText("Node25");
        getContentPane().add(a25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 50, -1));

        a26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a26.setText("Node26");
        getContentPane().add(a26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 40, -1));

        a27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a27.setText("Node27");
        getContentPane().add(a27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 40, -1));

        a29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a29.setText("Node29");
        getContentPane().add(a29, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 40, -1));

        a30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a30.setText("Node30");
        getContentPane().add(a30, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 50, -1));

        a31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a31.setText("Node31");
        getContentPane().add(a31, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 40, -1));

        a32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a32.setText("Node32");
        getContentPane().add(a32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 40, 40));

        a33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a33.setText("Node33");
        getContentPane().add(a33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 40, -1));

        a34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a34.setText("Node34");
        getContentPane().add(a34, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 40, -1));

        a35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a35.setText("Node35");
        getContentPane().add(a35, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 50, -1));

        a36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a36.setText("Node36");
        getContentPane().add(a36, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 30, -1));

        a37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a37.setText("Node37");
        getContentPane().add(a37, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, 40, -1));

        a38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a38.setText("Node38");
        getContentPane().add(a38, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 40, -1));

        a39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a39.setText("Node39");
        getContentPane().add(a39, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 40, -1));

        a40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a40.setText("Node40");
        getContentPane().add(a40, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 40, -1));

        a41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a41.setText("Node41");
        getContentPane().add(a41, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 40, -1));

        a42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a42.setText("Node42");
        getContentPane().add(a42, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 40, -1));

        a43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a43.setText("Node43");
        getContentPane().add(a43, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 40, -1));

        a44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a44.setText("Node44");
        getContentPane().add(a44, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, 40, -1));

        a45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a45.setText("Node45");
        getContentPane().add(a45, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 300, 40, -1));

        a46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a46.setText("Node46");
        getContentPane().add(a46, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 40, -1));

        a47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a47.setText("Node47");
        getContentPane().add(a47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 270, 40, -1));

        a48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/img.png"))); // NOI18N
        a48.setText("Node48");
        getContentPane().add(a48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 350, 40, -1));

        aa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa1.setText("Node1");
        getContentPane().add(aa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 50, -1));

        aa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa2.setText("Node2");
        getContentPane().add(aa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 70, -1));

        aa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa3.setText("Node3");
        getContentPane().add(aa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 90, -1));

        aa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa4.setText("Node4");
        getContentPane().add(aa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 90, -1));

        aa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa5.setText("Node5");
        getContentPane().add(aa5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 90, -1));

        aa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa6.setText("Node6");
        getContentPane().add(aa6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 90, -1));

        aa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa7.setText("Node6");
        getContentPane().add(aa7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 90, -1));

        aa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa8.setText("Node8");
        getContentPane().add(aa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 70, -1));

        aa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa9.setText("Node6");
        getContentPane().add(aa9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 90, -1));

        aa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa10.setText("Node9");
        getContentPane().add(aa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 70, -1));

        aa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa11.setText("Node10");
        getContentPane().add(aa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 70, -1));

        aa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa12.setText("Node11");
        getContentPane().add(aa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 70, -1));

        aa13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa13.setText("Node12");
        getContentPane().add(aa13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 70, -1));

        aa14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa14.setText("Node13");
        getContentPane().add(aa14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 80, -1));

        aa15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa15.setText("Node14");
        getContentPane().add(aa15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 70, -1));

        aa16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa16.setText("Node8");
        getContentPane().add(aa16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 90, -1));

        aa17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa17.setText("Node14");
        getContentPane().add(aa17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 80, -1));

        aa18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa18.setText("Node14");
        getContentPane().add(aa18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 80, -1));

        aa19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa19.setText("Node17");
        getContentPane().add(aa19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 80, -1));

        aa20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa20.setText("Node18");
        getContentPane().add(aa20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 80, -1));

        aa21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa21.setText("Node19");
        getContentPane().add(aa21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 80, -1));

        aa22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa22.setText("Node20");
        getContentPane().add(aa22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 80, -1));

        aa23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa23.setText("Node21");
        getContentPane().add(aa23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 80, -1));

        aa24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa24.setText("Node23");
        getContentPane().add(aa24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 80, -1));

        aa25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa25.setText("Node24");
        getContentPane().add(aa25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 80, -1));

        aa26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa26.setText("Node25");
        getContentPane().add(aa26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 80, -1));

        aa27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa27.setText("Node26");
        getContentPane().add(aa27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, -1));

        aa28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa28.setText("Node27");
        getContentPane().add(aa28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 80, -1));

        aa29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/ss.png"))); // NOI18N
        aa29.setText("Node8");
        getContentPane().add(aa29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, -1));

        aa30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa30.setText("Node29");
        getContentPane().add(aa30, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 70, -1));

        aa31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa31.setText("Node30");
        getContentPane().add(aa31, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 70, -1));

        aa32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa32.setText("Node31");
        getContentPane().add(aa32, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 70, -1));

        aa33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa33.setText("Node32");
        getContentPane().add(aa33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        aa34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa34.setText("Node33");
        getContentPane().add(aa34, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 70, -1));

        aa35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa35.setText("Node34");
        getContentPane().add(aa35, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 70, -1));

        aa36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa36.setText("Node35");
        getContentPane().add(aa36, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 70, -1));

        aa37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa37.setText("Node36");
        getContentPane().add(aa37, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 70, -1));

        aa38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa38.setText("Node37");
        getContentPane().add(aa38, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 70, -1));

        aa39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa39.setText("Node38");
        getContentPane().add(aa39, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 70, -1));

        aa40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa40.setText("Node39");
        getContentPane().add(aa40, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 70, -1));

        aa41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa41.setText("Node40");
        getContentPane().add(aa41, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 70, -1));

        aa42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa42.setText("Node42");
        getContentPane().add(aa42, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 70, -1));

        aa43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa43.setText("Node42");
        getContentPane().add(aa43, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 80, -1));

        aa44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa44.setText("Node43");
        getContentPane().add(aa44, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 70, -1));

        aa45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa45.setText("Node44");
        getContentPane().add(aa45, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, -1, -1));

        aa46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa46.setText("Node45");
        getContentPane().add(aa46, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 300, 80, -1));

        aa47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa47.setText("Node46");
        getContentPane().add(aa47, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 70, -1));

        aa48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa48.setText("Node47");
        getContentPane().add(aa48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 270, 70, -1));

        aa49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/imgg.png"))); // NOI18N
        aa49.setText("Node48");
        getContentPane().add(aa49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 350, 70, -1));

        aa50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/dd.png"))); // NOI18N
        aa50.setText("Node50");
        getContentPane().add(aa50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 310, 100, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("view route path");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 220, 30));

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b1.setText("jLabel1");
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 50, 50));

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b2.setText("jLabel1");
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 50, 50));

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b3.setText("jLabel1");
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 50, 50));

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b4.setText("jLabel1");
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 50, 50));

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b5.setText("jLabel1");
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 50, 50));

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b6.setText("jLabel1");
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 50, 50));

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b7.setText("jLabel1");
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 50, 50));

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b8.setText("jLabel1");
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 50, 50));

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b9.setText("jLabel1");
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 50, 50));

        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b10.setText("jLabel1");
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 50, 50));

        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b11.setText("jLabel1");
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 50, 50));

        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b12.setText("jLabel1");
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 50, 50));

        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b13.setText("jLabel1");
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 50, 50));

        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b14.setText("jLabel1");
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 50, 50));

        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b15.setText("jLabel1");
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 50, 50));

        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b16.setText("jLabel1");
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 50, 50));

        b17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b17.setText("jLabel1");
        getContentPane().add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 50, 50));

        b18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b18.setText("jLabel1");
        getContentPane().add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 50, 50));

        b19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b19.setText("jLabel1");
        getContentPane().add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 50, 50));

        b20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b20.setText("jLabel1");
        getContentPane().add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 50, 50));

        b21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b21.setText("jLabel1");
        getContentPane().add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 50, 50));

        b22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b22.setText("jLabel1");
        getContentPane().add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 50, 50));

        b23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b23.setText("jLabel1");
        getContentPane().add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 50, 50));

        b24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b24.setText("jLabel1");
        getContentPane().add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 50, 50));

        b25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b25.setText("jLabel1");
        getContentPane().add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 50, 50));

        b26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b26.setText("jLabel1");
        getContentPane().add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 50, 50));

        b29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b29.setText("jLabel1");
        getContentPane().add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 50, 50));

        b30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b30.setText("jLabel1");
        getContentPane().add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 50, 50));

        b31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b31.setText("jLabel1");
        getContentPane().add(b31, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 50, 50));

        b32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b32.setText("jLabel1");
        getContentPane().add(b32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, 50, 50));

        b33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b33.setText("jLabel1");
        getContentPane().add(b33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 50, 50));

        b34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b34.setText("jLabel1");
        getContentPane().add(b34, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 50, 50));

        b35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b35.setText("jLabel1");
        getContentPane().add(b35, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 50, 50));

        b36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b36.setText("jLabel1");
        getContentPane().add(b36, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 50, 50));

        b37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b37.setText("jLabel1");
        getContentPane().add(b37, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 50, 50));

        b38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b38.setText("jLabel1");
        getContentPane().add(b38, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 50, 50));

        b39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b39.setText("jLabel1");
        getContentPane().add(b39, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 50, 50));

        b40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b40.setText("jLabel1");
        getContentPane().add(b40, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 50, 50));

        b41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b41.setText("jLabel1");
        getContentPane().add(b41, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 50, 50));

        b42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b42.setText("jLabel1");
        getContentPane().add(b42, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 50, 50));

        b43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b43.setText("jLabel1");
        getContentPane().add(b43, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 50, 50));

        b44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b44.setText("jLabel1");
        getContentPane().add(b44, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, 50, 50));

        b45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b45.setText("jLabel1");
        getContentPane().add(b45, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 50, 50));

        b46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b46.setText("jLabel1");
        getContentPane().add(b46, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 50, 50));

        b47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b47.setText("jLabel1");
        getContentPane().add(b47, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 260, 50, 50));

        b48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b48.setText("jLabel1");
        getContentPane().add(b48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 350, 50, 50));

        b50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/Block.jpg"))); // NOI18N
        b50.setText("jLabel1");
        getContentPane().add(b50, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, 50, 50));

        supp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/supp.png"))); // NOI18N
        supp.setText("jLabel1");
        getContentPane().add(supp, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 90, 90));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("source");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 254, 80, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Destination");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 284, 130, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 390, 90, 30));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel5.setText("   Spark Streaming");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 14, 220, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/bbb.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1230, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       String snamee=login.susernames;
       String dnamee=selectdes.desuseer;
        jLabel1.setText(snamee);
       jLabel4.setText(dnamee);
      try {
          Random rn = new Random();
                        int i = rn.nextInt(5) + 1;
                         Random rnn = new Random();
                Connection conn = dbcon.getConne();
               Statement st = conn.createStatement();
                if(i==1)
                   {
                    Thread t1 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(100);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa29.setVisible(true);
                                          }
                 };
                        Thread t2 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(1000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa27.setVisible(true);
                                          }
                 };
                        Thread t3 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(2000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa22.setVisible(true);
                                          }
                 };
                        Thread t4 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(3000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa12.setVisible(true);
                                          }
                        };
                         Thread t5 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(4000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa31.setVisible(true);
                                          }
                         };
                          Thread t6 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(5000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa42.setVisible(true);
                                          }
                                          
                 };
                         Thread t7 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(6000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa38.setVisible(true);
                                          }
                 };
                         Thread t8 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(7000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa43.setVisible(true);
                                          }
                 };
                          Thread t9 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(8000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa47.setVisible(true);
                                          }
                 };
                          Thread t10 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(9000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa48.setVisible(true);
                                          }
                 };
                          Thread t11 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(9999);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa49.setVisible(true);
                                          }
                 };
                           Thread t12 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(3600);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa50.setVisible(true);
                                                   String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;
   n1=aa29.getText();n2=aa27.getText();n3=aa22.getText();n4=aa12.getText();n5=aa31.getText();n6=aa42.getText();
   n7=aa38.getText();n8=aa43.getText();n9=aa47.getText();n10=aa48.getText();n11=aa49.getText();n12=aa50.getText();
   Node=";"+n1+";"+n2+";"+n3+";"+n4+";"+n5+";"+n6+";"+n7+";"+n8+"n9"+n9+";"+n10+";"+n11+";"+n12;
    JOptionPane.showMessageDialog(null, "Data Received Succesfully");
   new destinaction().setVisible(true);
                                          }
                 };
                     t1.start();t2.start();t3.start();t4.start();t6.start();t5.start();t7.start();t8.start();t9.start();t10.start();t11.start(); t12.start();

                }
                
                   else if(i==2)
                   {
                    Thread t1 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(100);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa29.setVisible(true);
                                          }
                 };
                        Thread t2 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(1000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa24.setVisible(true);
                                          }
                 };
                        Thread t3 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(2000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa15.setVisible(true);
                                          }
                 };
                        Thread t4 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(3000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa1.setVisible(true);
                                          }
                        };
                         Thread t5 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(4000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa37.setVisible(true);
                                          }
                         };
                          Thread t6 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(5000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa42.setVisible(true);
                                          }
                                          
                 };
                         Thread t7 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(6000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa46.setVisible(true);
                                          }
                 };
                         Thread t8 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(7000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa47.setVisible(true);
                                          }
                 };
                          Thread t9 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(8000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa49.setVisible(true);
                                          }
                 };
                          
                          Thread t11 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(9999);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa50.setVisible(true);
                                                   String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
   n1=aa29.getText();n2=aa24.getText();n3=aa15.getText();n4=aa1.getText();n5=aa37.getText();n6=aa42.getText();
   n7=aa46.getText();n8=aa47.getText();n9=aa49.getText();n10=aa50.getText();
   Node=";"+n1+";"+n2+";"+n3+";"+n4+";"+n5+";"+n6+";"+n7+";"+n8+"n9"+n9+";"+n10;
    JOptionPane.showMessageDialog(null, "Data Received Succesfully");
  new destinaction().setVisible(true);
                                          } };
                     t1.start();t2.start();t3.start();t4.start();t6.start();t5.start();t7.start();t8.start();t9.start();t11.start(); 

    }
                if(i==3)
                   {
                    Thread t1 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(100);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa29.setVisible(true);
                                          }
                 };
                        Thread t2 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(1000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa28.setVisible(true);
                                          }
                 };
                        Thread t3 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(2000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa26.setVisible(true);
                                          }
                 };
                        Thread t4 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(3000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa23.setVisible(true);
                                          }
                        };
                         Thread t5 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(4000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa12.setVisible(true);
                                          }
                         };
                          Thread t6 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(5000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa5.setVisible(true);
                                          }
                                          
                 };
                         Thread t7 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(6000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa32.setVisible(true);
                                          }
                 };
                         Thread t8 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(7000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa38.setVisible(true);
                                          }
                 };
                          Thread t9 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(8000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa43.setVisible(true);
                                          }
                 };
                          
                          Thread t11 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(9000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa47.setVisible(true);
                                          }
                 };
                           Thread t12 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(9999);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa50.setVisible(true);
                                                   String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
   n1=aa29.getText();n2=aa28.getText();n3=aa26.getText();n4=aa23.getText();n5=aa12.getText();n6=aa5.getText();
   n7=aa32.getText();n8=aa38.getText();n9=aa43.getText();n10=aa50.getText();
   Node=";"+n1+";"+n2+";"+n3+";"+n4+";"+n5+";"+n6+";"+n7+";"+n8+"n9"+n9+";"+n10;
   
    JOptionPane.showMessageDialog(null, "Data Received Succesfully");
  new destinaction().setVisible(true);
                                          }
                 };
                      t1.start();t2.start();t3.start();t4.start();t6.start();t5.start();t7.start();t8.start();t9.start();t11.start(); t12.start();

                }
             if(i==4)
                   {
                    Thread t1 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(100);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa29.setVisible(true);
                                          }
                 };
                        Thread t2 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(1000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa25.setVisible(true);
                                          }
                 };
                        Thread t3 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(2000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa23.setVisible(true);
                                          }
                 };
                        Thread t4 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(3000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa18.setVisible(true);
                                          }
                        };
                         Thread t5 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(4000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa4.setVisible(true);
                                          }
                         };
                          Thread t6 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(5000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa33.setVisible(true);
                                          }
                                          
                 };
                         Thread t7 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(6000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa38.setVisible(true);
                                          }
                 };
                         Thread t8 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(7000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa42.setVisible(true);
                                          }
                 };
                          Thread t9 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(8000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa46.setVisible(true);
                                          }
                 };
                          
                          Thread t11 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(9999);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa50.setVisible(true);
                                          }
                 };
                           Thread t12 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(3600);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa3.setVisible(true);
                                                   String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
   n1=aa29.getText();n2=aa25.getText();n3=aa23.getText();n4=aa18.getText();n5=aa4.getText();n6=aa3.getText();
   n7=aa33.getText();n8=aa42.getText();n9=aa46.getText();n10=aa40.getText();
   Node=";"+n1+";"+n2+";"+n3+";"+n4+";"+n5+";"+n6+";"+n7+";"+n8+"n9"+n9+";"+n10;
    JOptionPane.showMessageDialog(null, "Data Received Succesfully");
   new destinaction().setVisible(true);
                                          }
                 };
                      t1.start();t2.start();t3.start();t4.start();t6.start();t5.start();t7.start();t8.start();t9.start();t11.start(); t12.start();

                }
             if(i==5)
                   {
                    Thread t1 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(100);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa29.setVisible(true);
                                          }
                 };
                        Thread t2 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(1000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa25.setVisible(true);
                                          }
                 };
                        Thread t3 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(2000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa18.setVisible(true);
                                          }
                 };
                        Thread t4 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(3000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa4.setVisible(true);
                                          }
                        };
                         Thread t5 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(4000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa38.setVisible(true);
                                          }
                         };
                          Thread t6 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(5000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa42.setVisible(true);
                                          }
                                          
                 };
                         Thread t7 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(6000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa46.setVisible(true);
                                          }
                 };
                         Thread t8 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(7000);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa49.setVisible(true);
                                          }
                 };
                          Thread t11 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(9999);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa50.setVisible(true);
                                          }
                 };
                           Thread t12 = new Thread(){  
					  public void run(){ 
						  try {
							sleep(3600);
						} catch (InterruptedException e) {

							e.printStackTrace();
						}
                                                  aa3.setVisible(true);
                                                   String n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;
   n1=aa29.getText();n2=aa27.getText();n3=aa25.getText();n4=attt;n5=aa12.getText();n6=aa2.getText();
   n7=aa35.getText();n8=aa40.getText();n9=aa44.getText();n10=aa47.getText();n11=aa49.getText();n12=aa50.getText();
   Node=";"+n1+";"+n2+";"+n3+";"+n4+";"+n5+";"+n6+";"+n7+";"+n8+"n9"+n9+";"+n10+";"+n11+";"+n12;
    JOptionPane.showMessageDialog(null, "Data Received Succesfully");
   new destinaction().setVisible(true);
                                          }
                 };
                  t1.start();t2.start();t3.start();t4.start();t6.start();t5.start();t7.start();t8.start();t11.start(); t12.start();

                }
              } catch (SQLException ex) {
                Logger.getLogger(dbcon.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(routee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(routee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(routee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(routee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new routee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a12;
    private javax.swing.JLabel a13;
    private javax.swing.JLabel a14;
    private javax.swing.JLabel a15;
    private javax.swing.JLabel a16;
    private javax.swing.JLabel a17;
    private javax.swing.JLabel a18;
    private javax.swing.JLabel a19;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a20;
    private javax.swing.JLabel a21;
    private javax.swing.JLabel a22;
    private javax.swing.JLabel a23;
    private javax.swing.JLabel a24;
    private javax.swing.JLabel a25;
    private javax.swing.JLabel a26;
    private javax.swing.JLabel a27;
    private javax.swing.JLabel a29;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a30;
    private javax.swing.JLabel a31;
    private javax.swing.JLabel a32;
    private javax.swing.JLabel a33;
    private javax.swing.JLabel a34;
    private javax.swing.JLabel a35;
    private javax.swing.JLabel a36;
    private javax.swing.JLabel a37;
    private javax.swing.JLabel a38;
    private javax.swing.JLabel a39;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a40;
    private javax.swing.JLabel a41;
    private javax.swing.JLabel a42;
    private javax.swing.JLabel a43;
    private javax.swing.JLabel a44;
    private javax.swing.JLabel a45;
    private javax.swing.JLabel a46;
    private javax.swing.JLabel a47;
    private javax.swing.JLabel a48;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JLabel aa1;
    private javax.swing.JLabel aa10;
    private javax.swing.JLabel aa11;
    private javax.swing.JLabel aa12;
    private javax.swing.JLabel aa13;
    private javax.swing.JLabel aa14;
    private javax.swing.JLabel aa15;
    private javax.swing.JLabel aa16;
    private javax.swing.JLabel aa17;
    private javax.swing.JLabel aa18;
    private javax.swing.JLabel aa19;
    private javax.swing.JLabel aa2;
    private javax.swing.JLabel aa20;
    private javax.swing.JLabel aa21;
    private javax.swing.JLabel aa22;
    private javax.swing.JLabel aa23;
    private javax.swing.JLabel aa24;
    private javax.swing.JLabel aa25;
    private javax.swing.JLabel aa26;
    private javax.swing.JLabel aa27;
    private javax.swing.JLabel aa28;
    private javax.swing.JLabel aa29;
    private javax.swing.JLabel aa3;
    private javax.swing.JLabel aa30;
    private javax.swing.JLabel aa31;
    private javax.swing.JLabel aa32;
    private javax.swing.JLabel aa33;
    private javax.swing.JLabel aa34;
    private javax.swing.JLabel aa35;
    private javax.swing.JLabel aa36;
    private javax.swing.JLabel aa37;
    private javax.swing.JLabel aa38;
    private javax.swing.JLabel aa39;
    private javax.swing.JLabel aa4;
    private javax.swing.JLabel aa40;
    private javax.swing.JLabel aa41;
    private javax.swing.JLabel aa42;
    private javax.swing.JLabel aa43;
    private javax.swing.JLabel aa44;
    private javax.swing.JLabel aa45;
    private javax.swing.JLabel aa46;
    private javax.swing.JLabel aa47;
    private javax.swing.JLabel aa48;
    private javax.swing.JLabel aa49;
    private javax.swing.JLabel aa5;
    private javax.swing.JLabel aa50;
    private javax.swing.JLabel aa6;
    private javax.swing.JLabel aa7;
    private javax.swing.JLabel aa8;
    private javax.swing.JLabel aa9;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b11;
    private javax.swing.JLabel b12;
    private javax.swing.JLabel b13;
    private javax.swing.JLabel b14;
    private javax.swing.JLabel b15;
    private javax.swing.JLabel b16;
    private javax.swing.JLabel b17;
    private javax.swing.JLabel b18;
    private javax.swing.JLabel b19;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b20;
    private javax.swing.JLabel b21;
    private javax.swing.JLabel b22;
    private javax.swing.JLabel b23;
    private javax.swing.JLabel b24;
    private javax.swing.JLabel b25;
    private javax.swing.JLabel b26;
    private javax.swing.JLabel b29;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b30;
    private javax.swing.JLabel b31;
    private javax.swing.JLabel b32;
    private javax.swing.JLabel b33;
    private javax.swing.JLabel b34;
    private javax.swing.JLabel b35;
    private javax.swing.JLabel b36;
    private javax.swing.JLabel b37;
    private javax.swing.JLabel b38;
    private javax.swing.JLabel b39;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b40;
    private javax.swing.JLabel b41;
    private javax.swing.JLabel b42;
    private javax.swing.JLabel b43;
    private javax.swing.JLabel b44;
    private javax.swing.JLabel b45;
    private javax.swing.JLabel b46;
    private javax.swing.JLabel b47;
    private javax.swing.JLabel b48;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b50;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel supp;
    // End of variables declaration//GEN-END:variables
}
