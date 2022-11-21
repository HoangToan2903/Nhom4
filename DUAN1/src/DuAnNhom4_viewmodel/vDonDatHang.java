/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

import DuAnNhom4_model.KhachHang;
import DuAnNhom4_model.NhanVien;
import DuAnNhom4_model.SanPham;
import java.math.BigDecimal;

/**
 *
 * @author TRAN VAN DUONG
 */
public class vDonDatHang {
    SanPham TenSanPham;
    int SoLuong;
    SanPham donGia;
    SanPham mauSac;
    SanPham Size;
    KhachHang tenNN;
    int TrangThai;

    public vDonDatHang() {
    }

    public vDonDatHang(SanPham TenSanPham, int SoLuong, SanPham donGia, SanPham mauSac, SanPham Size, KhachHang tenNN, int TrangThai) {
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.donGia = donGia;
        this.mauSac = mauSac;
        this.Size = Size;
        this.tenNN = tenNN;
        this.TrangThai = TrangThai;
    }

    public SanPham getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(SanPham TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public SanPham getDonGia() {
        return donGia;
    }

    public void setDonGia(SanPham donGia) {
        this.donGia = donGia;
    }

    public SanPham getMauSac() {
        return mauSac;
    }

    public void setMauSac(SanPham mauSac) {
        this.mauSac = mauSac;
    }

    public SanPham getSize() {
        return Size;
    }

    public void setSize(SanPham Size) {
        this.Size = Size;
    }

    public KhachHang getTenNN() {
        return tenNN;
    }

    public void setTenNN(KhachHang tenNN) {
        this.tenNN = tenNN;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "vDonDatHang{" + "TenSanPham=" + TenSanPham + ", SoLuong=" + SoLuong + ", donGia=" + donGia + ", mauSac=" + mauSac + ", Size=" + Size + ", tenNN=" + tenNN + ", TrangThai=" + TrangThai + '}';
    }

    
}
