
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rakib05
 */
public class javaconnect {
    Connection conn=null;
    
    public static Connection ConnecrDb(){
        try{
           Class.forName("org.sqlite.JDBC");
           Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\rakib05\\Documents\\NetBeansProjects\\StudentManagementSystem\\Student_Info.sqlite");
        return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
