/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author djavu
 */
public abstract class Person {

    public abstract String[][] getProfilById(int id);

    public abstract int getIdUser(String a, String b);

    public abstract int cekUser(String a, String b);
    
    public abstract void deleteData(int id);

    //get jumlah baris
    protected int getJumlahBaris(ResultSet res) {
        int totalBaris = 0;
        try {
            res.last();
            totalBaris = res.getRow();
            res.beforeFirst();
        } catch (SQLException ex) {
            return 0;
        }
        return totalBaris;
    }
}
