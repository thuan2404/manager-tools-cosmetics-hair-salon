/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class TaiKhoan extends javax.swing.JPanel {

    /**
     * Creates new form TaiKhoan
     */
    private String username;
    String emailold, sdtold;
    public TaiKhoan(String username){
        this.username = username;
        initComponents();
        this.setBackground(Color.PINK);
        jPanel_NhanVien.setBackground(Color.PINK);
        loadThongTinUser(username);
        jTextField_user.setEditable(false);
        jTextField_chucvu.setEditable(false);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_Nam);
        bg.add(jRadioButton_Nu);
        if(jTextField_chucvu.getText().equals("Quản Lý") || jTextField_chucvu.getText().equals("Admin")){
            JPanel node = new ThongTinNhanVien(username);
            jPanel_NhanVien.removeAll();
            jPanel_NhanVien.setLayout(new BorderLayout());
            jPanel_NhanVien.add(node);
            jPanel_NhanVien.validate();
            jPanel_NhanVien.repaint();
        }
        else{
            JPanel node = new ThongTinMuonDungCu(username);
            jPanel_NhanVien.removeAll();
            jPanel_NhanVien.setLayout(new BorderLayout());
            jPanel_NhanVien.add(node);
            jPanel_NhanVien.validate();
            jPanel_NhanVien.repaint();
            jButton_Muon.setVisible(false);
        }
    }
    public TaiKhoan() {
        initComponents();
        
    }
    private void loadThongTinUser(String user){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        
        String sql = "select * from NHANVIEN where TAIKHOAN = '" + user + "'";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                jTextField_user.setText(rs.getString("TAIKHOAN").trim());
                jTextField_hoten.setText(rs.getString("HOTEN").trim());
                jTextField_chucvu.setText(rs.getString("CHUCVU").trim());
                jTextField_email.setText(rs.getString("EMAIL").trim());
                emailold = rs.getString("EMAIL").trim();
                jTextField_SDT.setText(rs.getString("SDT").trim());
                sdtold = rs.getString("SDT").trim();
                if(rs.getString("GIOITINH").trim().equals("Nam")){
                    jRadioButton_Nam.setSelected(true);
                }
                else{
                    jRadioButton_Nu.setSelected(true);
                }
            }
            ketNoi.close();
        }
        catch(SQLException ex){
            Logger.getLogger(DungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_user = new javax.swing.JTextField();
        jTextField_hoten = new javax.swing.JTextField();
        jTextField_chucvu = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jTextField_SDT = new javax.swing.JTextField();
        jPanel_NhanVien = new javax.swing.JPanel();
        jButton_Sua = new javax.swing.JButton();
        jRadioButton_Nam = new javax.swing.JRadioButton();
        jRadioButton_Nu = new javax.swing.JRadioButton();
        jButton_DoiMK = new javax.swing.JButton();
        jButton_Muon = new javax.swing.JButton();

        panel1.setBackground(new java.awt.Color(255, 204, 0));
        panel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label1.setText("THÔNG TIN TÀI KHOẢN");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Tài Khoản:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Họ Tên:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Giới Tính:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Chức Vụ:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("SĐT:");

        jTextField_user.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextField_hoten.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_hoten.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_hotenKeyTyped(evt);
            }
        });

        jTextField_chucvu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextField_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_emailKeyTyped(evt);
            }
        });

        jTextField_SDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_SDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SDTActionPerformed(evt);
            }
        });
        jTextField_SDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_SDTKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel_NhanVienLayout = new javax.swing.GroupLayout(jPanel_NhanVien);
        jPanel_NhanVien.setLayout(jPanel_NhanVienLayout);
        jPanel_NhanVienLayout.setHorizontalGroup(
            jPanel_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel_NhanVienLayout.setVerticalGroup(
            jPanel_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jButton_Sua.setBackground(new java.awt.Color(51, 153, 255));
        jButton_Sua.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Sua.setText("Sửa Thông Tin");
        jButton_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SuaActionPerformed(evt);
            }
        });

        jRadioButton_Nam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton_Nam.setText("Nam");

        jRadioButton_Nu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton_Nu.setText("Nữ");

        jButton_DoiMK.setBackground(new java.awt.Color(51, 153, 255));
        jButton_DoiMK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_DoiMK.setText("Đổi Mật Khẩu");
        jButton_DoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DoiMKActionPerformed(evt);
            }
        });

        jButton_Muon.setBackground(new java.awt.Color(51, 153, 255));
        jButton_Muon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Muon.setText("Dụng Cụ Mượn");
        jButton_Muon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MuonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton_DoiMK)
                                        .addGap(44, 44, 44)
                                        .addComponent(jButton_Sua))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_chucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_user, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton_Nam)
                                                .addGap(54, 54, 54)
                                                .addComponent(jRadioButton_Nu))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jButton_Muon)))
                        .addGap(25, 25, 25)
                        .addComponent(jPanel_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton_Nam)
                    .addComponent(jRadioButton_Nu))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_chucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Muon)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_DoiMK)
                    .addComponent(jButton_Sua))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(jPanel_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SDTActionPerformed

    private void jButton_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SuaActionPerformed
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String user = jTextField_user.getText();
        String ten = jTextField_hoten.getText();
        String gioiTinh = jRadioButton_Nam.isSelected() == true ? "Nam" : "Nữ";
        String email = jTextField_email.getText();
        String phone = jTextField_SDT.getText();
        String chucvu = jTextField_chucvu.getText();
        String sql = "UPDATE NHANVIEN SET HOTEN = ?, GIOITINH = ?, EMAIL = ?, CHUCVU = ?, SDT = ? WHERE TAIKHOAN = ?";
        int KTName = 0, KTPhone = 0, KTEmail = 0;
        if(ten.equals("")){
                KTName = 1;
                JOptionPane.showMessageDialog(this, "Họ Tên Không Được Để Trống!!!");
            }
           else if(phone.equals("")){
                KTPhone = 1;
                JOptionPane.showMessageDialog(this, "Số Điện Thoại Không Được Để Trống!!!");
            }
            else if(!ChuanHoa.kiemTraPhone(phone)){
                KTPhone = 1;
                JOptionPane.showMessageDialog(this, "Số Điện Thoại Không Hợp Lệ!!!");
            }
            else if(email.equals("")){
                KTEmail = 1;
                JOptionPane.showMessageDialog(this, "Email Không Được Để Trống!!!");
            }
            else if(!ChuanHoa.kiemTraEmail(email)){
                KTEmail = 1;
                JOptionPane.showMessageDialog(this, "Email Không Hợp Lệ!!!");
            }
            else if(KTName != 1 && KTPhone != 1 && KTPhone != 1){
                int check1 = kiemTraEmail(email);
                int check2 = kiemTraSDT(phone);
                if(check1 == 1 && !emailold.equals(email)){
                    JOptionPane.showMessageDialog(this, "Email Đã Tồn Tại!!!");
                }
                else if(check2 == 1 && !sdtold.equals(phone)){
                    JOptionPane.showMessageDialog(this, "Số Điện Thoại Đã Tồn Tại!!!");
                }
                else{
                    try{
                        PreparedStatement ps = ketNoi.prepareStatement(sql);
                        ps.setString(1, ten);
                        ps.setString(2, gioiTinh);
                        ps.setString(3, email);
                        ps.setString(4, chucvu);
                        ps.setString(5, phone);
                        ps.setString(6, user);
                        ps.executeUpdate();
                    }
                    catch(SQLException ex){
                        Logger.getLogger(TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Sửa Thông Tin Thành Công");
               }
                
           }
        
                
           
    
    }//GEN-LAST:event_jButton_SuaActionPerformed

    private void jTextField_hotenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_hotenKeyTyped
        if(jTextField_hoten.getText().length() >= 40){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_hotenKeyTyped

    private void jTextField_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_emailKeyTyped
        if(jTextField_email.getText().length() >= 50){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_emailKeyTyped

    private void jTextField_SDTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SDTKeyTyped
        if(jTextField_SDT.getText().length() >= 10){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_SDTKeyTyped

    private void jButton_DoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DoiMKActionPerformed
        new DoiMatKhau(username).setVisible(true);
    }//GEN-LAST:event_jButton_DoiMKActionPerformed

    private void jButton_MuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MuonActionPerformed
            JPanel node = new ThongTinMuonDungCu(username);
            jPanel_NhanVien.removeAll();
            jPanel_NhanVien.setLayout(new BorderLayout());
            jPanel_NhanVien.add(node);
            jPanel_NhanVien.validate();
            jPanel_NhanVien.repaint();
    }//GEN-LAST:event_jButton_MuonActionPerformed
        private int kiemTraEmail(String email){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        int tontai = 0;
        String sql = "select * from NHANVIEN";
        try{
            try (PreparedStatement ps = ketNoi.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while(rs.next()){
                    if(rs.getString("EMAIL").trim().equals(email)){
                        tontai = 1;
                    }
                }
            }
            ketNoi.close();
        }
        catch(SQLException ex){
            Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tontai;
    }
        private int kiemTraSDT(String phone){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        int tontai = 0;
        String sql = "select * from NHANVIEN";
        try{
            try (PreparedStatement ps = ketNoi.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while(rs.next()){
                    if(rs.getString("SDT").equals(phone)){
                        tontai = 1;
                    }
                }
            }
            ketNoi.close();
        }
        catch(SQLException ex){
            Logger.getLogger(DangKy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tontai;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DoiMK;
    private javax.swing.JButton jButton_Muon;
    private javax.swing.JButton jButton_Sua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel_NhanVien;
    private javax.swing.JRadioButton jRadioButton_Nam;
    private javax.swing.JRadioButton jRadioButton_Nu;
    private javax.swing.JTextField jTextField_SDT;
    private javax.swing.JTextField jTextField_chucvu;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_hoten;
    private javax.swing.JTextField jTextField_user;
    private java.awt.Label label1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
