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
public class GioHang {
    private String ID;
    private String IDKhachHang;
    private String IDSanPham;
    private Date NgayThemVaoGioHang;
     private String Tensp;
    private int SoLuong;
    private BigDecimal DonGia;
    private String HinhAnh;

    public GioHang() {
    }

    public GioHang(String ID, String IDKhachHang, String IDSanPham, Date NgayThemVaoGioHang, String Tensp, int SoLuong, BigDecimal DonGia, String HinhAnh) {
        this.ID = ID;
        this.IDKhachHang = IDKhachHang;
        this.IDSanPham = IDSanPham;
        this.NgayThemVaoGioHang = NgayThemVaoGioHang;
        this.Tensp = Tensp;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.HinhAnh = HinhAnh;
    }

    public GioHang(String IDSP, java.sql.Date NGAY, int SOLUONG, BigDecimal DONGIA, String HINHANH, String TENSP) {

        this.IDSanPham = IDSP;
        this.NgayThemVaoGioHang = NGAY;
        this.Tensp = TENSP;
        this.SoLuong = SOLUONG;
        this.DonGia = DONGIA;
        this.HinhAnh = HINHANH;
         this.Tensp = TENSP;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(String IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public Date getNgayThemVaoGioHang() {
        return NgayThemVaoGioHang;
    }

    public void setNgayThemVaoGioHang(Date NgayThemVaoGioHang) {
        this.NgayThemVaoGioHang = NgayThemVaoGioHang;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
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

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    @Override
    public String toString() {
        return "GioHang{" + "ID=" + ID + ", IDKhachHang=" + IDKhachHang + ", IDSanPham=" + IDSanPham + ", NgayThemVaoGioHang=" + NgayThemVaoGioHang + ", Tensp=" + Tensp + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", HinhAnh=" + HinhAnh + '}';
    }

  
}