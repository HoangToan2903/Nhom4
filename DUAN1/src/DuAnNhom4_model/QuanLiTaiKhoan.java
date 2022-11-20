/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

/**
 *
 * @author TRAN VAN DUONG
 */
public class QuanLiTaiKhoan {
    KhachHang IDKhachHang;
    NhanVien IDNhanVien;
    String TenTaiKhoan;
    String MatKhau;
    int TrangThai;

    public QuanLiTaiKhoan() {
    }

    public QuanLiTaiKhoan(KhachHang IDKhachHang, NhanVien IDNhanVien, String TenTaiKhoan, String MatKhau, int TrangThai) {
        this.IDKhachHang = IDKhachHang;
        this.IDNhanVien = IDNhanVien;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.TrangThai = TrangThai;
    }

    public KhachHang getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(KhachHang IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public NhanVien getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(NhanVien IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "QuanLiTaiKhoan{" + "IDKhachHang=" + IDKhachHang + ", IDNhanVien=" + IDNhanVien + ", TenTaiKhoan=" + TenTaiKhoan + ", MatKhau=" + MatKhau + ", TrangThai=" + TrangThai + '}';
    }
    
}
