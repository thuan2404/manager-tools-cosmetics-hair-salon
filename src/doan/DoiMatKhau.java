/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DoiMatKhau extends javax.swing.JFrame {

    /**
     * Creates new form DoiMatKhau
     */
    private String user;
    public DoiMatKhau(String username) {
        this.user = username;
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    public DoiMatKhau() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_MKC = new javax.swing.JPasswordField();
        jPasswordField_MKM = new javax.swing.JPasswordField();
        jPasswordField_MKMNL = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton_OK = new javax.swing.JButton();
        jButton_Huy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đổi Mật Khẩu");
        setBackground(new java.awt.Color(255, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Mật Khẩu Cũ:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Mật Khẩu Mới:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nhập Lại Mật Khẩu Mới:");

        jPasswordField_MKC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField_MKC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField_MKCKeyTyped(evt);
            }
        });

        jPasswordField_MKM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField_MKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_MKMActionPerformed(evt);
            }
        });
        jPasswordField_MKM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField_MKMKeyTyped(evt);
            }
        });

        jPasswordField_MKMNL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField_MKMNL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField_MKMNLKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐỔI MẬT KHẨU");

        jButton_OK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_OK.setForeground(new java.awt.Color(0, 153, 255));
        jButton_OK.setText("Đồng Ý");
        jButton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OKActionPerformed(evt);
            }
        });

        jButton_Huy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Huy.setForeground(new java.awt.Color(0, 153, 255));
        jButton_Huy.setText("Hủy");
        jButton_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButton_OK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Huy)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(14, 14, 14))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPasswordField_MKM)
                                .addComponent(jPasswordField_MKMNL, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordField_MKC, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField_MKC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField_MKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField_MKMNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_OK)
                    .addComponent(jButton_Huy))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_MKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_MKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_MKMActionPerformed

    private void jButton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OKActionPerformed
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String sql = "UPDATE NHANVIEN SET MATKHAU = ? WHERE TAIKHOAN = ?";
        String passOld = String.valueOf(jPasswordField_MKC.getPassword());
        String passNew = String.valueOf(jPasswordField_MKM.getPassword());
        String passNewCF = String.valueOf(jPasswordField_MKMNL.getPassword());
        int KTMKC = 0, KTMKM = 0, KTNL = 0;
        if(passOld.equals("")){
            KTMKC = 1;
            JOptionPane.showMessageDialog(this, "Mật Khẩu Cũ Trống");
        }
        else if(passNew.equals("")){
            KTMKM = 1;
            JOptionPane.showMessageDialog(this, "Mật Khẩu Mới Trống");
        }
        else if(passNewCF.equals("")){
            KTNL = 1;
            JOptionPane.showMessageDialog(this, "Nhập Lại Mật Khẩu Mới Trống");
        }
        else if(!passNewCF.equals(passNew)){
            KTNL = 1;
            JOptionPane.showMessageDialog(this, "Mật Khẩu Nhập Lại Không Trùng Khớp");
        }
        else if(kiemTraLogin(user, passOld) != 1){
            KTMKC = 1;
            JOptionPane.showMessageDialog(this, "Mật Khẩu Cũ Không Chính Xác");
        }
        else if(passNew.length() < 6 || passNew.length() > 30){
            KTMKM = 1;
            JOptionPane.showMessageDialog(this, "Mật Khẩu Từ 6 - 30 Kí Tự!!!");
        }
        else if(KTMKC != 1 && KTMKM != 1 && KTNL != 1){
            try {
                PreparedStatement ps = ketNoi.prepareStatement(sql);
                ps.setString(1, passNew);
                ps.setString(2, user);
                ps.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Đổi Mật Khẩu Thành Công");
            this.dispose();
        }
    }//GEN-LAST:event_jButton_OKActionPerformed

    private void jButton_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_HuyActionPerformed

    private void jPasswordField_MKCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_MKCKeyTyped
        if(jPasswordField_MKC.getText().length() >= 30){
            evt.consume();
        }
    }//GEN-LAST:event_jPasswordField_MKCKeyTyped

    private void jPasswordField_MKMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_MKMKeyTyped
        if(jPasswordField_MKM.getText().length() >= 30){
            evt.consume();
        }
    }//GEN-LAST:event_jPasswordField_MKMKeyTyped

    private void jPasswordField_MKMNLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_MKMNLKeyTyped
        if(jPasswordField_MKMNL.getText().length() >= 30){
            evt.consume();
        }
    }//GEN-LAST:event_jPasswordField_MKMNLKeyTyped
    private int kiemTraLogin(String user, String pass){
        int tontai = 0;
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String sql = "select MATKHAU from NHANVIEN where TAIKHOAN = '" + user + "'";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                if(pass.equals(rs.getString("MATKHAU").trim())){
                    tontai = 1;
                    
                }
            }
        }
        catch(SQLException ex){
            Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tontai;
    }
  
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
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Huy;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField_MKC;
    private javax.swing.JPasswordField jPasswordField_MKM;
    private javax.swing.JPasswordField jPasswordField_MKMNL;
    // End of variables declaration//GEN-END:variables
}