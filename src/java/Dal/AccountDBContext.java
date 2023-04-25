/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import Model.Acount;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class AcountDBContext {
       public Acount getAccount(String email, String password) throws ClassNotFoundException, SQLException {
        Connection com = null;
        Acount acc = null;
        try {
            com = Dal.DBContext.DBContext();
            if (com != null) {
                String sql = " select accID, email, password, fullname, status, phone , role "
                        + "   from Accounts "
                        + "   where status = 1 and email = ? and password = ? COLLATE LAtin1_General_CS_AS ";
                PreparedStatement stm = com.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                ResultSet rs = stm.executeQuery();
                if (rs != null && rs.next()) {
                    int AccID = rs.getInt("accID");
                    String Email = rs.getString("email");
                    String Password = rs.getString("password");
                    String phone = rs.getString("phone");
                    String Fullname = rs.getString("fullname");
                    int Status = rs.getInt("status");
                    int Role = rs.getInt("role");
                    acc = new Acount(AccID, Email, Password, Fullname, Status, phone, Role);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (com != null) {
                try {
                    com.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return acc;
    }
    public static boolean FAccount(String email) throws ClassNotFoundException, SQLException {
        Connection com = null;
        Acount acc = null;
        try {
          com = Dal.DBContext.DBContext();
            if (com != null) {
                String sql = " select accID, email, password, fullname, status, phone , role "
                        + "   from Accounts "
                        + "   where email = ? ";
                PreparedStatement stm = com.prepareStatement(sql);
                stm.setString(1, email);
                ResultSet rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }else{
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean insertAccount(String email, String password, String fullname, String phone, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
