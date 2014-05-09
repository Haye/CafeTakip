
package view;

import javax.swing.JOptionPane;
import model.bilgisayar.Bilgisayar;

/**
 *
 * @author MustafaS
 */
public class AracCubuguV extends javax.swing.JPanel {
    static int masaid=1;
    public AracCubuguV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSecenek = new javax.swing.JButton();
        btnKasiyer = new javax.swing.JButton();
        btnKafeterya = new javax.swing.JButton();
        btnBilet = new javax.swing.JButton();
        btnMusteri = new javax.swing.JButton();
        btnMusteri1 = new javax.swing.JButton();
        btnMusteri2 = new javax.swing.JButton();

        btnSecenek.setText("Seçenekler");
        btnSecenek.setPreferredSize(new java.awt.Dimension(60, 60));
        btnSecenek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecenekActionPerformed(evt);
            }
        });

        btnKasiyer.setText("Kasiyer");
        btnKasiyer.setPreferredSize(new java.awt.Dimension(100, 100));
        btnKasiyer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKasiyerMousePressed(evt);
            }
        });

        btnKafeterya.setText("Kafeterya");
        btnKafeterya.setPreferredSize(new java.awt.Dimension(100, 100));
        btnKafeterya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKafeteryaMousePressed(evt);
            }
        });

        btnBilet.setText("İstatistikler");
        btnBilet.setPreferredSize(new java.awt.Dimension(100, 100));
        btnBilet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiletActionPerformed(evt);
            }
        });

        btnMusteri.setText("Musteri");
        btnMusteri.setPreferredSize(new java.awt.Dimension(100, 100));
        btnMusteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMusteriMousePressed(evt);
            }
        });

        btnMusteri1.setText("Bekleyen Sipariş");
        btnMusteri1.setPreferredSize(new java.awt.Dimension(100, 100));
        btnMusteri1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMusteri1MousePressed(evt);
            }
        });

        btnMusteri2.setText("Sıraki Müşteriler");
        btnMusteri2.setActionCommand("");
        btnMusteri2.setPreferredSize(new java.awt.Dimension(100, 100));
        btnMusteri2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMusteri2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSecenek, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKasiyer, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKafeterya, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBilet, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMusteri1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMusteri2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMusteri1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnMusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnBilet, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnSecenek, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
            .addComponent(btnKasiyer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnKafeterya, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnMusteri2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSecenekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecenekActionPerformed
        if(mutlakkafe.MutlakKafe.mainCont.getCalisanCont().getKullanici().getTip()!=1){
            JOptionPane.showMessageDialog(null, "Admine ozel", "Uyari", 
                     JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSecenekActionPerformed

    private void btnKafeteryaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKafeteryaMousePressed

        UrunV urunFrame = new UrunV();
        urunFrame.show();
        
    }//GEN-LAST:event_btnKafeteryaMousePressed

    private void btnMusteriMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusteriMousePressed
        MusteriPencereV musteri = new MusteriPencereV();
        musteri.show();
    }//GEN-LAST:event_btnMusteriMousePressed

    private void btnKasiyerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKasiyerMousePressed

        KasiyerPencereV kasiyer = new KasiyerPencereV();
        kasiyer.show();
        
    }//GEN-LAST:event_btnKasiyerMousePressed

    private void btnBiletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiletActionPerformed
    }//GEN-LAST:event_btnBiletActionPerformed

    private void btnMusteri1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusteri1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMusteri1MousePressed

    private void btnMusteri2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusteri2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMusteri2MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBilet;
    private javax.swing.JButton btnKafeterya;
    private javax.swing.JButton btnKasiyer;
    private javax.swing.JButton btnMusteri;
    private javax.swing.JButton btnMusteri1;
    private javax.swing.JButton btnMusteri2;
    private javax.swing.JButton btnSecenek;
    // End of variables declaration//GEN-END:variables
}
