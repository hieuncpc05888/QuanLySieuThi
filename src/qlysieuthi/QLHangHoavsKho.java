/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlysieuthi;

import static java.lang.ProcessHandle.current; // Move

import Class.HangVaKho;
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
public class QLHangHoavsKho extends javax.swing.JFrame {

    List<HangVaKho> list = new ArrayList<>();
    //    int current = 0;
    //    int index = 0;

    /**
     * Creates new form QLHangHoavsKho
     */
    public QLHangHoavsKho() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quan Ly Hang Hoa");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMahh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMakhuvuc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMakho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnCapnhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        cboLoai = new javax.swing.JComboBox<>();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Quản Lý Hàng Hóa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Mã Hàng Hóa");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 83, -1));
        getContentPane().add(txtMahh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 68, 297, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Tên hàng hóa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, -1));
        getContentPane().add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 107, 299, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Mã Khu Vực");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 83, -1));
        getContentPane().add(txtMakhuvuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 147, 299, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("Mã Kho");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 55, -1));
        getContentPane().add(txtMakho, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 188, 299, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Loại Kho");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 60, -1));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-new-ticket-20.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 130, -1));

        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-update-20.png"))); // NOI18N
        btnCapnhat.setText("Cập Nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 130, -1));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-delete-20.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 130, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-avatar.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 68, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-exit-30.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 100, 30));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-back-30.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 593, 100, 30));

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
        jScrollPane1.setViewportView(tblData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 392, 701, 164));

        cboLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kho đông lạnh", "Kho sản phẩm", "Kho trung chuyển", "Kho làm mát" }));
        getContentPane().add(cboLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 299, -1));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-update-20.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 130, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/kho.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 650));

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
            if (check()) {
                insertEmployee();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLHangHoavsKho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        displayFrom();
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        // TODO add your handling code here:
        capNhat();
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa hay không");
        if (check == 0) {
            xoa();
            reset();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    public void insertEmployee() {
        try {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "Insert into HANGHOA values(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, txtMahh.getText());
            st.setString(2, txtTen.getText());
            st.setString(3, txtMakhuvuc.getText());
            st.setString(4, txtMakho.getText());
            String loai = (String) cboLoai.getSelectedItem().toString();
            st.setString(5, loai);

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
            String SQL = "select * from HANGHOA";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            String[] columnNames = {"MAHH", "TENHH", "MAKV", "MAKHO", "LOAIKHO"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("MAHH"), rs.getString("TENHH"), rs.getString("MAKV"), rs.getString("MAKHO"), rs.getString("LOAIKHO")});
            }
            tblData.setModel(model);
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi");
            e.printStackTrace();
        }
    }
//

    public void xoa() {
        HangVaKho emp = new HangVaKho();
        emp.setMahh(txtMahh.getText());
        try {

            Connection con = DatabaseHelper.connectDb();
            System.out.println("ket noi thanh cong");
            String sql = "delete from HANGHOA where MAHH=?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, emp.getMahh());
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

        txtMahh.setText(tblData.getValueAt(index, 0).toString());
        txtTen.setText(tblData.getValueAt(index, 1).toString());
        txtMakhuvuc.setText(tblData.getValueAt(index, 2).toString());
        txtMakho.setText(tblData.getValueAt(index, 3).toString());
        cboLoai.setSelectedItem(tblData.getValueAt(index, 4).toString());
        txtMahh.setEditable(false);
    }

    public void capNhat() {
        if (txtMahh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập Mã Nhân Viên");
            txtMahh.requestFocus();
            return;
        }
        try {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "Update HANGHOA set TENHH = ?,MAKV = ?,MAKHO = ?,LOAIKHO = ? where MAHH = ?";
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, txtTen.getText());
            st.setString(2, txtMakhuvuc.getText());
            st.setString(3, txtMakho.getText());
            String loai = (String) cboLoai.getSelectedItem().toString();
            st.setString(4, loai);
            st.setString(5, txtMahh.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            con.close();
            loadData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean check() throws SQLException {
        if (txtMahh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã hàng hóa không được bỏ trống", "Chu y", 1);
            txtMahh.requestFocus();
            return false;
        } else {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "select * from HANGHOA where MAHH=?";
            PreparedStatement pr = con.prepareStatement(SQL);
            pr.setString(1, txtMahh.getText());
            ResultSet rs = pr.executeQuery();

            if (rs.isBeforeFirst() == false) {
                //chưa có mã
                pr.execute();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mã hàng hóa đã tồn tại");
            }

        }

        if (txtTen.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên hàng hóa không được bỏ trống", "Chu y", 1);
            txtTen.requestFocus();
            return false;
        }

        if (txtMakhuvuc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã khu vực không được bỏ trống", "Chu y", 1);
            txtMakhuvuc.requestFocus();
            return false;
        }

        if (txtMakho.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã kho không được bỏ trống", "Chu y", 1);
            txtMakho.requestFocus();
            return false;
        }

        return true;
    }

    public void reset() {
        txtMahh.setText("");
        txtMakho.setText("");
        txtMakhuvuc.setText("");
        txtTen.setText("");
        cboLoai.setSelectedIndex(0);
        txtMahh.setEditable(true);
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
            java.util.logging.Logger.getLogger(QLHangHoavsKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLHangHoavsKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLHangHoavsKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLHangHoavsKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLHangHoavsKho().setVisible(true);
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
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtMahh;
    private javax.swing.JTextField txtMakho;
    private javax.swing.JTextField txtMakhuvuc;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
