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
public class HoaDonDatHang {
    String IDHoaDonDatHang;
    NhanVien IDNhanVien;
    KhachHang IDKhachHang;
    SanPham IDSanPham;
    GioHang IDGioHang;
    KhuyenMai IDKhuyenMai;
    Date NgayTaoHoaDon;
    Date NgayDuTinh;
    Date NgayGiaoHang;
    Date NgayNhanHang;
    Date NgayThanhToan;
    String TenSanPham;
    int SoLuong;
    BigDecimal DonGia;
    String MaKhuyenMai;
    BigDecimal ThanhTien;
    String TenNguoiNhan;
    String DiaChi;
    String SoDienThoai;
    int TrangThai;

    public HoaDonDatHang() {
    }

    public HoaDonDatHang(String IDHoaDonDatHang, NhanVien IDNhanVien, KhachHang IDKhachHang, SanPham IDSanPham, GioHang IDGioHang, KhuyenMai IDKhuyenMai, Date NgayTaoHoaDon, Date NgayDuTinh, Date NgayGiaoHang, Date NgayNhanHang, Date NgayThanhToan, String TenSanPham, int SoLuong, BigDecimal DonGia, String MaKhuyenMai, BigDecimal ThanhTien, String TenNguoiNhan, String DiaChi, String SoDienThoai, int TrangThai) {
        this.IDHoaDonDatHang = IDHoaDonDatHang;
        this.IDNhanVien = IDNhanVien;
        this.IDKhachHang = IDKhachHang;
        this.IDSanPham = IDSanPham;
        this.IDGioHang = IDGioHang;
        this.IDKhuyenMai = IDKhuyenMai;
        this.NgayTaoHoaDon = NgayTaoHoaDon;
        this.NgayDuTinh = NgayDuTinh;
        this.NgayGiaoHang = NgayGiaoHang;
        this.NgayNhanHang = NgayNhanHang;
        this.NgayThanhToan = NgayThanhToan;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.MaKhuyenMai = MaKhuyenMai;
        this.ThanhTien = ThanhTien;
        this.TenNguoiNhan = TenNguoiNhan;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.TrangThai = TrangThai;
    }

    public String getIDHoaDonDatHang() {
        return IDHoaDonDatHang;
    }

    public void setIDHoaDonDatHang(String IDHoaDonDatHang) {
        this.IDHoaDonDatHang = IDHoaDonDatHang;
    }

    public NhanVien getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(NhanVien IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public KhachHang getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(KhachHang IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public SanPham getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(SanPham IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public GioHang getIDGioHang() {
        return IDGioHang;
    }

    public void setIDGioHang(GioHang IDGioHang) {
        this.IDGioHang = IDGioHang;
    }

    public KhuyenMai getIDKhuyenMai() {
        return IDKhuyenMai;
    }

    public void setIDKhuyenMai(KhuyenMai IDKhuyenMai) {
        this.IDKhuyenMai = IDKhuyenMai;
    }

    public Date getNgayTaoHoaDon() {
        return NgayTaoHoaDon;
    }

    public void setNgayTaoHoaDon(Date NgayTaoHoaDon) {
        this.NgayTaoHoaDon = NgayTaoHoaDon;
    }

    public Date getNgayDuTinh() {
        return NgayDuTinh;
    }

    public void setNgayDuTinh(Date NgayDuTinh) {
        this.NgayDuTinh = NgayDuTinh;
    }

    public Date getNgayGiaoHang() {
        return NgayGiaoHang;
    }

    public void setNgayGiaoHang(Date NgayGiaoHang) {
        this.NgayGiaoHang = NgayGiaoHang;
    }

    public Date getNgayNhanHang() {
        return NgayNhanHang;
    }

    public void setNgayNhanHang(Date NgayNhanHang) {
        this.NgayNhanHang = NgayNhanHang;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    public String getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(String MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getTenNguoiNhan() {
        return TenNguoiNhan;
    }

    public void setTenNguoiNhan(String TenNguoiNhan) {
        this.TenNguoiNhan = TenNguoiNhan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "HoaDonDatHang{" + "IDHoaDonDatHang=" + IDHoaDonDatHang + ", IDNhanVien=" + IDNhanVien + ", IDKhachHang=" + IDKhachHang + ", IDSanPham=" + IDSanPham + ", IDGioHang=" + IDGioHang + ", IDKhuyenMai=" + IDKhuyenMai + ", NgayTaoHoaDon=" + NgayTaoHoaDon + ", NgayDuTinh=" + NgayDuTinh + ", NgayGiaoHang=" + NgayGiaoHang + ", NgayNhanHang=" + NgayNhanHang + ", NgayThanhToan=" + NgayThanhToan + ", TenSanPham=" + TenSanPham + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", MaKhuyenMai=" + MaKhuyenMai + ", ThanhTien=" + ThanhTien + ", TenNguoiNhan=" + TenNguoiNhan + ", DiaChi=" + DiaChi + ", SoDienThoai=" + SoDienThoai + ", TrangThai=" + TrangThai + '}';
    }
    
}
