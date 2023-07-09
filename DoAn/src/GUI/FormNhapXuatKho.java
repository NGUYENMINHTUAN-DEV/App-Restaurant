package GUI;

import DAO.CHITIETPHIEUNHAP;
import DAO.CHITIETPHIEUXUATDAO;
import DAO.DAO_PhieuXuat;
import DAO.NGUYENLIEUDAO;
import DAO.PHIEUNHAPDAO;
import POJO.ChiTietPhieu;
import POJO.NguyenLieu;
import POJO.PhieuNhapXuat;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class FormNhapXuatKho extends javax.swing.JFrame {
 DefaultTableModel dtmNhap = new DefaultTableModel();
    DefaultTableModel dtmXuat = new DefaultTableModel();
    DefaultTableModel dtmChiTiet = new DefaultTableModel();
    DefaultComboBoxModel<NguyenLieu> dcm = new DefaultComboBoxModel();
    NGUYENLIEUDAO dnl = new NGUYENLIEUDAO();
    PHIEUNHAPDAO dpn = new PHIEUNHAPDAO();
    DAO_PhieuXuat dpx = new DAO_PhieuXuat();
    CHITIETPHIEUNHAP dctpn = new CHITIETPHIEUNHAP();
    CHITIETPHIEUXUATDAO dctpx = new CHITIETPHIEUXUATDAO();

    public FormNhapXuatKho() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tbNhapKho.setModel(dtmNhap);
        tbXuatKho.setModel(dtmXuat);
        tbChiTietPhieu.setModel(dtmChiTiet);
        cbxNguyenLieu.setModel(dcm);
        hienThiPhieuNhap(dpn.doc());
        hienThiPhieuXuat(dpx.doc()); 
        
        List<NguyenLieu> dsNguyenLieu = dnl.doc();
        
        for (NguyenLieu nl : dsNguyenLieu)
        {
            cbxNguyenLieu.addItem(nl);
        }
    }
    
    private void hienThiPhieuNhap(List<PhieuNhapXuat> dsPhieu)
    {
        dtmNhap.setRowCount(0);
        
        Vector<Object> tieuDe = new Vector<>();
        tieuDe.add("Mã phiếu nhập");
        tieuDe.add("Ngày nhập");
        tieuDe.add("Tổng tiền");
        dtmNhap.setColumnIdentifiers(tieuDe);
        
        for (PhieuNhapXuat p : dsPhieu)
        {
            Vector<Object> v = new Vector<>();
            v.add(p.maPhieu);
            v.add(p.ngay);
            v.add(p.tongTien);
            dtmNhap.addRow(v);
        }
    }
    
    private void hienThiPhieuXuat(List<PhieuNhapXuat> dsPhieu)
    {
        dtmXuat.setRowCount(0);
        
        Vector<Object> tieuDe = new Vector<>();
        tieuDe.add("Mã phiếu xuất");
        tieuDe.add("Ngày xuất");
        tieuDe.add("Tổng tiền");
        dtmXuat.setColumnIdentifiers(tieuDe);
        
        for (PhieuNhapXuat p : dsPhieu)
        {
            Vector<Object> v = new Vector<>();
            v.add(p.maPhieu);
            v.add(p.ngay);
            v.add(p.tongTien);
            dtmXuat.addRow(v);
        }
    }
    
    private void hienThiChiTietPhieuNhap(List<ChiTietPhieu> dsChiTiet)
    {
        dtmChiTiet.setRowCount(0);
        
        Vector<Object> tieuDe = new Vector<>();
        tieuDe.add("Mã phiếu nhập");
        tieuDe.add("Mã nguyên liệu");
        tieuDe.add("Số lượng");
        tieuDe.add("Đơn giá");
        dtmChiTiet.setColumnIdentifiers(tieuDe);
        
        for (ChiTietPhieu ctp : dsChiTiet)
        {
            Vector<Object> v = new Vector<>();
            v.add(ctp.maPhieu);
            v.add(ctp.maNguyenLieu);
            v.add(ctp.soLuong);
            v.add(ctp.donGia);
            dtmChiTiet.addRow(v);
        }
    }
    
    private void hienThiChiTietPhieuXuat(List<ChiTietPhieu> dsChiTiet)
    {
        dtmChiTiet.setRowCount(0);
        
        Vector<Object> tieuDe = new Vector<>();
        tieuDe.add("Mã phiếu xuất");
        tieuDe.add("Mã nguyên liệu");
        tieuDe.add("Số lượng");
        tieuDe.add("Đơn giá");
        dtmChiTiet.setColumnIdentifiers(tieuDe);
        
        for (ChiTietPhieu ctp : dsChiTiet)
        {
            Vector<Object> v = new Vector<>();
            v.add(ctp.maPhieu);
            v.add(ctp.maNguyenLieu);
            v.add(ctp.soLuong);
            v.add(ctp.donGia);
            dtmChiTiet.addRow(v);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhapKho = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbXuatKho = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        cbxNguyenLieu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtSoLuong = new javax.swing.JTextField();
        tbChiTiet = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbChiTietPhieu = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtMaPhieu = new javax.swing.JTextField();
        btnNhap = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnCapNhatPhieu = new javax.swing.JButton();
        btnXoaPhieu = new javax.swing.JButton();
        dpNgay = new org.jdatepicker.JDatePicker();
        btnXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NHẬP VÀ XUẤT KHO");
        setBackground(new java.awt.Color(255, 255, 204));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lịch sử nhập kho"));

        tbNhapKho.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbNhapKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbNhapKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhapKhoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhapKho);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lịch sử xuất kho"));

        tbXuatKho.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbXuatKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbXuatKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbXuatKhoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbXuatKho);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Chi tiết phiếu"));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Số lượng");

        btnThem.setBackground(new java.awt.Color(204, 255, 204));
        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Đơn giá");

        txtDonGia.setEditable(false);
        txtDonGia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        cbxNguyenLieu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Tên nguyên liệu");
        jLabel4.setToolTipText("");

        btnCapNhat.setBackground(new java.awt.Color(204, 255, 204));
        btnCapNhat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(204, 255, 204));
        btnXoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhat)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addComponent(txtDonGia)
                    .addComponent(cbxNguyenLieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoLuong))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxNguyenLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa))
                .addContainerGap())
        );

        tbChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        tbChiTiet.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Danh sách chi tiết"));

        tbChiTietPhieu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbChiTietPhieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbChiTietPhieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChiTietPhieuMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbChiTietPhieu);

        javax.swing.GroupLayout tbChiTietLayout = new javax.swing.GroupLayout(tbChiTiet);
        tbChiTiet.setLayout(tbChiTietLayout);
        tbChiTietLayout.setHorizontalGroup(
            tbChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        tbChiTietLayout.setVerticalGroup(
            tbChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin phiếu"));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Mã phiếu");

        txtMaPhieu.setEditable(false);
        txtMaPhieu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnNhap.setBackground(new java.awt.Color(204, 255, 204));
        btnNhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnNhap.setText("Nhập kho");
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Tổng tiền");

        txtTongTien.setEditable(false);
        txtTongTien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Ngày");

        btnCapNhatPhieu.setBackground(new java.awt.Color(204, 255, 204));
        btnCapNhatPhieu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCapNhatPhieu.setText("Cập nhật");
        btnCapNhatPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatPhieuActionPerformed(evt);
            }
        });

        btnXoaPhieu.setBackground(new java.awt.Color(204, 255, 204));
        btnXoaPhieu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnXoaPhieu.setText("Xóa");
        btnXoaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhieuActionPerformed(evt);
            }
        });

        btnXuat.setBackground(new java.awt.Color(204, 255, 204));
        btnXuat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnXuat.setText("Xuất kho");
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnNhap)
                                .addGap(18, 18, 18)
                                .addComponent(btnXuat)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhatPhieu)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaPhieu))
                            .addComponent(txtTongTien)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaPhieu)
                            .addComponent(dpNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dpNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhap)
                    .addComponent(btnCapNhatPhieu)
                    .addComponent(btnXoaPhieu)
                    .addComponent(btnXuat))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isEmptyPhieu()
    {
        return txtMaPhieu.getText().isEmpty() || txtTongTien.getText().isEmpty();
    }
    
    private boolean isEmpty()
    {
        return txtDonGia.getText().isEmpty() || txtMaPhieu.getText().isEmpty()
            || txtSoLuong.getText().isEmpty();
    }
    
    public void setButtonEditable(boolean value)
    {
        txtDonGia.setEditable(value);
        txtSoLuong.setEditable(value);
        txtMaPhieu.setEditable(value);
        txtTongTien.setEditable(value);
        
        btnCapNhat.setEnabled(!value);
        btnThem.setEnabled(!value);
        btnXoa.setEnabled(!value);
        btnCapNhatPhieu.setEnabled(!value);
        btnNhap.setEnabled(!value);
        btnXoaPhieu.setEnabled(!value);
    }
    
    private void tbXuatKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbXuatKhoMouseClicked
        PhieuNhapXuat pnx = dpx.doc(dtmXuat.getValueAt(tbXuatKho.getSelectedRow(), 0).toString());
        hienThiChiTietPhieuXuat(dctpx.docTheoLoai(dtmXuat.getValueAt(tbXuatKho.getSelectedRow(), 0).toString()));
        txtMaPhieu.setText(pnx.maPhieu);
        txtTongTien.setText(String.valueOf(pnx.tongTien));
        
        Calendar cal = Calendar.getInstance();
        
        cal.setTimeInMillis(pnx.ngay.getTime());        
        dpNgay.getModel().setDate(
                cal.get(Calendar.YEAR), 
                cal.get(Calendar.MONTH), 
                cal.get(Calendar.DATE));
        dpNgay.getModel().setSelected(true);
        
        tbNhapKho.clearSelection();
    }//GEN-LAST:event_tbXuatKhoMouseClicked

    private void tbNhapKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhapKhoMouseClicked
        PhieuNhapXuat pnx = dpn.doc(dtmNhap.getValueAt(tbNhapKho.getSelectedRow(), 0).toString());
        hienThiChiTietPhieuNhap(dctpn.docTheoLoai(dtmNhap.getValueAt(tbNhapKho.getSelectedRow(), 0).toString()));
        txtMaPhieu.setText(pnx.maPhieu);
        txtTongTien.setText(String.valueOf(pnx.tongTien));
        
        Calendar cal = Calendar.getInstance();
        
        cal.setTimeInMillis(pnx.ngay.getTime());        
        dpNgay.getModel().setDate(
                cal.get(Calendar.YEAR), 
                cal.get(Calendar.MONTH), 
                cal.get(Calendar.DATE));
        dpNgay.getModel().setSelected(true);
        
        tbXuatKho.clearSelection();
    }//GEN-LAST:event_tbNhapKhoMouseClicked

    private void tbChiTietPhieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChiTietPhieuMouseClicked
        String maPhieu = dtmChiTiet.getValueAt(tbChiTietPhieu.getSelectedRow(), 0).toString();
        String maNguyenLieu = dtmChiTiet.getValueAt(tbChiTietPhieu.getSelectedRow(), 1).toString();
        ChiTietPhieu ctp = null;
        
        if (tbNhapKho.getSelectedRow() >= 0)
        {
            ctp = dctpn.doc(maPhieu, maNguyenLieu);
        }
        else
        {
            ctp = dctpx.doc(maPhieu, maNguyenLieu);
        }
        
        txtSoLuong.setText(String.valueOf(ctp.soLuong));
        txtDonGia.setText(String.valueOf(ctp.donGia));
        
        for (int i = 0; i < dcm.getSize(); i++)
        {
            NguyenLieu lm = (NguyenLieu) dcm.getElementAt(i);
            
            if (lm.maNguyenLieu.equals(maNguyenLieu))
            {
                dcm.setSelectedItem(lm);
                break;
            }
        }
    }//GEN-LAST:event_tbChiTietPhieuMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (tbChiTietPhieu.getSelectedRow() >= 0)
        {
            int kq = JOptionPane.showConfirmDialog(
                rootPane, 
                "Bạn có muốn xóa chi tiết này không?",
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION);
        
            if (kq == JOptionPane.YES_OPTION)
            {
                String maPhieu = txtMaPhieu.getText();
                NguyenLieu nl = (NguyenLieu) dcm.getSelectedItem();
                
                if (tbNhapKho.getSelectedRow() >= 0)
                {
                    if (dctpn.xoa(maPhieu, nl.maNguyenLieu))
                    {
                        tbNhapKhoMouseClicked(null);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Xóa chi tiết thất bại");
                    }
                }
                else
                {
                    if (dctpx.xoa(maPhieu, nl.maNguyenLieu))
                    {
                        tbXuatKhoMouseClicked(null);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Xóa chi tiết thất bại");
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn chi tiết cần xóa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if(btnCapNhat.getText().equals("Cập nhật"))
        {
            setButtonEditable(true);
            btnCapNhat.setEnabled(true);
            btnCapNhat.setText("Lưu");
        }
        else if (!isEmpty())
        {
            String maPhieu = txtMaPhieu.getText();
            NguyenLieu nl = (NguyenLieu) dcm.getSelectedItem();
            int soLuong = Integer.parseInt(txtSoLuong.getText());
            int donGia = Integer.parseInt(txtDonGia.getText());
            
            if (tbNhapKho.getSelectedRow() >= 0)
            {
                if (dctpn.sua(maPhieu, nl.maNguyenLieu, soLuong, donGia))
                {
                    tbNhapKhoMouseClicked(null);
                }
            }
            else
            {
                if (dctpx.sua(maPhieu, nl.maNguyenLieu, soLuong, donGia))
                {
                    tbXuatKhoMouseClicked(null);
                }
            }
            
            btnCapNhat.setText("Cập nhật");
            setButtonEditable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin của bàn cần thêm.");
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(btnThem.getText().equals("Thêm"))
        {
            tbChiTietPhieu.clearSelection();
            txtSoLuong.setText("");
            txtDonGia.setText("");    
            setButtonEditable(true);
            btnThem.setEnabled(true);
            btnThem.setText("Lưu");
        }
        else if (!isEmpty())
        {
            String maPhieu = txtMaPhieu.getText();
            NguyenLieu nl = (NguyenLieu) dcm.getSelectedItem();
            int soLuong = Integer.parseInt(txtSoLuong.getText());
            int donGia = Integer.parseInt(txtDonGia.getText());
            
            if (tbNhapKho.getSelectedRow() >= 0)
            {
                if (dctpn.them(maPhieu, nl.maNguyenLieu, soLuong, donGia))
                {
                    tbNhapKhoMouseClicked(null);
                }
            }
            else
            {
                if (dctpx.them(maPhieu, nl.maNguyenLieu, soLuong, donGia))
                {
                    tbXuatKhoMouseClicked(null);
                }
            }
            
            btnThem.setText("Thêm");
            setButtonEditable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin của bàn cần thêm.");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhieuActionPerformed
        if (tbNhapKho.getSelectedRow() >= 0 || tbXuatKho.getSelectedRow() >= 0)
        {
            int kq = JOptionPane.showConfirmDialog(
                rootPane, 
                "Bạn có muốn xóa phiếu này không?",
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION);
        
            if (kq == JOptionPane.YES_OPTION)
            {
                String maPhieu = txtMaPhieu.getText();
                
                if (tbNhapKho.getSelectedRow() >= 0)
                {
                    if (dpn.xoa(maPhieu))
                    {
                        hienThiPhieuNhap(dpn.doc());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Xóa phiếu thất bại");
                    }
                }
                else
                {
                    if (dpx.xoa(maPhieu))
                    {
                        hienThiPhieuXuat(dpx.doc());
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Xóa phiếu thất bại");
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn chi tiết cần xóa");
        }
    }//GEN-LAST:event_btnXoaPhieuActionPerformed

    private void btnCapNhatPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatPhieuActionPerformed
        if(btnCapNhatPhieu.getText().equals("Cập nhật"))
        {
            setButtonEditable(true);
            btnCapNhatPhieu.setEnabled(true);
            btnCapNhatPhieu.setText("Lưu");
        }
        else if (!isEmptyPhieu())
        {
            String maPhieu = txtMaPhieu.getText();
            int tongTien = Integer.parseInt(txtTongTien.getText());
            
            Date ngay = new java.sql.Date(
                    dpNgay.getModel().getYear() - 1900,
                    dpNgay.getModel().getMonth() - 1,
                    dpNgay.getModel().getDay() - 1);
            
            if (tbNhapKho.getSelectedRow() >= 0)
            {
                if (dpn.sua(maPhieu, ngay, tongTien))
                {
                    hienThiPhieuNhap(dpn.doc());
                }
            }
            else
            {
                if (dpx.sua(maPhieu, ngay, tongTien))
                {
                    hienThiPhieuXuat(dpx.doc());
                }
            }
            
            btnCapNhatPhieu.setText("Cập nhật");
            setButtonEditable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin của bàn cần thêm.");
        }
    }//GEN-LAST:event_btnCapNhatPhieuActionPerformed

    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed
        if (btnNhap.getText().equals("Nhập kho"))
        {
            tbNhapKho.clearSelection();
            txtMaPhieu.setText("");
            txtTongTien.setText("");    
            setButtonEditable(true);
            btnNhap.setEnabled(true);
            btnNhap.setText("Lưu");
        }
        else if (!isEmptyPhieu())
        {
            String maPhieu = txtMaPhieu.getText();
            int tongTien = Integer.parseInt(txtTongTien.getText());
            
            Date ngay = new java.sql.Date(
                    dpNgay.getModel().getYear() - 1900,
                    dpNgay.getModel().getMonth() - 1,
                    dpNgay.getModel().getDay() - 1);
            
            if (dpn.them(maPhieu, ngay, tongTien))
            {
                hienThiPhieuNhap(dpn.doc());
            }
            
            btnNhap.setText("Nhập kho");
            setButtonEditable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin nhập kho.");
        }
    }//GEN-LAST:event_btnNhapActionPerformed

    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
       if (btnXuat.getText().equals("Xuất kho"))
        {
            tbXuatKho.clearSelection();
            txtMaPhieu.setText("");
            txtTongTien.setText("");    
            setButtonEditable(true);
            btnXuat.setEnabled(true);
            btnXuat.setText("Lưu");
        }
        else if (!isEmptyPhieu())
        {
            String maPhieu = txtMaPhieu.getText();
            int tongTien = Integer.parseInt(txtTongTien.getText());
            
            Date ngay = new java.sql.Date(
                    dpNgay.getModel().getYear() - 1900,
                    dpNgay.getModel().getMonth() - 1,
                    dpNgay.getModel().getDay() - 1);
            
            if (dpx.them(maPhieu, ngay, tongTien))
            {
                hienThiPhieuXuat(dpx.doc());
            }
            
            btnXuat.setText("Xuất kho");
            setButtonEditable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin xuất kho.");
        }
    }//GEN-LAST:event_btnXuatActionPerformed

    public static void main(String[] args) {
        new FormNhapXuatKho();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnCapNhatPhieu;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaPhieu;
    private javax.swing.JButton btnXuat;
    private javax.swing.JComboBox<NguyenLieu> cbxNguyenLieu;
    private org.jdatepicker.JDatePicker dpNgay;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel tbChiTiet;
    private javax.swing.JTable tbChiTietPhieu;
    private javax.swing.JTable tbNhapKho;
    private javax.swing.JTable tbXuatKho;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

}
