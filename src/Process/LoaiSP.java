/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import java.sql.*;
import Database.Connect;

/**
 *
 * @author howl1
 */
public class LoaiSP {
     public Connect cn = new Connect();
    //Truy van tat ca du lieu trong Table LoaiSP

    public ResultSet ShowLoaiSP() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM LoaiSanpham";
        return cn.LoadData(sql);
    }
//Truy van cac dong du lieu trong Table LoaiSP theo Maloai

    public ResultSet ShowLoaiSP(String ml) throws SQLException {
        String sql = "  SELECT * FROM LoaiSanpham where IDLoai='" + ml + "'  ";
        return cn.LoadData(sql);
    }
//Theo moi 1 dong du lieu vao table LoaiSP

    public void InsertData(String ml, String tl) throws SQLException {
        String sql = "INSERT INTO LoaiSanpham values('" + ml + "',N'" + tl + "')";
        cn.UpdateData(sql);
    }
//Dieu chinh 1 dong du lieu vao table LoaiSP

    public void EditData(String ml, String tl) throws SQLException {
        String sql = "Update LoaiSanpham set TenLoai=N'" + tl + "' where IDLoai='" + ml + "'";

        cn.UpdateData(sql);
    }
//Xoa 1 dong du lieu vao table LoaiSP

    public void DeleteData(String msp) throws SQLException {
        String sql = "Delete from LoaiSanpham where IDLoai='" + msp + "'";
        cn.UpdateData(sql);
    }
    
     public ResultSet timkiem(String ten) throws SQLException
    {
       
        String sql = "Select * from LoaiSanpham where TenLoai like '%"+ten+"%'";
        return cn.LoadData(sql);
    }
     
     public ResultSet timkiemtheoid(String idloai) throws SQLException
    {
       
        String sql = "Select * from LoaiSanpham where IDLoai like '%"+idloai+"%'";
        return cn.LoadData(sql);
    }
     
      public ResultSet timkiemtheochongoi(String chongoi1 , String chongoi2) throws SQLException
    {
       
        String sql = "Select * from LoaiSanpham where Chongoi BETWEEN "+chongoi1+"AND"+chongoi2;
        return cn.LoadData(sql);
    }
}
