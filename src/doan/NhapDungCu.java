/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NhapDungCu extends javax.swing.JFrame {

    /**
     * Creates new form NhapMyPham
     */
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String maDH = "", maDC = "", tenDC = "", dateNhap = "", soLuong = "", giaTien = "";
    byte[] hinh;
    long donGia = 0, SL = 0;
    private String username;
    public NhapDungCu(String username){
        this.username = username;
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("NHẬP DỤNG CỤ");
        loadMaDC();
        jTextField_TenDC.setEditable(false);
        jTextField_GT.setEditable(false);
        jComboBox_MaDC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jComboBox_MaDC) {
                    maDC = (String) jComboBox_MaDC.getSelectedItem();
                    if(!maDC.equals("")){
                        tenDC = LayTenDC(maDC);
                        jTextField_TenDC.setText(tenDC);
                        hinh = layHinh(maDC);
                        ImageIcon icon = new ImageIcon(new ImageIcon(hinh).getImage().getScaledInstance(jLabel_Hinh.getWidth(), jLabel_Hinh.getHeight(), Image.SCALE_SMOOTH));
                        jLabel_Hinh.setIcon(icon);
                        donGia = layDonGia(maDC);
                        jTextField_SL.setText("");
                        jTextField_GT.setText("");
                    }
        }
                }
        });
    }
    public NhapDungCu() {
              initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_GT = new javax.swing.JTextField();
        jTextField_SL = new javax.swing.JTextField();
        jDateChooser_NNH = new com.toedter.calendar.JDateChooser();
        jTextField_TenDC = new javax.swing.JTextField();
        jComboBox_MaDC = new javax.swing.JComboBox<>();
        jTextField_MaDH = new javax.swing.JTextField();
        jButton_Them = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jLabel_Hinh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐƠN NHẬP DỤNG CỤ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("MÃ ĐƠN HÀNG:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("MÃ DỤNG CỤ:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("TÊN DỤNG CỤ:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("NGÀY NHẬP HÀNG:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("SỐ LƯỢNG:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("GIÁ TIỀN:");

        jTextField_GT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_GT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_GTActionPerformed(evt);
            }
        });
        jTextField_GT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_GTKeyReleased(evt);
            }
        });

        jTextField_SL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_SL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SLActionPerformed(evt);
            }
        });
        jTextField_SL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_SLKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_SLKeyTyped(evt);
            }
        });

        jTextField_TenDC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_TenDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TenDCActionPerformed(evt);
            }
        });

        jComboBox_MaDC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTextField_MaDH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField_MaDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_MaDHActionPerformed(evt);
            }
        });
        jTextField_MaDH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_MaDHKeyTyped(evt);
            }
        });

        jButton_Them.setBackground(new java.awt.Color(0, 102, 255));
        jButton_Them.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Them.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Them.setText("NHẬP ĐƠN");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jButton_Cancel.setBackground(new java.awt.Color(0, 102, 255));
        jButton_Cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel.setText("HỦY");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jLabel_Hinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel_Hinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Hinh.setText("NO IMAGE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_SL)
                            .addComponent(jDateChooser_NNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_TenDC)
                            .addComponent(jTextField_GT, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_MaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_MaDC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jLabel_Hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_MaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_MaDC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_TenDC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_NNH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_SL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_GT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 176, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Cancel)
                            .addComponent(jButton_Them))
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_MaDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_MaDHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MaDHActionPerformed

    private void jTextField_SLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SLActionPerformed

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        try {
            maDH = jTextField_MaDH.getText();
            soLuong = jTextField_SL.getText();
            giaTien = jTextField_GT.getText();
            
            if(jDateChooser_NNH.getDate() != null){
                dateNhap = sdf.format(jDateChooser_NNH.getDate());
            }   
                       
            int KTMaDH = 0, KTMaMP = 0, KTNNH = 0, KTSL = 0;
            if(maDH.equals("")){
                KTMaDH = 1;
                JOptionPane.showMessageDialog(this, "Mã Đơn Hàng Không Được Để Trống!!!");
            }
            else if(maDC.equals("")){
                KTMaMP = 1;
                JOptionPane.showMessageDialog(this, "Mã Mỹ Phẩm Không Được Để Trống!!!");
            }
            else if(jDateChooser_NNH.getDate() == null){
                KTNNH = 1;
                JOptionPane.showMessageDialog(this, "Ngày Nhập Hàng Không Được Để Trống!!!");
            }
            else if(!ChuanHoa.kiemTraDateToday(jDateChooser_NNH.getDate())){
                KTNNH = 1;
                JOptionPane.showMessageDialog(this, "Ngày Nhập Không Hợp lệ");
            }
            
            else if(soLuong.equals("")){
                KTSL = 1;
                JOptionPane.showMessageDialog(this, "Số Lượng Không Được Để Trống");
            }
            else if(KTMaDH != 1 && KTMaMP != 1 && KTSL != 1){
                int check = kiemTraDH(maDH);
                
                if(check == 1){
                    JOptionPane.showMessageDialog(this, "Đơn Hàng Đã Tồn Tại");
                }
                else{
                    luuDonHang(maDH, maDC, dateNhap, soLuong, giaTien, username);
                    themDungCu(maDC, Integer.valueOf(soLuong) + laySLDC(maDC));
                    JOptionPane.showMessageDialog(this, "Nhập Thêm Mỹ Phẩm Thành Công");
                                        
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_ThemActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jTextField_TenDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TenDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TenDCActionPerformed

    private void jTextField_GTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_GTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_GTActionPerformed

    private void jTextField_SLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SLKeyTyped
       char c = evt.getKeyChar();
       if(maDC.equals("")){
           jTextField_SL.setEditable(false);
       }
       else{
           jTextField_SL.setEditable(true);
       }
       if(!Character.isDigit(c)){
           evt.consume();
       }
       if(jTextField_SL.getText().length() >= 5){
           evt.consume();
       }
           
       
            
    }//GEN-LAST:event_jTextField_SLKeyTyped

    private void jTextField_GTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_GTKeyReleased
        
        
    }//GEN-LAST:event_jTextField_GTKeyReleased

    private void jTextField_SLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SLKeyReleased
        SL = 0;
        long Tien = 0;
        try {
            SL = Long.valueOf(jTextField_SL.getText());
        } catch (NumberFormatException e) {
        }
        Tien = donGia * SL;
        jTextField_GT.setText(String.valueOf(Tien));
    }//GEN-LAST:event_jTextField_SLKeyReleased

    private void jTextField_MaDHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MaDHKeyTyped
        char c = evt.getKeyChar();
        if(jTextField_MaDH.getText().length() >= 10){
           evt.consume();
       }
    }//GEN-LAST:event_jTextField_MaDHKeyTyped
    private void luuDonHang(String maDH, String maMP, String dateNhap, String soLuong, String giaTien, String user){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String sql = "INSERT INTO NHAPDUNGCU VALUES (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ps.setString(1, maDH);
            ps.setString(2, maMP);
            ps.setString(3, dateNhap);
            ps.setString(4, soLuong);
            ps.setString(5, giaTien);
            ps.setString(6, user);
            ps.executeUpdate();
            
        }
        catch(SQLException ex){
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private int laySLDC(String maDC){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        int SL = 0;
        String sql = "select SLDCT from TINHTRANGDUNGCU where MADUNGCU = '" + maDC + "'";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SL = rs.getInt("SLDCT");
            }
            ketNoi.close();
        }
        catch(SQLException ex){
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return SL;
    }
    private void loadMaDC(){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String sql = "select * from DUNGCU";
        jComboBox_MaDC.addItem("");
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                jComboBox_MaDC.addItem(rs.getString("MADUNGCU"));
            }
            ketNoi.close();
            
        }
        catch(SQLException ex){
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void themDungCu(String maDC, int SL){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String sql = "UPDATE TINHTRANGDUNGCU SET SLDCT = ? WHERE MADUNGCU = ?";
        PreparedStatement ps;
        try {
            ps = ketNoi.prepareStatement(sql);
            ps.setInt(1, SL);
            ps.setString(2, maDC);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private long layDonGia(String maDC){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        long donGia = 0;
        String sql = "select DONGIA from DUNGCU where MADUNGCU = '" + maDC + "'";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                donGia = rs.getLong("DONGIA");
            }
            ketNoi.close();
        }
        catch(SQLException ex){
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donGia;
    }
    private String LayTenDC(String maDC){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        String ten = "";
        String sql = "select TENDUNGCU from DUNGCU where MADUNGCU = '" + maDC + "'";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ten = rs.getString("TENDUNGCU");
            }
            ketNoi.close();
        }
        catch(SQLException ex){
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ten;
    }
    private byte[] layHinh(String maDC){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        byte[] hinh = null;
        String sql = "select HINHANH from DUNGCU where MADUNGCU = '" + maDC + "'";
        try{
            PreparedStatement ps = ketNoi.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                hinh = rs.getBytes("HINHANH");
            }
            ketNoi.close();
        }
        catch(SQLException ex){
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hinh;
    }
    private int kiemTraDH(String maDH){
        Connection ketNoi = KetNoiSQL.layKetNoi();
        int tontai = 0;
        String sql = "select * from NHAPDUNGCU where MADONHANG = '" + maDH + "'";
        try{
            try (PreparedStatement ps = ketNoi.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                while(rs.next()){
                    tontai = 1;
                }
            }
            ketNoi.close();
        }
        catch(SQLException ex){
            Logger.getLogger(NhapDungCu.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(NhapDungCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapDungCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapDungCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapDungCu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NhapDungCu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Them;
    private javax.swing.JComboBox<String> jComboBox_MaDC;
    private com.toedter.calendar.JDateChooser jDateChooser_NNH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Hinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_GT;
    private javax.swing.JTextField jTextField_MaDH;
    private javax.swing.JTextField jTextField_SL;
    private javax.swing.JTextField jTextField_TenDC;
    // End of variables declaration//GEN-END:variables
}
