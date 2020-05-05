/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author djavu
 */
public class Beli extends HasilPanen implements Transaksi {

    private String query;
    private ResultSet rs;
    private Statement stmt;

    //insert data transaksi
    @Override
    public void insertDataTransaksi(int jumlah_item, int id_user, int id_jenisTransaksi, int kode_unik) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "INSERT INTO `tb_transaksi` (`id_transaksi`, `jumlah_item`, `id_user`, `id_jenisTransaksi`, `kode_unik`) "
                    + "VALUES (NULL, '" + jumlah_item + "', '" + id_user + "', '" + id_jenisTransaksi + "', '" + kode_unik + "'); ";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //get jumlah baris
    @Override
    public int getJumlahBaris() {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT COUNT(id_transaksi) FROM tb_transaksi ";
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

    //insert to tb pembayaran
    @Override
    public void insertDataPembayaran(int total_bayar, String tgl_bayar, int id_transaksi) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "INSERT INTO tb_pembayaran VALUES (NULL, '" + total_bayar + "', '" + tgl_bayar + "', '" + id_transaksi + "') ";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //get id transaksi
    @Override
    public int getIdTransaksi(int kode_unik) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT id_transaksi FROM tb_transaksi WHERE kode_unik=" + kode_unik + " ";
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

    //get data laporan
    public String[][] getDataLaporanBeli() {
        Koneksi koneksi = new Koneksi();
        com.mysql.jdbc.Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT l.total_bayar, l.tgl_bayar, u.nama FROM tb_laporan_pembelian l "
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

    public int getJumlahBeli() {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT COUNT(id_laporan_pembelian) FROM tb_laporan_pembelian ";
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

    public int getTotalBeli() {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT SUM(total_bayar) FROM tb_laporan_pembelian  ";
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
