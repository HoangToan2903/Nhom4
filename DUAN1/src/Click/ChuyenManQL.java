/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Click;

import DuAnNhom4_view.QuanLySanPham;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class ChuyenManQL {
     private JPanel root;
    private String kinSelected = "";
    private List<AutoClick> listClick = null;

    public ChuyenManQL(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kinSelected = "SanPhamKH";

        jpnItem.setBackground(new Color(102,102,102));
        jlbItem.setBackground(new Color(102,102,102));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new QuanLySanPham());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<AutoClick> listClick) {
        this.listClick = listClick;

        for (AutoClick item : listClick) {
            item.getJlb().addMouseListener(new LabeEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabeEvent implements MouseListener {

        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabeEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "QuanlyNhanVien":
                    node = new QuanLySanPham();
                    break;
                case "QuanLySanPham":
                    node = new QuanLySanPham();
                    break;
                case "QuanLyTaiKhoan":
                    node = new QuanLySanPham();
                    break;
                case "QuanLyKhuyenMai":
                    node = new QuanLySanPham();
                    break;
                default: 
                    node = new QuanLySanPham();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackgruoud(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kinSelected = kind;
            jpnItem.setBackground(new Color(102,102,102));
            jlbItem.setBackground(new Color(102,102,102));

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(102,102,102));
            jlbItem.setBackground(new Color(102,102,102));

        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kinSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(153, 153, 153));
                jlbItem.setBackground(new Color(153, 153, 153));

            }
        }

        private void setChangeBackgruoud(String kind) {
            for (AutoClick item : listClick) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                    jpnItem.setBackground(new Color(102,102,102));
                    jlbItem.setBackground(new Color(102,102,102));
                } else {
                    jpnItem.setBackground(new Color(102,102,102));
                    jlbItem.setBackground(new Color(102,102,102));
                }
            }
        }
    }
}
