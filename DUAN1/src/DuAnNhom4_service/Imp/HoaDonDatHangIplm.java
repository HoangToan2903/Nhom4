/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_service.Imp;

import DuAnNhom4_viewmodel.vHoaDonDatHang;
import DuAnNhom4_repository.HoaDonDatHangRepository;
import DuAnNhom4_service.HoaDonDatHangService;
import java.util.List;

/**
 *
 * @author TRAN VAN DUONG
 */
public class HoaDonDatHangIplm implements HoaDonDatHangService {

    private HoaDonDatHangRepository donDatHangRepository = new HoaDonDatHangRepository();

    @Override
    public List<vHoaDonDatHang> getAll() {
        return donDatHangRepository.getAll();
    }
    @Override
    public String xoa(String TenSanPham) {
        boolean Xoa = donDatHangRepository.delete(TenSanPham);
        if(Xoa == true){
            return "Xóa thành công";
        }return "Xóa không thành công";
    }

    @Override
    public vHoaDonDatHang timKiem(int TrangThai) {
       return donDatHangRepository.timKiem(TrangThai);
    }

}
