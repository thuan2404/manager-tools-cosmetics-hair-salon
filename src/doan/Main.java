package doan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author MINHTHUAN
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private String username;

    public Main(String username) {
        this.username = username;
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("QUẢN LÝ MỸ PHẨM, DỤNG CỤ TIỆM CẮT TÓC");
        ImageIcon icon = new ImageIcon(new ImageIcon("src/images/mypham.png").getImage().getScaledInstance(60, 54, Image.SCALE_SMOOTH));
        jButton_MyPham.setIcon(icon);
        icon = new ImageIcon(new ImageIcon("src/images/taikhoan.png").getImage().getScaledInstance(50, 45, Image.SCALE_SMOOTH));
        jButton_TaiKhoan.setIcon(icon);
        icon = new ImageIcon(new ImageIcon("src/images/dungcu.png").getImage().getScaledInstance(60, 45, Image.SCALE_SMOOTH));
        jButton_DungCu.setIcon(icon);
        icon = new ImageIcon(new ImageIcon("src/images/thongtin.png").getImage().getScaledInstance(60, 45, Image.SCALE_SMOOTH));
        jButton_ThongTin.setIcon(icon);
        icon = new ImageIcon(new ImageIcon("src/images/thongke.png").getImage().getScaledInstance(55, 54, Image.SCALE_SMOOTH));
        jButton_ThongKe.setIcon(icon);
        icon = new ImageIcon(new ImageIcon("src/images/logout.png").getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
        jButton_DangXuat.setIcon(icon);
        icon = new ImageIcon(new ImageIcon("src/images/keo.png").getImage().getScaledInstance(jLabel_Keo.getWidth(), jLabel_Keo.getHeight(), Image.SCALE_SMOOTH));
        jLabel_Keo.setIcon(icon);
        JLabel lbhn = new JLabel();
        lbhn.setSize(900, 750);
        jPanelWiew.add(lbhn);
        icon = new ImageIcon(new ImageIcon("src/images/hinhnen.png").getImage().getScaledInstance(lbhn.getWidth(), lbhn.getHeight(), Image.SCALE_SMOOTH));
        lbhn.setIcon(icon);
        icon = new ImageIcon(new ImageIcon("src/images/trangchu.png").getImage().getScaledInstance(80, 60, Image.SCALE_SMOOTH));
        jButton_TC.setIcon(icon);
        if(layChucVu(username).equals("Nhân Viên")){
            jButton_ThongKe.setVisible(false);
            
        }
    }
    public Main() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_MyPham = new javax.swing.JButton();
        jButton_DungCu = new javax.swing.JButton();
        jButton_ThongKe = new javax.swing.JButton();
        jButton_DangXuat = new javax.swing.JButton();
        jLabel_Keo = new javax.swing.JLabel();
        jButton_TC = new javax.swing.JButton();
        jButton_ThongTin = new javax.swing.JButton();
        jButton_TaiKhoan = new javax.swing.JButton();
        jPanelWiew = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenu.setBackground(new java.awt.Color(255, 204, 204));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MỸ PHẨM, DỤNG CỤ TIỆM CẮT TÓC");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton_MyPham.setBackground(new java.awt.Color(51, 255, 255));
        jButton_MyPham.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_MyPham.setForeground(new java.awt.Color(255, 255, 255));
        jButton_MyPham.setText("MỸ PHẨM");
        jButton_MyPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MyPhamActionPerformed(evt);
            }
        });

        jButton_DungCu.setBackground(new java.awt.Color(51, 255, 255));
        jButton_DungCu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_DungCu.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DungCu.setText("DỤNG CỤ");
        jButton_DungCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DungCuActionPerformed(evt);
            }
        });

        jButton_ThongKe.setBackground(new java.awt.Color(51, 255, 255));
        jButton_ThongKe.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_ThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThongKe.setText("THỐNG KÊ");
        jButton_ThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThongKeActionPerformed(evt);
            }
        });

        jButton_DangXuat.setBackground(new java.awt.Color(51, 255, 255));
        jButton_DangXuat.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton_DangXuat.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DangXuat.setText("ĐĂNG XUẤT");
        jButton_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DangXuatActionPerformed(evt);
            }
        });

        jButton_TC.setBackground(new java.awt.Color(153, 255, 255));
        jButton_TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TCActionPerformed(evt);
            }
        });

        jButton_ThongTin.setBackground(new java.awt.Color(51, 255, 255));
        jButton_ThongTin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_ThongTin.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ThongTin.setText("THÔNG TIN");
        jButton_ThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThongTinActionPerformed(evt);
            }
        });

        jButton_TaiKhoan.setBackground(new java.awt.Color(51, 255, 255));
        jButton_TaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton_TaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        jButton_TaiKhoan.setText("TÀI KHOẢN");
        jButton_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TaiKhoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addComponent(jButton_TC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                            .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Keo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_DungCu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_MyPham, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62)))))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_TC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jLabel_Keo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_MyPham, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_DungCu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_DangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanelWiew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelWiew.setPreferredSize(new java.awt.Dimension(0, 700));

        javax.swing.GroupLayout jPanelWiewLayout = new javax.swing.GroupLayout(jPanelWiew);
        jPanelWiew.setLayout(jPanelWiewLayout);
        jPanelWiewLayout.setHorizontalGroup(
            jPanelWiewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanelWiewLayout.setVerticalGroup(
            jPanelWiewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelWiew, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelWiew, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_MyPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MyPhamActionPerformed
        jButton_MyPham.setBackground(Color.GREEN);
        jButton_DungCu.setBackground(Color.CYAN);
        jButton_ThongKe.setBackground(Color.CYAN);
        jButton_ThongTin.setBackground(Color.CYAN);
        jButton_TaiKhoan.setBackground(Color.CYAN);
        JPanel node = new MyPham(username);
        jPanelWiew.removeAll();
        jPanelWiew.setLayout(new BorderLayout());
        jPanelWiew.add(node);
        jPanelWiew.validate();
        jPanelWiew.repaint();
    }//GEN-LAST:event_jButton_MyPhamActionPerformed

    private void jButton_DungCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DungCuActionPerformed
        jButton_MyPham.setBackground(Color.CYAN);
        jButton_DungCu.setBackground(Color.GREEN);
        jButton_ThongKe.setBackground(Color.CYAN);
        jButton_ThongTin.setBackground(Color.CYAN);
        jButton_TaiKhoan.setBackground(Color.CYAN);
        JPanel node = new DungCu(username);
        jPanelWiew.removeAll();
        jPanelWiew.setLayout(new BorderLayout());
        jPanelWiew.add(node);
        jPanelWiew.validate();
        jPanelWiew.repaint();
    }//GEN-LAST:event_jButton_DungCuActionPerformed

    private void jButton_ThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThongKeActionPerformed
        jButton_MyPham.setBackground(Color.CYAN);
        jButton_DungCu.setBackground(Color.CYAN);
        jButton_ThongTin.setBackground(Color.CYAN);
        jButton_ThongKe.setBackground(Color.GREEN);
        jButton_TaiKhoan.setBackground(Color.CYAN);
        JPanel node;
        node = new ThongKeNhapHang();
        jPanelWiew.removeAll();
        jPanelWiew.setLayout(new BorderLayout());
        jPanelWiew.add(node);
        jPanelWiew.validate();
        jPanelWiew.repaint();
            
        
        
    }//GEN-LAST:event_jButton_ThongKeActionPerformed
    
    private void jButton_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DangXuatActionPerformed
        this.dispose();
        new DangNhap().setVisible(true);
        
    }//GEN-LAST:event_jButton_DangXuatActionPerformed

    private void jButton_TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TCActionPerformed
        jButton_MyPham.setBackground(Color.CYAN);
        jButton_DungCu.setBackground(Color.CYAN);
        jButton_ThongKe.setBackground(Color.CYAN);
        jButton_ThongTin.setBackground(Color.CYAN);
        jButton_TaiKhoan.setBackground(Color.CYAN);
        jPanelWiew.removeAll();
        JLabel lbhn = new JLabel();
        lbhn.setSize(900, 750);
        jPanelWiew.add(lbhn);
        ImageIcon icon = new ImageIcon(new ImageIcon("src/images/hinhnen.png").getImage().getScaledInstance(lbhn.getWidth(), lbhn.getHeight(), Image.SCALE_SMOOTH));
        lbhn.setIcon(icon);
    }//GEN-LAST:event_jButton_TCActionPerformed

    private void jButton_ThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThongTinActionPerformed
        jButton_MyPham.setBackground(Color.CYAN);
        jButton_DungCu.setBackground(Color.CYAN);
        jButton_ThongKe.setBackground(Color.CYAN);
        jButton_ThongTin.setBackground(Color.GREEN);
        jButton_TaiKhoan.setBackground(Color.CYAN);
        JPanel node = new ThongTin(username);
        jPanelWiew.removeAll();
        jPanelWiew.setLayout(new BorderLayout());
        jPanelWiew.add(node);
        jPanelWiew.validate();
        jPanelWiew.repaint();
    }//GEN-LAST:event_jButton_ThongTinActionPerformed

    private void jButton_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TaiKhoanActionPerformed
        jButton_MyPham.setBackground(Color.CYAN);
        jButton_DungCu.setBackground(Color.CYAN);
        jButton_ThongKe.setBackground(Color.CYAN);
        jButton_TaiKhoan.setBackground(Color.GREEN);
        jButton_ThongTin.setBackground(Color.CYAN);
        JPanel node = new TaiKhoan(username);
        jPanelWiew.removeAll();
        jPanelWiew.setLayout(new BorderLayout());
        jPanelWiew.add(node);
        jPanelWiew.validate();
        jPanelWiew.repaint();
    }//GEN-LAST:event_jButton_TaiKhoanActionPerformed
    private String layChucVu(String username){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String sql = "select CHUCVU from NHANVIEN WHERE TAIKHOAN = '" + username + "'";
        String kt = "";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                kt = rs.getString("CHUCVU").trim();
            }
            ketNoi.close();
            
        }
        catch(SQLException ex){
            Logger.getLogger(ThongTinNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kt;
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DangXuat;
    private javax.swing.JButton jButton_DungCu;
    private javax.swing.JButton jButton_MyPham;
    private javax.swing.JButton jButton_TC;
    private javax.swing.JButton jButton_TaiKhoan;
    private javax.swing.JButton jButton_ThongKe;
    private javax.swing.JButton jButton_ThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Keo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelWiew;
    // End of variables declaration//GEN-END:variables
}
