/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DataBaseHospitalMS {
    public static Statement getStatement(){
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitall", "root", "");
            Statement stat = con.createStatement();
            return stat;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    
    }
}
