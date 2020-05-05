/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author djavu
 */
public class Koneksi {
    
    public Connection koneksi = null;
    public Connection koneksiDatabase(){
        try {
            //setting driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            //create conecction
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql:///db_petani","root","");
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Connection Error : "+e.getMessage());
        }
        
        return koneksi;
    }
}
