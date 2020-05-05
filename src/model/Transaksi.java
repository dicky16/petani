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
public interface Transaksi {

    //insert data transaksi
    public void insertDataTransaksi(int jumlah_item, int id_user, int id_jenisTransaksi, int kode_unik);

    //get jumlah baris
    public int getJumlahBaris();

    //insert to tb pembayaran
    public void insertDataPembayaran(int total_bayar, String tgl_bayar, int id_transaksi);

    //get id transaksi
    public int getIdTransaksi(int kode_unik);
}
