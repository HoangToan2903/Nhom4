/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DuAnNhom4_service;

import DuAnNhom4_model.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public interface KHACHHANG_service {
     public ArrayList<KhachHang> getALLKH();

    public int THEMKH(KhachHang KH);
}
