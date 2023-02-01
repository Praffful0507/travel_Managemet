/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

import java.sql.*;

/**
 *
 * @author pa688
 */
public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///tms","root","12345");
            
            s= c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
