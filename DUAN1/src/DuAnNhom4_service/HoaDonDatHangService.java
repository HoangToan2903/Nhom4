/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DuAnNhom4_service;

import DuAnNhom4_viewmodel.vHoaDonDatHang;
import java.util.List;

/**
 *
 * @author TRAN VAN DUONG
 */
public interface HoaDonDatHangService {
    List<vHoaDonDatHang> getAll();
    String xoa(String TenSanPham);
    vHoaDonDatHang timKiem(int TrangThai);
}
