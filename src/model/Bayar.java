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
public class Bayar implements InterfacePembayaran {

    //deklarasi
    private String query;
    private ResultSet rs;
    private Statement stmt;

    @Override
    public int getIDPembayaran(int id_transaksi) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT id_pembayaran FROM tb_pembayaran WHERE id_transaksi=" + id_transaksi + " ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error get id bayar : " + e.getMessage());
        }
        return data;
    }

    //insert data to laporan pembelian
    @Override
    public void insertLaporanBeli(int id_pembayaran, int total_bayar, String tanggal, int id_user) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "INSERT INTO `tb_laporan_pembelian` (`id_laporan_pembelian`, `id_pembayaran`, `total_bayar`, `tgl_bayar`, `id_user`) "
                    + "VALUES (NULL, '" + id_pembayaran + "', '" + total_bayar + "', '" + tanggal + "', '" + id_user + "'); ";
            stmt.executeUpdate(query);

            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error laporan : " + e.getMessage());
        }
    }

    //insert data to laporan penjualan
    public void insertLaporanJual(int id_pembayaran, int total_bayar, String tanggal, int id_user) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "INSERT INTO `tb_laporan_penjualan` (`id_laporan_pembelian`, `id_pembayaran`, `total_bayar`, `tgl_bayar`, `id_user`) "
                    + "VALUES (NULL, '"+id_pembayaran+"', '"+total_bayar+"', '"+tanggal+"', '"+id_user+"'); ";
            stmt.executeUpdate(query);

            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error laporan : " + e.getMessage());
        }
    }

    //insert data to stok hasil panen
    @Override
    public void insertToDBStokHasilPanen(int id_jenis, int jumlah_stok, String ket) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "INSERT INTO `stok_hasil_panen` (`id_stokHasilPanen`, `id_jenisHasilPanen`, `jumlah_stok_tersedia`, `keterangan`) "
                    + "VALUES (NULL, '" + id_jenis + "', '" + jumlah_stok + "', '" + ket + "'); ";
            stmt.executeUpdate(query);

            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error laporan : " + e.getMessage());
        }
    }

    //cek id if exists
    @Override
    public int cekIdHasilPanen(int id) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT id_jenisHasilPanen FROM stok_hasil_panen WHERE id_jenisHasilPanen=" + id + " ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error get id bayar : " + e.getMessage());
        }
        return data;
    }

    //update data  stok
    @Override
    public void updateStokHasilPanen(int id, int jumlah) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        try {
            stmt = connect.createStatement();
            query = "UPDATE `stok_hasil_panen` SET `jumlah_stok_tersedia` = '" + jumlah + "' WHERE `stok_hasil_panen`.`id_jenisHasilPanen` = " + id + " ; ";
            stmt.executeUpdate(query);

            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error laporan : " + e.getMessage());
        }
    }

    //get jumlah stok by id
    @Override
    public int getJumlahStok(int id) {
        Koneksi konek = new Koneksi();
        Connection connect = konek.koneksiDatabase();
        int data = 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT jumlah_stok_tersedia FROM stok_hasil_panen WHERE id_jenisHasilPanen=" + id + " ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Error get id bayar : " + e.getMessage());
        }
        return data;
    }
}
