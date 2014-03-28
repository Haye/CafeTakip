
package view;

import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import model.urun.Urun;

/**
 *
 * @author MustafaS
 */
public class UrunV extends javax.swing.JFrame {

   
    public UrunV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUrunAdi = new javax.swing.JTextField();
        txtBarkod = new javax.swing.JTextField();
        txtBirimFiyati = new javax.swing.JTextField();
        spnStok = new javax.swing.JSpinner();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUrunList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kafeterya");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Ürün Adı :");

        jLabel2.setText("Barkod :");

        jLabel3.setText("Birim Fiyatı : ");

        jLabel4.setText("Stok :");

        spnStok.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));

        btnEkle.setText("Ekle");
        btnEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEkleMousePressed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSilMousePressed(evt);
            }
        });

        btnTemizle.setText("Temizle");
        btnTemizle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTemizleMousePressed(evt);
            }
        });

        btnGuncelle.setText("Güncelle");
        btnGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuncelleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBarkod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUrunAdi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBirimFiyati)
                            .addComponent(spnStok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBirimFiyati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtBarkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEkle)
                    .addComponent(btnSil)
                    .addComponent(btnTemizle)
                    .addComponent(btnGuncelle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblUrunList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Ürün ID", "Ürün Adı", "Barkod", "Birim Fiyatı", "Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUrunList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblUrunListMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblUrunList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEkleMousePressed
        
        HashMap<String, String> values = new HashMap<>();
        
        values.put("barkod", txtBarkod.getText().trim());
        values.put("stok", spnStok.getValue().toString());
        values.put("birimFiyat", txtBirimFiyati.getText().trim());
        values.put("urunAdi", txtUrunAdi.getText().trim());
        
        mutlakkafe.MutlakKafe.mainCont.getUrunCont().urunEkle(
                mutlakkafe.MutlakKafe.mainCont.getUrunCont().getUrun(values));
        
        tblUrunList.setModel(mutlakkafe.MutlakKafe
                .mainCont.getUrunCont().urunListesiModel());
        
        temizle();
        
    }//GEN-LAST:event_btnEkleMousePressed

    private void btnSilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSilMousePressed

        int urunID = Integer.parseInt((String) tblUrunList
                .getValueAt(tblUrunList.getSelectedRow(), 0));
        
        mutlakkafe.MutlakKafe.mainCont.getUrunCont().urunSil(urunID);
        
        tblUrunList.setModel(mutlakkafe.MutlakKafe
                .mainCont.getUrunCont().urunListesiModel());
        
    }//GEN-LAST:event_btnSilMousePressed

    private void btnTemizleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemizleMousePressed
        temizle();        
    }//GEN-LAST:event_btnTemizleMousePressed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        tblUrunList.setModel(mutlakkafe.MutlakKafe
                .mainCont.getUrunCont().urunListesiModel());
        
    }//GEN-LAST:event_formComponentShown

    private void btnGuncelleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuncelleMousePressed

        HashMap<String, String> values = new HashMap<>();
        
        values.put("barkod", txtBarkod.getText().trim());
        values.put("stok", spnStok.getValue().toString());
        values.put("birimFiyat", txtBirimFiyati.getText().trim());
        values.put("urunAdi", txtUrunAdi.getText().trim());
        
        int urunID = Integer.parseInt((String) tblUrunList.getValueAt
                                (tblUrunList.getSelectedRow(), 0));
        
        mutlakkafe.MutlakKafe.mainCont.getUrunCont().urunGuncelle(urunID,
                mutlakkafe.MutlakKafe.mainCont.getUrunCont().getUrun(values));
        
        tblUrunList.setModel(mutlakkafe.MutlakKafe
                .mainCont.getUrunCont().urunListesiModel());
        
        temizle();
        
    }//GEN-LAST:event_btnGuncelleMousePressed

    private void tblUrunListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUrunListMousePressed
        
       txtUrunAdi.setText((String) tblUrunList.getValueAt
                                (tblUrunList.getSelectedRow(), 1));
        
        txtBarkod.setText((String) tblUrunList
                .getValueAt(tblUrunList.getSelectedRow(), 2));
        
        txtBirimFiyati.setText(tblUrunList.getValueAt
                (tblUrunList.getSelectedRow(), 3).toString().split(" ")[0]);
        
        int stok = Integer.parseInt( (String) tblUrunList.
                getValueAt(tblUrunList.getSelectedRow(), 4));
        
        spnStok.setValue(stok);
    }//GEN-LAST:event_tblUrunListMousePressed

    
    public void temizle(){
        txtUrunAdi.setText("");
        txtBirimFiyati.setText("");
        txtBarkod.setText("");
        spnStok.setValue(0);
    }
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
            java.util.logging.Logger.getLogger(UrunV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrunV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrunV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrunV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UrunV().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnStok;
    private javax.swing.JTable tblUrunList;
    private javax.swing.JTextField txtBarkod;
    private javax.swing.JTextField txtBirimFiyati;
    private javax.swing.JTextField txtUrunAdi;
    // End of variables declaration//GEN-END:variables
}
