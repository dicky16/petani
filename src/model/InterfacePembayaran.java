/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author djavu
 */
public interface InterfacePembayaran {

    public int getIDPembayaran(int id_transaksi);

    //insert data to laporan pembelian
    public void insertLaporanBeli(int id_pembayaran, int total_bayar, String tanggal, int id_user);

    //insert data to stok hasil panen
    public void insertToDBStokHasilPanen(int id_jenis, int jumlah_stok, String ket);

    //cek id if exists
    public int cekIdHasilPanen(int id);

    //update data  stok
    public void updateStokHasilPanen(int id, int jumlah);

    //get jumlah stok by id
    public int getJumlahStok(int id);
}
