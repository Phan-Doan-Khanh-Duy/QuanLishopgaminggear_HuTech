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
public class Hoadon {
    public Connect cn = new Connect();
    
    public ResultSet ShowHD() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM Hoadon";
        return cn.LoadData(sql);
    }
    
    public ResultSet ShowCTHD() throws SQLException {
        cn.connectSQL();
        String sql = "SELECT * FROM CTHD";
        return cn.LoadData(sql);
    }
    
     public ResultSet ThongKeAll(String nam , String ngay , String thang) throws SQLException {
       
        String sql = "SELECT SUM(total) AS DOANHTHU FROM Hoadon WHERE Year(Ngay)= "+ nam + "and Day(Ngay)="+ngay+ "and MONTH(Ngay)="+thang;
        return cn.LoadData(sql);
    }
     
      public ResultSet ThongKeNam(String nam) throws SQLException {
       
        String sql = "SELECT SUM(total) AS DOANHTHU FROM Hoadon WHERE Year(Ngay)= "+ nam;
        return cn.LoadData(sql);
    }
      
      public ResultSet ThongKeThang(String thang) throws SQLException {
       
        String sql = "SELECT SUM(total) AS DOANHTHU FROM Hoadon WHERE MONTH(Ngay)= "+ thang;
        return cn.LoadData(sql);
    }
      
      public ResultSet gophoadon(String id) throws SQLException {
       
        String sql = "select Hoadon.IDHoadon , ngay,IDSanPham,Soluong,gia,CTHD.Total from Hoadon inner join CTHD on Hoadon.IDHoadon = CTHD.IDHoadon where CTHD.IDHoadon ="+id;
        return cn.LoadData(sql);
    }
     
      
       public ResultSet hoadonthoengay(String ngay) throws SQLException {
       
        String sql = "select Hoadon.IDHoadon , ngay,IDSanPham,Soluong,gia,CTHD.Total from Hoadon inner join CTHD on Hoadon.IDHoadon = CTHD.IDHoadon where ngay = '"+ngay+"'";
        return cn.LoadData(sql);
    }
      
}
