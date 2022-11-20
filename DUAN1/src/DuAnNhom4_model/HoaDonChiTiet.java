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
public class HoaDonChiTiet {
    HoaDonMuahang IDHoaDonMuaHang;
    HoaDonDatHang IDHoaDonDatHang;
    int SoLuong;
    BigDecimal DonGia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(HoaDonMuahang IDHoaDonMuaHang, HoaDonDatHang IDHoaDonDatHang, int SoLuong, BigDecimal DonGia) {
        this.IDHoaDonMuaHang = IDHoaDonMuaHang;
        this.IDHoaDonDatHang = IDHoaDonDatHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public HoaDonMuahang getIDHoaDonMuaHang() {
        return IDHoaDonMuaHang;
    }

    public void setIDHoaDonMuaHang(HoaDonMuahang IDHoaDonMuaHang) {
        this.IDHoaDonMuaHang = IDHoaDonMuaHang;
    }

    public HoaDonDatHang getIDHoaDonDatHang() {
        return IDHoaDonDatHang;
    }

    public void setIDHoaDonDatHang(HoaDonDatHang IDHoaDonDatHang) {
        this.IDHoaDonDatHang = IDHoaDonDatHang;
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

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "IDHoaDonMuaHang=" + IDHoaDonMuaHang + ", IDHoaDonDatHang=" + IDHoaDonDatHang + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
}
