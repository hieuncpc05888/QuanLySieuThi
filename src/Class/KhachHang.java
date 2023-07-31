/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author baott
 */
public class KhachHang {

    String MaKH;
    String TenKH;
    String DChi;
    String SDT;
    String Email;

    public KhachHang() {
    }

    public KhachHang(String MaKH, String TenKH, String DChi, String SDT, String Email) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.DChi = DChi;
        this.SDT = SDT;
        this.Email = Email;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getDChi() {
        return DChi;
    }

    public void setDChi(String DChi) {
        this.DChi = DChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

}
