/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author baott
 */
public class Nhanvien {
    String Manv;
    String Tennv;
    String NgaySinh;
    String Dchi;
    int Phai;
    double Luong;

    public Nhanvien() {
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String Tennv) {
        this.Tennv = Tennv;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDchi() {
        return Dchi;
    }

    public void setDchi(String Dchi) {
        this.Dchi = Dchi;
    }

    public int getPhai() {
        return Phai;
    }

    public void setPhai(int Phai) {
        this.Phai = Phai;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public Nhanvien(String Manv, String Tennv, String NgaySinh, String Dchi, int Phai, double Luong) {
        this.Manv = Manv;
        this.Tennv = Tennv;
        this.NgaySinh = NgaySinh;
        this.Dchi = Dchi;
        this.Phai = Phai;
        this.Luong = Luong;
    }

}