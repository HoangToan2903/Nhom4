/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

import DuAnNhom4_model.LoaiSanPham;
import DuAnNhom4_model.SanPham;
import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
public class vSanPham {

    private String ID;
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private String HinhAnh;
    private String Size;
    private String MauSac;
    private String ChatLieu;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;
    private String idloaisp;
    private String MaLoai;
    private String TenLoai;
    private int TrangThai;
    private LoaiSanPham loai;
    private SanPham sanpham;

    public vSanPham() {
    }

    public vSanPham(String ID, String MaSanPham, String TenSanPham, int SoLuong, String HinhAnh, String Size, String MauSac, String ChatLieu, BigDecimal GiaNhap, BigDecimal GiaBan, String idloaisp, String MaLoai, String TenLoai, int TrangThai, LoaiSanPham loai, SanPham sanpham) {
        this.ID = ID;
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.HinhAnh = HinhAnh;
        this.Size = Size;
        this.MauSac = MauSac;
        this.ChatLieu = ChatLieu;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.idloaisp = idloaisp;
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
        this.TrangThai = TrangThai;
        this.loai = loai;
        this.sanpham = sanpham;
    }

    public vSanPham(String masp, String tensp, int soluongsp, String hinhanhsp, String size, String mausacsp, String chatLieu, BigDecimal gianhap, BigDecimal giaban, String idloaisp, String maloaisp, String tenloaisp, int TrangThai) {
        this.MaSanPham = masp;
        this.TenSanPham = tensp;
        this.SoLuong = soluongsp;
        this.HinhAnh = hinhanhsp;
        this.Size = size;
        this.MauSac = mausacsp;
        this.ChatLieu = chatLieu;
        this.GiaNhap = gianhap;
        this.GiaBan = giaban;
        this.idloaisp = idloaisp;
        this.MaLoai = maloaisp;
        this.TenLoai = tenloaisp;
        this.TrangThai = TrangThai;
    }

    public vSanPham(String MASP, String TENSP, int SOLUONG, String HINHANH, String SIZE, String MAUSAC, String CHATLIEU, BigDecimal GIANHAP, BigDecimal GIABAN) {
        this.MaSanPham = MASP;
        this.TenSanPham = TENSP;
        this.SoLuong = SOLUONG;
        this.HinhAnh = HINHANH;
        this.Size = SIZE;
        this.MauSac = MAUSAC;
        this.ChatLieu = CHATLIEU;
        this.GiaNhap = GIANHAP;
        this.GiaBan = GIABAN;
//        this.TrangThai = TRANGTHAI;
    }

    public vSanPham(String TENLOAISP, String TENSP, int SOLUONG, String HINHANH, String SIZE, String MAUSAC, String CHATLIEU, BigDecimal GIABAN) {
        this.TenLoai = TENLOAISP;
        this.TenSanPham = TENSP;
        this.SoLuong = SOLUONG;
        this.HinhAnh = HINHANH;
        this.Size = SIZE;
        this.MauSac = MAUSAC;
        this.ChatLieu = CHATLIEU;
        this.GiaBan = GIABAN;
    }

    public vSanPham(String TENLOAISP, String MASP, String TENSP, int SOLUONG, String HINHANH, String SIZE, String MAUSAC, String CHATLIEU, BigDecimal GIANHAP, BigDecimal GIABAN) {
        this.TenLoai = TENLOAISP;
        this.MaSanPham = MASP;
        this.TenSanPham = TENSP;
        this.SoLuong = SOLUONG;
        this.HinhAnh = HINHANH;
        this.Size = SIZE;
        this.MauSac = MAUSAC;
        this.ChatLieu = CHATLIEU;
        this.GiaNhap = GIANHAP;
        this.GiaBan = GIABAN;
    }

    public vSanPham(String idloaisp, String maloaisp, String tenloaisp, String idsanpham, String masp, String tensp, int soluong, String hinhanhsp, String size, String mausacsp, String chatLieu, BigDecimal gianhap, BigDecimal giaban, int TrangThai) {
        this.MaSanPham = masp;
        this.TenSanPham = tensp;
        this.SoLuong = soluong;
        this.HinhAnh = hinhanhsp;
        this.Size = size;
        this.MauSac = mausacsp;
        this.ChatLieu = chatLieu;
        this.GiaNhap = gianhap;
        this.GiaBan = giaban;
        this.idloaisp = idloaisp;
        this.MaLoai = maloaisp;
        this.TenLoai = tenloaisp;
        this.TrangThai = TrangThai;
    }

    public vSanPham(String idsanpham, String masp, String tensp, int soluong, String hinhanhsp, String size, String mausacsp, String chatLieu, BigDecimal gianhap, BigDecimal giaban, String idloaisp, String maloaisp, String tenloaisp, int TrangThai) {
        this.ID = idsanpham;
        this.MaSanPham = masp;
        this.TenSanPham = tensp;
        this.SoLuong = soluong;
        this.HinhAnh = hinhanhsp;
        this.Size = size;
        this.MauSac = mausacsp;
        this.ChatLieu = chatLieu;
        this.GiaNhap = gianhap;
        this.GiaBan = giaban;
        this.idloaisp = idloaisp;
        this.MaLoai = maloaisp;
        this.TenLoai = tenloaisp;
        this.TrangThai = TrangThai;
      
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getIdloaisp() {
        return idloaisp;
    }

    public void setIdloaisp(String idloaisp) {
        this.idloaisp = idloaisp;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public LoaiSanPham getLoai() {
        return loai;
    }

    public void setLoai(LoaiSanPham loai) {
        this.loai = loai;
    }

    public SanPham getSanpham() {
        return sanpham;
    }

    public void setSanpham(SanPham sanpham) {
        this.sanpham = sanpham;
    }

    public String TrangThai() {
//        int SoLuong = 0;
        if (SoLuong > 1) {
            return "Đang bán";
        } else {
            return "Hết hàng ";
        }
    }

    @Override
    public String toString() {
        return "vSanPham{" + "ID=" + ID + ", MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + ", SoLuong=" + SoLuong + ", HinhAnh=" + HinhAnh + ", Size=" + Size + ", MauSac=" + MauSac + ", ChatLieu=" + ChatLieu + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", idloaisp=" + idloaisp + ", MaLoai=" + MaLoai + ", TenLoai=" + TenLoai + ", TrangThai=" + TrangThai + ", loai=" + loai + ", sanpham=" + sanpham + '}';
    }

}
