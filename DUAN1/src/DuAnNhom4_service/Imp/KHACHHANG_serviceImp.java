/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_service.Imp;

import DuAnNhom4_model.KhachHang;
import DuAnNhom4_repository.KHACHHANG_repository;
import DuAnNhom4_service.KHACHHANG_service;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class KHACHHANG_serviceImp implements KHACHHANG_service {

    KHACHHANG_repository KHR = new KHACHHANG_repository();

    @Override
    public ArrayList<KhachHang> getALLKH() {
        return (ArrayList<KhachHang>) KHR.getAllKH();
    }

    @Override
    public int THEMKH(KhachHang KH) {
        return KHR.themKH(KH);
    }

}
