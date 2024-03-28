package Form;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class Formregister extends javax.swing.JFrame {

    Connection cn = Config.Conn.GetConn();
    Statement st;
    ResultSet rs;
    
    public Formregister() {
        initComponents();
        txtemail.setBackground(new java.awt.Color(0,0,0,1));
        txtuser.setBackground(new java.awt.Color(0,0,0,1));
        txtpwd.setBackground(new java.awt.Color(0,0,0,1));
        txtkonfirm.setBackground(new java.awt.Color(0,0,0,1));
    }
    
    public void Clear(){
        txtemail.setText("");
        txtuser.setText("");
        txtpwd.setText("");
        txtkonfirm.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Btncrt = new javax.swing.JPanel();
        JbtnCrt = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        txtpwd = new javax.swing.JPasswordField();
        txtkonfirm = new javax.swing.JPasswordField();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        Btnback = new javax.swing.JPanel();
        Jback = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrasi akun");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 23, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 555, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("________________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 430, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("________________________________________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 430, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("________________________________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 430, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Konfirmasi Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("________________________________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 430, 40));

        Btncrt.setBackground(new java.awt.Color(0, 102, 153));
        Btncrt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Btncrt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btncrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtncrtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtncrtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtncrtMouseExited(evt);
            }
        });

        JbtnCrt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JbtnCrt.setForeground(new java.awt.Color(255, 255, 255));
        JbtnCrt.setText("Create Akun Now");

        javax.swing.GroupLayout BtncrtLayout = new javax.swing.GroupLayout(Btncrt);
        Btncrt.setLayout(BtncrtLayout);
        BtncrtLayout.setHorizontalGroup(
            BtncrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
            .addGroup(BtncrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtncrtLayout.createSequentialGroup()
                    .addGap(0, 115, Short.MAX_VALUE)
                    .addComponent(JbtnCrt)
                    .addGap(0, 116, Short.MAX_VALUE)))
        );
        BtncrtLayout.setVerticalGroup(
            BtncrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(BtncrtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtncrtLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JbtnCrt)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Btncrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 350, -1));

        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        txtemail.setBorder(null);
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 82, 350, 30));

        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setBorder(null);
        jPanel1.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 350, 30));

        txtpwd.setForeground(new java.awt.Color(255, 255, 255));
        txtpwd.setBorder(null);
        jPanel1.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 350, 30));

        txtkonfirm.setForeground(new java.awt.Color(255, 255, 255));
        txtkonfirm.setBorder(null);
        jPanel1.add(txtkonfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 350, 30));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel1.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 30, 30));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 30, 30));

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
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Jback)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BtnbackLayout.setVerticalGroup(
            BtnbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(BtnbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnbackLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Jback)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        setSize(new java.awt.Dimension(623, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtpwd.setEchoChar((char)0);
        txtkonfirm.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtpwd.setEchoChar((char)8226);
        txtkonfirm.setEchoChar((char)8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void BtncrtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtncrtMouseEntered
        Btncrt.setBackground(new Color(255,255,255));
        JbtnCrt.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_BtncrtMouseEntered

    private void BtncrtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtncrtMouseExited
        Btncrt.setBackground(new Color(0,102,153));
        JbtnCrt.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_BtncrtMouseExited

    private void BtncrtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtncrtMouseClicked
        try {
            st = cn.createStatement();
            String email = txtemail.getText();
            String pwd = txtpwd.getText();
            String KonfirmPwd = txtkonfirm.getText();
            if (email.equals("") ||
                    txtuser.getText().equals("") ||
                    pwd.equals("") ||
                    KonfirmPwd.equals("")) {
                JOptionPane.showMessageDialog(null, "Harap isi data dengan sesuai");
                Clear();
            }else if (email.endsWith("@gmail.com")) {
                if (pwd.length() <= 25) {
                    if (pwd.equals(KonfirmPwd)) {
                        String SqlCek = "SELECT * FROM tbl_users WHERE status_user = 'Admin'";
                        rs = st.executeQuery(SqlCek);
                        if (rs.next()) {
                            this.setVisible(false);
                            new Formlogin().setVisible(true);
                            Clear();
                            JOptionPane.showMessageDialog(null, "Maaf anda sudah memiliki akun Admin!");
                        }else{
                            String Sql = "INSERT INTO tbl_users VALUES (NULL,'"+email+"','"+txtuser.getText()
                                    +"','"+pwd+"','Admin')";
                            java.sql.PreparedStatement pst = cn.prepareStatement(Sql);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Registrasi akun admin berhasil");
                            Clear();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Data password tidak cocok");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Maksimal 25 karakter");
                }
            }else if (!email.endsWith("@gmail.com")) {
                JOptionPane.showMessageDialog(null, "Email tidak di ketahui");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BtncrtMouseClicked

    private void BtnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnbackMouseEntered
        Btnback.setBackground(new Color(255,255,255));
        Jback.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_BtnbackMouseEntered

    private void BtnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnbackMouseExited
        Btnback.setBackground(new Color(0,102,153));
        Jback.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_BtnbackMouseExited

    private void BtnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnbackMouseClicked
        this.setVisible(false);
        new Formlogin().setVisible(true);
    }//GEN-LAST:event_BtnbackMouseClicked

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
            java.util.logging.Logger.getLogger(Formregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formregister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formregister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btnback;
    private javax.swing.JPanel Btncrt;
    private javax.swing.JLabel Jback;
    private javax.swing.JLabel JbtnCrt;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel show;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtkonfirm;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
