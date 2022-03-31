/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.*;
import javax.swing.*;

import java.sql.Connection;
import java.sql.PreparedStatemen t;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


//tk: admin
//mk ::: 123


public class Connect {
    public Connection conn ;
    public Connection getConn() {
        return conn;
    }
           public void connectSQL() throws SQLException {
        try {
            String userName = "sa";
            String password = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=HiuTech;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = java.sql.DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ket noi CSDL that bai", "Thong bao", 1);
        }
        
       

    }
// để truy vấn , load dữ liệu trong sql sang java đ xem 
    public ResultSet LoadData(String sql) {
        ResultSet result = null;
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
//  cho quyền xóa sửa update 
public void UpdateData(String sql) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PreparedStatement prepareStatement(String admin) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

