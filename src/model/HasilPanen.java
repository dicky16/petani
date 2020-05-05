/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author djavu
 */
public class HasilPanen {

    //deklarasi
    private String query;
    private ResultSet rs;
    private Statement stmt;
    private static int IDKategori;
    //bool for cek insert or update
    private static boolean cekStatus = false;

    public int getIDKategori() {
        return IDKategori;
    }

    public void setIDKategori(int IDKategori) {
        HasilPanen.IDKategori = IDKategori;
    }

    //getter setter status
    public boolean isCekStatus() {
        return cekStatus;
    }

    public void setCekStatus(boolean cekStatus) {
        HasilPanen.cekStatus = cekStatus;
    }

    //get jumlah baris
    private int getJumlahBaris(ResultSet res) {
        int totalBaris = 0;
        try {
            res.last();
            totalBaris = res.getRow();
            res.beforeFirst();
        } catch (Exception ex) {
            return 0;
        }
        return totalBaris;
    }

    // get id from tb jenis hasil panen
    public int getIdFromDb(String nama) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT id_jenisHasilPanen FROM tb_jenishasilpanen where nama='" + nama + "' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return data;
    }

    //get data hasil panen
    public String[][] getDataHasilPanen() {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT nama, harga_beli, harga_jual FROM tb_jenishasilpanen ";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            int jmlBaris = getJumlahBaris(rs);
            data = new String[jmlBaris][jmlKolom];
            int r = 0;
            while (rs.next()) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = rs.getString(c + 1);
                }
                r++;
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }

    //get data by id
    public String[][] getDataHasilPanenById() {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT nama, harga_beli, harga_jual FROM tb_jenishasilpanen WHERE id_jenisHasilPanen=" + getIDKategori() + " ";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            int jmlBaris = getJumlahBaris(rs);
            data = new String[jmlBaris][jmlKolom];
            int r = 0;
            while (rs.next()) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = rs.getString(c + 1);
                }
                r++;
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }

    //insert data hasil panen
    public void insertDataHasilPanen(String nama, int harga_beli, int harga_jual) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        try {
            stmt = connection.createStatement();
            query = "INSERT INTO tb_jenishasilpanen (nama, harga_beli, harga_jual) "
                    + "VALUES ('" + nama + "', '" + harga_beli + "', '" + harga_jual + "') ";
            stmt.executeUpdate(query);

            setCekStatus(true);
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //update data hasil panen
    public void updateDataHasilPanen(String nama, int harga_beli, int harga_jual, int id) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        try {
            stmt = connection.createStatement();
            query = "UPDATE `tb_jenishasilpanen` SET `nama` = '" + nama + "', `harga_beli` = '" + harga_beli + "', `harga_jual` = '" + harga_jual + "' "
                    + "WHERE `tb_jenishasilpanen`.`id_jenisHasilPanen` = " + id + ";";
            stmt.executeUpdate(query);

            setCekStatus(true);
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //delete data
    public void deleteDataHasilPanen(String name) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        try {
            stmt = connection.createStatement();
            query = "DELETE FROM tb_jenishasilpanen WHERE nama='" + name + "' ";
            stmt.executeUpdate(query);

            setCekStatus(true);
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //search data 
    public String[][] searchDataHasilPanen(String key) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT nama, harga_beli, harga_jual FROM tb_jenishasilpanen "
                    + "WHERE nama LIKE '%" + key + "%' order by nama ";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            int jmlBaris = getJumlahBaris(rs);
            data = new String[jmlBaris][jmlKolom];
            int r = 0;
            while (rs.next()) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = rs.getString(c + 1);
                }
                r++;
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }

    //cek nama if exists
    public int cekDataHasilPanen(String nama) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT COUNT(nama) FROM tb_jenishasilpanen where nama='" + nama + "' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return data;
    }

    

}
