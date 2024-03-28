package Form;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import view_kasir.Absensi_kasir;
import view_kasir.Daftarmenu;
import view_kasir.Transaksi;
import view_kasir.formTransaksi;

public class FormKasir extends javax.swing.JFrame {
    
    Statement st;
    ResultSet rs;
    Connection cn = Config.Conn.GetConn();
    static boolean maximixed = true;

    private Timer timer;
    public FormKasir(){}
    public FormKasir(String Iduser) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();
        getdata( Iduser);
    }
    private String Iduser;
    public void getdata(String Iduser){
        this.Iduser = Iduser;
    }
     private void updateTime() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        
        String dateStr = dateFormat.format(now);
        String timeStr = timeFormat.format(now);
        
        datelabel.setText(dateStr);
        timelabel.setText(timeStr);

     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn_btndashboard = new javax.swing.JPanel();
        pn_line = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JLabel();
        pn_btntransaksi = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_produk = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pn_btndaftarmenu = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_daftarmenu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pn_kanan = new javax.swing.JPanel();
        pn_atas = new javax.swing.JPanel();
        datelabel = new javax.swing.JLabel();
        timelabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnmaximize = new javax.swing.JLabel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pn_kiri.setBackground(new java.awt.Color(255, 255, 255));
        pn_kiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("MyKasir");
        pn_kiri.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 104, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Nnyok_Coffe_Ukuran_kecil-removebguk20 tanpa text.png"))); // NOI18N
        pn_kiri.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, -1, 69));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Master Data");
        pn_kiri.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 84, -1, -1));

        pn_btndashboard.setBackground(new java.awt.Color(255, 255, 255));

        pn_line.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_lineLayout = new javax.swing.GroupLayout(pn_line);
        pn_line.setLayout(pn_lineLayout);
        pn_lineLayout.setHorizontalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-30.png"))); // NOI18N

        btn_dashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(102, 102, 102));
        btn_dashboard.setText("Absensi");
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btndashboardLayout = new javax.swing.GroupLayout(pn_btndashboard);
        pn_btndashboard.setLayout(pn_btndashboardLayout);
        pn_btndashboardLayout.setHorizontalGroup(
            pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dashboard)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        pn_btndashboardLayout.setVerticalGroup(
            pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_btndashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btndashboardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_dashboard))))
                .addContainerGap())
        );

        pn_kiri.add(pn_btndashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 231, -1));

        pn_btntransaksi.setBackground(new java.awt.Color(255, 255, 255));

        pn_line1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-payment-30_1.png"))); // NOI18N

        btn_produk.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_produk.setForeground(new java.awt.Color(102, 102, 102));
        btn_produk.setText("Transaksi");
        btn_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_produkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_produkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_produkMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btntransaksiLayout = new javax.swing.GroupLayout(pn_btntransaksi);
        pn_btntransaksi.setLayout(pn_btntransaksiLayout);
        pn_btntransaksiLayout.setHorizontalGroup(
            pn_btntransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_btntransaksiLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_produk, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn_btntransaksiLayout.setVerticalGroup(
            pn_btntransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btntransaksiLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_btntransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btntransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_produk)
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pn_kiri.add(pn_btntransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 160, -1, -1));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Kasier");
        pn_kiri.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));

        pn_btndaftarmenu.setBackground(new java.awt.Color(255, 255, 255));

        pn_line2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cafe-30.png"))); // NOI18N

        btn_daftarmenu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_daftarmenu.setForeground(new java.awt.Color(102, 102, 102));
        btn_daftarmenu.setText("Daftar Menu");
        btn_daftarmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_daftarmenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_daftarmenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_daftarmenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btndaftarmenuLayout = new javax.swing.GroupLayout(pn_btndaftarmenu);
        pn_btndaftarmenu.setLayout(pn_btndaftarmenuLayout);
        pn_btndaftarmenuLayout.setHorizontalGroup(
            pn_btndaftarmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_btndaftarmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_daftarmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        pn_btndaftarmenuLayout.setVerticalGroup(
            pn_btndaftarmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndaftarmenuLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_btndaftarmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btndaftarmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_daftarmenu))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pn_kiri.add(pn_btndaftarmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jButton1.setText("Transaksi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pn_kiri.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_atas.setBackground(new java.awt.Color(0, 102, 153));

        datelabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        datelabel.setForeground(new java.awt.Color(255, 255, 255));
        datelabel.setText("jLabel12");

        timelabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        timelabel.setForeground(new java.awt.Color(255, 255, 255));
        timelabel.setText("14:55");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("X");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        btnmaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_restore_down_30px.png"))); // NOI18N
        btnmaximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmaximizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_atasLayout = new javax.swing.GroupLayout(pn_atas);
        pn_atas.setLayout(pn_atasLayout);
        pn_atasLayout.setHorizontalGroup(
            pn_atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_atasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(datelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timelabel)
                .addContainerGap(944, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_atasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmaximize)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        pn_atasLayout.setVerticalGroup(
            pn_atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_atasLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(27, 70, Short.MAX_VALUE))
            .addGroup(pn_atasLayout.createSequentialGroup()
                .addComponent(btnmaximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_atasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datelabel)
                    .addComponent(timelabel))
                .addContainerGap())
        );

        pn_kanan.add(pn_atas, java.awt.BorderLayout.PAGE_START);

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseEntered
        pn_btndashboard.setBackground(new Color(250,250,250));
        pn_line.setBackground(new Color(0,102,153));
        
    }//GEN-LAST:event_btn_dashboardMouseEntered

    private void btn_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseExited
        pn_btndashboard.setBackground(new Color(255,255,255));
        pn_line.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_dashboardMouseExited

    private void btn_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseClicked
       pn_btndashboard.setBackground(new Color(240,240,240));
        pn_line.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new Absensi_kasir(Iduser));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_dashboardMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void btnmaximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmaximizeMouseClicked
        if (maximixed) {
            FormKasir.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            FormKasir.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximixed = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximixed = true;
        }
    }//GEN-LAST:event_btnmaximizeMouseClicked

    private void btn_produkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produkMouseExited
        pn_btntransaksi.setBackground(new Color(255,255,255));
        pn_line1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_produkMouseExited

    private void btn_produkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produkMouseEntered
        pn_btntransaksi.setBackground(new Color(250,250,250));
        pn_line1.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_produkMouseEntered

    private void btn_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produkMouseClicked
        pn_btntransaksi.setBackground(new Color(240,240,240));
        pn_line1.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new Transaksi());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_produkMouseClicked

    private void btn_daftarmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarmenuMouseClicked
         pn_btndaftarmenu.setBackground(new Color(240,240,240));
        pn_line2.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new Daftarmenu());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_daftarmenuMouseClicked

    private void btn_daftarmenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarmenuMouseEntered
       pn_btndaftarmenu.setBackground(new Color(250,250,250));
        pn_line2.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_daftarmenuMouseEntered

    private void btn_daftarmenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarmenuMouseExited
         pn_btndaftarmenu.setBackground(new Color(255,255,255));
        pn_line2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_daftarmenuMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new formTransaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_daftarmenu;
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel btn_produk;
    private javax.swing.JLabel btnmaximize;
    private javax.swing.JLabel datelabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pn_atas;
    private javax.swing.JPanel pn_btndaftarmenu;
    private javax.swing.JPanel pn_btndashboard;
    private javax.swing.JPanel pn_btntransaksi;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JLabel timelabel;
    // End of variables declaration//GEN-END:variables
}
