/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlysieuthi;
import static java.lang.ProcessHandle.current; // Move

import Class.HangVaKho;
import Class.Hoadon;
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
public class QLHoaDon extends javax.swing.JFrame {

    List<Hoadon> list = new ArrayList<>();
    //    int current = 0;
    //    int index = 0;

    /**
     * Creates new form QLSieuThi
     */
    public QLHoaDon() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quan Ly Hoa Don");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMahd = new javax.swing.JTextField();
        txtMahh = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnCapnhat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNgay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDongia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Hóa Đơn");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 18, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã Hóa Đơn");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Số Lượng");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Đơn Giá");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        getContentPane().add(txtMahd, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 70, 213, -1));
        getContentPane().add(txtMahh, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 110, 213, -1));
        getContentPane().add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 150, 213, -1));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-new-ticket-20.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 160, -1));

        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-update-20.png"))); // NOI18N
        btnCapnhat.setText("Cập Nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Ngày Lập Hóa Đơn");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, -1));
        getContentPane().add(txtNgay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 213, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-avatar.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Mã NV");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, -1));

        txtDongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDongiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDongia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 213, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Mã KH");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 40, -1));
        getContentPane().add(txtMakh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 213, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-exit-30.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 660, 107, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Mã Hàng Hóa");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 150, 213, -1));
        getContentPane().add(txtManv, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Thành tiền");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 356, 64, -1));

        txtThanhTien.setEditable(false);
        getContentPane().add(txtThanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 353, 213, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-back-30.png"))); // NOI18N
        btnBack.setText("Trở về");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 110, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, 205));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-update-20.png"))); // NOI18N
        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 160, -1));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-delete-20.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 160, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/hoa don.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 450));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/Background-xanh-duong-nhat.jpeg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 610, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDongiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDongiaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            if (check()) {
                insertEmployee();
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        FormOption f = new FormOption();
        f.show();
        this.hide();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        capNhat();
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        displayFrom();
    }//GEN-LAST:event_tblDataMouseClicked

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
            String SQL = "Insert into HOADON values(?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, txtMahd.getText());
            st.setString(2, txtMahh.getText());
            st.setInt(3, Integer.parseInt(txtSoluong.getText()));
            st.setDouble(4, Double.parseDouble(txtDongia.getText()));
            st.setString(5, txtNgay.getText());
            st.setString(6, txtManv.getText());
            st.setString(7, txtMakh.getText());
            double thanhtien = (Integer.parseInt(txtSoluong.getText())) * (Double.parseDouble(txtDongia.getText()));
            st.setDouble(8, thanhtien);
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
            String SQL = "select * from HOADON";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            String[] columnNames = {"MAHD", "MAHH", "SOLUONG", "DONGIA", "NGAYLAPHOADON", "MANV", "MAKH", "THANHTIEN"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {

                model.addRow(new Object[]{rs.getString("MAHD"), rs.getString("MAHH"), rs.getInt("SOLUONG"), rs.getDouble("DONGIA"), rs.getDate("NGAYLAPHOADON"), rs.getString("MANV"), rs.getString("MAKH"), rs.getDouble("THANHTIEN")});
            }
            tblData.setModel(model);
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi");
            e.printStackTrace();
        }
    }

    public void displayFrom() {
        int index = tblData.getSelectedRow();
        Hoadon nv = new Hoadon();
        txtMahd.setText(tblData.getValueAt(index, 0).toString());
        txtMahh.setText(tblData.getValueAt(index, 1).toString());
        txtSoluong.setText(tblData.getValueAt(index, 2).toString());
        txtDongia.setText(tblData.getValueAt(index, 3).toString());
        txtNgay.setText(tblData.getValueAt(index, 4).toString());
        txtManv.setText(tblData.getValueAt(index, 5).toString());
        txtMakh.setText(tblData.getValueAt(index, 6).toString());
        txtThanhTien.setText(tblData.getValueAt(index, 7).toString());

        txtMahd.setEditable(false);
    }

    public void capNhat() {
        if (txtMahd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập Mã Hóa Đơn");
            txtMahd.requestFocus();
            return;
        }
        try {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "Update HOADON set MAHH = ?, SOLUONG = ?,DONGIA = ?,NGAYLAPHOADON = ?, MANV = ?, MAKH = ?, THANHTIEN = ? where MAHD = ?";
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, txtMahh.getText());
            st.setInt(2, Integer.parseInt(txtSoluong.getText()));
            st.setDouble(3, Double.parseDouble(txtDongia.getText()));
            st.setString(4, txtNgay.getText());
            st.setString(5, txtManv.getText());
            st.setString(6, txtMakh.getText());
            double thanhtien = (Integer.parseInt(txtSoluong.getText())) * (Double.parseDouble(txtDongia.getText()));
            st.setDouble(7, thanhtien);
            st.setString(8, txtMahd.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            con.close();
            loadData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean check() throws SQLException {
        if (txtMahd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã hóa đơn không được bỏ trống", "Chu y", 1);
            txtMahd.requestFocus();
            return false;
        } else {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "select * from HOADON where MAHD=?";
            PreparedStatement pr = con.prepareStatement(SQL);
            pr.setString(1, txtMahd.getText());
            ResultSet rs = pr.executeQuery();

            if (rs.isBeforeFirst() == false) {
                //chưa có mã
                pr.execute();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mã hóa đơn đã tồn tại");
            }

        }

        if (txtMahh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã hàng hóa không được bỏ trống", "Chu y", 1);
            txtMahh.requestFocus();
            return false;

        }
        if (txtSoluong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số lượng không được bỏ trống", "Chu y", 1);
            txtSoluong.requestFocus();
            return false;
        }
        if (txtDongia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Đơn giá không được bỏ trống", "Chu y", 1);
            txtDongia.requestFocus();
            return false;
        }
        if (txtNgay.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày mua hàng không được để trống ", "Chu y", 1);
            txtNgay.requestFocus();
            return false;
        }
        if (txtNgay.getText().matches("^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))") == false) {
            JOptionPane.showMessageDialog(this, "Ngày mua hàng không đúng định dạng (yyyy-MM-dd)", "Chu y", 1);
            txtNgay.requestFocus();
            return false;
        }
        if (txtManv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên không được bỏ trống", "Chu y", 1);
            txtManv.requestFocus();
            return false;
        }
        if (txtMakh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã khách hàng không được bỏ trống", "Chu y", 1);
            txtMakh.requestFocus();
            return false;
        }
        return true;
    }

    public void reset() {
        txtManv.setText("");
        txtMahd.setText("");
        txtMahh.setText("");
        txtNgay.setText("");
        txtSoluong.setText("");
        txtDongia.setText("");
        txtMakh.setText("");
        txtThanhTien.setText("");
        txtMahd.setEditable(true);
    }

    public void xoa() {
        Hoadon emp = new Hoadon();
        emp.setMahh(txtMahd.getText());
        try {

            Connection con = DatabaseHelper.connectDb();
            String sql = "delete from HOADON where MAHD=?";
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
            java.util.logging.Logger.getLogger(QLHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLHoaDon().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtDongia;
    private javax.swing.JTextField txtMahd;
    private javax.swing.JTextField txtMahh;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
