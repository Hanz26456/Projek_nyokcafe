package Form;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class Formforgotpwd extends javax.swing.JFrame {

    Connection cn = Config.Conn.GetConn();
    Statement st;
    ResultSet rs;
    
    public Formforgotpwd() {
        initComponents();
        txtemail.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jpwd = new javax.swing.JLabel();
        Btnback = new javax.swing.JPanel();
        Jback = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        Btnshow = new javax.swing.JPanel();
        Jshow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Note :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harap masukkan email anda dan password akan muncul pada kolom ini!!!");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Jpwd.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Jpwd.setForeground(new java.awt.Color(255, 255, 255));
        Jpwd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(Jpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 8, 620, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 640, 140));

        Btnback.setBackground(new java.awt.Color(0, 102, 153));
        Btnback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnbackMouseExited(evt);
            }
        });

        Jback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Jback.setForeground(new java.awt.Color(255, 255, 255));
        Jback.setText("Back");

        javax.swing.GroupLayout BtnbackLayout = new javax.swing.GroupLayout(Btnback);
        Btnback.setLayout(BtnbackLayout);
        BtnbackLayout.setHorizontalGroup(
            BtnbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(BtnbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnbackLayout.createSequentialGroup()
                    .addGap(0, 34, Short.MAX_VALUE)
                    .addComponent(Jback)
                    .addGap(0, 34, Short.MAX_VALUE)))
        );
        BtnbackLayout.setVerticalGroup(
            BtnbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(BtnbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnbackLayout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(Jback)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        jPanel1.add(Btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 30, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_______________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 310, 30));

        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setBorder(null);
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 310, 30));

        Btnshow.setBackground(new java.awt.Color(0, 102, 153));
        Btnshow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Btnshow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btnshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnshowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnshowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnshowMouseExited(evt);
            }
        });

        Jshow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jshow.setForeground(new java.awt.Color(255, 255, 255));
        Jshow.setText("Show Password");

        javax.swing.GroupLayout BtnshowLayout = new javax.swing.GroupLayout(Btnshow);
        Btnshow.setLayout(BtnshowLayout);
        BtnshowLayout.setHorizontalGroup(
            BtnshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
            .addGroup(BtnshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnshowLayout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addComponent(Jshow)
                    .addGap(0, 16, Short.MAX_VALUE)))
        );
        BtnshowLayout.setVerticalGroup(
            BtnshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(BtnshowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnshowLayout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(Jshow)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        jPanel1.add(Btnshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 320));

        setSize(new java.awt.Dimension(658, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnbackMouseClicked
        this.setVisible(false);
        new Formlogin().setVisible(true);
    }//GEN-LAST:event_BtnbackMouseClicked

    private void BtnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnbackMouseEntered
        Btnback.setBackground(new Color(255,255,255));
        Jback.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_BtnbackMouseEntered

    private void BtnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnbackMouseExited
        Btnback.setBackground(new Color(0,102,153));
        Jback.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_BtnbackMouseExited

    private void BtnshowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnshowMouseEntered
        Btnshow.setBackground(new Color(255,255,255));
        Jshow.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_BtnshowMouseEntered

    private void BtnshowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnshowMouseExited
        Btnshow.setBackground(new Color(0,102,153));
        Jshow.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_BtnshowMouseExited

    private void BtnshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnshowMouseClicked
        try {
            st = cn.createStatement();
            String sql = "SELECT password FROM tbl_users WHERE email= '"+txtemail.getText()+"'";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String Password = rs.getString("password");
                    Jpwd.setText(Password);
                    jLabel4.setVisible(false);
                    jLabel5.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnshowMouseClicked

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
            java.util.logging.Logger.getLogger(Formforgotpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formforgotpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formforgotpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formforgotpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formforgotpwd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btnback;
    private javax.swing.JPanel Btnshow;
    private javax.swing.JLabel Jback;
    private javax.swing.JLabel Jpwd;
    private javax.swing.JLabel Jshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables
}
