/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;
import java.sql.*;
import Database.Connect;
import java.io.InputStream;

/**
 *
 * @author howl1
 */
public class Sanpham {
    public Connect cn = new Connect();
    
    //Truy van tat ca du lieu trong Table LoaiSP

    public ResultSet ShowSanPham() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM Sanpham";
        return cn.LoadData(sql);
    }
    
     public ResultSet ShowSP(String msp) throws SQLException {
        String sql = "  SELECT * FROM Sanpham where IDSanPham='" + msp + "'  ";
        return cn.LoadData(sql);
    }
//Theo moi 1 dong du lieu vao table LoaiSP

    public void InsertDataSP(String msp, String tsp , String lsp, String gia, String brand,String sl) throws SQLException {
        String sql = "INSERT INTO Sanpham values('" + msp + "',N'" + tsp + "','" + lsp + "','" + gia + "','" + brand + "','" + sl + "')";
        cn.UpdateData(sql);
    }
//Dieu chinh 1 dong du lieu vao table LoaiSP

    public void EditDataSP(String msp, String tsp , String lsp, String gia, String brand,String sl) throws SQLException {
        String sql = "Update Sanpham set TenSanPham=N'" + tsp +"',IDLoai = '"+lsp+"',Gia = '"+gia+"',Brand = '"+brand+"',Soluong = '"+sl
                + "' where IDSanPham='" + msp + "'";

        cn.UpdateData(sql);
    }
//Xoa 1 dong du lieu vao table LoaiSP

    public void DeleteDataSP(String msp) throws SQLException {
        String sql = "Delete from Sanpham where IDSanPham='" + msp + "'";
        cn.UpdateData(sql);
    }
    
     public ResultSet timkiem1(String ten1) throws SQLException
    {
       
        String sql = "Select * from Sanpham where TenSanPham like '%"+ten1+"%'";
        return cn.LoadData(sql);
    }
     
     
     public ResultSet timkiemtheogia(String gia1,String gia2) throws SQLException
    {
       
        String sql = "select * from Sanpham where gia between "+ gia1 +" and "+gia2 ;
        return cn.LoadData(sql);
    }
     
     public ResultSet timkiemtheomaloai(String maloai) throws SQLException
    {
       
        String sql = "select Sanpham.IDsanpham , Sanpham.tensanpham , LoaiSanpham.TenLoai , Sanpham.gia from Sanpham inner join LoaiSanpham on Sanpham.IDLoai = LoaiSanpham.IDLoai where Tenloai ='"+maloai+"'";
        return cn.LoadData(sql);
    }
}
