/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlysieuthi;

import static java.lang.ProcessHandle.current; // Move

import Class.Nhanvien;
import DatabaseHelper.DatabaseHelper;
import com.sun.jdi.Value;
import static java.lang.ProcessHandle.current;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NGUYEN CHI HIEU
 */
public class QLNhanVien extends javax.swing.JFrame {

    ArrayList<Nhanvien> list = new ArrayList<Nhanvien>();
    int current = 0;
//    int index = 0;
    Vector data = new Vector();

    /**
     * Creates new form QLSieuThi
     */
    public QLNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quan Ly Nhan Vien");
        setSize(560, 655);
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

        btgGioitinh = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        txtTennv = new javax.swing.JTextField();
        txtNgaysinh = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnCapnhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnReset = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Quản Lý Nhân Viên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 180, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Mã NV");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 64, 50, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên NV");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 101, 50, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ngày Sinh");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 141, 60, -1));
        getContentPane().add(txtManv, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 61, 220, -1));
        getContentPane().add(txtTennv, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 101, 220, -1));
        getContentPane().add(txtNgaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 141, 220, -1));

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-new-ticket-20.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 110, -1));

        btnCapnhat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-update-20.png"))); // NOI18N
        btnCapnhat.setText("Cập Nhật");
        btnCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapnhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 110, -1));

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-delete-20.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Địa chỉ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 182, 50, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-avatar.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Phái");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 37, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Lương");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 37, -1));
        getContentPane().add(txtLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 220, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-exit-30.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, 30));

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 220, 80));

        btgGioitinh.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNu.setForeground(new java.awt.Color(255, 0, 102));
        rdoNu.setText("Nữ");
        getContentPane().add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 50, -1));

        btgGioitinh.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdoNam.setForeground(new java.awt.Color(255, 0, 51));
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });
        getContentPane().add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-back-30.png"))); // NOI18N
        btnBack.setText("Trở về");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 100, 30));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 560, 170));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/icons8-save-20.png"))); // NOI18N
        btnReset.setText("Làm mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 110, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/ky-nang-quan-ly-nhan-vien.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 360));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlysieuthi/IMG/Background-xanh-duong-nhat.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 560, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

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
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhatActionPerformed
        // TODO add your handling code here:
        capNhat();
    }//GEN-LAST:event_btnCapnhatActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        displayFrom();
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa hay không!");
        if (check == 0) {
            xoa();
            reset();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    public void insertEmployee() {
        try {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "Insert into NHANVIEN values(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, txtManv.getText());
            st.setString(2, txtTennv.getText());
            st.setString(3, txtNgaysinh.getText());
            st.setString(4, txtDiachi.getText());
            boolean gt;
            if (rdoNam.isSelected()) {
                gt = true;
            } else {
                gt = false;
            }
            st.setBoolean(5, gt);
            st.setDouble(6, Double.parseDouble(txtLuong.getText()));
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
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
            String SQL = "select * from NHANVIEN";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            String[] columnNames = {"MANV", "TENNV", "NGSINH", "DCHI", "PHAI", "LUONG"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {
                int Phai = rs.getInt("Phai");
                String gt = "";
                if (Phai == 1) {
                    gt = "Nam";
                } else {
                    gt = "Nu";
                }
                model.addRow(new Object[]{rs.getString("MANV"), rs.getString("TENNV"), rs.getDate("NGSINH"), rs.getString("DCHI"), gt, rs.getDouble("Luong")});
            }
            tblData.setModel(model);
        } catch (SQLException e) {
            System.out.println("Kết nối lỗi");
            e.printStackTrace();
        }
    }

    public void xoa() {
        Nhanvien emp = new Nhanvien();
        emp.setManv(txtManv.getText());
        try {

            Connection con = DatabaseHelper.connectDb();
            System.out.println("Ket noi thanh cong");
            String sql = "delete from NHANVIEN where Manv=?";

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
        Nhanvien nv = new Nhanvien();
        txtManv.setText(tblData.getValueAt(index, 0).toString());
        txtTennv.setText(tblData.getValueAt(index, 1).toString());
        txtNgaysinh.setText(tblData.getValueAt(index, 2).toString());
        txtDiachi.setText(tblData.getValueAt(index, 3).toString());
        switch (tblData.getValueAt(index, 4).toString()) {
            case "Nam":
                rdoNam.setSelected(true);
                break;
            case "Nu":
                rdoNu.setSelected(true);
                break;
            default:
                btgGioitinh.clearSelection();
        }
        txtLuong.setText(tblData.getValueAt(index, 5).toString());
        txtManv.setEditable(false);
    }

    public void capNhat() {
        if (txtManv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập Mã Nhân Viên");
            txtManv.requestFocus();
            return;
        }
        try {
            Connection con = DatabaseHelper.connectDb();
            String SQL = "Update NHANVIEN set TENNV = ?,NGSINH = ?,DCHI = ?,PHAI = ?,LUONG = ? where MANV = ?";
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, txtTennv.getText());
            st.setString(2, txtNgaysinh.getText());
            st.setString(3, txtDiachi.getText());
            boolean gt;
            if (rdoNam.isSelected()) {
                gt = true;
            } else {
                gt = false;
            }
            st.setBoolean(4, gt);
            st.setDouble(5, Double.parseDouble(txtLuong.getText()));
            st.setString(6, txtManv.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            con.close();
            loadData();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean check() throws SQLException {
        if (txtManv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không được bỏ trống", "Chu y", 1);
            txtManv.requestFocus();
            return false;
        } else {
            Connection con = DatabaseHelper.connectDb();
            System.out.println("Kết nối thành công");
            String SQL = "select * from NHANVIEN where manv=?";
            PreparedStatement pr = con.prepareStatement(SQL);
            pr.setString(1, txtManv.getText());
            ResultSet rs = pr.executeQuery();

            if (rs.isBeforeFirst() == false) {
                //chưa có mã
                pr.execute();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Mã đã tồn tại");
            }

        }
        if (txtTennv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không được bỏ trống", "Chu y", 1);
            txtTennv.requestFocus();
            return false;
        }
        if (txtTennv.getText().matches("^[^!-@]+$") == false) {
            JOptionPane.showMessageDialog(this, "Tên không đúng định dạng ", "Chu y", 1);
            txtTennv.requestFocus();
            return false;
        }

        if (txtNgaysinh.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống ", "Chu y", 1);
            txtNgaysinh.requestFocus();
            return false;
        }
        if (txtNgaysinh.getText().matches("^([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))") == false) {
            JOptionPane.showMessageDialog(this, "Ngày sinh không đúng định dạng (yyyy-MM-dd)", "Chu y", 1);
            txtNgaysinh.requestFocus();
            return false;
        }
        if (txtDiachi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Địa chỉ không được để trống ", "Chu y", 1);
            txtDiachi.requestFocus();
            
            return false;
        }
        if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
            JOptionPane.showMessageDialog(this, "Chưa chọn giới tính");
            return false;
        }
        if (txtLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lương không được để trống ", "Chu y", 1);
            txtLuong.requestFocus();
            return false;
        }
         try {
            Double.parseDouble(txtLuong.getText());
           
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lương phải là số");
            return false;
            
        }
        return true;
    }

    public void reset() {
        txtManv.setText("");
        txtDiachi.setText("");
        txtLuong.setText("");
        txtNgaysinh.setText("");
        txtTennv.setText("");
        txtManv.setEditable(true);
        btgGioitinh.clearSelection();
    }
    
     public void Display(int i) {
        
        Nhanvien nv = new Nhanvien();
        txtManv.setText(tblData.getValueAt(i, 0).toString());
        txtTennv.setText(tblData.getValueAt(i, 1).toString());
        txtNgaysinh.setText(tblData.getValueAt(i, 2).toString());
        txtDiachi.setText(tblData.getValueAt(i, 3).toString());
        switch (tblData.getValueAt(i, 4).toString()) {
            case "Nam":
                rdoNam.setSelected(true);
                break;
            case "Nu":
                rdoNu.setSelected(true);
                break;
            default:
                btgGioitinh.clearSelection();
        }
        txtLuong.setText(tblData.getValueAt(i, 5).toString());
    }
     
//        public void dau() {
//        current = 0;
//        Display(current);
//    }
//
//    public void lui() {
//        if (current == 0) {
//            JOptionPane.showMessageDialog(this, "Đang ở đầu dang sách");
//            return;
//        } else {
//            current--;
//            if (current < 0) {
//                return;
//            }
//            Display(current);
//        }
//    }
//
//    public void tiep() {
//        if (current == list.size() - 1) {
//            JOptionPane.showMessageDialog(this, "Đang ở cuối dang sách");
//            return;
//        } else {
//            current++;
//            if (current >= list.size()) {
//                JOptionPane.showMessageDialog(this, "Đang ở đầu dang sách");
//                return;
//            }
//            Display(current);
//        }
//    }
//
//    public void cuoi() {
//        current = list.size() - 1;
//        Display(current);
//    }

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
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGioitinh;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCapnhat;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblData;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtNgaysinh;
    private javax.swing.JTextField txtTennv;
    // End of variables declaration//GEN-END:variables

}
