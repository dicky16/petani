/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Bayar;
import model.Beli;
import model.User;

/**
 *
 * @author djavu
 */
public class Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form Pembayaran
     */
    public static String jenisTransaksi;
    //array for stok
    public static ArrayList<Integer> idJenisHasilPanen = new ArrayList<>();
    public static ArrayList<Integer> beratHasilPanen = new ArrayList<>();

    private String tanggal;
    private int totalBayar;
    private int idTransaksi;
    private int kode_unik;

    public Pembayaran() {
        initComponents();
    }

    public Pembayaran(int totalBayar, int idTransaksi, int kode_unik) {
        initComponents();
        this.totalBayar = totalBayar;
        this.idTransaksi = idTransaksi;
        this.kode_unik = kode_unik;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edt_tanggal_bayar = new javax.swing.JTextField();
        edt_total_bayar = new javax.swing.JTextField();
        edt_id_transaksi = new javax.swing.JTextField();
        btn_konfirmasi = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Konfirmasi pembayaran");

        jLabel2.setText("TOTAL BAYAR");

        jLabel3.setText("TANGGAL BAYAR");

        jLabel4.setText("ID TRANSAKSI");

        btn_konfirmasi.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btn_konfirmasi.setText("KONFIRMASI");
        btn_konfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konfirmasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_konfirmasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edt_tanggal_bayar)
                            .addComponent(edt_total_bayar)
                            .addComponent(edt_id_transaksi))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edt_total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edt_tanggal_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edt_id_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btn_konfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Date date = new Date();
        String tanggalBayar = date.toString();
//        System.out.println(""+tanggalBayar);
        tanggal = tanggalBayar;
        edt_tanggal_bayar.setText(tanggal);
        String total = "Rp." + totalBayar;
        edt_total_bayar.setText(total);
        Beli beli = new Beli();
        int idTransaksi = beli.getIdTransaksi(kode_unik);
        edt_id_transaksi.setText("" + idTransaksi);
    }//GEN-LAST:event_formComponentShown

    private void btn_konfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_konfirmasiActionPerformed
        Beli beli = new Beli();
        int idTransaksi = beli.getIdTransaksi(kode_unik);

        if (idTransaksi != 0) {
            if (jenisTransaksi.equalsIgnoreCase("pembelian")) {
                //insert to data bayar
                beli.insertDataPembayaran(totalBayar, tanggal, idTransaksi);
                //set data to laporan
                Bayar bayar = new Bayar();
                int id_pembayaran = bayar.getIDPembayaran(idTransaksi);
                System.out.println("id bayar :" + id_pembayaran);
                //inser to db stok
                System.out.println("id jenis hasil panen : " + idJenisHasilPanen.size());
                if (idJenisHasilPanen.size() > 0) {
                    for (int i = 0; i < idJenisHasilPanen.size(); i++) {
                        String keterangan = "aman";
                        int id = bayar.cekIdHasilPanen(idJenisHasilPanen.get(i));
                        if (id == 0) {
                            bayar.insertToDBStokHasilPanen(idJenisHasilPanen.get(i), beratHasilPanen.get(i), keterangan);
                            Pembayaran.beratHasilPanen.removeAll(Pembayaran.beratHasilPanen);
                            Pembayaran.idJenisHasilPanen.removeAll(Pembayaran.idJenisHasilPanen);
                        } else {
                            int jumlah = bayar.getJumlahStok(id);
                            int total = jumlah + beratHasilPanen.get(i);
                            bayar.updateStokHasilPanen(id, total);
                        }
                    }
                } else {
                    System.out.println("inser to db stok gagal");
                }

                bayar.insertLaporanBeli(id_pembayaran, totalBayar, tanggal, User.getIDUser());
                JOptionPane.showMessageDialog(this, "Pembayaran berhasil");
                this.setVisible(false);
            } else {
                //insert to data bayar
                beli.insertDataPembayaran(totalBayar, tanggal, idTransaksi);
                //set data to laporan
                Bayar bayar = new Bayar();
                int id_pembayaran = bayar.getIDPembayaran(idTransaksi);
                System.out.println("id bayar :" + id_pembayaran);
                //inser to db stok
                if (idJenisHasilPanen.size() > 0) {
                    for (int i = 0; i < idJenisHasilPanen.size(); i++) {
                        String keterangan = "aman";
                        int id = bayar.cekIdHasilPanen(idJenisHasilPanen.get(i));
                        if (id == 0) {
                            bayar.insertToDBStokHasilPanen(idJenisHasilPanen.get(i), beratHasilPanen.get(i), keterangan);
                        } else {
                            int jumlah = bayar.getJumlahStok(id);
                            int total = jumlah - beratHasilPanen.get(i);
                            bayar.updateStokHasilPanen(id, total);
                        }
                    }
                } else {
                    System.out.println("inser to db stok gagal");
                }

                bayar.insertLaporanJual(id_pembayaran, totalBayar, tanggal, User.getIDUser());
                JOptionPane.showMessageDialog(this, "Pembayaran berhasil");
                this.setVisible(false);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Pembayaran gagal");
        }
    }//GEN-LAST:event_btn_konfirmasiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_konfirmasi;
    private javax.swing.JTextField edt_id_transaksi;
    private javax.swing.JTextField edt_tanggal_bayar;
    private javax.swing.JTextField edt_total_bayar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
