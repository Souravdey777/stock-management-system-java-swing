/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompanysystem;
import java.sql.*;
/**
 *
 * @authOR SNEHANKUR
 */
class MysqlConnect {
   
    Connection Conn=null;
    public static Connection ConnectDB() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_system","root","12345");//password for mysql local host.
        return conn;
    }        
}