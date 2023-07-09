/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author btooo
 */
public class ConnectionDB {
    Connection cn;

   public Connection getCn() {
    try {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNHAHANG;encrypt=false;trustServerCertificate=true";
        String user = "sa";
        String pass = "123";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn = DriverManager.getConnection(url, user, pass);
        System.out.println("Kết nối csdl thành công");
    } catch (SQLException e) {
        System.out.println("Lỗi kết nối CSDL: " + e.getMessage());
    } catch (ClassNotFoundException e) {
        System.out.println("Không tìm thấy driver JDBC: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Lỗi chung: " + e.getMessage());
    }
    return cn;
}
   public void close()
    {
        try {
            cn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public ResultSet executeQueryy(String sql)
    {
        try {
            Statement s = cn.createStatement();
            return s.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public int executeUpdatee(String sql)
    {
        try {
            Statement s = cn.createStatement();
            return s.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return -1;
        }
    }
    public void open()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://" +
                    "localhost:1433;" +
                    "databaseName=QLNHAHANG;" +
                    "encrypt=true;" +
                    "trustServerCertificate=true;" +
                    "user=sa;" +
                    "password=123");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public ResultSet executeQuery(String sql){
        ResultSet rs = null;
        try {
            Statement stm = cn.createStatement();
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public boolean executeUpdate(String sql){
        try {
            Statement statement = cn.createStatement();
            int n = statement.executeUpdate(sql);
            if (n > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean excuteCallable(String sql) {
        try {
            CallableStatement callStatement = cn.prepareCall(sql);
            callStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    Object createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
      
}
