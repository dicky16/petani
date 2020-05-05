package view.admin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HasilPanen;
import view.Petani;
import view.Profil;

/**
 *
 * @author djavu
 */
public class DataHasilPanen extends javax.swing.JFrame {

    /**
     * Creates new form Petani
     */
    int baris = 0;
    static Object kolom[] = {"No.", "Nama", "Harga Beli", "Harga Jual"};
    DefaultTableModel tabel = new DefaultTableModel(kolom, baris);

    public DataHasilPanen() {
        initComponents();
        PlaceHolder holderCar = new PlaceHolder(edt_cari, "Cari hasil panen");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_jenis_hasil_panen = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edt_nama = new javax.swing.JTextField();
        edt_harga_beli = new javax.swing.JTextField();
        edt_harga_jual = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        edt_cari = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_profil = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_member = new javax.swing.JMenuItem();
        menu_kategori = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_pembelian = new javax.swing.JMenuItem();
        menu_penjualan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Jenis Hasil Panen");

        tabel_jenis_hasil_panen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_jenis_hasil_panen);

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        jLabel3.setText("Harga Beli");

        jLabel4.setText("Harga Jual");

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        edt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt_cariKeyReleased(evt);
            }
        });

        jMenu1.setText("Menu");

        menu_profil.setText("Profil");
        menu_profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_profilMouseReleased(evt);
            }
        });
        jMenu1.add(menu_profil);

        jMenuItem2.setText("Keluar");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseReleased(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Master Data");

        menu_member.setText("Data Member");
        menu_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_memberMouseReleased(evt);
            }
        });
        jMenu2.add(menu_member);

        menu_kategori.setText("Data Kategori");
        menu_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_kategoriMouseReleased(evt);
            }
        });
        jMenu2.add(menu_kategori);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaksi");

        menu_pembelian.setText("Pembelian");
        menu_pembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_pembelianMouseReleased(evt);
            }
        });
        jMenu3.add(menu_pembelian);

        menu_penjualan.setText("Penjualan");
        menu_penjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_penjualanMouseReleased(evt);
            }
        });
        jMenu3.add(menu_penjualan);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_hapus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_tambah)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update)
                                .addGap(18, 18, 18)
                                .addComponent(btn_reset)
                                .addGap(18, 18, 18)
                                .addComponent(edt_cari))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(edt_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(edt_harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 380, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_reset)
                    .addComponent(btn_update)
                    .addComponent(edt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit)
                    .addComponent(btn_hapus))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        HasilPanen hasilpanen = new HasilPanen();
        String data[][] = hasilpanen.getDataHasilPanen();
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                int no = i + 1;
                tabel.addRow(new Object[]{no, data[i][0], data[i][1], data[i][2]});
            }
            tabel_jenis_hasil_panen.setModel(tabel);
        }
    }//GEN-LAST:event_formComponentShown

    private void menu_profilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_profilMouseReleased
        Profil profil = new Profil();
        this.setVisible(false);
        profil.setLocationRelativeTo(this);
        profil.setVisible(true);
    }//GEN-LAST:event_menu_profilMouseReleased

    private void jMenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseReleased
        Petani petani = new Petani();
        this.setVisible(false);
        petani.setLocationRelativeTo(this);
        petani.setVisible(true);
    }//GEN-LAST:event_jMenuItem2MouseReleased

    private void menu_memberMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_memberMouseReleased
        DataMember dataMember = new DataMember();
        this.setVisible(false);
        dataMember.setLocationRelativeTo(this);
        dataMember.setVisible(true);
    }//GEN-LAST:event_menu_memberMouseReleased

    private void menu_kategoriMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_kategoriMouseReleased
        DataHasilPanen dataHasilPanen = new DataHasilPanen();
        this.setVisible(false);
        dataHasilPanen.setLocationRelativeTo(this);
        dataHasilPanen.setVisible(true);
    }//GEN-LAST:event_menu_kategoriMouseReleased

    private void menu_pembelianMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_pembelianMouseReleased
        Pembelian pembelian = new Pembelian();
        this.setVisible(false);
        pembelian.setLocationRelativeTo(this);
        pembelian.setVisible(true);
    }//GEN-LAST:event_menu_pembelianMouseReleased

    private void menu_penjualanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_penjualanMouseReleased
        Penjualan penjualan = new Penjualan();
        this.setVisible(false);
        penjualan.setLocationRelativeTo(this);
        penjualan.setVisible(true);
    }//GEN-LAST:event_menu_penjualanMouseReleased

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        String nama = edt_nama.getText();
        int harga_beli = 0, harga_jual = 0;
        harga_beli = Integer.parseInt(edt_harga_beli.getText());
        harga_jual = Integer.parseInt(edt_harga_jual.getText());
        if (nama.isEmpty() || harga_beli == 0 || harga_jual == 0) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh kosong");
        } else {
            HasilPanen hasilpanen = new HasilPanen();
            int isNamaExists = hasilpanen.cekDataHasilPanen(nama);
//            System.out.println(""+isNamaExists);
            if (isNamaExists == 0) {
                hasilpanen.insertDataHasilPanen(nama, harga_beli, harga_jual);
                boolean status = hasilpanen.isCekStatus();
                if (status == true) {
                    //set to tabel hasil panen
                    tabel.getDataVector().removeAllElements();

                    String data[][] = hasilpanen.getDataHasilPanen();
                    if (data.length > 0) {
                        for (int i = 0; i < data.length; i++) {
                            int no = i + 1;
                            tabel.addRow(new Object[]{no, data[i][0], data[i][1], data[i][2]});
                        }
                        tabel_jenis_hasil_panen.setModel(tabel);
                    }
                    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Data sudah ada");
            }
        }

    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        edt_nama.setText("");
        edt_harga_beli.setText("");
        edt_harga_jual.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String nama = edt_nama.getText();
        int harga_beli = 0, harga_jual = 0;
        harga_beli = Integer.parseInt(edt_harga_beli.getText());
        harga_jual = Integer.parseInt(edt_harga_jual.getText());
        if (nama.isEmpty() || harga_beli == 0 || harga_jual == 0) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh kosong");
        } else {
            HasilPanen hasilpanen = new HasilPanen();
            int id = hasilpanen.getIDKategori();
            hasilpanen.updateDataHasilPanen(nama, harga_beli, harga_jual, id);
            boolean status = hasilpanen.isCekStatus();

            if (status == true) {
                //set to tabel hasil panen
                String data[][] = hasilpanen.getDataHasilPanen();
                tabel.getDataVector().removeAllElements();
                if (data.length > 0) {
                    for (int i = 0; i < data.length; i++) {
                        int no = i + 1;
                        tabel.addRow(new Object[]{no, data[i][0], data[i][1], data[i][2]});
                    }
                    tabel_jenis_hasil_panen.setModel(tabel);
                }
                JOptionPane.showMessageDialog(this, "Data berhasil diubah");
                edt_nama.setText("");
                edt_harga_beli.setText("");
                edt_harga_jual.setText("");
            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        int row = tabel_jenis_hasil_panen.getSelectedRow();
        String nama = tabel_jenis_hasil_panen.getValueAt(row, 1).toString();
        HasilPanen hasil = new HasilPanen();
        int id = hasil.getIdFromDb(nama);
        System.out.println("" + nama);
        hasil.setIDKategori(id);

        String dataById[][] = hasil.getDataHasilPanenById();
        edt_nama.setText(dataById[0][0]);
        edt_harga_beli.setText(dataById[0][1]);
        edt_harga_jual.setText(dataById[0][2]);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int row = tabel_jenis_hasil_panen.getSelectedRow();
        String nama = tabel_jenis_hasil_panen.getValueAt(row, 1).toString();
        HasilPanen hasil = new HasilPanen();
        hasil.deleteDataHasilPanen(nama);
//        System.out.println("" + nama);
        //set to tabel hasil panen
        String data[][] = hasil.getDataHasilPanen();

        if (data.length > 0) {
            tabel.getDataVector().removeAllElements();
            for (int i = 0; i < data.length; i++) {
                int no = i + 1;
                tabel.addRow(new Object[]{no, data[i][0], data[i][1], data[i][2]});
            }
            tabel_jenis_hasil_panen.setModel(tabel);
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void edt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt_cariKeyReleased
        String key = edt_cari.getText();
        HasilPanen hasilPanen = new HasilPanen();
        if (key.isEmpty()) {
            tabel.getDataVector().removeAllElements();
            String data[][] = hasilPanen.getDataHasilPanen();
            if (data.length > 0) {
                for (int i = 0; i < data.length; i++) {
                    int no = i + 1;
                    tabel.addRow(new Object[]{no, data[i][0], data[i][1], data[i][2]});
                }
                tabel_jenis_hasil_panen.setModel(tabel);
            }
        } else {
            String data[][] = hasilPanen.searchDataHasilPanen(key);
            if (data.length > 0) {
                tabel.getDataVector().removeAllElements();

                for (int i = 0; i < data.length; i++) {
                    int no = i + 1;
                    tabel.addRow(new Object[]{no, data[i][0], data[i][1], data[i][2]});
                }
                tabel_jenis_hasil_panen.setModel(tabel);
            }
        }
    }//GEN-LAST:event_edt_cariKeyReleased

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
            java.util.logging.Logger.getLogger(DataHasilPanen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataHasilPanen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataHasilPanen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataHasilPanen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataHasilPanen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update;
    private javax.swing.JTextField edt_cari;
    private javax.swing.JTextField edt_harga_beli;
    private javax.swing.JTextField edt_harga_jual;
    private javax.swing.JTextField edt_nama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menu_kategori;
    private javax.swing.JMenuItem menu_member;
    private javax.swing.JMenuItem menu_pembelian;
    private javax.swing.JMenuItem menu_penjualan;
    private javax.swing.JMenuItem menu_profil;
    private javax.swing.JTable tabel_jenis_hasil_panen;
    // End of variables declaration//GEN-END:variables
}