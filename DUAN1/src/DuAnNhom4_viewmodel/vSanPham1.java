/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

import java.math.BigDecimal;

/**
 *
 * @author TRAN VAN DUONG
 */
public class vSanPham1 {
    String TenSanPham;
    String Size;
    String MauSac;
    BigDecimal GiaBan;
    String HinhAnh;

    public vSanPham1() {
    }

    public vSanPham1(String TenSanPham, String Size, String MauSac, BigDecimal GiaBan, String HinhAnh) {
        this.TenSanPham = TenSanPham;
        this.Size = Size;
        this.MauSac = MauSac;
        this.GiaBan = GiaBan;
        this.HinhAnh = HinhAnh;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
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

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    @Override
    public String toString() {
        return "vSanPham{" + "TenSanPham=" + TenSanPham + ", Size=" + Size + ", MauSac=" + MauSac + ", GiaBan=" + GiaBan + ", HinhAnh=" + HinhAnh + '}';
    }
  
}
