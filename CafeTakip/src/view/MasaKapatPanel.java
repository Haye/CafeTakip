/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

/**
 *
 * @author yetishbey
 */
public class MasaKapatPanel extends javax.swing.JFrame {

    /**
     * Creates new form MasaKapatPanel
     */
    public MasaKapatPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMasaAdi = new javax.swing.JLabel();
        lblAcilisZamani = new javax.swing.JLabel();
        lblGecenSure = new javax.swing.JLabel();
        lblTarife = new javax.swing.JLabel();
        lblMusteri = new javax.swing.JLabel();
        lblKullanimTutari = new javax.swing.JLabel();
        lblAdisyonTutari = new javax.swing.JLabel();
        lblToplamTutar = new javax.swing.JLabel();
        lblAdisyonDetayiGoruntule = new javax.swing.JLabel();
        pnlIslemler = new javax.swing.JPanel();
        btnMasaAktar = new javax.swing.JButton();
        btnAdisyonEkle = new javax.swing.JButton();
        btnIndırımUygula = new javax.swing.JButton();
        pnlMasaKapat = new javax.swing.JPanel();
        btnMasaKapat = new javax.swing.JButton();
        btnKismenOdendi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMasaAdi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMasaAdi.setText("Masa Adı");

        lblAcilisZamani.setText("Açılış Zamanı :");
        lblAcilisZamani.setName(""); // NOI18N

        lblGecenSure.setText("Geçen Süre :");

        lblTarife.setText("Tarife :");

        lblMusteri.setText("Müşteri :");

        lblKullanimTutari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKullanimTutari.setText("Kullanım Tutarı :");

        lblAdisyonTutari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblAdisyonTutari.setText("Adisyon Tutarı :");

        lblToplamTutar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblToplamTutar.setText("Toplam Tutar :");

        lblAdisyonDetayiGoruntule.setForeground(new java.awt.Color(0, 51, 255));
        lblAdisyonDetayiGoruntule.setText("Adisyon Detayı Görüntüle");

        pnlIslemler.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İşlemler", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnMasaAktar.setText("Masa Aktar");

        btnAdisyonEkle.setText("Adisyon Ekle");

        btnIndırımUygula.setText("İndirim uygula");

        javax.swing.GroupLayout pnlIslemlerLayout = new javax.swing.GroupLayout(pnlIslemler);
        pnlIslemler.setLayout(pnlIslemlerLayout);
        pnlIslemlerLayout.setHorizontalGroup(
            pnlIslemlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIslemlerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdisyonEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMasaAktar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIndırımUygula)
                .addGap(21, 21, 21))
        );
        pnlIslemlerLayout.setVerticalGroup(
            pnlIslemlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIslemlerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIslemlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdisyonEkle)
                    .addComponent(btnMasaAktar)
                    .addComponent(btnIndırımUygula))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlMasaKapat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Masa Kapat", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnMasaKapat.setText("Tamamen Ödendi");

        btnKismenOdendi.setText("Kısmen Ödendi");

        javax.swing.GroupLayout pnlMasaKapatLayout = new javax.swing.GroupLayout(pnlMasaKapat);
        pnlMasaKapat.setLayout(pnlMasaKapatLayout);
        pnlMasaKapatLayout.setHorizontalGroup(
            pnlMasaKapatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMasaKapatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKismenOdendi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMasaKapat)
                .addContainerGap())
        );
        pnlMasaKapatLayout.setVerticalGroup(
            pnlMasaKapatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMasaKapatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMasaKapatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMasaKapat)
                    .addComponent(btnKismenOdendi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblMasaAdi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblGecenSure)
                                .addComponent(lblAcilisZamani)
                                .addComponent(lblMusteri)
                                .addComponent(lblTarife)
                                .addComponent(lblAdisyonTutari)
                                .addComponent(lblToplamTutar)
                                .addComponent(lblKullanimTutari))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAdisyonDetayiGoruntule))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pnlIslemler, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(pnlMasaKapat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMasaAdi)
                .addGap(18, 18, 18)
                .addComponent(lblAcilisZamani)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGecenSure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTarife, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMusteri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKullanimTutari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdisyonTutari)
                    .addComponent(lblAdisyonDetayiGoruntule))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblToplamTutar)
                .addGap(30, 30, 30)
                .addComponent(pnlIslemler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(pnlMasaKapat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MasaKapatPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasaKapatPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasaKapatPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasaKapatPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasaKapatPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdisyonEkle;
    private javax.swing.JButton btnIndırımUygula;
    private javax.swing.JButton btnKismenOdendi;
    private javax.swing.JButton btnMasaAktar;
    private javax.swing.JButton btnMasaKapat;
    private javax.swing.JLabel lblAcilisZamani;
    private javax.swing.JLabel lblAdisyonDetayiGoruntule;
    private javax.swing.JLabel lblAdisyonTutari;
    private javax.swing.JLabel lblGecenSure;
    private javax.swing.JLabel lblKullanimTutari;
    private javax.swing.JLabel lblMasaAdi;
    private javax.swing.JLabel lblMusteri;
    private javax.swing.JLabel lblTarife;
    private javax.swing.JLabel lblToplamTutar;
    private javax.swing.JPanel pnlIslemler;
    private javax.swing.JPanel pnlMasaKapat;
    // End of variables declaration//GEN-END:variables
}
