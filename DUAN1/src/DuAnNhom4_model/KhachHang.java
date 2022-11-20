/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

import java.util.Date;

/**
 *
 * @author TRAN VAN DUONG
 */
public class KhachHang {

    String IDKhachHang;
    int MaKhachHang;
    String HoTen;
    String GioiTinh;
    String NgaySinh;
    String SoDienThoai;
    String DiaChi;
    String ThanhPho;
    String QuocGia;
    String TenTaiKhoan;
    String MatKhau;
    String NhapLaiMatKhau;
    String hinhAnh;

    public KhachHang() {
  
    }

    public KhachHang(String IDKhachHang, int MaKhachHang, String HoTen, String GioiTinh, String NgaySinh, String SoDienThoai, String DiaChi, String ThanhPho, String QuocGia, String TenTaiKhoan, String MatKhau, String NhapLaiMatKhau, String hinhAnh) {
        this.IDKhachHang = IDKhachHang;
        this.MaKhachHang = MaKhachHang;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.NhapLaiMatKhau = NhapLaiMatKhau;
        this.hinhAnh = hinhAnh;
    }

    public KhachHang(String ID, int MA, String HOTEN, String GIOITINH, String NGAYSINH, String SDT, String DIACHI, String THANHPHO, String QUOCGIA, String TENTAIKHOAN, String MATKHAU, String NHAPLAIMATKHAU) {
        this.IDKhachHang = ID;
        this.MaKhachHang = MA;
        this.HoTen = HOTEN;
        this.GioiTinh = GIOITINH;
        this.NgaySinh = NGAYSINH;
        this.SoDienThoai = SDT;
        this.DiaChi = DIACHI;
        this.ThanhPho = THANHPHO;
        this.QuocGia = QUOCGIA;
        this.TenTaiKhoan = TENTAIKHOAN;
        this.MatKhau = MATKHAU;
        this.NhapLaiMatKhau = NHAPLAIMATKHAU;
    }

    public KhachHang(String HOTEN, String GIOITINH, String NGAYSINH, String SDT, String DIACHI, String THANHPHO, String QUOCGIA, String TENTAIKHOAN, String MATKHAU, String NHAPLAIMATKHAU, String HINHANH) {
        this.HoTen = HOTEN;
        this.GioiTinh = GIOITINH;
        this.NgaySinh = NGAYSINH;
        this.SoDienThoai = SDT;
        this.DiaChi = DIACHI;
        this.ThanhPho = THANHPHO;
        this.QuocGia = QUOCGIA;
        this.TenTaiKhoan = TENTAIKHOAN;
        this.MatKhau = MATKHAU;
        this.NhapLaiMatKhau = NHAPLAIMATKHAU;
        this.hinhAnh = HINHANH;
    }

    public String getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(String IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
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

    public String getNhapLaiMatKhau() {
        return NhapLaiMatKhau;
    }

    public void setNhapLaiMatKhau(String NhapLaiMatKhau) {
        this.NhapLaiMatKhau = NhapLaiMatKhau;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "IDKhachHang=" + IDKhachHang + ", MaKhachHang=" + MaKhachHang + ", HoTen=" + HoTen + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + ", SoDienThoai=" + SoDienThoai + ", DiaChi=" + DiaChi + ", ThanhPho=" + ThanhPho + ", QuocGia=" + QuocGia + ", TenTaiKhoan=" + TenTaiKhoan + ", MatKhau=" + MatKhau + ", NhapLaiMatKhau=" + NhapLaiMatKhau + ", hinhAnh=" + hinhAnh + '}';
    }

}
