package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import POJO.Ban;

public class BANDAO extends ConnectionDB{
    public List<Ban> doc()
    {
        open();
        List<Ban> dsBan = new ArrayList<>();
        ResultSet rs = executeQuery("Select * from Ban");
        
        try {
            while (rs.next())
            {
                Ban b = new Ban();
                b.maBan = rs.getString("MaBan");
                b.tenBan = rs.getString("TenBan");
                b.soGhe = rs.getInt("SoGhe");
                b.trangThai = rs.getString("TrangThai");
                dsBan.add(b);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return dsBan;
    }
    
    public Ban doc(String bBan)
    {
        open();
        ResultSet rs = executeQuery("Select * from Ban where MaBan='" + bBan + "'");
        
        try {
            while (rs.next())
            {
                Ban b = new Ban();
                b.maBan = rs.getString("MaBan");
                b.tenBan = rs.getString("TenBan");
                b.soGhe = rs.getInt("SoGhe");
                b.trangThai = rs.getString("TrangThai");
                close();
                return b;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        close();
        return null;
    }
    
    public boolean them(String tenBan, int soGhe, String trangThai)
    {              
        open();
        boolean kq = executeUpdate("insert into Ban values('" 
                
                + tenBan + "', " 
                + soGhe + ", N'" 
                + trangThai + "')");
        close();
        return kq;
    }
    
    public boolean sua(String maBan, String tenBan, int soGhe, String trangThai)
    {              
        open();
        boolean kq = executeUpdate("update Ban set TenBan=N'"
                + tenBan + "', SoGhe=" 
                + soGhe + ", TrangThai=N'" 
                + trangThai + "' where MaBan='" + maBan + "'");
        close();
        return kq;
    }
    
    public boolean xoa(String maBan)
    {              
        open();
        boolean kq = executeUpdate("delete Ban where MaBan='" + maBan + "'");
        close();
        return kq;
    }  
}
