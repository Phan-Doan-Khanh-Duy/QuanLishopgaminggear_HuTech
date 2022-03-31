/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author howl1
 */
public class frmDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form frmDangNhap
     */
    public frmDangNhap() throws SQLException {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        name23 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cc = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setLocation(new java.awt.Point(600, 200));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("LOGIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("User Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 109, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Password:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 109, -1));

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 152, 22));
        jPanel2.add(name23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 152, 22));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/login (1).png"))); // NOI18N
        jButton1.setText("ĐĂNG NHẬP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/exit.png"))); // NOI18N
        jButton2.setText("THOÁT");
        jButton2.setPreferredSize(new java.awt.Dimension(183, 41));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 175, -1));

        cc.setBackground(new java.awt.Color(255, 255, 255));
        cc.setForeground(new java.awt.Color(255, 153, 0));
        cc.setText("Hiển thị mật khẩu");
        cc.setOpaque(false);
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });
        jPanel2.add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Showroom HuTech - chuyên dòng gaming gear ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hinh/41553_technology-hd-wallpapers_2560x1600_h.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String msg = name23.getText();

        if (name23.getText().equals("") || pass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ Username va Password");

        }

        try {
            String userName = "sa"; // tài khoản trong sql
            String password = "123456"; // mk
            String url = "jdbc:sqlserver://localhost:1433;databaseName=HiuTech;"; // URL để kết nối tới CSDL , cùng với đó là tên database cu3a mi2nh
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // khai bao thư viện thôi, bắt buộc phải có này để chit ei61t e lên mạng có sẵn nguyên case luôn
            Connection conn = DriverManager.getConnection(url, userName, password); // 1 connection để gộp chung các biến trên lại 
            String sql = "Select * from Nguoidung where TaiKhoan = ? and MatKhau = ? "; // câu truy vấn
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name23.getText()); // settring đây kiểu lấy text từ trong textbox vào dấu chấm hỏi trong câu truy vấn , (số 1 là dấu chấm hỏi đầu tiên ,...)
            pst.setString(2, pass.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String textRoom = rs.getString("Chucvu");
                if (textRoom.equals("AD01")) {
                    dispose();
                    frmAdmin abc = new frmAdmin(msg);
                    abc.setVisible(true);
                    setVisible(false);
                } else if (textRoom.equals("BH01")) {
                    dispose();
                    frmNhanVien abcz = new frmNhanVien(msg);

                    abcz.setVisible(true);
                    setVisible(false);
                } else if (textRoom.equals("QLK01")) {
                    dispose();
                    frmQuanLyKho abc = new frmQuanLyKho(msg);
                    abc.setVisible(true);
                    setVisible(false);
                } else if (textRoom.equals("QLNS01")) {
                    dispose();
                    frmQuanLyNhanSu abc = new frmQuanLyNhanSu(msg);
                    abc.setVisible(true);
                    setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Không tồn tài TK hoặc MK vui lòng liên hệ Admin");
                name23.grabFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể kết nối đến SQL12");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát", "Thoát", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
        if (cc.isSelected()) {
            pass.setEchoChar((char) 0);
        } else {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_ccActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
      if(evt.getKeyCode() == KeyEvent.VK_ENTER)
       {
           String msg = name23.getText();

        if (name23.getText().equals("") || pass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ Username va Password");

        }

        try {
            String userName = "sa";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=HiuTech;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, userName, password);
            String sql = "Select * from Nguoidung where TaiKhoan = ? and MatKhau = ? ";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name23.getText());
            pst.setString(2, pass.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
               
                String textRoom = rs.getString("Chucvu");
                if (textRoom.equals("AD01")) {
                    dispose();
                    frmAdmin abc = new frmAdmin(msg);
                    abc.setVisible(true);
                    setVisible(false);
                } else if (textRoom.equals("BH01")) {
                    dispose();
                    frmNhanVien abcz = new frmNhanVien(msg);

                    abcz.setVisible(true);
                    setVisible(false);
                } else if (textRoom.equals("QLK01")) {
                    dispose();
                    frmQuanLyKho abc = new frmQuanLyKho(msg);
                    abc.setVisible(true);
                    setVisible(false);
                } else if (textRoom.equals("QLNS01")) {
                    dispose();
                    frmQuanLyNhanSu abc = new frmQuanLyNhanSu(msg);
                    abc.setVisible(true);
                    setVisible(false);
                }
             else {
                JOptionPane.showMessageDialog(null, "Không tồn tài TK hoặc MK vui lòng liên hệ Admin");
                name23.grabFocus();
            }}
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể kết nối đến SQL12");
        }

       }
    }//GEN-LAST:event_passKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        frmDangNhap f = new frmDangNhap();
        f.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name23;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
