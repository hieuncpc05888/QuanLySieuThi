/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlysieuthi;

import DatabaseHelper.DatabaseHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class LoginForm extends javax.swing.JFrame {

   

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setSize(780, 372);
        setLocationRelativeTo(null);
        setTitle("LOGIN");

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
        txtTaiKhoan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatkhau = new javax.swing.JPasswordField();
        btnGui = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("TÀI KHOẢN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 130, 66, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ĐĂNG NHẬP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 60, 120, 25);
        getContentPane().add(txtTaiKhoan);
        txtTaiKhoan.setBounds(560, 130, 170, 22);

        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("MẬT KHẨU");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 190, 66, 16);
        getContentPane().add(txtMatkhau);
        txtMatkhau.setBounds(560, 190, 170, 22);

        btnGui.setForeground(new java.awt.Color(204, 0, 0));
        btnGui.setText("GỬI");
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });
        getContentPane().add(btnGui);
        btnGui.setBounds(510, 260, 70, 23);

        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setText("THOÁT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(630, 260, 70, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/spmarket.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, -10, 460, 380);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        try {
            dangnhap();
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuiActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    public void dangnhap() throws SQLException {
        if (txtTaiKhoan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên tài khoản không được bỏ trống");
            return;
        }
        if (txtMatkhau.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được bỏ trống");
            return;
        }
        String username = txtTaiKhoan.getText();
        String password = txtMatkhau.getText();

        Connection con = DatabaseHelper.connectDb();
        Statement st = con.createStatement();
        String sql = "Select * from users where username='" + username + "' and password='" + password + "'";
        ResultSet rs = st.executeQuery(sql);
        if (rs.isBeforeFirst() == false) {
            JOptionPane.showMessageDialog(this, "Tài khoản với mật khẩu không đúng");
        } else {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            FormOption form = new FormOption();
            form.show();
            dispose();
        }
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
