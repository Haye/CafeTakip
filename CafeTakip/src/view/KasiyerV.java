/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.kisi.KisiI;
import java.util.HashMap;
import model.kisi.Calisan;

/**
 *
 * @author MustafaS
 */
public class KasiyerV extends javax.swing.JPanel {

   
    public KasiyerV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlList = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstKasiyerListesi = new javax.swing.JList();
        pnlAra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKullaniciAdiAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        lblToplamKayit = new javax.swing.JLabel();
        pnlKullaniciBilgisi = new javax.swing.JPanel();
        lblDurum = new javax.swing.JLabel();
        pnlKisiselBilgiler = new javax.swing.JPanel();
        lblResim = new javax.swing.JLabel();
        txtSifreTekrar = new javax.swing.JPasswordField();
        txtKullaniciAdi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSifre = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        pnlHesapBilgileri = new javax.swing.JPanel();
        pnlButonGrup = new javax.swing.JPanel();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        btnYeni = new javax.swing.JButton();
        txtAd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAdres = new javax.swing.JTextArea();
        radioAdmin = new javax.swing.JRadioButton();
        radioKasiyer = new javax.swing.JRadioButton();
        lblKayitTarihi = new javax.swing.JLabel();
        lblKasiyerBaslik = new javax.swing.JLabel();

        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        pnlList.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Çalışan Listesi");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setOpaque(true);

        lstKasiyerListesi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstKasiyerListesi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstKasiyerListesiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstKasiyerListesi);

        pnlAra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Çalışan Ara");

        btnAra.setText("Ara");
        btnAra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlAraLayout = new javax.swing.GroupLayout(pnlAra);
        pnlAra.setLayout(pnlAraLayout);
        pnlAraLayout.setHorizontalGroup(
            pnlAraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAraLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKullaniciAdiAra)))
                .addContainerGap())
        );
        pnlAraLayout.setVerticalGroup(
            pnlAraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKullaniciAdiAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblToplamKayit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblToplamKayit.setText("Toplam Kayıt : 0");

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(pnlAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(lblToplamKayit)
                .addContainerGap())
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addComponent(pnlAra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblToplamKayit)
                .addContainerGap())
        );

        lblDurum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDurum.setForeground(new java.awt.Color(0, 51, 255));
        lblDurum.setText("Durum : Kapalı");

        pnlKisiselBilgiler.setBorder(javax.swing.BorderFactory.createTitledBorder("Kişisel Bilgiler"));

        lblResim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblResim.setEnabled(false);

        txtSifreTekrar.setEnabled(false);

        txtKullaniciAdi.setEnabled(false);

        jLabel6.setText("Kullanıcı Adı :");

        jLabel7.setText("Şifre :");

        txtSifre.setEnabled(false);

        jLabel8.setText("Şifre Tekrar :");

        javax.swing.GroupLayout pnlKisiselBilgilerLayout = new javax.swing.GroupLayout(pnlKisiselBilgiler);
        pnlKisiselBilgiler.setLayout(pnlKisiselBilgilerLayout);
        pnlKisiselBilgilerLayout.setHorizontalGroup(
            pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKisiselBilgilerLayout.setVerticalGroup(
            pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addComponent(lblResim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHesapBilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesap Bilgileri"));

        btnEkle.setText("Ekle");
        btnEkle.setEnabled(false);
        btnEkle.setPreferredSize(new java.awt.Dimension(100, 25));
        btnEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEkleMousePressed(evt);
            }
        });

        btnSil.setText("Sil");
        btnSil.setMinimumSize(new java.awt.Dimension(100, 25));
        btnSil.setPreferredSize(new java.awt.Dimension(100, 25));
        btnSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSilMousePressed(evt);
            }
        });

        btnGuncelle.setText("Güncelle");
        btnGuncelle.setEnabled(false);
        btnGuncelle.setPreferredSize(new java.awt.Dimension(100, 25));
        btnGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuncelleMousePressed(evt);
            }
        });

        btnVazgec.setText("Vazgeç");
        btnVazgec.setPreferredSize(new java.awt.Dimension(100, 25));
        btnVazgec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVazgecMousePressed(evt);
            }
        });

        btnYeni.setText("Yeni");
        btnYeni.setPreferredSize(new java.awt.Dimension(100, 25));
        btnYeni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnYeniMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlButonGrupLayout = new javax.swing.GroupLayout(pnlButonGrup);
        pnlButonGrup.setLayout(pnlButonGrupLayout);
        pnlButonGrupLayout.setHorizontalGroup(
            pnlButonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButonGrupLayout.createSequentialGroup()
                .addComponent(btnYeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        pnlButonGrupLayout.setVerticalGroup(
            pnlButonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButonGrupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlButonGrupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnYeni, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        txtAd.setEnabled(false);

        jLabel3.setText("Ad :");

        jLabel4.setText("Soyad :");

        txtSoyad.setEnabled(false);

        txtTelefon.setEnabled(false);

        jLabel5.setText("Telefon :");

        jLabel10.setText("Maaş :");

        txtMaas.setEnabled(false);

        jLabel9.setText("Adres :");

        txtAdres.setColumns(20);
        txtAdres.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtAdres.setRows(5);
        txtAdres.setEnabled(false);
        jScrollPane2.setViewportView(txtAdres);

        buttonGroup1.add(radioAdmin);
        radioAdmin.setText("Admin");
        radioAdmin.setEnabled(false);

        buttonGroup1.add(radioKasiyer);
        radioKasiyer.setSelected(true);
        radioKasiyer.setText("Kasiyer");
        radioKasiyer.setEnabled(false);

        javax.swing.GroupLayout pnlHesapBilgileriLayout = new javax.swing.GroupLayout(pnlHesapBilgileri);
        pnlHesapBilgileri.setLayout(pnlHesapBilgileriLayout);
        pnlHesapBilgileriLayout.setHorizontalGroup(
            pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addComponent(pnlButonGrup, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                        .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaas, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioAdmin)
                                    .addComponent(radioKasiyer)))
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        pnlHesapBilgileriLayout.setVerticalGroup(
            pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioKasiyer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButonGrup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblKayitTarihi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKayitTarihi.setForeground(new java.awt.Color(255, 0, 0));
        lblKayitTarihi.setText("Kayıt Tarihi :09.02.2014");

        javax.swing.GroupLayout pnlKullaniciBilgisiLayout = new javax.swing.GroupLayout(pnlKullaniciBilgisi);
        pnlKullaniciBilgisi.setLayout(pnlKullaniciBilgisiLayout);
        pnlKullaniciBilgisiLayout.setHorizontalGroup(
            pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciBilgisiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKullaniciBilgisiLayout.createSequentialGroup()
                        .addComponent(lblDurum)
                        .addGap(291, 291, 291)
                        .addComponent(lblKayitTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlKullaniciBilgisiLayout.createSequentialGroup()
                        .addGroup(pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlKisiselBilgiler, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlHesapBilgileri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlKullaniciBilgisiLayout.setVerticalGroup(
            pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKullaniciBilgisiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKullaniciBilgisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDurum)
                    .addComponent(lblKayitTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlKisiselBilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHesapBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblKasiyerBaslik.setBackground(new java.awt.Color(0, 153, 204));
        lblKasiyerBaslik.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblKasiyerBaslik.setForeground(new java.awt.Color(255, 255, 255));
        lblKasiyerBaslik.setText("Kasiyer");
        lblKasiyerBaslik.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlKullaniciBilgisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKasiyerBaslik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblKasiyerBaslik, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlKullaniciBilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEkleMousePressed

        if(!btnEkle.isEnabled())
            return ;
        
        HashMap<String, String> values = new HashMap<>();

        values.put("ad", txtAd.getText().trim());
        values.put("soyad", txtSoyad.getText().trim());
        values.put("telefon", txtTelefon.getText().trim());
        values.put("resimURL", "C:\\");
        values.put("kullaniciAdi", txtKullaniciAdi.getText().trim());
        values.put("sifre1", txtSifre.getText().trim());
        values.put("sifre2", txtSifreTekrar.getText().trim());
        values.put("maas", txtMaas.getText().trim());
        values.put("adres", txtAdres.getText().trim());
        
        if(radioAdmin.isSelected())
            values.put("tip", KisiI.ADMIN+"");
        else
            values.put("tip", KisiI.KASIYER+"");
        
        Calisan  c = mutlakkafe.MutlakKafe.mainCont.getCalisanCont().getCalisan(values);
        
        if(c != null){
            mutlakkafe.MutlakKafe.mainCont.getCalisanCont().kisiEkle(c);
            kilitle();
            
            lstKasiyerListesi.setModel(mutlakkafe.MutlakKafe.mainCont.getCalisanCont().kullaniciAdiList());
            lblToplamKayit.setText("Toplam Kayıt : " + lstKasiyerListesi.getModel().getSize());
        }

    }//GEN-LAST:event_btnEkleMousePressed

    private void btnSilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSilMousePressed
        
        String kulAdi = (String) lstKasiyerListesi.getSelectedValue();
        
        if(mutlakkafe.MutlakKafe.mainCont.getCalisanCont().hesapSil(kulAdi)){
            lblToplamKayit.setText("Toplam Kayıt : " + lstKasiyerListesi.getModel().getSize());
            lstKasiyerListesi.setModel(mutlakkafe.MutlakKafe.mainCont.getCalisanCont().kullaniciAdiList());
            
        }
    }//GEN-LAST:event_btnSilMousePressed

    private void btnGuncelleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuncelleMousePressed
        
        if(!btnGuncelle.isEnabled())
            return;
        
        HashMap<String, String> values = new HashMap<>();

        values.put("ad", txtAd.getText().trim());
        values.put("soyad", txtSoyad.getText().trim());
        values.put("telefon", txtTelefon.getText().trim());
        values.put("resimURL", "C:\\");
        values.put("kullaniciAdi", txtKullaniciAdi.getText().trim());
        values.put("sifre1", txtSifre.getText().trim());
        values.put("sifre2", txtSifreTekrar.getText().trim());
        values.put("maas", txtMaas.getText().trim());
        values.put("adres", txtAdres.getText().trim());
        
        if(radioAdmin.isSelected())
            values.put("tip", KisiI.ADMIN+"");
        else
            values.put("tip", KisiI.KASIYER+"");
        
        Calisan  c = mutlakkafe.MutlakKafe.mainCont.getCalisanCont().getCalisan(values);
        
        if(c != null){
            mutlakkafe.MutlakKafe.mainCont.getCalisanCont().
                    hesapBilgiGuncelle(txtKullaniciAdi.getText().trim(), c);
            kilitle();
            
        }        
    }//GEN-LAST:event_btnGuncelleMousePressed

    private void btnVazgecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVazgecMousePressed
        temizle();
        kilitle();
    }//GEN-LAST:event_btnVazgecMousePressed

    private void btnYeniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYeniMousePressed

        txtAd.setEnabled(true);
        txtSoyad.setEnabled(true);
        txtTelefon.setEnabled(true);
        txtKullaniciAdi.setEnabled(true);
        txtSifre.setEnabled(true);
        txtSifreTekrar.setEnabled(true);
        txtMaas.setEnabled(true);
        txtAdres.setEnabled(true);
        radioAdmin.setEnabled(true);
        radioKasiyer.setEnabled(true);

        btnEkle.setEnabled(true);
        btnGuncelle.setEnabled(true);

        temizle();
        
    }//GEN-LAST:event_btnYeniMousePressed

    private void lstKasiyerListesiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstKasiyerListesiValueChanged

        String kulAdi = (String) lstKasiyerListesi.getSelectedValue();
        
        Calisan c = (Calisan) mutlakkafe.MutlakKafe.
                mainCont.getCalisanCont().bilgileriGetir(kulAdi);
        
        if( c == null)
            return ;
        
        txtAd.setText(c.getAd());
        txtSoyad.setText(c.getSoyad());
        txtTelefon.setText(c.getTelefon());
        txtKullaniciAdi.setText(c.getKulAdi());
        txtSifre.setText(c.getSifre());
        txtSifreTekrar.setText(c.getSifre());
        txtMaas.setText(c.getMaas() + "");
        txtAdres.setText(c.getAdres());
        lblKayitTarihi.setText("Kayıt Tarihi :" + c.getKayitTarihi().toLocaleString());
        
        switch(c.getTip()){
            case Calisan.ADMIN:
                radioAdmin.setSelected(true);
                break;
            case Calisan.KASIYER :
                radioKasiyer.setSelected(true);
                break;
        }
        
    }//GEN-LAST:event_lstKasiyerListesiValueChanged

    private void btnAraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAraMousePressed
        String kulAdi = txtKullaniciAdiAra.getText().trim();
        lstKasiyerListesi.setSelectedValue(kulAdi, true);
        
    }//GEN-LAST:event_btnAraMousePressed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        lstKasiyerListesi.setModel(mutlakkafe.MutlakKafe.mainCont
                .getCalisanCont().kullaniciAdiList());
        
        lblToplamKayit.setText("Toplam Kayıt : " + lstKasiyerListesi.getModel().getSize());
        
    }//GEN-LAST:event_formComponentAdded

    private void temizle(){
        txtAd.setText("");
        txtSoyad.setText("");
        txtTelefon.setText("");
        txtKullaniciAdi.setText("");
        txtSifre.setText("");
        txtSifreTekrar.setText("");
        txtMaas.setText("");
        txtAdres.setText("");
        radioAdmin.setSelected(false);
        radioKasiyer.setSelected(true);
    }
    
    private void kilitle(){
        txtAd.setEnabled(false);
        txtSoyad.setEnabled(false);
        txtTelefon.setEnabled(false);
        txtKullaniciAdi.setEnabled(false);
        txtSifre.setEnabled(false);
        txtSifreTekrar.setEnabled(false);
        txtMaas.setEnabled(false);
        txtAdres.setEnabled(false);
        radioAdmin.setEnabled(false);
        radioKasiyer.setEnabled(false);

        btnEkle.setEnabled(false);
        btnGuncelle.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JButton btnYeni;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDurum;
    private javax.swing.JLabel lblKasiyerBaslik;
    private javax.swing.JLabel lblKayitTarihi;
    private javax.swing.JLabel lblResim;
    private javax.swing.JLabel lblToplamKayit;
    private javax.swing.JList lstKasiyerListesi;
    private javax.swing.JPanel pnlAra;
    private javax.swing.JPanel pnlButonGrup;
    private javax.swing.JPanel pnlHesapBilgileri;
    private javax.swing.JPanel pnlKisiselBilgiler;
    private javax.swing.JPanel pnlKullaniciBilgisi;
    private javax.swing.JPanel pnlList;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioKasiyer;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextArea txtAdres;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtKullaniciAdiAra;
    private javax.swing.JTextField txtMaas;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JPasswordField txtSifreTekrar;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
