/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

import java.math.BigDecimal;

/**
 *
 * @author TRAN VAN DUONG
 */
public class SanPham {

    private String IDSanPham;
    private String IDLoaiSanPham;
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private String HinhAnh;
    private String Size;
    private String MauSac;
    private String ChatLieu;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;
    private int TrangThai;
    public SanPham() {
    }

    public SanPham(String IDSanPham, String IDLoaiSanPham, String MaSanPham, String TenSanPham, int SoLuong, String HinhAnh, String Size, String MauSac, String ChatLieu, BigDecimal GiaNhap, BigDecimal GiaBan, int TrangThai) {
        this.IDSanPham = IDSanPham;
        this.IDLoaiSanPham = IDLoaiSanPham;
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.HinhAnh = HinhAnh;
        this.Size = Size;
        this.MauSac = MauSac;
        this.ChatLieu = ChatLieu;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.TrangThai = TrangThai;
    }

   

    public SanPham(String idsp, String masp, String tensp, int soluongsp, String hinhanhsp, String size, String mausacsp, String chatLieu, BigDecimal gianhap, BigDecimal giaban, int TrangThai) {
        this.IDSanPham = idsp;
        this.MaSanPham = masp;
        this.TenSanPham = tensp;
        this.SoLuong = soluongsp;
        this.HinhAnh = hinhanhsp;
        this.Size = size;
        this.MauSac = mausacsp;
        this.ChatLieu = chatLieu;
        this.GiaNhap = gianhap;
        this.GiaBan = giaban;
        this.TrangThai = TrangThai;
       
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public String getIDLoaiSanPham() {
        return IDLoaiSanPham;
    }

    public void setIDLoaiSanPham(String IDLoaiSanPham) {
        this.IDLoaiSanPham = IDLoaiSanPham;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
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

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public BigDecimal getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(BigDecimal GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "IDSanPham=" + IDSanPham + ", IDLoaiSanPham=" + IDLoaiSanPham + ", MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + ", SoLuong=" + SoLuong + ", HinhAnh=" + HinhAnh + ", Size=" + Size + ", MauSac=" + MauSac + ", ChatLieu=" + ChatLieu + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", TrangThai=" + TrangThai + '}';
    }

    
}
