/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_model.GioHang;
import DuAnNhom4_utility.JDBC_Helper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class GioHang_repository {
     public static List<GioHang> getAllGioHang() {
        List<GioHang> listGH = new ArrayList();
        ResultSet rs;
        String sql = "SELECT DISTINCT  SANPHAM.ID,SANPHAM.TENSP\n"
                + "NGAYTHEMGIOHANG,SOLUONG,DONGIA,HINHANH\n"
                + "FROM SANPHAM INNER JOIN GIOHANG ON SANPHAM.ID=GIOHANG.IDSP\n";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String IDSP = rs.getString(1);
                Date NGAY = rs.getDate(2);
                int SOLUONG = rs.getInt(3);
                BigDecimal DONGIA = rs.getBigDecimal(4);
                String HINHANH = rs.getString(5);
                String TENSP = rs.getString(6);
                GioHang GH = new GioHang(IDSP, NGAY, SOLUONG, DONGIA, HINHANH,TENSP);
                listGH.add(GH);
            }
            return listGH;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static int themSanPhamVaoGioHang(GioHang gh) {
        String sql = "insert into GIOHANG(IDSP,NGAYTHEMVAOGIOHANG,TENSP,SOLUONG,HINHANH,DONGIA) values(?,?,?,?,?,?)";
        return JDBC_Helper.updateTongQuat(sql, gh.getIDSanPham(), gh.getNgayThemVaoGioHang(),
                gh.getTensp(),
                gh.getSoLuong(),
                gh.getHinhAnh(),
                gh.getDonGia());
    }
      public static void main(String[] args) {
        // check các chức năng tại đây
        List<GioHang> listCheck = new ArrayList<>();
        listCheck = getAllGioHang();
        for (GioHang x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
