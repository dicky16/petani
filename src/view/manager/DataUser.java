/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.manager;

import com.placeholder.PlaceHolder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Member;
import model.User;

/**
 *
 * @author djavu
 */
public class DataUser extends javax.swing.JFrame {

    /**
     * Creates new form DataUser
     */
    DefaultComboBoxModel comboLevelUsser = new DefaultComboBoxModel();
    int baris = 0;
    static Object kolom[] = {"No.", "Nama", "Email", "Alamat", "Username", "Password", "Level User"};
    DefaultTableModel tabel = new DefaultTableModel(kolom, baris);

    public DataUser() {
        initComponents();
        PlaceHolder placeCari = new PlaceHolder(edt_cari, "Cari user");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        edt_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        combo_level_user = new javax.swing.JComboBox<>();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_data_user = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edt_email = new javax.swing.JTextField();
        edt_alamat = new javax.swing.JTextField();
        edt_username = new javax.swing.JTextField();
        edt_password = new javax.swing.JTextField();
        edt_cari = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel4.setText("Level User");

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        combo_level_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        tabel_data_user.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel_data_user);

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("Data User");

        jLabel3.setText("Alamat");

        jLabel5.setText("Email");

        jLabel6.setText("Username");

        jLabel7.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_edit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_hapus))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(edt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(edt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(51, 51, 51)
                                                    .addComponent(edt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_tambah)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_update)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(edt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(24, 24, 24)
                                .addComponent(combo_level_user, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(edt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(edt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(combo_level_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(edt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah)
                            .addComponent(btn_update)
                            .addComponent(btn_reset)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_edit)
                    .addComponent(btn_hapus))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        User user = new User();
        setDataTable(user);
        setDataCombo(user);
    }//GEN-LAST:event_formComponentShown

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        User user = new User();
        edt_nama.setText("");
        edt_alamat.setText("");
        edt_email.setText("");
        edt_password.setText("");
        edt_username.setText("");
        setDataCombo(user);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        String nama = edt_nama.getText();
        String alamat = edt_nama.getText();
        String email = edt_nama.getText();
        String username = edt_nama.getText();
        String password = edt_nama.getText();
        String levelUser[] = combo_level_user.getSelectedItem().toString().split("-");
        int idLevelUser = 0;
        idLevelUser = Integer.parseInt(levelUser[0]);

        if (nama.isEmpty() || alamat.isEmpty() || email.isEmpty() || password.isEmpty() || idLevelUser == 0) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh kosong");
        } else {
            User user = new User();
            int cekUser = user.cekUser(username, password);
            if (cekUser == 0) {
                user.insertDataUser(nama, alamat, email, username, password, idLevelUser);
                setDataTable(user);
                edt_nama.setText("");
                edt_alamat.setText("");
                edt_email.setText("");
                edt_password.setText("");
                edt_username.setText("");
                setDataCombo(user);
                JOptionPane.showMessageDialog(this, "Data berhasil ditambah");
            } else {
                JOptionPane.showMessageDialog(this, "Data sudah ada");
            }
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String nama = edt_nama.getText();
        String alamat = edt_alamat.getText();
        String email = edt_email.getText();
        String username = edt_username.getText();
        String password = edt_password.getText();
        String levelUser[] = combo_level_user.getSelectedItem().toString().split("-");
        int idLevelUser = 0;
        idLevelUser = Integer.parseInt(levelUser[0]);

        if (nama.isEmpty() || alamat.isEmpty() || email.isEmpty() || password.isEmpty() || idLevelUser == 0) {
            JOptionPane.showMessageDialog(this, "Field tidak boleh kosong");
        } else {
            User user = new User();
            int cekUser = user.cekUser(username, password);
//            if (cekUser == 0) {
                int id = user.getIdUser(username, password);
                user.updateProfil(username, password, email, nama, alamat,idLevelUser, id);
                setDataTable(user);
                edt_nama.setText("");
                edt_alamat.setText("");
                edt_email.setText("");
                edt_password.setText("");
                edt_username.setText("");
                setDataCombo(user);
                JOptionPane.showMessageDialog(this, "Data berhasil diubah");
//            } else {
//                JOptionPane.showMessageDialog(this, "Data sudah ada");
//            }
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        User user = new User();
        int row = tabel_data_user.getSelectedRow();
        String username = tabel_data_user.getValueAt(row, 4).toString();
        String password = tabel_data_user.getValueAt(row, 5).toString();
        int id = user.getIdUser(username, password);
        String[][] data = user.getProfilById(id);
        if (data.length > 0) {

            edt_nama.setText(data[0][0]);
            edt_alamat.setText(data[0][1]);
            edt_email.setText(data[0][2]);
            edt_username.setText(data[0][3]);
            edt_password.setText(data[0][4]);
            String levelUSer = data[0][5];
            int idLevel = user.getIdUser(levelUSer);
//            System.out.println(" id "+idLevel);
            String[] level = user.getListLevelUserById(idLevel);
            if (level.length > 0) {
                comboLevelUsser.removeAllElements();
                comboLevelUsser.addElement(level[0]);
                combo_level_user.setModel(comboLevelUsser);
            }
        } else {
            System.out.println("data user : " + data.length);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        User user = new User();
        int row = tabel_data_user.getSelectedRow();
        String username = tabel_data_user.getValueAt(row, 4).toString();
        String password = tabel_data_user.getValueAt(row, 5).toString();
        int id = user.getIdUser(username, password);
        user.deleteData(id);
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
        setDataTable(user);
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataUser().setVisible(true);
            }
        });
    }

    //set data to table
    private void setDataTable(User user) {
        tabel.getDataVector().removeAllElements();
        String[][] data = user.getDataUser();
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                int no = i + 1;
                tabel.addRow(new Object[]{no, data[i][0], data[i][1], data[i][2], data[i][3], data[i][4], data[i][5]});
//                System.out.println("data : " + data[3][0]);
            }
            tabel_data_user.setModel(tabel);
        }
    }

    //set data combo box
    private void setDataCombo(User user) {
        comboLevelUsser.removeAllElements();
        String data[] = user.getListLevelUser();
        if (data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                comboLevelUsser.addElement(data[i]);
            }
            combo_level_user.setModel(comboLevelUsser);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_level_user;
    private javax.swing.JTextField edt_alamat;
    private javax.swing.JTextField edt_cari;
    private javax.swing.JTextField edt_email;
    private javax.swing.JTextField edt_nama;
    private javax.swing.JTextField edt_password;
    private javax.swing.JTextField edt_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_data_user;
    // End of variables declaration//GEN-END:variables
}
