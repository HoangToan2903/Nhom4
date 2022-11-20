/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_model.LoaiSanPham;
import DuAnNhom4_utility.JDBC_Helper;
import DuAnNhom4_viewmodel.vSanPham;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class vSanPham_repository {

//    public static List<vSanPham> getAllVSP() {
//        List<vSanPham> listVSP = new ArrayList();
//        ResultSet rs;
//        String sql = "SELECT DISTINCT  LOAISANPHAM.ID, LOAISANPHAM.MA, LOAISANPHAM.TEN\n"
//                + "ID,MASP,TENSP,SOLUONG,HINHANH,SIZE,MAUSAC,CHATLIEU,GIANHAP,GIABAN,TRANGTHAI\n"
//                + "FROM SANPHAM JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID \n";
//        rs = JDBC_Helper.selectTongQuat(sql);
//        try {
//            while (rs.next()) {
//                String idloaisp = rs.getString(1);
//                String maloaisp = rs.getString(2);
//                String tenloaisp = rs.getString(3);
//                String masp = rs.getString(4);
//                String tensp = rs.getString(5);
//                int soluong = rs.getInt(6);
//                String hinhanhsp = rs.getString(7);
//                String size = rs.getString(8);
//                String mausacsp = rs.getString(9);
//                String chatLieu = rs.getString(10);
//                BigDecimal gianhap = rs.getBigDecimal(11);
//                BigDecimal giaban = rs.getBigDecimal(12);
//                int TrangThai = rs.getInt(13);
//                vSanPham vsp = new vSanPham(masp, tensp, soluong, hinhanhsp, size, mausacsp, chatLieu, gianhap, giaban, idloaisp, maloaisp, tenloaisp, TrangThai);
//                listVSP.add(vsp);
//            }
//            return listVSP;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return null;
//            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    public static List<vSanPham> getAllVSP() {
        List<vSanPham> listVSP = new ArrayList();
        ResultSet rs;
        String sql = "SELECT DISTINCT  LOAISANPHAM.ID, LOAISANPHAM.MA, LOAISANPHAM.TEN\n"
                + "ID,MASP,TENSP,SOLUONG,HINHANH,SIZE,MAUSAC,CHATLIEU,GIANHAP,GIABAN,TRANGTHAI\n"
                + "FROM SANPHAM JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID \n";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idsanpham = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);
                int soluong = rs.getInt(4);
                String hinhanhsp = rs.getString(5);
                String size = rs.getString(6);
                String mausacsp = rs.getString(7);
                String chatLieu = rs.getString(8);
                BigDecimal gianhap = rs.getBigDecimal(9);
                BigDecimal giaban = rs.getBigDecimal(10);
                String idloaisp = rs.getString(11);
                String maloaisp = rs.getString(12);
                String tenloaisp = rs.getString(13);
                int TrangThai = rs.getInt(14);
                vSanPham vsp = new vSanPham(idsanpham,masp,tensp,soluong,hinhanhsp,size,mausacsp,chatLieu,gianhap,giaban,idloaisp,maloaisp,tenloaisp,TrangThai);
                listVSP.add(vsp);
            }
            return listVSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static vSanPham getVSPbymaSP(String MA) {
        vSanPham vsp = new vSanPham();
        ResultSet rs;
        String sql = "select MASP, TENSP, SOLUONG, HINHANH, SIZE, MAUSAC, CHATLIEU, GIANHAP, GIABAN, LOAISANPHAM.ID, LOAISANPHAM.MA, LOAISANPHAM.TEN\n"
                + "from SANPHAM join LOAISANPHAM on SANPHAM.IDLOAISP = LOAISANPHAM.ID\n"
                + "where MASP  = ?  ";

        rs = JDBC_Helper.selectTongQuat(sql, MA);
        try {
            while (rs.next()) {
                String masp = rs.getString(1);
                String tensp = rs.getString(2);
                int soluongsp = rs.getInt(3);
                String hinhanhsp = rs.getString(4);
                String size = rs.getString(5);
                String mausacsp = rs.getString(6);
                String chatLieu = rs.getString(7);
                BigDecimal gianhap = rs.getBigDecimal(8);
                BigDecimal giaban = rs.getBigDecimal(9);
                String idloaisp = rs.getString(10);
                String maloaisp = rs.getString(11);
                String tenloaisp = rs.getString(12);
                int TrangThai = rs.getInt(13);
                vsp = new vSanPham(masp, tensp, soluongsp, hinhanhsp, size, mausacsp, chatLieu, gianhap, giaban, idloaisp, maloaisp, tenloaisp, TrangThai);

            }
            return vsp;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static ArrayList<vSanPham> timKiem(String Ten) {
//        List<vSanPham> listSP = new ArrayList<>();
//        ResultSet rs;
//        String sql = "SELECT LOAISANPHAM.TEN,SANPHAM.MASP,TENSP,SOLUONG,HINHANH,SIZE,MAUSAC,CHATLIEU,GIANHAP,GIABAN FROM SANPHAM JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID\n"
//                + "WHERE TENSP LIKE N'%" + Ten + "%'";
//        rs = JDBC_Helper.selectTongQuat(sql);
//        try {
//            while (rs.next()) {
//                String TENLOAISP = rs.getString(1);
//                
//                String MASP = rs.getString(2);
//                String TENSP = rs.getString(3);
//                int SOLUONG = rs.getInt(4);
////                int SOLUONG  = Integer.valueOf(rs.getInt(4));
//                String HINHANH = rs.getString(5);
//                String SIZE = rs.getString(6);
//                String MAUSAC = rs.getString(7);
//                String CHATLIEU = rs.getString(8);
//                BigDecimal GIANHAP = rs.getBigDecimal(9);
//                BigDecimal GIABAN = rs.getBigDecimal(10);
////                int TRANGTHAI = rs.getInt(12);
//                LoaiSanPham loai = new LoaiSanPham(TENLOAISP, MAUSAC, TENLOAISP);
//                vSanPham SP = new vSanPham(MASP, TENSP, SOLUONG, HINHANH, SIZE, MAUSAC, CHATLIEU, GIANHAP, GIABAN);
//                listSP.add(SP);
//            }
//            return (ArrayList<vSanPham>) listSP;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//    }
    public static ArrayList<vSanPham> timKiem(String Ten) {
        List<vSanPham> listSP = new ArrayList<>();
        ResultSet rs;
        String sql = "SELECT LOAISANPHAM.TEN,SANPHAM.MASP,TENSP,SOLUONG,HINHANH,SIZE,MAUSAC,CHATLIEU,GIANHAP,GIABAN FROM SANPHAM JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID\n"
                + "WHERE TENSP LIKE N'%" + Ten + "%'";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String TENLOAISP = rs.getString(1);

                String MASP = rs.getString(2);
                String TENSP = rs.getString(3);
                int SOLUONG = rs.getInt(4);
//                int SOLUONG  = Integer.valueOf(rs.getInt(4));
                String HINHANH = rs.getString(5);
                String SIZE = rs.getString(6);
                String MAUSAC = rs.getString(7);
                String CHATLIEU = rs.getString(8);
                BigDecimal GIANHAP = rs.getBigDecimal(9);
                BigDecimal GIABAN = rs.getBigDecimal(10);
//                int TRANGTHAI = rs.getInt(12);
//                LoaiSanPham loai = new LoaiSanPham(TENLOAISP, MAUSAC, TENLOAISP);
                vSanPham SP = new vSanPham(TENLOAISP, MASP, TENSP, SOLUONG, HINHANH, SIZE, MAUSAC, CHATLIEU, GIANHAP, GIABAN);
                listSP.add(SP);
            }
            return (ArrayList<vSanPham>) listSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

//    public static ArrayList<vSanPham> timKiemKH(String Ten) {
//        List<vSanPham> listSP = new ArrayList<>();
//        ResultSet rs;
//        String sql = "SELECT LOAISANPHAM.TEN,SANPHAM.MASP,TENSP,SOLUONG,HINHANH,SIZE,MAUSAC,CHATLIEU,GIANHAP,GIABAN FROM SANPHAM JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID\n"
//                + "WHERE TENSP LIKE N'%" + Ten + "%'";
//        rs = JDBC_Helper.selectTongQuat(sql);
//        try {
//            while (rs.next()) {
//                String TENLOAISP = rs.getString(1);
//                String TENSP = rs.getString(2);
//                int SOLUONG = rs.getInt(3);
////                int SOLUONG  = Integer.valueOf(rs.getInt(4));
//                String HINHANH = rs.getString(5);
//                String SIZE = rs.getString(5);
//                String MAUSAC = rs.getString(6);
//                String CHATLIEU = rs.getString(7);
//                BigDecimal GIABAN = rs.getBigDecimal(8);
////                int TRANGTHAI = rs.getInt(12);
//
//                vSanPham SP = new vSanPham(TENLOAISP, TENSP, SOLUONG, HINHANH, SIZE, MAUSAC, CHATLIEU, GIABAN);
//                listSP.add(SP);
//            }
//            return (ArrayList<vSanPham>) listSP;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return null;
//        }
//    }
    public static int themSanPham(vSanPham vsp) {
        String sql = "insert into SANPHAM(IDLOAISP,MASP,TENSP,SOLUONG,HINHANH,SIZE,MAUSAC,CHATLIEU,GIANHAP,GIABAN,TRANGTHAI) values(?,?,?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.updateTongQuat(sql, vsp.getIdloaisp(), vsp.getMaSanPham(),
                vsp.getTenSanPham(),
                vsp.getSoLuong(),
                vsp.getHinhAnh(),
                vsp.getSize(),
                vsp.getMauSac(),
                vsp.getChatLieu(),
                vsp.getGiaNhap(),
                vsp.getGiaBan(),
                vsp.getTrangThai());
    }

    public static int suaSanPham(vSanPham vsp) {
        String sql = "update SanPham set TENSP = ?, SOLUONG = ?, HINHANH = ?, SIZE = ?, MAUSAC = ?, CHATLIEU = ?, GIANHAP = ?, GIABAN = ? where MASP=? ";
        return JDBC_Helper.updateTongQuat(sql, vsp.getTenSanPham(), vsp.getSoLuong(), vsp.getHinhAnh(),
                vsp.getSize(), vsp.getMauSac(), vsp.getChatLieu(), vsp.getGiaNhap(), vsp.getGiaBan(), vsp.getMaSanPham());
    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<vSanPham> listCheck = new ArrayList<>();
        listCheck = getAllVSP();
        for (vSanPham x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }

}
