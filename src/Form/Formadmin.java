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
import view_admin.Laporan_pengeluaran;
import view_admin.Laporan_penjualan;
import view_admin.Produk;
import view_admin.dashboard;
import view_admin.komposisi;
import view_admin.laporan_absensi;
import view_admin.registrasi_akun;
import view_admin.stok;
import Form.Formlogin;

public class Formadmin extends javax.swing.JFrame {
    
    Statement st;
    ResultSet rs;
    Connection cn = Config.Conn.GetConn();
    static boolean maximixed = true;

    private Timer timer;
    public Formadmin(){}
    public Formadmin(String Iduser) {
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
        pn_btnstok = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_stok = new javax.swing.JLabel();
        pn_btnproduk = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_produk = new javax.swing.JLabel();
        pn_btnkomposisi = new javax.swing.JPanel();
        pn_line3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_komposisi = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pn_btnLpenjualan = new javax.swing.JPanel();
        pn_line4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_Lpenjualan = new javax.swing.JLabel();
        pn_btnLpengeluaran = new javax.swing.JPanel();
        pn_line5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_Lpengeluaran = new javax.swing.JLabel();
        pn_btnLabsensi = new javax.swing.JPanel();
        pn_line6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_Labsensi = new javax.swing.JLabel();
        pn_btnregister = new javax.swing.JPanel();
        pn_line7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_register = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pn_btnlogout = new javax.swing.JPanel();
        pn_line9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-30.png"))); // NOI18N

        btn_dashboard.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(102, 102, 102));
        btn_dashboard.setText("Dashboard");
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
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btn_dashboard)
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );
        pn_btndashboardLayout.setVerticalGroup(
            pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btndashboardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_dashboard)))
                .addContainerGap())
            .addGroup(pn_btndashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndashboardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        pn_kiri.add(pn_btndashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 231, -1));

        pn_btnstok.setBackground(new java.awt.Color(255, 255, 255));

        pn_line1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cardboard-30.png"))); // NOI18N

        btn_stok.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_stok.setForeground(new java.awt.Color(102, 102, 102));
        btn_stok.setText("Stok Barang");
        btn_stok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_stokMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_stokMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_stokMouseExited(evt);
            }
        });

        pn_btnproduk.setBackground(new java.awt.Color(255, 255, 255));

        pn_line2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cafe-30.png"))); // NOI18N

        btn_produk.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_produk.setForeground(new java.awt.Color(102, 102, 102));
        btn_produk.setText("Produk");
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

        javax.swing.GroupLayout pn_btnprodukLayout = new javax.swing.GroupLayout(pn_btnproduk);
        pn_btnproduk.setLayout(pn_btnprodukLayout);
        pn_btnprodukLayout.setHorizontalGroup(
            pn_btnprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnprodukLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btn_produk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnprodukLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );
        pn_btnprodukLayout.setVerticalGroup(
            pn_btnprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnprodukLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnprodukLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_produk)))
                .addContainerGap())
            .addGroup(pn_btnprodukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnprodukLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pn_btnstokLayout = new javax.swing.GroupLayout(pn_btnstok);
        pn_btnstok.setLayout(pn_btnstokLayout);
        pn_btnstokLayout.setHorizontalGroup(
            pn_btnstokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnstokLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btn_stok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pn_btnproduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_btnstokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnstokLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(220, Short.MAX_VALUE)))
        );
        pn_btnstokLayout.setVerticalGroup(
            pn_btnstokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnstokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnstokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnstokLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_stok)))
                .addGap(0, 0, 0)
                .addComponent(pn_btnproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(pn_btnstokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnstokLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        pn_kiri.add(pn_btnstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 156, -1, -1));

        pn_btnkomposisi.setBackground(new java.awt.Color(255, 255, 255));

        pn_line3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line3Layout = new javax.swing.GroupLayout(pn_line3);
        pn_line3.setLayout(pn_line3Layout);
        pn_line3Layout.setHorizontalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line3Layout.setVerticalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-composition-30.png"))); // NOI18N

        btn_komposisi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_komposisi.setForeground(new java.awt.Color(102, 102, 102));
        btn_komposisi.setText("Komposisi");
        btn_komposisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_komposisiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_komposisiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_komposisiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnkomposisiLayout = new javax.swing.GroupLayout(pn_btnkomposisi);
        pn_btnkomposisi.setLayout(pn_btnkomposisiLayout);
        pn_btnkomposisiLayout.setHorizontalGroup(
            pn_btnkomposisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnkomposisiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btn_komposisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnkomposisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnkomposisiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(190, Short.MAX_VALUE)))
        );
        pn_btnkomposisiLayout.setVerticalGroup(
            pn_btnkomposisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnkomposisiLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pn_btnkomposisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_komposisi, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(pn_btnkomposisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnkomposisiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pn_kiri.add(pn_btnkomposisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 231, 40));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Report");
        pn_kiri.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 292, 71, -1));

        pn_btnLpenjualan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line4Layout = new javax.swing.GroupLayout(pn_line4);
        pn_line4.setLayout(pn_line4Layout);
        pn_line4Layout.setHorizontalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line4Layout.setVerticalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-chart-30.png"))); // NOI18N

        btn_Lpenjualan.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_Lpenjualan.setForeground(new java.awt.Color(102, 102, 102));
        btn_Lpenjualan.setText("Laporan Penjualan");
        btn_Lpenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LpenjualanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LpenjualanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LpenjualanMouseExited(evt);
            }
        });

        pn_btnLpengeluaran.setBackground(new java.awt.Color(255, 255, 255));

        pn_line5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line5Layout = new javax.swing.GroupLayout(pn_line5);
        pn_line5.setLayout(pn_line5Layout);
        pn_line5Layout.setHorizontalGroup(
            pn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line5Layout.setVerticalGroup(
            pn_line5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-coin-30.png"))); // NOI18N

        btn_Lpengeluaran.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_Lpengeluaran.setForeground(new java.awt.Color(102, 102, 102));
        btn_Lpengeluaran.setText("Laporan Pengeluaran");
        btn_Lpengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LpengeluaranMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LpengeluaranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LpengeluaranMouseExited(evt);
            }
        });

        pn_btnLabsensi.setBackground(new java.awt.Color(255, 255, 255));

        pn_line6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line6Layout = new javax.swing.GroupLayout(pn_line6);
        pn_line6.setLayout(pn_line6Layout);
        pn_line6Layout.setHorizontalGroup(
            pn_line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line6Layout.setVerticalGroup(
            pn_line6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-groups-30.png"))); // NOI18N

        btn_Labsensi.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_Labsensi.setForeground(new java.awt.Color(102, 102, 102));
        btn_Labsensi.setText("Laporan Absensi");
        btn_Labsensi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LabsensiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LabsensiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LabsensiMouseExited(evt);
            }
        });

        pn_btnregister.setBackground(new java.awt.Color(255, 255, 255));

        pn_line7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line7Layout = new javax.swing.GroupLayout(pn_line7);
        pn_line7.setLayout(pn_line7Layout);
        pn_line7Layout.setHorizontalGroup(
            pn_line7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line7Layout.setVerticalGroup(
            pn_line7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-30.png"))); // NOI18N

        btn_register.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(102, 102, 102));
        btn_register.setText("Registrasi Account");
        btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_registerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnregisterLayout = new javax.swing.GroupLayout(pn_btnregister);
        pn_btnregister.setLayout(pn_btnregisterLayout);
        pn_btnregisterLayout.setHorizontalGroup(
            pn_btnregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnregisterLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(btn_register, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnregisterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
        );
        pn_btnregisterLayout.setVerticalGroup(
            pn_btnregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnregisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGroup(pn_btnregisterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_register)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(pn_btnregisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnregisterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 17)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("User Register");

        javax.swing.GroupLayout pn_btnLabsensiLayout = new javax.swing.GroupLayout(pn_btnLabsensi);
        pn_btnLabsensi.setLayout(pn_btnLabsensiLayout);
        pn_btnLabsensiLayout.setHorizontalGroup(
            pn_btnLabsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLabsensiLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(btn_Labsensi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnLabsensiLayout.createSequentialGroup()
                .addComponent(pn_btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(pn_btnLabsensiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnLabsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnLabsensiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
        );
        pn_btnLabsensiLayout.setVerticalGroup(
            pn_btnLabsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLabsensiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnLabsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnLabsensiLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Labsensi)))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnregister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(pn_btnLabsensiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnLabsensiLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        pn_btnlogout.setBackground(new java.awt.Color(255, 255, 255));

        pn_line9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line9Layout = new javax.swing.GroupLayout(pn_line9);
        pn_line9.setLayout(pn_line9Layout);
        pn_line9Layout.setHorizontalGroup(
            pn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        pn_line9Layout.setVerticalGroup(
            pn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-30.png"))); // NOI18N

        btn_logout.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(102, 102, 102));
        btn_logout.setText("Log Out");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_logoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnlogoutLayout = new javax.swing.GroupLayout(pn_btnlogout);
        pn_btnlogout.setLayout(pn_btnlogoutLayout);
        pn_btnlogoutLayout.setHorizontalGroup(
            pn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnlogoutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(btn_logout)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(pn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnlogoutLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(200, Short.MAX_VALUE)))
        );
        pn_btnlogoutLayout.setVerticalGroup(
            pn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnlogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnlogoutLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_logout)))
                .addContainerGap())
            .addGroup(pn_btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnlogoutLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pn_btnLpengeluaranLayout = new javax.swing.GroupLayout(pn_btnLpengeluaran);
        pn_btnLpengeluaran.setLayout(pn_btnLpengeluaranLayout);
        pn_btnLpengeluaranLayout.setHorizontalGroup(
            pn_btnLpengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLpengeluaranLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btn_Lpengeluaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnLpengeluaranLayout.createSequentialGroup()
                .addGroup(pn_btnLpengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_btnLabsensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_btnLpengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnLpengeluaranLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );
        pn_btnLpengeluaranLayout.setVerticalGroup(
            pn_btnLpengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLpengeluaranLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnLpengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnLpengeluaranLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Lpengeluaran)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnLabsensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(pn_btnLpengeluaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnLpengeluaranLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pn_btnLpenjualanLayout = new javax.swing.GroupLayout(pn_btnLpenjualan);
        pn_btnLpenjualan.setLayout(pn_btnLpenjualanLayout);
        pn_btnLpenjualanLayout.setHorizontalGroup(
            pn_btnLpenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLpenjualanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(btn_Lpenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_btnLpenjualanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn_btnLpengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pn_btnLpenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnLpenjualanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
        pn_btnLpenjualanLayout.setVerticalGroup(
            pn_btnLpenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnLpenjualanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btnLpenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pn_btnLpenjualanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Lpenjualan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnLpengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_btnLpenjualanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnLpenjualanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(307, Short.MAX_VALUE)))
        );

        pn_kiri.add(pn_btnLpenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 315, -1, -1));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Admin");
        pn_kiri.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 20));

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
                .addContainerGap(924, Short.MAX_VALUE))
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
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
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
        pn_utama.add(new dashboard());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_dashboardMouseClicked

    private void btn_stokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stokMouseClicked
       pn_btnstok.setBackground(new Color(240,240,240));
        pn_line1.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new stok(Iduser));
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_stokMouseClicked

    private void btn_stokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stokMouseEntered
       pn_btnstok.setBackground(new Color(250,250,250));
        pn_line1.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_stokMouseEntered

    private void btn_stokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_stokMouseExited
        pn_btnstok.setBackground(new Color(255,255,255));
        pn_line1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_stokMouseExited

    private void btn_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produkMouseClicked
        pn_btnproduk.setBackground(new Color(240,240,240));
        pn_line2.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new Produk());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_produkMouseClicked

    private void btn_produkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produkMouseEntered
       pn_btnproduk.setBackground(new Color(250,250,250));
        pn_line2.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_produkMouseEntered

    private void btn_produkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produkMouseExited
       pn_btnproduk.setBackground(new Color(255,255,255));
        pn_line2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_produkMouseExited

    private void btn_komposisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_komposisiMouseClicked
       pn_btnkomposisi.setBackground(new Color(240,240,240));
        pn_line3.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new komposisi());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_komposisiMouseClicked

    private void btn_komposisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_komposisiMouseEntered
        pn_btnkomposisi.setBackground(new Color(250,250,250));
        pn_line3.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_komposisiMouseEntered

    private void btn_komposisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_komposisiMouseExited
        pn_btnkomposisi.setBackground(new Color(255,255,255));
        pn_line3.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_komposisiMouseExited

    private void btn_LpenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LpenjualanMouseClicked
       pn_btnLpenjualan.setBackground(new Color(240,240,240));
        pn_line4.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new Laporan_penjualan());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_LpenjualanMouseClicked

    private void btn_LpenjualanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LpenjualanMouseEntered
       pn_btnLpenjualan.setBackground(new Color(250,250,250));
        pn_line4.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_LpenjualanMouseEntered

    private void btn_LpenjualanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LpenjualanMouseExited
        pn_btnLpenjualan.setBackground(new Color(255,255,255));
        pn_line4.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_LpenjualanMouseExited

    private void btn_LpengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LpengeluaranMouseClicked
        pn_btnLpengeluaran.setBackground(new Color(240,240,240));
        pn_line5.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new Laporan_pengeluaran());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_LpengeluaranMouseClicked

    private void btn_LpengeluaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LpengeluaranMouseEntered
      pn_btnLpengeluaran.setBackground(new Color(250,250,250));
        pn_line5.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_LpengeluaranMouseEntered

    private void btn_LpengeluaranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LpengeluaranMouseExited
       pn_btnLpengeluaran.setBackground(new Color(255,255,255));
        pn_line5.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_LpengeluaranMouseExited

    private void btn_LabsensiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LabsensiMouseClicked
        pn_btnLabsensi.setBackground(new Color(240,240,240));
        pn_line6.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new laporan_absensi());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_LabsensiMouseClicked

    private void btn_LabsensiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LabsensiMouseEntered
       pn_btnLabsensi.setBackground(new Color(250,250,250));
        pn_line6.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_LabsensiMouseEntered

    private void btn_LabsensiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LabsensiMouseExited
        pn_btnLabsensi.setBackground(new Color(255,255,255));
        pn_line6.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_LabsensiMouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void btnmaximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmaximizeMouseClicked
        if (maximixed) {
            Formadmin.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Formadmin.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximixed = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximixed = true;
        }
    }//GEN-LAST:event_btnmaximizeMouseClicked

    private void btn_registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseExited
        pn_btnregister.setBackground(new Color(255,255,255));
        pn_line7.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_registerMouseExited

    private void btn_registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseEntered
        pn_btnregister.setBackground(new Color(250,250,250));
        pn_line7.setBackground(new Color(0,102,153));
    }//GEN-LAST:event_btn_registerMouseEntered

    private void btn_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseClicked
        pn_btnregister.setBackground(new Color(240,240,240));
        pn_line6.setBackground(new Color(0,102,153));
        pn_utama.removeAll();
        pn_utama.add(new registrasi_akun());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_btn_registerMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        Formlogin login = new Formlogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutMouseEntered

    private void btn_logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutMouseExited

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
            java.util.logging.Logger.getLogger(Formadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Labsensi;
    private javax.swing.JLabel btn_Lpengeluaran;
    private javax.swing.JLabel btn_Lpenjualan;
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel btn_komposisi;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_produk;
    private javax.swing.JLabel btn_register;
    private javax.swing.JLabel btn_stok;
    private javax.swing.JLabel btnmaximize;
    private javax.swing.JLabel datelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pn_atas;
    private javax.swing.JPanel pn_btnLabsensi;
    private javax.swing.JPanel pn_btnLpengeluaran;
    private javax.swing.JPanel pn_btnLpenjualan;
    private javax.swing.JPanel pn_btndashboard;
    private javax.swing.JPanel pn_btnkomposisi;
    private javax.swing.JPanel pn_btnlogout;
    private javax.swing.JPanel pn_btnproduk;
    private javax.swing.JPanel pn_btnregister;
    private javax.swing.JPanel pn_btnstok;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line3;
    private javax.swing.JPanel pn_line4;
    private javax.swing.JPanel pn_line5;
    private javax.swing.JPanel pn_line6;
    private javax.swing.JPanel pn_line7;
    private javax.swing.JPanel pn_line9;
    private javax.swing.JPanel pn_utama;
    private javax.swing.JLabel timelabel;
    // End of variables declaration//GEN-END:variables
}
