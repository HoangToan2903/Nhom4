/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_viewmodel.vHoaDonDatHang;
import DuAnNhom4_viewmodel.vKhachHang;
import DuAnNhom4_viewmodel.vSanPham1;
import java.sql.Connection;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author TRAN VAN DUONG
 */
public class HoaDonDatHangRepository {

//    public static final Connection con = DBContext.getConnection();
////     public List<GiangVien> getALL() {
//        //b1:viết query
//        String query = "SELECT * FROM giang_vien";
//        //b2:mở cổng kết nối
//        try (Connection con = SQLsever_Connection.getConnection();
//                PreparedStatement ps = con.prepareStatement(query)) {
//            //b3:statement: cho phép gửi các câu SQL tới DATABASE
//            //b4:  khởi tạo kiểu trả về của hàm
//            List<GiangVien> listGV = new ArrayList<>();
//            //b5:resultset: đại điện cho tập hipw cá bản ghi (record)
//            //có được sau kho thực hiện truy vấn (query)
//            ResultSet rs = ps.executeQuery();
//            //b6: đọc DATA
//            while (rs.next()) {
//                GiangVien gv = new GiangVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6));
//                listGV.add(gv);
//            }
//            return listGV;
//        } catch (SQLException ex) {
//            // class này xử ký bất cứ lỗi nào xuất
//            ex.printStackTrace(System.out);
//        }
//        return null;
    public static List<vHoaDonDatHang> getAll() {
        String query = "select SANPHAM.TENSP, HOADONDATHANG.SOLUONG, SANPHAM.GIABAN, SANPHAM.MAUSAC, SANPHAM.SIZE, KHACHHANG.HOTEN,SANPHAM.HINHANH, HOADONDATHANG.TRANGTHAI\n" +
"                from HOADONDATHANG " +
"                join SANPHAM ON HOADONDATHANG.IDSP = SANPHAM.Id " +
"                join KHACHHANG ON HOADONDATHANG.IDKH = KHACHHANG.ID";
        try (Connection con = DBContext1.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<vHoaDonDatHang> listHoaDon = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vSanPham1 sanPham = new vSanPham1(rs.getString(1), rs.getString(5), rs.getString(4), rs.getBigDecimal(3), rs.getString(7));
                vKhachHang khachHang = new vKhachHang(rs.getString(6));
                vHoaDonDatHang hoaDonDatHang = new vHoaDonDatHang(khachHang, sanPham, rs.getInt(2), rs.getInt(8));
                listHoaDon.add(hoaDonDatHang);
            }
            return listHoaDon;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    //        public boolean delete(String maGV) {
    //        String query = "DELETE FROM [dbo].[giang_vien]"
    //                + "      WHERE ma_gv = ?";
    //        int check = 0;
    //        try (Connection con = SQLsever_Connection.getConnection();
    //                PreparedStatement ps = con.prepareStatement(query)) {
    //            ps.setObject(1, maGV);
    //            check = ps.executeUpdate();
    //        } catch (SQLException ex) {
    //            ex.printStackTrace(System.out);
    //        }
    //        return check > 0;
    //        //    }
        public boolean delete(String TenSanPham) {
            String query = "DELETE FROM [dbo].[HOADONDATHANG]"
                    + "      WHERE TENSANPHAM = ?";
            int check = 0;
            try (Connection con = DBContext1.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
                ps.setObject(1, TenSanPham);
                check = ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
            return check > 0;
        }

    //    public static void main(String[] args) throws SQLException {
    //        HoaDonDatHangRepository hoaDonDatHangRepository = new HoaDonDatHangRepository();
    //        hoaDonDatHangRepository.getAll();
    //    }
    //    public GiangVien getOne(String maGV) {
    //        String query = "select * from giang_vien where ma_gv = ?";
    //        try (Connection con = SQLsever_Connection.getConnection();
    //                PreparedStatement ps = con.prepareStatement(query)) {
    //            ps.setObject(1, maGV);
    //            ResultSet rs = ps.executeQuery();
    //            if (rs.next()) {
    //                return new GiangVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6));
    //            }
    //        } catch (SQLException ex) {
    //            // class này xử ký bất cứ lỗi nào xuất
    //            ex.printStackTrace(System.out);
    //        }
    //        return null;
    //    }
    public vHoaDonDatHang timKiem(int TrangThai) {
        String query = "select SANPHAM.TENSP, HOADONDATHANG.SOLUONG, SANPHAM.GIABAN, SANPHAM.MAUSAC, SANPHAM.SIZE, KHACHHANG.HOTEN,SANPHAM.HINHANH, HOADONDATHANG.TRANGTHAI\n" +
"                from HOADONDATHANG " +
"                join SANPHAM ON HOADONDATHANG.IDSP = SANPHAM.Id " +
"                join KHACHHANG ON HOADONDATHANG.IDKH = KHACHHANG.ID" +
"				where HOADONDATHANG.TRANGTHAI = ?";
        try (Connection con = DBContext1.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, TrangThai);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vSanPham1 sanPham = new vSanPham1(rs.getString(1), rs.getString(5), rs.getString(4), rs.getBigDecimal(3), rs.getString(7));
                vKhachHang khachHang = new vKhachHang(rs.getString(6));
                return new vHoaDonDatHang(khachHang, sanPham, rs.getInt(2), rs.getInt(8));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public static void main(String[] args) {
        HoaDonDatHangRepository hd = new HoaDonDatHangRepository();
        hd.getAll();
    }
}
