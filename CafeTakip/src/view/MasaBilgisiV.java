/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import model.bilgisayar.Bilgisayar;

/**
 *
 * @author yetishbey
 */
public class MasaBilgisiV extends javax.swing.JPanel {

    /**
     * Creates new form MasaBilgisi
     */
    public MasaBilgisiV() {
        initComponents();
        prgGecenSure.setStringPainted(true);
        pnlSureEkle.setVisible(false);
    }

    public void init(Bilgisayar b){
        lblMasaAdi.setText(b.getMasaAdi());
        pnlSureEkle.setVisible(false);
        if(b.getAcilisSaati()!=null){
            if(b.getSureSiniri()!=0){             
                lblKalanSure.setText(Long.toString(b.getSureSiniri() - b.gecenDakikaHesapla())+" dk");
                pnlSureEkle.setVisible(true);
            }else{
                lblKalanSure.setText("-");
            }
            prgGecenSure.setValue(b.gecenOranHesapla());
            lblGecenSure.setText(b.gecenDakikaHesapla()+" dk");
            lblAcilisSaati.setText(b.acilisZamaniString());
            lblKullanimUcreti.setText(Float.toString(b.kullanimTutariHesapla())+" TL");
            lblAdisyonTutar.setText(Float.toString(b.adisyonTutariHesapla())+" TL");
            lblToplamTutar.setText((b.adisyonTutariHesapla()+b.kullanimTutariHesapla())+" TL");
        }else{
            lblGecenSure.setText("Kapalı");
            lblKalanSure.setText("-");
            lblAcilisSaati.setText("Kapalı");
            lblKullanimUcreti.setText("-"); 
            lblAdisyonTutar.setText("-");
            lblToplamTutar.setText("-");
            prgGecenSure.setValue(0);
           
        }
        lblKullanici.setText("Kayıtlı Değil");
        if(b.getMusteri() != null)
            lblKullanici.setText(b.getMusteri().getAd());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblMasaAdi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        prgGecenSure = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblKullanici = new javax.swing.JLabel();
        lblAcilisSaati = new javax.swing.JLabel();
        lblGecenSure = new javax.swing.JLabel();
        lblKalanSure = new javax.swing.JLabel();
        lblAdisyonTutar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblKullanimUcreti = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblToplamTutar = new javax.swing.JLabel();
        pnlSureEkle = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        jLabel2.setText("Açılış Saati :");

        lblMasaAdi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMasaAdi.setText("Masa - X");

        jLabel5.setText("Kalan Süre :");

        jLabel3.setText("Geçen Süre :");

        jLabel6.setText("Kullanıcı :");

        jLabel4.setText("Adisyon Tutarı :");

        lblKullanici.setText("Kayıtlı Değil");

        lblAcilisSaati.setText("Kapalı");

        lblGecenSure.setText("Kapalı");

        lblKalanSure.setText("-");

        lblAdisyonTutar.setText("-");

        jLabel7.setText("Kullanım Ücreti :");

        lblKullanimUcreti.setText("-");

        jLabel8.setText("Toplam Tutar :");

        lblToplamTutar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblToplamTutar.setText("-");

        pnlSureEkle.setBorder(javax.swing.BorderFactory.createTitledBorder("Süre Ekle"));

        jButton1.setText("15 dk");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("30 dk");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("45 dk");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("60 dk");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("__ dk");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("90 dk");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSureEkleLayout = new javax.swing.GroupLayout(pnlSureEkle);
        pnlSureEkle.setLayout(pnlSureEkleLayout);
        pnlSureEkleLayout.setHorizontalGroup(
            pnlSureEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSureEkleLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlSureEkleLayout.createSequentialGroup()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addGap(22, 22, 22))
        );
        pnlSureEkleLayout.setVerticalGroup(
            pnlSureEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSureEkleLayout.createSequentialGroup()
                .addGroup(pnlSureEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSureEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("İşlemler"));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/kilitac.png"))); // NOI18N
        jLabel12.setToolTipText("Masayı Aç");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/kilitle.png"))); // NOI18N
        jLabel1.setToolTipText("Masayı Kilitle");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/kullanici.png"))); // NOI18N
        jLabel9.setToolTipText("Özel Müşteriye Aç");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/liste.png"))); // NOI18N
        jLabel10.setToolTipText("Siparişleri Gör");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/dosya.png"))); // NOI18N
        jLabel11.setToolTipText("Dosyalara Göz At");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/gozat.png"))); // NOI18N
        jLabel13.setToolTipText("Bilgisayarı İzle");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/indir.png"))); // NOI18N
        jLabel14.setToolTipText("Ping Gönder");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/bilgisayar.png"))); // NOI18N
        jLabel15.setToolTipText("Bilgisayarı Kapat");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/duzenle.png"))); // NOI18N
        jLabel16.setToolTipText("Masa Ayarları");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/arti.png"))); // NOI18N
        jLabel17.setToolTipText("Süreli Masa Aç");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/pointer.png"))); // NOI18N
        jLabel18.setToolTipText("Yetkili Girişi Yap");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/icons32/sagok.png"))); // NOI18N
        jLabel19.setToolTipText("Mesaj Gönder");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel10))
                    .addComponent(jLabel19))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jButton7.setText("Son 20 Hesap");
        jButton7.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMasaAdi)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKullanimUcreti)
                                    .addComponent(lblKullanici)
                                    .addComponent(lblAcilisSaati)
                                    .addComponent(lblGecenSure)
                                    .addComponent(lblKalanSure))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAdisyonTutar)
                                    .addComponent(lblToplamTutar))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(prgGecenSure, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlSureEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMasaAdi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblKullanici))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAcilisSaati))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblGecenSure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblKalanSure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblKullanimUcreti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblAdisyonTutar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblToplamTutar))
                .addGap(18, 18, 18)
                .addComponent(prgGecenSure, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlSureEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().sureUzat(lblMasaAdi.getText(), 15);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().sureUzat(lblMasaAdi.getText(), 30);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().sureUzat(lblMasaAdi.getText(), 45);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().sureUzat(lblMasaAdi.getText(), 60);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().sureUzat(lblMasaAdi.getText(), 90);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().sureUzat(lblMasaAdi.getText(), 0);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcilisSaati;
    private javax.swing.JLabel lblAdisyonTutar;
    private javax.swing.JLabel lblGecenSure;
    private javax.swing.JLabel lblKalanSure;
    private javax.swing.JLabel lblKullanici;
    private javax.swing.JLabel lblKullanimUcreti;
    public javax.swing.JLabel lblMasaAdi;
    private javax.swing.JLabel lblToplamTutar;
    private javax.swing.JPanel pnlSureEkle;
    private javax.swing.JProgressBar prgGecenSure;
    // End of variables declaration//GEN-END:variables
}
