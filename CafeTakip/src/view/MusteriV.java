
package view;

import controller.kisi.MusteriC;
import java.util.HashMap;
import model.kisi.Musteri;

/**
 *
 * @author MustafaS
 */
public class MusteriV extends javax.swing.JPanel {

  
    public MusteriV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pnlList = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstKullaniciListesi = new javax.swing.JList();
        pnlAra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKullaniciAdiAra = new javax.swing.JTextField();
        btnAra = new javax.swing.JButton();
        lblToplamKayit = new javax.swing.JLabel();
        tabPageKullanici = new javax.swing.JTabbedPane();
        pnlKullaniciBilgisi = new javax.swing.JPanel();
        lblDurum = new javax.swing.JLabel();
        pnlKisiselBilgiler = new javax.swing.JPanel();
        lblResim = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        pnlHesapBilgileri = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtSifre = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txtSifreTekrar = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        comboGun = new javax.swing.JComboBox();
        comboAy = new javax.swing.JComboBox();
        comboYil = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtKullanilanSure = new javax.swing.JTextField();
        txtKalanSure = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnSurekEkleCikar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtBorc = new javax.swing.JTextField();
        txtIndirim = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pnlUcretSecenekleri = new javax.swing.JPanel();
        radioStandar = new javax.swing.JRadioButton();
        radioUyeUcreti = new javax.swing.JRadioButton();
        radioUcretsiz = new javax.swing.JRadioButton();
        pnlOdemeSecenekleri = new javax.swing.JPanel();
        radioOnceden = new javax.swing.JRadioButton();
        radioSonradan = new javax.swing.JRadioButton();
        pnlButonGrup = new javax.swing.JPanel();
        btnEkle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        btnYeni = new javax.swing.JButton();
        lblKayitTarihi = new javax.swing.JLabel();
        pnlGecmis = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKullaniciGecmis = new javax.swing.JTable();

        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        pnlList.setCursor(new java.awt.Cursor(java.awt.Cursor.NE_RESIZE_CURSOR));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kullanıcı Listesi");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setOpaque(true);

        lstKullaniciListesi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstKullaniciListesi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstKullaniciListesiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstKullaniciListesi);

        pnlAra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Kullanıcı Adı");

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
                .addGap(0, 80, Short.MAX_VALUE)
                .addComponent(lblToplamKayit))
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

        jLabel3.setText("Ad :");

        txtAd.setEnabled(false);

        jLabel4.setText("Soyad :");

        txtSoyad.setEnabled(false);

        jLabel5.setText("Telefon :");

        txtTelefon.setEnabled(false);

        javax.swing.GroupLayout pnlKisiselBilgilerLayout = new javax.swing.GroupLayout(pnlKisiselBilgiler);
        pnlKisiselBilgiler.setLayout(pnlKisiselBilgilerLayout);
        pnlKisiselBilgilerLayout.setHorizontalGroup(
            pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKisiselBilgilerLayout.setVerticalGroup(
            pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addComponent(lblResim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlKisiselBilgilerLayout.createSequentialGroup()
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHesapBilgileri.setBorder(javax.swing.BorderFactory.createTitledBorder("Hesap Bilgileri"));

        jLabel6.setText("Kullanıcı Adı :");

        jLabel7.setText("Şifre :");

        txtKullaniciAdi.setEnabled(false);

        txtSifre.setEnabled(false);

        jLabel8.setText("Şifre Tekrar :");

        txtSifreTekrar.setEnabled(false);

        jLabel9.setText("Bitiş Tarihi :");

        comboGun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboGun.setEnabled(false);

        comboAy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık" }));
        comboAy.setEnabled(false);

        comboYil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        comboYil.setEnabled(false);

        jLabel10.setText("Kullanılan Süre :");

        txtKullanilanSure.setEnabled(false);

        txtKalanSure.setEnabled(false);

        jLabel11.setText("Kalan Süre :");

        btnSurekEkleCikar.setText("+/-");
        btnSurekEkleCikar.setToolTipText("Süre Ekle Çıkar");
        btnSurekEkleCikar.setEnabled(false);

        jLabel12.setText("Borç :");

        txtBorc.setEnabled(false);

        txtIndirim.setEnabled(false);

        jLabel13.setText("İndirim (%) :");

        pnlUcretSecenekleri.setBorder(javax.swing.BorderFactory.createTitledBorder("Ücret Seçenekleri"));

        buttonGroup1.add(radioStandar);
        radioStandar.setText("Standart");
        radioStandar.setEnabled(false);

        buttonGroup1.add(radioUyeUcreti);
        radioUyeUcreti.setSelected(true);
        radioUyeUcreti.setText("Üye Ücreti");
        radioUyeUcreti.setEnabled(false);

        buttonGroup1.add(radioUcretsiz);
        radioUcretsiz.setText("Ücretsiz");
        radioUcretsiz.setEnabled(false);

        javax.swing.GroupLayout pnlUcretSecenekleriLayout = new javax.swing.GroupLayout(pnlUcretSecenekleri);
        pnlUcretSecenekleri.setLayout(pnlUcretSecenekleriLayout);
        pnlUcretSecenekleriLayout.setHorizontalGroup(
            pnlUcretSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUcretSecenekleriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUcretSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioStandar)
                    .addComponent(radioUyeUcreti)
                    .addComponent(radioUcretsiz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUcretSecenekleriLayout.setVerticalGroup(
            pnlUcretSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUcretSecenekleriLayout.createSequentialGroup()
                .addComponent(radioStandar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioUyeUcreti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioUcretsiz))
        );

        pnlOdemeSecenekleri.setBorder(javax.swing.BorderFactory.createTitledBorder("Ödeme Seçenekleri"));

        buttonGroup2.add(radioOnceden);
        radioOnceden.setSelected(true);
        radioOnceden.setText("Önceden Ödenmiş");
        radioOnceden.setEnabled(false);

        buttonGroup2.add(radioSonradan);
        radioSonradan.setText("Sonra Ödenecek");
        radioSonradan.setEnabled(false);

        javax.swing.GroupLayout pnlOdemeSecenekleriLayout = new javax.swing.GroupLayout(pnlOdemeSecenekleri);
        pnlOdemeSecenekleri.setLayout(pnlOdemeSecenekleriLayout);
        pnlOdemeSecenekleriLayout.setHorizontalGroup(
            pnlOdemeSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOdemeSecenekleriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOdemeSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSonradan)
                    .addComponent(radioOnceden))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pnlOdemeSecenekleriLayout.setVerticalGroup(
            pnlOdemeSecenekleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOdemeSecenekleriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioOnceden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(radioSonradan)
                .addContainerGap())
        );

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
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlHesapBilgileriLayout = new javax.swing.GroupLayout(pnlHesapBilgileri);
        pnlHesapBilgileri.setLayout(pnlHesapBilgileriLayout);
        pnlHesapBilgileriLayout.setHorizontalGroup(
            pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                            .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel7)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSifre)
                                .addComponent(txtKullanilanSure)
                                .addComponent(txtBorc, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                    .addComponent(pnlUcretSecenekleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                        .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addComponent(comboGun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboAy, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboYil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIndirim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                                .addComponent(txtKalanSure, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSurekEkleCikar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                        .addComponent(pnlOdemeSecenekleri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addComponent(pnlButonGrup, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlHesapBilgileriLayout.setVerticalGroup(
            pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHesapBilgileriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(comboGun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboAy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSifreTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtKullanilanSure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtKalanSure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSurekEkleCikar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBorc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIndirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHesapBilgileriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlUcretSecenekleri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlOdemeSecenekleri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(pnlKisiselBilgiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlKullaniciBilgisiLayout.createSequentialGroup()
                        .addComponent(lblDurum)
                        .addGap(291, 291, 291)
                        .addComponent(lblKayitTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlHesapBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(pnlHesapBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPageKullanici.addTab("Kullanıcı Bilgisi", pnlKullaniciBilgisi);

        tblKullaniciGecmis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tarih", "Bilgisayar", "Başlangıç", "Bitiş", "Açıklama", "Kullanılan", "Ücret", "Alınan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblKullaniciGecmis);

        javax.swing.GroupLayout pnlGecmisLayout = new javax.swing.GroupLayout(pnlGecmis);
        pnlGecmis.setLayout(pnlGecmisLayout);
        pnlGecmisLayout.setHorizontalGroup(
            pnlGecmisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        pnlGecmisLayout.setVerticalGroup(
            pnlGecmisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        tabPageKullanici.addTab("Geçmiş", pnlGecmis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPageKullanici))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabPageKullanici)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEkleMousePressed

        if(!btnEkle.isEnabled())
            return;
        
        HashMap<String, String> values = new HashMap<>();
        
        values.put("ad", txtAd.getText().trim());
        values.put("soyad", txtSoyad.getText().trim());
        values.put("telefon", txtTelefon.getText().trim());
        values.put("resimURL", "C:\\");
        values.put("kullaniciAdi", txtKullaniciAdi.getText().trim());
        values.put("sifre1", txtSifre.getText().trim());
        values.put("sifre2", txtSifreTekrar.getText().trim());
        values.put("kullanilanSure", txtKullanilanSure.getText().trim());
        values.put("kalanSure", txtKalanSure.getText().trim());
        values.put("borc", txtBorc.getText().trim());
        values.put("indirim", txtIndirim.getText().trim());
        values.put("bitisTarihYil", comboYil.getSelectedItem().toString());
        values.put("bitisTarihAy", (comboAy.getSelectedIndex()) +"");
        values.put("bitisTarihGun", (comboGun.getSelectedItem().toString()));
        
        String ucretSecenek;
        
        if(radioStandar.isSelected())
            ucretSecenek = MusteriC.UCRET_STANDART;
        else if(radioUcretsiz.isSelected())
            ucretSecenek = MusteriC.UCRET_UCRETSIZ;
        else
            ucretSecenek = MusteriC.UCRET_UYE;
        
        values.put("ucretSecenek", ucretSecenek);
        
        String odemeSekli;
        if(radioOnceden.isSelected())
            odemeSekli = MusteriC.ODEME_ONCEDEN;
        else
            odemeSekli = MusteriC.ODEME_SONRADAN;
        
        values.put("odemeSecenek", odemeSekli);
        
        Musteri m = mutlakkafe.MutlakKafe.mainCont.getMusteriCont().getMusteri(values);
        
        if(m != null){
            mutlakkafe.MutlakKafe.mainCont.getMusteriCont().kisiEkle(m);

            lstKullaniciListesi.setModel(
                    mutlakkafe.MutlakKafe.mainCont.getMusteriCont().kullaniciAdiList());

            lblToplamKayit.setText("Toplam Kayıt : " + lstKullaniciListesi.getModel().getSize());
        
            kilitle();
            temizle();
        }
    }//GEN-LAST:event_btnEkleMousePressed

    private void btnSilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSilMousePressed
        
        String kulAdi = (String) lstKullaniciListesi.getSelectedValue();
        
        mutlakkafe.MutlakKafe.mainCont.getMusteriCont().hesapSil(kulAdi);
        
        lstKullaniciListesi.setModel(
                mutlakkafe.MutlakKafe.mainCont.getMusteriCont().kullaniciAdiList());
        
        
        lblToplamKayit.setText("Toplam Kayıt : " + lstKullaniciListesi.getModel().getSize());
        temizle();
    }//GEN-LAST:event_btnSilMousePressed

    private void btnGuncelleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuncelleMousePressed
        
        if(!btnGuncelle.isEnabled())
            return;
        
        HashMap<String, String> values = new HashMap<>();
        
        values.put("ad", txtAd.getText().trim());
        values.put("soyad", txtSoyad.getText().trim());
        values.put("telefon", txtTelefon.getText().trim());
        values.put("resimURL", "");
        values.put("kullaniciAdi", txtKullaniciAdi.getText().trim());
        values.put("sifre1", txtSifre.getText().trim());
        values.put("sifre2", txtSifreTekrar.getText().trim());
        values.put("kullanilanSure", txtKullanilanSure.getText().trim());
        values.put("kalanSure", txtKalanSure.getText().trim());
        values.put("borc", txtBorc.getText().trim());
        values.put("indirim", txtIndirim.getText().trim());
        values.put("bitisTarihYil", comboYil.getSelectedItem().toString());
        values.put("bitisTarihAy", (comboAy.getSelectedIndex()) +"");
        values.put("bitisTarihGun", (comboGun.getSelectedItem().toString()));
        
        String ucretSecenek;
        
        if(radioStandar.isSelected())
            ucretSecenek = MusteriC.UCRET_STANDART;
        else if(radioUcretsiz.isSelected())
            ucretSecenek = MusteriC.UCRET_UCRETSIZ;
        else
            ucretSecenek = MusteriC.UCRET_UYE;
        
        values.put("ucuretSecenek", ucretSecenek);
        
        String odemeSekli;
        if(radioOnceden.isSelected())
            odemeSekli = MusteriC.ODEME_ONCEDEN;
        else
            odemeSekli = MusteriC.ODEME_SONRADAN;
        
        values.put("odemeSekli", odemeSekli);
        
        Musteri m = mutlakkafe.MutlakKafe.mainCont.getMusteriCont().getMusteri(values);
        
        if(m != null){
            boolean sonuc = mutlakkafe.MutlakKafe.mainCont.getMusteriCont().hesapBilgiGuncelle(m.getKulAdi(),m);
            
            if(sonuc)
                kilitle();
            temizle();
        }
    }//GEN-LAST:event_btnGuncelleMousePressed

    private void btnYeniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnYeniMousePressed

        txtAd.setEnabled(true);
        txtSoyad.setEnabled(true);
        txtTelefon.setEnabled(true);
        txtKullaniciAdi.setEnabled(true);
        txtSifre.setEnabled(true);
        txtSifreTekrar.setEnabled(true);
        txtKullanilanSure.setEnabled(true);
        txtKalanSure.setEnabled(true);
        comboGun.setEnabled(true);
        comboAy.setEnabled(true);
        comboYil.setEnabled(true);
        txtBorc.setEnabled(true);
        txtIndirim.setEnabled(true);
        radioOnceden.setEnabled(true);
        radioSonradan.setEnabled(true);
        radioStandar.setEnabled(true);
        radioUcretsiz.setEnabled(true);
        radioUyeUcreti.setEnabled(true);
        btnSurekEkleCikar.setEnabled(true);
        
        btnEkle.setEnabled(true);
        
        btnGuncelle.setEnabled(true);
        
        temizle();
    }//GEN-LAST:event_btnYeniMousePressed

    private void btnVazgecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVazgecMousePressed
        kilitle();
        temizle();
    }//GEN-LAST:event_btnVazgecMousePressed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        lstKullaniciListesi.setModel(
                mutlakkafe.MutlakKafe.mainCont.getMusteriCont().kullaniciAdiList());
        
        lblToplamKayit.setText("Toplam Kayıt : " + lstKullaniciListesi.getModel().getSize());
    }//GEN-LAST:event_formComponentAdded

    private void lstKullaniciListesiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstKullaniciListesiValueChanged
        
        String kulAdi = (String) lstKullaniciListesi.getSelectedValue();
        
        Musteri m = (Musteri) mutlakkafe.MutlakKafe.
                mainCont.getMusteriCont().bilgileriGetir(kulAdi);
        
        if( m == null)
            return ;
        
        txtAd.setText(m.getAd());
        txtSoyad.setText(m.getSoyad());
        txtTelefon.setText(m.getTelefon());
        txtKullaniciAdi.setText(m.getKulAdi());
        txtSifre.setText(m.getSifre());
        txtSifreTekrar.setText(m.getSifre());
        txtKalanSure.setText(m.getKredi() + "");
        txtKullanilanSure.setText(m.getHarcanan() + "");
        txtIndirim.setText(m.getIndrim() + "");
        txtBorc.setText(m.getBorc() + "");
        comboGun.setSelectedIndex(m.getBitisTarihi().getDay());
        comboAy.setSelectedIndex(m.getBitisTarihi().getMonth());
        
        comboYil.setSelectedIndex(m.getBitisTarihi().getYear() - 114);
        lblKayitTarihi.setText("Kayıt Tarihi :" + m.getKayitTarihi().toLocaleString());
        
        switch(m.getOdemeSecenek()){
            case MusteriC.ODEME_ONCEDEN:
                radioOnceden.setSelected(true);
                break;
            case MusteriC.ODEME_SONRADAN:
                radioSonradan.setSelected(true);
                break;
        }
        
        switch (m.getUcretSecenek()) {
            case MusteriC.UCRET_STANDART:
                radioStandar.setSelected(true);
                break;
            case MusteriC.UCRET_UCRETSIZ:
                radioUcretsiz.setSelected(true);
                break;
            default:
                radioUyeUcreti.setSelected(true);
                break;
        }
    }//GEN-LAST:event_lstKullaniciListesiValueChanged

    private void btnAraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAraMousePressed
        String kulAdi = txtKullaniciAdiAra.getText().trim();
        lstKullaniciListesi.setSelectedValue(kulAdi, true);
        
    }//GEN-LAST:event_btnAraMousePressed

    private void kilitle(){
        txtAd.setEnabled(false);
        txtSoyad.setEnabled(false);
        txtTelefon.setEnabled(false);
        txtKullaniciAdi.setEnabled(false);
        txtSifre.setEnabled(false);
        txtSifreTekrar.setEnabled(false);
        txtKullanilanSure.setEnabled(false);
        txtKalanSure.setEnabled(false);
        comboGun.setEnabled(false);
        comboAy.setEnabled(false);
        comboYil.setEnabled(false);
        txtBorc.setEnabled(false);
        txtIndirim.setEnabled(false);
        radioOnceden.setEnabled(false);
        radioSonradan.setEnabled(false);
        radioStandar.setEnabled(false);
        radioUcretsiz.setEnabled(false);
        radioUyeUcreti.setEnabled(false);
        btnSurekEkleCikar.setEnabled(false);
        
        btnEkle.setEnabled(false);
        btnGuncelle.setEnabled(false);
        
    }
    
    private void temizle(){
        
        txtAd.setText("");
        txtSoyad.setText("");
        txtTelefon.setText("");
        txtKullaniciAdi.setText("");
        txtSifre.setText("");
        txtSifreTekrar.setText("");
        txtKullanilanSure.setText("");
        txtKalanSure.setText("");
        comboGun.setSelectedIndex(0);
        comboAy.setSelectedIndex(0);
        comboYil.setSelectedIndex(0);
        txtBorc.setText("");
        txtIndirim.setText("");
        radioOnceden.setSelected(true);
        radioSonradan.setSelected(false);
        radioStandar.setSelected(true);
        radioStandar.setSelected(false);
        radioUyeUcreti.setSelected(false);
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAra;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnSurekEkleCikar;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JButton btnYeni;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox comboAy;
    private javax.swing.JComboBox comboGun;
    private javax.swing.JComboBox comboYil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel lblKayitTarihi;
    private javax.swing.JLabel lblResim;
    private javax.swing.JLabel lblToplamKayit;
    private javax.swing.JList lstKullaniciListesi;
    private javax.swing.JPanel pnlAra;
    private javax.swing.JPanel pnlButonGrup;
    private javax.swing.JPanel pnlGecmis;
    private javax.swing.JPanel pnlHesapBilgileri;
    private javax.swing.JPanel pnlKisiselBilgiler;
    private javax.swing.JPanel pnlKullaniciBilgisi;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlOdemeSecenekleri;
    private javax.swing.JPanel pnlUcretSecenekleri;
    private javax.swing.JRadioButton radioOnceden;
    private javax.swing.JRadioButton radioSonradan;
    private javax.swing.JRadioButton radioStandar;
    private javax.swing.JRadioButton radioUcretsiz;
    private javax.swing.JRadioButton radioUyeUcreti;
    private javax.swing.JTabbedPane tabPageKullanici;
    private javax.swing.JTable tblKullaniciGecmis;
    private javax.swing.JTextField txtAd;
    private javax.swing.JTextField txtBorc;
    private javax.swing.JTextField txtIndirim;
    private javax.swing.JTextField txtKalanSure;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtKullaniciAdiAra;
    private javax.swing.JTextField txtKullanilanSure;
    private javax.swing.JPasswordField txtSifre;
    private javax.swing.JPasswordField txtSifreTekrar;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
