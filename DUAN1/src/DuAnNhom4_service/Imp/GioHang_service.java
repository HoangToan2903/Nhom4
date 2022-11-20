/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_service.Imp;

import DuAnNhom4_model.GioHang;
import DuAnNhom4_repository.GioHang_repository;
import java.util.List;

/**
 *
 * @author Dell
 */
public class GioHang_service {
     public static List<GioHang> getAllGioHang() {
        return GioHang_repository.getAllGioHang();
    }



    public static int themSanPhamVaoGioHang(GioHang gh) {
        return GioHang_repository.themSanPhamVaoGioHang(gh);
    }

    public void themSanPhamVaoGioHang(DuAnNhom4_view.GioHangKH gh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
