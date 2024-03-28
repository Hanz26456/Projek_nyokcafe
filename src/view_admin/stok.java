package view_admin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class stok extends javax.swing.JPanel {

    Statement st;
    ResultSet rs;
    Connection cn = Config.Conn.GetConn();
    private Timer timer;
    private String Iduser;
    public stok(String Iduser) {
        initComponents();
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();
        SetTxtfild();
        this.Iduser = Iduser;
        ShowDataStok();
    }
    
    public void SetTxtfild(){
        txtnama.setBackground(new Color(0,0,0,1));
        txtberat.setBackground(new Color(0,0,0,1));
        txtharga.setBackground(new Color(0,0,0,1));
        txttglbbmasuk.setBackground(new Color(0,0,0,1));
    }
    
    private void updateTime() {
        Date now = new Date();
        SimpleDateFormat DateAndTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        String dateStr = DateAndTime.format(now);
        txttglbbmasuk.setText(dateStr);
     }
    
    public void ClearInputBb(){
        txtnama.setText("");
        txtberat.setText("");
        txtharga.setText("");
        txttglbbmasuk.setText("");
    }
    
    public void ShowDataStok(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama Bahan");
        model.addColumn("Berat Satuan");
        
        try {
            String tampil = "SELECT nama_bb,berat_bb FROM tbl_stok_bb";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(tampil);
            int i = 1;
            while(rs.next()){
                model.addRow(new Object[] {
                    i++,
                    rs.getString("nama_bb"),
                    rs.getString("berat_bb")
                });
                TableStokBb.setModel(model);
            }
        } catch (Exception e) {
        }
    }
    
    private void CariDataStok(String key){
        try{
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("Nama Bahan");
            model.addColumn("Berat Bahan");
            TableStokBb.setModel(model);
            
            String sqlcari = "SELECT nama_bb,berat_bb FROM tbl_stok_bb WHERE nama_bb LIKE '%"+
                    key+"%' OR berat_bb LIKE '%"+key+"%'";
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery(sqlcari);
            int i = 1;
            while (rs.next()) {
                model.addRow(new Object[] {
                        i++,
                        rs.getString("nama_bb"),
                        rs.getString("berat_bb") 
                });
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableStokBb = new javax.swing.JTable();
        txtcaribb = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtberat = new javax.swing.JTextField();
        txtharga = new javax.swing.JTextField();
        txttglbbmasuk = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("DATA STOK BAHAN BAKU");

        TableStokBb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableStokBb.setRowHeight(30);
        TableStokBb.setSelectionBackground(new java.awt.Color(0, 102, 153));
        jScrollPane1.setViewportView(TableStokBb);

        txtcaribb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcaribbKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtcaribb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtcaribb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("INPUT DATA STOK");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nama Bahan");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 38, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("________________________________");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Berat Bahan");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("________________________________");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Harga Bahan");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 38, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("________________________________");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 69, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("________________________________");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 131, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Tanggal Bahan Masuk");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        txtnama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtnama.setBorder(null);
        jPanel2.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 40));

        txtberat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtberat.setBorder(null);
        jPanel2.add(txtberat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, 40));

        txtharga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtharga.setBorder(null);
        jPanel2.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 210, 40));

        txttglbbmasuk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttglbbmasuk.setBorder(null);
        jPanel2.add(txttglbbmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 210, 40));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Input");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        try {
            st = cn.createStatement();
            String sql = "SELECT * FROM tbl_stok_bb WHERE nama_bb = '"+txtnama.getText()+"'";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String id = rs.getString("id_bb");
                String SqlBbMasuk = "INSERT INTO tbl_bb_masuk VALUES (NULL,'"+Iduser+"','"+
                        id+"','"+txtberat.getText()+"','"+txtharga.getText()+"','"+txttglbbmasuk.getText()+"')";
                java.sql.PreparedStatement BahanMasuk = cn.prepareStatement(SqlBbMasuk);
                BahanMasuk.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil di input");
                ClearInputBb();
                ShowDataStok();
            }else{
                String sql2 = "INSERT INTO tbl_stok_bb VALUES (NULL,'"+Iduser+"','"+txtnama.getText()+"','"+txtberat.getText()+"')";
                java.sql.PreparedStatement pst = cn.prepareStatement(sql2);
                pst.execute();
                String CariIdnew = "SELECT * FROM tbl_stok_bb WHERE nama_bb = '"+txtnama.getText()+"'";
                st = cn.createStatement();
                rs = st.executeQuery(CariIdnew);
                if (rs.next()) {
                    String IdBb = rs.getString("id_bb");
                    String SqlBbMasuk = "INSERT INTO tbl_bb_masuk VALUES (NULL,'"+Iduser+"','"+
                            IdBb+"','"+txtberat.getText()+"','"+txtharga.getText()+"','"+txttglbbmasuk.getText()+"')";
                    java.sql.PreparedStatement BahanMasuk = cn.prepareStatement(SqlBbMasuk);
                    BahanMasuk.execute();
                    JOptionPane.showMessageDialog(null, "Data berhasil di input");
                    ClearInputBb();
                    ShowDataStok();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void txtcaribbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcaribbKeyReleased
        String key = txtcaribb.getText(); 
        if(key != ""){
            CariDataStok(key);
        }else{
            ShowDataStok();
        }
    }//GEN-LAST:event_txtcaribbKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableStokBb;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtberat;
    private javax.swing.JTextField txtcaribb;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttglbbmasuk;
    // End of variables declaration//GEN-END:variables
}
