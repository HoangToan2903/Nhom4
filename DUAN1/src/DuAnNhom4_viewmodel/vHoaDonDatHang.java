/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

/**
 *
 * @author TRAN VAN DUONG
 */
public class vHoaDonDatHang {
    vKhachHang IDKhachHang;
    vSanPham1 IDSanPham;
    int soLuong;
    int TrangThai;

    public vHoaDonDatHang() {
    }

    public vHoaDonDatHang(vKhachHang IDKhachHang, vSanPham1 IDSanPham, int soLuong, int TrangThai) {
        this.IDKhachHang = IDKhachHang;
        this.IDSanPham = IDSanPham;
        this.soLuong = soLuong;
        this.TrangThai = TrangThai;
    }

    public vKhachHang getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(vKhachHang IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public vSanPham1 getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(vSanPham1 IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "vHoaDonDatHang{" + "IDKhachHang=" + IDKhachHang + ", IDSanPham=" + IDSanPham + ", soLuong=" + soLuong + ", TrangThai=" + TrangThai + '}';
    }

    
   
    
}
