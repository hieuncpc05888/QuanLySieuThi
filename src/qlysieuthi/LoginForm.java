/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlysieuthi;

import javax.swing.JOptionPane;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class LoginForm extends javax.swing.JFrame {

    String User = "Admin";
    String Pass1 = "123";
   

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
        setSize(410,270);
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
        jCheckBox1 = new javax.swing.JCheckBox();
        btnGui = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("TÀI KHOẢN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 70, 66, 16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("ĐĂNG NHẬP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 30, 120, 25);
        getContentPane().add(txtTaiKhoan);
        txtTaiKhoan.setBounds(160, 70, 153, 22);

        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("MẬT KHẨU");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 110, 66, 16);
        getContentPane().add(txtMatkhau);
        txtMatkhau.setBounds(160, 110, 153, 22);

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Nhớ mật khẩu?");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(160, 150, 104, 20);

        btnGui.setForeground(new java.awt.Color(204, 0, 0));
        btnGui.setText("GỬI");
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });
        getContentPane().add(btnGui);
        btnGui.setBounds(170, 180, 90, 23);

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 330, 220);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/greenlogin.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-20, 0, 420, 230);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        // TODO add your handling code here:
        if (txtTaiKhoan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên tài khoản không được bỏ trống");
            return;
        }
        if (txtMatkhau.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được bỏ trống");
            return;
        }
        if (txtTaiKhoan.getText().equalsIgnoreCase(User) && txtMatkhau.getText().equals(Pass1)) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
            FormOption form = new FormOption();
            form.show();
        } else {
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại!");
            txtMatkhau.setText("");
            txtTaiKhoan.setText("");

        }
    }//GEN-LAST:event_btnGuiActionPerformed

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
    private javax.swing.JButton btnGui;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
