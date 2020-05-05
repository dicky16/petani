/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import com.placeholder.PlaceHolder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Beli;
import model.Jual;
import model.User;
import view.Petani;
import view.Profil;

/**
 *
 * @author djavu
 */
public class Penjualan extends javax.swing.JFrame {

    /**
     * Creates new form Petani
     */
    private static ArrayList<Integer> aTotal = new ArrayList<>();
    private static ArrayList<String> tItem = new ArrayList<>();
    private static ArrayList<Integer> tHarga = new ArrayList<>();

    private static int mTotal = 0;
    private static int mTotalDiskon = 0;

    DefaultListModel listModel = new DefaultListModel();
    DefaultListModel listJual = new DefaultListModel();

    public Penjualan() {
        initComponents();
        PlaceHolder place = new PlaceHolder(edt_cari, "Cari...");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        edt_cari = new javax.swing.JTextField();
        btn_pilih = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        tv_total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_bayar = new javax.swing.JButton();
        tv_judul = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_stok = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_hapus = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        list_yang_dibeli = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        edt_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tv_diskon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tv_jenis_member = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_profil = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_member = new javax.swing.JMenuItem();
        menu_kategori = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menu_pembelian = new javax.swing.JMenuItem();
        menu_penjualan = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("CV. PETANI JAYA");

        edt_cari.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        btn_pilih.setBackground(new java.awt.Color(0, 153, 51));
        btn_pilih.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_pilih.setForeground(new java.awt.Color(255, 255, 255));
        btn_pilih.setText("Pilih Jenis");
        btn_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        tv_total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Total");

        btn_bayar.setBackground(new java.awt.Color(0, 153, 51));
        btn_bayar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btn_bayar.setForeground(new java.awt.Color(255, 255, 255));
        btn_bayar.setText("Bayar");
        btn_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bayarActionPerformed(evt);
            }
        });

        tv_judul.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tv_judul.setText("Penjualan");

        list_stok.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        list_stok.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(list_stok);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setText("Stok Tersedia");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setText("Item Dipilih");

        btn_hapus.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btn_hapus.setText("Hapus");

        list_yang_dibeli.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jScrollPane5.setViewportView(list_yang_dibeli);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("ID Member");

        edt_id.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        edt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt_idKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Disc.");

        tv_diskon.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tv_diskon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tv_diskonKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Member");

        tv_jenis_member.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tv_jenis_member.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tv_jenis_memberKeyReleased(evt);
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

        jMenu5.setText("Transaksi");

        menu_pembelian.setText("Pembelian");
        menu_pembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_pembelianMouseReleased(evt);
            }
        });
        jMenu5.add(menu_pembelian);

        menu_penjualan.setText("Penjualan");
        menu_penjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menu_penjualanMouseReleased(evt);
            }
        });
        jMenu5.add(menu_penjualan);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel9))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tv_diskon, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(tv_total))
                                        .addGap(65, 65, 65)
                                        .addComponent(btn_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tv_jenis_member, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_hapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(edt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tv_judul, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(510, 510, 510))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tv_judul, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(edt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(tv_jenis_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(edt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(btn_hapus)
                                        .addComponent(btn_reset)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(tv_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tv_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(btn_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihActionPerformed
        Jual jual = new Jual();
        if (list_stok.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih item !");
        } else {
            String itemDipilih = list_stok.getSelectedValue();
            String[] h = itemDipilih.split(" @");
            String mBerat = JOptionPane.showInputDialog(this, "Masukkan berat " + h[0] + " (kg)");
            String item = h[0] + " @ " + mBerat + "(kg)";
            tItem.add(item);
            int harga = Integer.parseInt(h[1]);
            int berat = Integer.parseInt(mBerat);
            int total = harga * berat;
            aTotal.add(total);
            //set to array stok
            Beli beli = new Beli();
            int idJenis = beli.getIdFromDb(h[0]);
            Pembayaran.idJenisHasilPanen.add(idJenis);
            Pembayaran.beratHasilPanen.add(berat);

            //convert to array
            Integer[] totalHarga = new Integer[aTotal.size()];
            totalHarga = aTotal.toArray(totalHarga);

            //get total harga
            mTotal = getTotal(totalHarga);

            //set to list
            listJual.removeAllElements();
            for (int i = 0; i < tItem.size(); i++) {
                listJual.addElement(tItem.get(i));
            }

            //set total harga
            tv_total.setText(jual.setIDR(mTotal));
            list_yang_dibeli.setModel(listJual);

        }
    }//GEN-LAST:event_btn_pilihActionPerformed

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

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        Jual j = new Jual();
        String data[][] = j.getDataStok();
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                listModel.addElement(data[i][0] + " @" + data[i][1] + " @" + data[i][2] + " kg");
            }
            list_stok.setModel(listModel);
        }
    }//GEN-LAST:event_formComponentShown

    private void edt_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt_idKeyReleased
        Jual jual = new Jual();
        String idMember = edt_id.getText();
        if (idMember.isEmpty()) {
            tv_jenis_member.setText("");
            tv_diskon.setText("");
            tv_total.setText(jual.setIDR(mTotal));
        } else {

            int id = Integer.parseInt(idMember);
            if (id > 0 && id < 4) {
                String data[] = jual.getListJenisMemberById(id);
                String mMember[] = data[0].split("-");
                String jMember = mMember[1];
                tv_jenis_member.setText(jMember);
                String jenis = tv_jenis_member.getText();
                Jual j = new Jual();
                if (mTotal != 0) {

                    if (jenis.isEmpty()) {
                        tv_diskon.setText("");
                        tv_total.setText("" + mTotal);
                    } else if (jenis.equalsIgnoreCase("silver")) {
                        double dataBayar[] = j.getDiskonSilver(mTotal);
                        double diskon, bayar;
                        diskon = dataBayar[0];
                        bayar = dataBayar[1];
                        tv_diskon.setText("" + diskon);
                        tv_total.setText(jual.setIDR(bayar));
                        mTotalDiskon = (int) bayar;
                    } else if (jenis.equalsIgnoreCase("gold")) {
                        double dataBayar[] = j.getDiskonGold(mTotal);
                        double diskon, bayar;
                        diskon = dataBayar[0];
                        bayar = dataBayar[1];
                        tv_diskon.setText("" + diskon);
                        tv_total.setText(jual.setIDR(bayar));
                        mTotalDiskon = (int) bayar;
                    } else if (jenis.equalsIgnoreCase("platinum")) {
                        double dataBayar[] = j.getDiskonPlatinum(mTotal);
                        double diskon, bayar;
                        diskon = dataBayar[0];
                        bayar = dataBayar[1];
                        tv_diskon.setText("" + diskon);
                        tv_total.setText(jual.setIDR(bayar));
                        mTotalDiskon = (int) bayar;
                    }
                }
            }
        }
    }//GEN-LAST:event_edt_idKeyReleased

    private void btn_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bayarActionPerformed
        int jumlahItem = aTotal.size();
        int idMember = 0;
        int idUser = User.getIDUser();
        int idJenisTransaksi = 0;
        //cek jenis transaksi
        String jenisTransaksi = tv_judul.getText();
        if (jenisTransaksi.equalsIgnoreCase("pembelian")) {
            idJenisTransaksi = 1;
            Pembayaran.jenisTransaksi = "pembelian";
        } else {
            idJenisTransaksi = 2;
            Pembayaran.jenisTransaksi = "penjualan";
        }
        System.out.println("" + jumlahItem + idMember + idUser + idJenisTransaksi);
        if (jumlahItem == 0 || idUser == 0 || idJenisTransaksi == 0) {
            JOptionPane.showMessageDialog(this, "Belum ada transaksi");
        } else {
            Beli beli = new Beli();
            int jumlahBaris = beli.getJumlahBaris();
            int kode_unik = jumlahBaris + 1;
            beli.insertDataTransaksi(jumlahItem, idUser, idJenisTransaksi, kode_unik);
            //set to constructor pembayaran
            if (tv_diskon.getText().equals("")) {
                Pembayaran p = new Pembayaran(mTotal, jumlahBaris, kode_unik);
                this.setVisible(true);
                p.setLocationRelativeTo(this);
                p.setVisible(true);
            } else {
                Pembayaran p = new Pembayaran(mTotalDiskon, jumlahBaris, kode_unik);
                this.setVisible(true);
                p.setLocationRelativeTo(this);
                p.setVisible(true);
            }

            //reset
            aTotal.removeAll(aTotal);
            tItem.removeAll(tItem);

            //remove all array stok
//            Pembayaran.beratHasilPanen.removeAll(Pembayaran.beratHasilPanen);
//            Pembayaran.idJenisHasilPanen.removeAll(Pembayaran.idJenisHasilPanen);
            //set to list
            listJual.removeAllElements();
            for (int i = 0; i < tItem.size(); i++) {
                listJual.addElement(tItem.get(i));
            }
            //convert to array
            Integer[] totalHarga = new Integer[aTotal.size()];
            totalHarga = aTotal.toArray(totalHarga);

            //get total harga
            int mTotal = getTotal(totalHarga);
            //set total harga
            tv_total.setText("Rp. " + mTotal);
            list_yang_dibeli.setModel(listJual);
            edt_id.setText("");
            tv_diskon.setText("");
            tv_jenis_member.setText("");
        }
    }//GEN-LAST:event_btn_bayarActionPerformed

    private void tv_jenis_memberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tv_jenis_memberKeyReleased


    }//GEN-LAST:event_tv_jenis_memberKeyReleased

    private void tv_diskonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tv_diskonKeyReleased

    }//GEN-LAST:event_tv_diskonKeyReleased

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        aTotal.removeAll(aTotal);
        tItem.removeAll(tItem);

        //remove all array stok
        Pembayaran.beratHasilPanen.removeAll(Pembayaran.beratHasilPanen);
        Pembayaran.idJenisHasilPanen.removeAll(Pembayaran.idJenisHasilPanen);
        //set to list
        listJual.removeAllElements();
        for (int i = 0; i < tItem.size(); i++) {
            listJual.addElement(tItem.get(i));
        }
        //convert to array
        Integer[] totalHarga = new Integer[aTotal.size()];
        totalHarga = aTotal.toArray(totalHarga);

        //get total harga
        int mTotal = getTotal(totalHarga);
        //set total harga
        tv_total.setText("Rp. " + mTotal);
        list_yang_dibeli.setModel(listJual);
        edt_id.setText("");
        tv_diskon.setText("");
        tv_jenis_member.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjualan().setVisible(true);
            }
        });
    }

    //get total harga
    private int getTotal(Integer[] total) {
        int hasil = 0;
        for (int harga : total) {
            hasil += harga;
        }
        return hasil;
    }

    //set IDR

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bayar;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_pilih;
    private javax.swing.JButton btn_reset;
    private javax.swing.JTextField edt_cari;
    private javax.swing.JTextField edt_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> list_stok;
    private javax.swing.JList<String> list_yang_dibeli;
    private javax.swing.JMenuItem menu_kategori;
    private javax.swing.JMenuItem menu_member;
    private javax.swing.JMenuItem menu_pembelian;
    private javax.swing.JMenuItem menu_penjualan;
    private javax.swing.JMenuItem menu_profil;
    private javax.swing.JTextField tv_diskon;
    private javax.swing.JTextField tv_jenis_member;
    private javax.swing.JLabel tv_judul;
    private javax.swing.JTextField tv_total;
    // End of variables declaration//GEN-END:variables

}
