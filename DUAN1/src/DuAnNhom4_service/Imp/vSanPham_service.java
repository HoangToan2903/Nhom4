/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_service.Imp;

import DuAnNhom4_repository.vSanPham_repository;
import DuAnNhom4_viewmodel.vSanPham;
import java.util.List;

/**
 *
 * @author Dell
 */
public class vSanPham_service {
     public static List<vSanPham> getAllVSP() {
        return vSanPham_repository.getAllVSP();
    }

    public static vSanPham getVSPbyMa(String mavsp) {
        return vSanPham_repository.getVSPbymaSP(mavsp);
    }

    public static int themSP(vSanPham vsp) {
        return vSanPham_repository.themSanPham(vsp);
    }

    public static int suaSP(vSanPham vsp) {
        return vSanPham_repository.suaSanPham(vsp);
    }
}
