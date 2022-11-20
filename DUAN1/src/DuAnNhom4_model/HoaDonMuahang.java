/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author TRAN VAN DUONG
 */
public class HoaDonMuahang {
    String IDHoaDonMuaHang;
    NhanVien IDNhanVien;
    KhuyenMai IDKhuyenMai;
    int SoLuong;
    Date NgayTaoHoaDon;
    String MaKhuyenMai;
    BigDecimal TongTien;
    int TrangThai;

    public HoaDonMuahang() {
    }

    public HoaDonMuahang(String IDHoaDonMuaHang, NhanVien IDNhanVien, KhuyenMai IDKhuyenMai, int SoLuong, Date NgayTaoHoaDon, String MaKhuyenMai, BigDecimal TongTien, int TrangThai) {
        this.IDHoaDonMuaHang = IDHoaDonMuaHang;
        this.IDNhanVien = IDNhanVien;
        this.IDKhuyenMai = IDKhuyenMai;
        this.SoLuong = SoLuong;
        this.NgayTaoHoaDon = NgayTaoHoaDon;
        this.MaKhuyenMai = MaKhuyenMai;
        this.TongTien = TongTien;
        this.TrangThai = TrangThai;
    }

    public String getIDHoaDonMuaHang() {
        return IDHoaDonMuaHang;
    }

    public void setIDHoaDonMuaHang(String IDHoaDonMuaHang) {
        this.IDHoaDonMuaHang = IDHoaDonMuaHang;
    }

    public NhanVien getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(NhanVien IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public KhuyenMai getIDKhuyenMai() {
        return IDKhuyenMai;
    }

    public void setIDKhuyenMai(KhuyenMai IDKhuyenMai) {
        this.IDKhuyenMai = IDKhuyenMai;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Date getNgayTaoHoaDon() {
        return NgayTaoHoaDon;
    }

    public void setNgayTaoHoaDon(Date NgayTaoHoaDon) {
        this.NgayTaoHoaDon = NgayTaoHoaDon;
    }

    public String getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(String MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public BigDecimal getTongTien() {
        return TongTien;
    }

    public void setTongTien(BigDecimal TongTien) {
        this.TongTien = TongTien;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "HoaDonMuahang{" + "IDHoaDonMuaHang=" + IDHoaDonMuaHang + ", IDNhanVien=" + IDNhanVien + ", IDKhuyenMai=" + IDKhuyenMai + ", SoLuong=" + SoLuong + ", NgayTaoHoaDon=" + NgayTaoHoaDon + ", MaKhuyenMai=" + MaKhuyenMai + ", TongTien=" + TongTien + ", TrangThai=" + TrangThai + '}';
    }
    
}
