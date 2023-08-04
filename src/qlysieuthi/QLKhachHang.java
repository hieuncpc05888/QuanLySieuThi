/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlysieuthi;
import static java.lang.ProcessHandle.current; // Move

import Class.KhachHang;
import Class.Nhanvien;
import DatabaseHelper.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class QLKhachHang extends javax.swing.JFrame {

    List<KhachHang> listkh = new ArrayList<>();
    int index;
    //    int current = 0;
    //    int index = 0;

    /**
     * Creates new form QLSieuThi
     */
    public QLKhachHang() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quan Ly Khach Hang");
        loadData();
        //        Display(current);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        txtTenkh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnCapnhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Quản Lý Khách Hàng");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 179, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã Khách hàng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 73, 93, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên Khách hàng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 113, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Số điện thoại");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 267, -1, -1));
        getContentPane().add(txtMakh, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 70, 213, -1));
        getContentPane().add(txtTenkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 110, 213, -1));
        getContentPane().add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 264, 213, -1));

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-new-ticket-20.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 160, 110, -1));

        btnCapnhat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-update-20.png"))); // NOI18N
        btnCapnhat.setText("Cập Nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 212, 110, -1));

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-delete-20.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 264, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 308, 37, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 305, 213, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-avatar.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Địa chỉ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 162, 40, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-exit-30.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 100, 30));

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 160, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-back-30.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 100, 30));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 160));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-update-20.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 100, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/qly khach hang.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FormOption f = new FormOption();
        f.show();
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            if (check()) {
                insertEmployee();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        // TODO add your handling code here:
        capNhat();
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa hay không");
        if (check == 0) {
            xoa();
            reset();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        displayFrom();
    }//GEN-LAST:event_tblDataMouseClicked

    public void insertEmployee() {
        try {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "Insert into KHACHHANG values(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, txtMakh.getText());
            st.setString(2, txtTenkh.getText());
            st.setString(3, txtDiachi.getText());
            st.setString(4, txtSDT.getText());
            st.setString(5, txtEmail.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            con.close();
            loadData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void loadData() {
        try {
            Connection con = DatabaseHelper.connectDb();
            System.out.println("Kết nối thành công");
            String SQL = "select * from KHACHHANG";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            String[] columnNames = {"MAKH", "TENKH", "DCHI", "DIENTHOAI", "EMAIL"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("MAKH"), rs.getString("TENKH"), rs.getString("DCHI"), rs.getString("DIENTHOAI"), rs.getString("EMAIL")});
            }
            tblData.setModel(model);
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi");
            e.printStackTrace();
        }
    }

    public void xoa() {
        Nhanvien emp = new Nhanvien();
        emp.setManv(txtMakh.getText());
        try {

            Connection con = DatabaseHelper.connectDb();
            System.out.println("ket noi thanh cong");
            String sql = "delete from KHACHHANG where MAKH=?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, emp.getManv());
            int rs = stmt.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Xóa thanh công!!!");
                loadData();
            } else {
                JOptionPane.showMessageDialog(null, "Xóa thất bại!!!");
            }

        } catch (SQLException e) {
            System.out.println("ket noi loi");
            e.printStackTrace();
        }

    }

    public void displayFrom() {
        int index = tblData.getSelectedRow();
        KhachHang nv = new KhachHang();
        txtMakh.setText(tblData.getValueAt(index, 0).toString());
        txtTenkh.setText(tblData.getValueAt(index, 1).toString());
        txtDiachi.setText(tblData.getValueAt(index, 2).toString());
        txtSDT.setText(tblData.getValueAt(index, 3).toString());
        txtEmail.setText(tblData.getValueAt(index, 4).toString());

        txtMakh.setEditable(false);
    }

    public void capNhat() {
        if (txtMakh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập Mã Khách Hàng");
            txtMakh.requestFocus();
            return;
        }
        try {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "Update KHACHHANG set TENKH = ?,DCHI = ?,DIENTHOAI = ?,EMAIL = ? where MAKH = ?";
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, txtTenkh.getText());
            st.setString(2, txtDiachi.getText());
            st.setString(3, txtSDT.getText());
            st.setString(4, txtEmail.getText());
            st.setString(5, txtMakh.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            con.close();
            loadData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean check() throws SQLException {
        if (txtMakh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không được bỏ trống", "Chu y", 1);
            txtMakh.requestFocus();
            return false;
        } else {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "select * from KHACHHANG where MAKH=?";
            PreparedStatement pr = con.prepareStatement(SQL);
            pr.setString(1, txtMakh.getText());
            ResultSet rs = pr.executeQuery();

            if (rs.isBeforeFirst() == false) {
                //chưa có mã
                pr.execute();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mã khách hàng đã tồn tại");
            }

        }
        if (txtTenkh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không được bỏ trống", "Chu y", 1);
            txtTenkh.requestFocus();
            return false;
        }
        if (txtTenkh.getText().matches("^[^!-@]+$") == false) {
            JOptionPane.showMessageDialog(this, "Tên không đúng định dạng ", "Chu y", 1);
            txtTenkh.requestFocus();
            return false;
        }

        if (txtDiachi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống ", "Chu y", 1);
            txtDiachi.requestFocus();
            return false;
        }

        if (txtSDT.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống", "Chu y", 1);
            txtSDT.requestFocus();
            return false;
        }
        if (txtSDT.getText().matches("^0[0-9]{9}$") == false) {
            JOptionPane.showMessageDialog(this, "Số điện thoại phải đủ 10 số và bắt đầu bằng 0", "Chu y", 1);
            txtSDT.requestFocus();
            return false;
        }
        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Email không được để trống ", "Chu y", 1);
            txtEmail.requestFocus();
            return false;
        }
        if (txtEmail.getText().matches("^[a-zA-Z]{1}[0-9a-zA-Z]+@[0-9a-zA-Z]+\\.\\w+.\\w+") == false) {
            JOptionPane.showMessageDialog(this, "Email không đúng định dạng(VD:bao@fpt.edu.vn hoặc bao@gmail.com)", "Chu y", 1);
            txtEmail.requestFocus();
            return false;
        }
        return true;
    }

    public void reset() {
        txtMakh.setText("");
        txtDiachi.setText("");
        txtEmail.setText("");
        txtSDT.setText("");
        txtTenkh.setText("");
        txtMakh.setEditable(true);

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
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new QLKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenkh;
    // End of variables declaration//GEN-END:variables
}
