package GUI;

import DAO.BANDAO;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import POJO.Ban;
import javax.swing.JFrame;

public class BAN extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    BANDAO db = new BANDAO();
    
    public BAN() {
        initComponents();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setVisible(true);
        setLocationRelativeTo(null);
         this.setTitle("BÀN");
        tbBan.setModel(dtm);
        hienThi(db.doc());
    }
    
    private void hienThi(List<Ban> dsBan)
    {
        dtm.setRowCount(0);
        
        Vector<Object> tieuDe = new Vector<>();
        tieuDe.add("Mã bàn");
        tieuDe.add("Tên bàn");
        tieuDe.add("Số ghế");
        tieuDe.add("Trạng thái");
        dtm.setColumnIdentifiers(tieuDe);
        
        for (Ban b : dsBan)
        {
            Vector<Object> v = new Vector<>();
            v.add(b.maBan);
            v.add(b.tenBan);
            v.add(b.soGhe);
            v.add(b.trangThai);
            dtm.addRow(v);
        }
    }
    
    public void setButtonEditable(boolean value)
    {
        txtTenBan.setEditable(value);      
        txtSoGhe.setEditable(value);
        txtTrangThai.setEditable(value);     
        btnCapNhat.setEnabled(!value);
        btnThem.setEnabled(!value);
        btnXoa.setEnabled(!value);
    }
    
    private boolean isEmpty()
    {
        return txtTenBan.getText().isEmpty()
            || txtSoGhe.getText().isEmpty() || txtTrangThai.getText().isEmpty();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBan = new javax.swing.JTable();
        txtMaBan = new javax.swing.JTextField();
        txtTenBan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtSoGhe = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BÀN");

        tbBan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbBan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbBan);

        txtMaBan.setEditable(false);
        txtMaBan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtTenBan.setEditable(false);
        txtTenBan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon("D:\\FILEDOAN\\DoAn\\src\\Image\\insert.png")); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Số ghế");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Tên bàn");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Mã bàn");

        btnCapNhat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon("D:\\FILEDOAN\\DoAn\\src\\Image\\edit.png")); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon("D:\\FILEDOAN\\DoAn\\src\\Image\\delete.png")); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        txtSoGhe.setEditable(false);
        txtSoGhe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtTrangThai.setEditable(false);
        txtTrangThai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Trạng thái");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaBan)
                            .addComponent(txtTenBan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTrangThai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoGhe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnCapNhat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoGhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBanMouseClicked
        Ban b = db.doc(dtm.getValueAt(tbBan.getSelectedRow(), 0).toString());
        
        txtMaBan.setText(b.maBan);
        txtTenBan.setText(b.tenBan);      
        txtSoGhe.setText(String.valueOf(b.soGhe));
        txtTrangThai.setText(b.trangThai);  
    }//GEN-LAST:event_tbBanMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(btnThem.getText().equals("Thêm"))
        {
            tbBan.clearSelection();
            txtTenBan.setText("");    
            txtSoGhe.setText("");
            txtTrangThai.setText(""); 
            setButtonEditable(true);
            btnThem.setEnabled(true);
            btnThem.setText("Lưu");
            txtMaBan.setEnabled(false);
        }
        
        else if(!isEmpty())
        {
            
            String tenBan = txtTenBan.getText();
            int soGhe = Integer.parseInt(txtSoGhe.getText());
            String trangThai = txtTrangThai.getText();
            
            if (db.them(tenBan, soGhe, trangThai))
            {
                hienThi(db.doc());
            }
            
            btnThem.setText("Thêm");
            setButtonEditable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin của bàn cần thêm.");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if(btnCapNhat.getText().equals("Cập nhật"))
        {
            btnCapNhat.setText("Lưu");
            setButtonEditable(true);
            btnCapNhat.setEnabled(true);
        }
        else if (!isEmpty())
        {
            String maBan = txtMaBan.getText();
            String tenBan = txtTenBan.getText();
            int soGhe = Integer.parseInt(txtSoGhe.getText());
            String trangThai = txtTrangThai.getText();
            
            if (db.sua(maBan, tenBan, soGhe, trangThai))
            {
                hienThi(db.doc());
            }
            
            btnCapNhat.setText("Cập nhật");
            setButtonEditable(false);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin món ăn");
            
            btnCapNhat.setText("Cập nhật");
            setButtonEditable(false);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       if (tbBan.getSelectedRow() >= 0)
        {
            int kq = JOptionPane.showConfirmDialog(
                rootPane, 
                "Bạn có muốn xóa bàn này không?",
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION);
        
            if (kq == JOptionPane.YES_OPTION)
            {
                String maBan = txtMaBan.getText();
                
                if (db.xoa(maBan))
                {
                    hienThi(db.doc());
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Xóa bàn thất bại");
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn thông tin bàn cần xóa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    public static void main(String[] args) {
        new BAN();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tbBan;
    private javax.swing.JTextField txtMaBan;
    private javax.swing.JTextField txtSoGhe;
    private javax.swing.JTextField txtTenBan;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
