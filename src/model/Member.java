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
public class Member extends Person {

    //diskon
    private final double SILVER = 0.05;
    private final double GOLD = 0.01;
    private final double PLATINUM = 0.15;

    //deklarasi
    private static String query;
    private ResultSet rs;
    private Statement stmt;
//    private static int IDUser;

    public String[][] getDataMember() {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT m.nama,m.alamat,j.jenis_member FROM tb_member m"
                    + " INNER JOIN tb_jenismember j ON m.id_jenisMember = j.id_jenisMember "
                    + "order by m.nama ";
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

    //insert data member
    public void insertDataMember(String nama, String alamat, int jenis_member) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();

        try {
            stmt = connection.createStatement();
            query = "INSERT INTO `tb_member` (`id_member`, `nama`, `alamat`, `id_jenisMember`) "
                    + "VALUES (NULL, '" + nama + "', '" + alamat + "', '" + jenis_member + "');";
            stmt.executeUpdate(query);
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //update data member
    public void updateDataMember(String nama, String alamat, int jenis_member) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();

        try {
            stmt = connection.createStatement();
            query = "UPDATE tb_member SET nama='" + nama + "', alamat='" + alamat + "', jenis_member='" + jenis_member + "' ";
            stmt.executeUpdate(query);
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public String[][] searchMember(String key) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT m.nama,m.alamat,j.jenis_member FROM tb_member m"
                    + " INNER JOIN tb_jenismember j ON m.id_jenisMember = j.id_jenisMember "
                    + "WHERE m.nama LIKE '%" + key + "%' "
                    + "order by m.nama ";
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

    //get list jenis member
    public String[] getListJenisMember() {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String[] data = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT id_jenisMember, jenis_member FROM tb_jenismember ";
            rs = stmt.executeQuery(query);
            int jumlahBaris = getJumlahBaris(rs);
            data = new String[jumlahBaris];
            int r = 0;
            while (rs.next()) {
                int id = rs.getInt(1);
                String member = rs.getString(2);
                String list = id + "-" + member;
                data[r] = list;
                r++;
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }

    //delete data member
    @Override
    public void deleteData(int id) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        try {
            stmt = connection.createStatement();
            query = "DELETE FROM tb_member WHERE id_member=" + id + " ";
            stmt.executeUpdate(query);

            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }

    //get list member by name
    public String[] getListJenisMemberById(int id_member) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String[] data = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT id_jenisMember, jenis_member FROM tb_jenismember WHERE id_jenisMember=" + id_member + " ";
            rs = stmt.executeQuery(query);
            int jumlahBaris = getJumlahBaris(rs);
            data = new String[jumlahBaris];
            int r = 0;
            while (rs.next()) {
                int id = rs.getInt(1);
                String member = rs.getString(2);
                String list = id + "-" + member;
                data[r] = list;
                r++;
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }

    //get id jenis member
    public int getIDJenisMember(String jenis) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        int id = 0;
        try {
            stmt = connection.createStatement();
            query = "SELECT id_jenisMember FROM tb_jenismember WHERE jenis_member='" + jenis + "' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt(1);
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return id;
    }

    @Override
    public String[][] getProfilById(int id) {

        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT m.nama,m.alamat,j.jenis_member FROM tb_member m"
                    + " INNER JOIN tb_jenismember j ON m.id_jenisMember = j.id_jenisMember "
                    + "WHERE m.id_member = " + id + " "
                    + "order by m.nama ";
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

    @Override
    public int getIdUser(String nama, String alamat) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        int id = 0;
        try {
            stmt = connection.createStatement();
            query = "SELECT id_member FROM tb_member WHERE nama='" + nama + "' AND alamat='" + alamat + "' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt(1);
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return id;
    }

    @Override
    public int cekUser(String nama, String alamat) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        int id = 0;
        try {
            stmt = connection.createStatement();
            query = "SELECT COUNT(nama) FROM tb_member WHERE nama='" + nama + "' AND alamat='" + alamat + "' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                id = rs.getInt(1);
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return id;
    }
    
    //get jenis member by id member
    public String getJenisMemberById(int id) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String jenis = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT j.jenis_member FROM tb_member m "
                    + "INNER JOIN tb_jenismember j ON m.id_jenisMember = j.id_jenisMember WHERE m.id_member = "+id+"; ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                jenis = rs.getString(1);
            }
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        return jenis;
    }

    //data diskon
    public double[] getDiskonSilver(int total) {
        double diskon = this.SILVER * total;
        double mBayar = total - diskon;
        double data[] = new double[2];
        data[0] = diskon;
        data[1] = mBayar;
        return data;
    }

    public double[] getDiskonGold(int total) {
        double diskon = this.GOLD * total;
        double mBayar = total - diskon;
        double data[] = new double[2];
        data[0] = diskon;
        data[1] = mBayar;
        return data;
    }

    public double[] getDiskonPlatinum(int total) {
        double diskon = this.PLATINUM * total;
        double mBayar = total - diskon;
        double data[] = new double[2];
        data[0] = diskon;
        data[1] = mBayar;
        return data;
    }

}
