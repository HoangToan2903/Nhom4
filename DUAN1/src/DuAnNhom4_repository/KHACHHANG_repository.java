/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;
import DuAnNhom4_model.KhachHang;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dell
 */
public class KHACHHANG_repository {

    public static List<KhachHang> getAllKH() {
        List<KhachHang> listKH = new ArrayList();
        ResultSet rs;
        String sql = "select * from KHACHHANG";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                int MA = rs.getInt(2);
                String HOTEN = rs.getString(3);
                String GIOITINH = rs.getString(4);
                String NGAYSINH = rs.getString(5);
                String SDT = rs.getString(6);
                String DIACHI = rs.getString(7);
                String THANHPHO = rs.getString(8);
                String QUOCGIA = rs.getString(9);
                String TENTAIKHOAN = rs.getString(10);
                String MATKHAU = rs.getString(11);
                String NHAPLAIMATKHAU = rs.getString(12);
                KhachHang KH = new KhachHang(ID,MA,HOTEN,GIOITINH,NGAYSINH,SDT,DIACHI,THANHPHO,QUOCGIA,TENTAIKHOAN,MATKHAU,NHAPLAIMATKHAU);
                listKH.add(KH);
            }
            return listKH;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int themKH(KhachHang KH) {
        String sql = "insert into KHACHHANG(HOTEN,GIOITINH,NGAYSINH,SDT,DIACHI,THANHPHO,QUOCGIA,TENTAIKHOAN,MATKHAU,NHAPLAIMK,HINHANH) values(?,?,?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.updateTongQuat(sql, KH.getHoTen(), KH.getGioiTinh(),
                KH.getNgaySinh(),KH.getSoDienThoai(), KH.getDiaChi(), KH.getThanhPho(), KH.getQuocGia(), KH.getTenTaiKhoan(), KH.getMatKhau(), KH.getNhapLaiMatKhau(), KH.getHinhAnh());

    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<KhachHang> listCheck = new ArrayList<>();
        listCheck = getAllKH();
        for (KhachHang x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }

}
