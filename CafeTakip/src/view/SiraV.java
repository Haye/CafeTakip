
package view;

import java.util.HashMap;

/**
 *
 * @author MustafaS
 */
public class SiraV extends javax.swing.JPanel {


    public SiraV() {
        initComponents();
        pnlDetaylar.setVisible(false);
        guncelle();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtToplamKisi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        txtSoyad = new javax.swing.JTextField();
        btnEkle = new javax.swing.JButton();
        txtAd = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spnSiraNo = new javax.swing.JSpinner();
        spnMasaNo = new javax.swing.JSpinner();
        btnVazgec = new javax.swing.JButton();
        pnlDetaylar = new javax.swing.JPanel();
        spnBaslangicDk = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnBaslangicSaat = new javax.swing.JSpinner();
        spnBitisSaat = new javax.swing.JSpinner();
        spnBitisDk = new javax.swing.JSpinner();
        chkDetaylar = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSira = new javax.swing.JTable();

        txtToplamKisi.setEnabled(false);

        jButton3.setText("Süre Artır");
        jButton3.setPreferredSize(new java.awt.Dimension(80, 23));

        btnSil.setText("Sil");
        btnSil.setPreferredSize(new java.awt.Dimension(80, 23));
        btnSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSilMousePressed(evt);
            }
        });

        btnEkle.setText("Ekle");
        btnEkle.setPreferredSize(new java.awt.Dimension(80, 23));
        btnEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEkleMousePressed(evt);
            }
        });

        jLabel1.setText("Ad :");

        jLabel4.setText("Sıra No :");

        jLabel2.setText("Soyad :");

        jLabel3.setText("Telefon :");

        jLabel5.setText("Masa No :");

        spnSiraNo.setEnabled(false);
        spnSiraNo.setFocusable(false);
        spnSiraNo.setMinimumSize(new java.awt.Dimension(50, 20));
        spnSiraNo.setPreferredSize(new java.awt.Dimension(50, 20));

        spnMasaNo.setPreferredSize(new java.awt.Dimension(50, 20));

        btnVazgec.setText("Vazgeç");
        btnVazgec.setPreferredSize(new java.awt.Dimension(80, 23));
        btnVazgec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVazgecMousePressed(evt);
            }
        });

        spnBaslangicDk.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBaslangicDk.setToolTipText("Dakika");

        jLabel6.setText("Başlangıç Saati :");

        jLabel7.setText("Bitiş Saati :");

        spnBaslangicSaat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));
        spnBaslangicSaat.setToolTipText("Saat");
        spnBaslangicSaat.setMinimumSize(new java.awt.Dimension(50, 20));
        spnBaslangicSaat.setPreferredSize(new java.awt.Dimension(50, 20));

        spnBitisSaat.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, Integer.valueOf(24), Integer.valueOf(1)));
        spnBitisSaat.setToolTipText("Saat");
        spnBitisSaat.setPreferredSize(new java.awt.Dimension(50, 20));

        spnBitisDk.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), null, Integer.valueOf(60), Integer.valueOf(1)));
        spnBitisDk.setToolTipText("Dakika");
        spnBitisDk.setPreferredSize(new java.awt.Dimension(50, 20));

        javax.swing.GroupLayout pnlDetaylarLayout = new javax.swing.GroupLayout(pnlDetaylar);
        pnlDetaylar.setLayout(pnlDetaylarLayout);
        pnlDetaylarLayout.setHorizontalGroup(
            pnlDetaylarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetaylarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDetaylarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDetaylarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetaylarLayout.createSequentialGroup()
                        .addComponent(spnBaslangicSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spnBaslangicDk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetaylarLayout.createSequentialGroup()
                        .addComponent(spnBitisSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spnBitisDk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        pnlDetaylarLayout.setVerticalGroup(
            pnlDetaylarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetaylarLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(pnlDetaylarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetaylarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(pnlDetaylarLayout.createSequentialGroup()
                        .addGroup(pnlDetaylarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnBaslangicSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnBaslangicDk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetaylarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetaylarLayout.createSequentialGroup()
                                .addComponent(spnBitisDk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addComponent(spnBitisSaat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        chkDetaylar.setText("Detaylı Ekleme");
        chkDetaylar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDetaylarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkDetaylar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtAd)
                            .addComponent(txtSoyad))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnMasaNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnSiraNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDetaylar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnSiraNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnMasaNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))))
                    .addComponent(pnlDetaylar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDetaylar)
                .addGap(14, 14, 14))
        );

        jLabel8.setText("Toplam Sırada ki kişi :");

        tblSira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ad", "Soyad", "Telefon", "Sıra No", "Masa No", "Başlangıç Saati", "Bitiş Saati"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSira.getTableHeader().setReorderingAllowed(false);
        tblSira.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblSiraComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tblSira);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtToplamKisi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtToplamKisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guncelle(){
        tblSira.setModel(mutlakkafe.MutlakKafe.mainCont.getSiraCont().listModel());
        txtToplamKisi.setText(tblSira.getModel().getRowCount() + "");
        temizle();
        spnSiraNo.setValue(tblSira.getModel().getRowCount()+1);
    }
    
    
    private void tblSiraComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblSiraComponentShown
        guncelle();
    }//GEN-LAST:event_tblSiraComponentShown

    private void chkDetaylarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDetaylarActionPerformed
        if(chkDetaylar.isSelected()){
            pnlDetaylar.setVisible(true);
        }else{
            pnlDetaylar.setVisible(false);
        }
    }//GEN-LAST:event_chkDetaylarActionPerformed

    private void btnVazgecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVazgecMousePressed
        temizle();
    }//GEN-LAST:event_btnVazgecMousePressed

    private void btnEkleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEkleMousePressed
        HashMap<String, String> values = new HashMap<>();

        spnBaslangicDk.requestFocus(false);
        
        values.put("ad", txtAd.getText().trim());
        values.put("soyad", txtSoyad.getText().trim());
        values.put("telefon", txtTelefon.getText().trim());
        values.put("siraNo", spnSiraNo.getValue().toString());
        values.put("masaNo", spnMasaNo.getValue().toString());
        values.put("baslangicSaat", spnBaslangicSaat.getValue().toString());
        values.put("baslangicDk", spnBaslangicDk.getValue().toString());
        values.put("bitisSaat", spnBitisSaat.getValue().toString());
        values.put("bitisDk", spnBitisDk.getValue().toString());

        if(mutlakkafe.MutlakKafe.mainCont.getSiraCont().ekle(values)){
            guncelle();
        }
        
        
    }//GEN-LAST:event_btnEkleMousePressed

    private void btnSilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSilMousePressed
        if(tblSira.getSelectedRow()>=0){
            int siraID = Integer.parseInt(tblSira.getValueAt(tblSira.getSelectedRow(), 3).toString());
            mutlakkafe.MutlakKafe.mainCont.getSiraCont().sil(siraID);
            guncelle();
        }
    }//GEN-LAST:event_btnSilMousePressed

     private void temizle(){
    	
    	this.txtAd.setText("");
    	this.txtSoyad.setText("");
    	this.txtTelefon.setText("");
    	this.spnBaslangicDk.setValue(0);
    	this.spnBaslangicSaat.setValue(0);
    	this.spnBitisDk.setValue(0);
    	this.spnBitisSaat.setValue(0);
    	this.spnMasaNo.setValue(0);
    	this.spnSiraNo.setValue(0);

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JCheckBox chkDetaylar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDetaylar;
    private javax.swing.JSpinner spnBaslangicDk;
    private javax.swing.JSpinner spnBaslangicSaat;
    private javax.swing.JSpinner spnBitisDk;
    private javax.swing.JSpinner spnBitisSaat;
    private javax.swing.JSpinner spnMasaNo;
    private javax.swing.JSpinner spnSiraNo;
    private javax.swing.JTable tblSira;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTelefon;
    private javax.swing.JTextField txtToplamKisi;
    // End of variables declaration//GEN-END:variables
}
