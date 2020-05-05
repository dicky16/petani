/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author djavu
 */
public class Jual extends Member {

    private String query;
    private ResultSet rs;
    private Statement stmt;

    //get data
    public String[][] getDataStok() {
        Koneksi koneksi = new Koneksi();
        com.mysql.jdbc.Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT j.nama, j.harga_jual, s.jumlah_stok_tersedia FROM stok_hasil_panen s "
                    + "INNER JOIN tb_jenishasilpanen j ON s.id_jenisHasilPanen = j.id_jenisHasilPanen "
                    + "WHERE jumlah_stok_tersedia > 0 "
                    + "order by j.nama; ";
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

    public int getJumlahBaris(ResultSet res) {
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

    //get data laporan
    public String[][] getDataLaporanJual() {
        Koneksi koneksi = new Koneksi();
        com.mysql.jdbc.Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT l.total_bayar, l.tgl_bayar, u.nama FROM tb_laporan_penjualan l "
                    + "INNER JOIN tb_user u ON l.id_user = u.id_user order by l.tgl_bayar; ";
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
    
    public int getJumlahJual() {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT COUNT(id_laporan_pembelian) FROM tb_laporan_penjualan ";
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
    
    public int getTotalJual() {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT SUM(total_bayar) FROM tb_laporan_penjualan  ";
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
    
    public String setIDR(double var) {
        //rupiah format
        String idr;
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rp = new DecimalFormatSymbols();
        rp.setCurrencySymbol("IDR. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(rp);
        //end
        idr = rupiah.format(var);
        return idr;
    }

}
