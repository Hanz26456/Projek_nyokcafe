package Form;

import Config.Conn;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class Formlogin extends javax.swing.JFrame {

    Connection cn = Config.Conn.GetConn();
    Statement st;
    ResultSet rs;

    public Formlogin() {
        initComponents();
        txtuser.setBackground(new java.awt.Color(0, 0, 0, 1));
        txtpwd.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    public void clear() {
        txtuser.setText("");
        txtpwd.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Xclose = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpwd = new javax.swing.JPasswordField();
        Btnlogin = new javax.swing.JPanel();
        JBtnlogin = new javax.swing.JLabel();
        txtrfid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nyokcoffecrop10.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 420));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Xclose.setBackground(new java.awt.Color(255, 255, 255));
        Xclose.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Xclose.setForeground(new java.awt.Color(255, 255, 255));
        Xclose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Xclose.setText("X");
        Xclose.setToolTipText("");
        Xclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Xclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XcloseMouseClicked(evt);
            }
        });
        jPanel2.add(Xclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 0, 27, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hello! Welcome to MyKasir");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 450, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 226, 255));
        jLabel5.setText("Username");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 340, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("__________________________________________");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 300, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 39, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(199, 226, 255));
        jLabel8.setText("Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 373, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("__________________________________________");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 300, 30));

        disable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 39, 40));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_eye_20px_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 39, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forgot Password?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Register Akun");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 100, -1));

        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setBorder(null);
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 280, 40));

        txtpwd.setForeground(new java.awt.Color(255, 255, 255));
        txtpwd.setBorder(null);
        jPanel2.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 280, 40));

        Btnlogin.setBackground(new java.awt.Color(255, 255, 255));
        Btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnloginMouseExited(evt);
            }
        });

        JBtnlogin.setBackground(new java.awt.Color(30, 144, 255));
        JBtnlogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JBtnlogin.setForeground(new java.awt.Color(30, 144, 255));
        JBtnlogin.setText("Login");

        javax.swing.GroupLayout BtnloginLayout = new javax.swing.GroupLayout(Btnlogin);
        Btnlogin.setLayout(BtnloginLayout);
        BtnloginLayout.setHorizontalGroup(
            BtnloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(BtnloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnloginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JBtnlogin)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BtnloginLayout.setVerticalGroup(
            BtnloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(BtnloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnloginLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JBtnlogin)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(Btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 310, 40));

        txtrfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrfidActionPerformed(evt);
            }
        });
        txtrfid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtrfidKeyReleased(evt);
            }
        });
        jPanel2.add(txtrfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 280, 40));

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 344, 280, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 0, 450, 420));

        setSize(new java.awt.Dimension(905, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void XcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XcloseMouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        txtpwd.setEchoChar((char) 0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtpwd.setEchoChar((char) 8226);
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setVisible(false);
        new Formregister().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        new Formforgotpwd().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void BtnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnloginMouseClicked
        try {
            st = cn.createStatement();
            String Sql = "SELECT * FROM tbl_users WHERE username = '" + txtuser.getText() + "'";
            rs = st.executeQuery(Sql);
            if (rs.next()) {
                String Iduser = rs.getString("id_user");
                String Status = rs.getString("status_user");
                String Username = txtuser.getText();
                if (txtpwd.getText().equals(rs.getString("password"))) {
                    if (Status.equals("Admin")) {
                        Formadmin admin = new Formadmin(Iduser);
                        admin.setVisible(true);
                        this.setVisible(false);
                    } else if (Status.equals("Kasir")) {
                        FormKasir kasir = new FormKasir(Iduser);
                        kasir.setVisible(true);
                        this.setVisible(false);
                    } else if (Status.equals("Karyawan")) {
                        FormKaryawan karyawan = new FormKaryawan(Iduser);
                        karyawan.setVisible(true);
                        this.setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Password yang anda masukkan tidak sesuai");
                }
            } else {
                JOptionPane.showMessageDialog(null, "User tidak dapat ditemukan");
                clear();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BtnloginMouseClicked

    private void BtnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnloginMouseEntered
        Btnlogin.setBackground(new Color(0, 102, 153));
        JBtnlogin.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BtnloginMouseEntered

    private void BtnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnloginMouseExited
        Btnlogin.setBackground(new Color(255, 255, 255));
        JBtnlogin.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_BtnloginMouseExited

    private void txtrfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrfidActionPerformed

    private void txtrfidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrfidKeyReleased
        String Rfid = txtrfid.getText();
        try {
            String sql = "SELECT * FROM tbl_users WHERE id_user = ?";
            java.sql.Connection conn = (Connection) Conn.GetConn();
            java.sql.PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, Rfid);
            java.sql.ResultSet res = stm.executeQuery();
            if (res.next()) {
                txtrfid.setText(res.getString("id_user"));
                txtuser.setText(res.getString("username"));
                txtpwd.setText(res.getString("password"));

                // Perform the login operation
                login();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

     private void login() {
    String Iduser = txtrfid.getText();
    try {
        String sql = "SELECT * FROM tbl_users WHERE id_user = ?";
        java.sql.Connection conn = (Connection) Conn.GetConn();
        java.sql.PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1, Iduser);
        java.sql.ResultSet res = stm.executeQuery();
        if (res.next()) {
            String Status = res.getString("status_user");
            if (Status.equals("Admin")) {
                Formadmin admin = new Formadmin(Iduser);
                JOptionPane.showMessageDialog(null, "Login berhasil sebagai Admin");
                this.setVisible(false);
                admin.setVisible(true);
            } else if (Status.equals("Kasir")) {
                FormKasir kasir = new FormKasir(Iduser);
                JOptionPane.showMessageDialog(null, "Login berhasil sebagai Kasir");
                kasir.setVisible(true);
                this.setVisible(false);
            } else if (Status.equals("Karyawan")) {
                FormKaryawan karyawan = new FormKaryawan(Iduser);
                JOptionPane.showMessageDialog(null, "Login berhasil sebagai Karyawan");
                this.setVisible(false);
                karyawan.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "User tidak dapat ditemukan");
            clear();
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }

    }//GEN-LAST:event_txtrfidKeyReleased

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
            java.util.logging.Logger.getLogger(Formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btnlogin;
    private javax.swing.JLabel JBtnlogin;
    private javax.swing.JLabel Xclose;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel show;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtrfid;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
