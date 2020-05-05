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
public class User extends Person {

    //deklarasi
    private String query;
    private ResultSet rs;
    private Statement stmt;
    private static int IDUser;

    public static void setIDUser(int id_user) {
        User.IDUser = id_user;
    }

    public static int getIDUser() {
        return IDUser;
    }

    //cek user
    @Override
    public int cekUser(String username, String password) {
        Koneksi k = new Koneksi();
        Connection connection = k.koneksiDatabase();
        int data = 0;
        try {
            stmt = connection.createStatement();
            query = "SELECT COUNT(id_user) FROM tb_user where username='" + username + "'"
                    + " and password='" + password + "' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return data;
    }

    //get id user
    @Override
    public int getIdUser(String username, String password) {
        Koneksi koneksi = new Koneksi();
        java.sql.Connection connection = koneksi.koneksiDatabase();
        int data = 0;
        try {
            stmt = connection.createStatement();
            query = "SELECT id_user FROM tb_user where username='" + username + "'"
                    + " and password='" + password + "' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return data;
    }

    public int getIdUser(String nama) {
        Koneksi koneksi = new Koneksi();
        java.sql.Connection connection = koneksi.koneksiDatabase();
        int data = 0;
        try {
            stmt = connection.createStatement();
            query = "SELECT id_userLevel FROM tb_userlevel where nama='" + nama + "' ";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                data = rs.getInt(1);
            }
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
        return data;
    }

    //get profil
    @Override
    public String[][] getProfilById(int id_user) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT u.nama,u.email,u.alamat, u.username,u.password,l.nama FROM `tb_user` u INNER JOIN tb_userlevel l ON u.id_userLevel=l.id_userLevel"
                    + " WHERE id_user='" + id_user + "'";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            int jmlBaris = super.getJumlahBaris(rs);
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

    //edit profil
    public void updateProfil(String username, String password, String email, String nama, int id_user) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        try {
            stmt = connection.createStatement();
            query = "UPDATE `tb_user` SET nama='" + nama + "', email='" + email + "', username='" + username + "', password='" + password + "'"
                    + " WHERE id_user='" + id_user + "'";
            stmt.executeUpdate(query);
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }

    //for manager
    public void updateProfil(String username, String password, String email, String nama, String alamat, int idLevel, int id_user) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        try {
            stmt = connection.createStatement();
            query = "UPDATE `tb_user` SET alamat='" + alamat + "', nama='" + nama + "', id_userLevel='" + idLevel + "', "
                    + "email='" + email + "', username='" + username + "', password='" + password + "'"
                    + " WHERE id_user='" + id_user + "'";
            stmt.executeUpdate(query);
            stmt.close();
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }

    public String[][] getDataUser() {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String data[][] = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT u.nama,u.email, u.alamat, u.username,u.password,l.nama FROM `tb_user` u "
                    + "INNER JOIN tb_userlevel l ON u.id_userLevel=l.id_userLevel ";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            int jmlBaris = super.getJumlahBaris(rs);
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

    //get list user level
    public String[] getListLevelUser() {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String[] data = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT id_userLevel, nama FROM tb_userlevel order by nama ";
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

    //get list user level byid
    public String[] getListLevelUserById(int id_level) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();
        String[] data = null;
        try {
            stmt = connection.createStatement();
            query = "SELECT id_userLevel, nama FROM tb_userlevel WHERE id_userLevel='" + id_level + "' ";
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

    //insert data user
    public void insertDataUser(String nama, String alamat, String email, String username, String password, int id_userLevel) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();

        try {
            stmt = connection.createStatement();
            query = "INSERT INTO `tb_user` (`id_user`, `nama`, `alamat`, `email`, `username`, `password`, `id_userLevel`) "
                    + "VALUES (NULL, '" + nama + "', '" + alamat + "', '" + email + "', '" + username + "', '" + password + "', '" + id_userLevel + "'); ";
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    //delete data member
    @Override
    public void deleteData(int id) {
        Koneksi koneksi = new Koneksi();
        Connection connection = koneksi.koneksiDatabase();

        try {
            stmt = connection.createStatement();
            query = "DELETE FROM tb_user WHERE id_user = " + id + " ";
            stmt.executeUpdate(query);
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

}
