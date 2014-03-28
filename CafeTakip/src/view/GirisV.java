
package view;

/**
 *
 * @author MustafaS
 */
public class GirisV extends javax.swing.JFrame {

   
    public GirisV() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKullaniciAdi = new javax.swing.JLabel();
        lblSifre = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        btnGirisYap = new javax.swing.JButton();
        btnVazgec = new javax.swing.JButton();
        txtSifre = new javax.swing.JPasswordField();

        setTitle("Giriş");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblKullaniciAdi.setText("Kullanıcı Adı : ");

        lblSifre.setText("Şifre :");

        txtKullaniciAdi.setText("mutlak");

        btnGirisYap.setText("Giriş Yap");
        btnGirisYap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGirisYapMousePressed(evt);
            }
        });

        btnVazgec.setText("Vazgeç");
        btnVazgec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVazgecMousePressed(evt);
            }
        });
        btnVazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVazgecActionPerformed(evt);
            }
        });

        txtSifre.setText("123");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGirisYap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVazgec))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblKullaniciAdi)
                            .addComponent(lblSifre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtSifre))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSifre)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVazgec)
                    .addComponent(btnGirisYap))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirisYapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGirisYapMousePressed
        String kulAdi = txtKullaniciAdi.getText().trim();
        String sifre = txtSifre.getText().trim();
        
        if(mutlakkafe.MutlakKafe.mainCont.getCalisanCont().girisYap(kulAdi, sifre)){
            this.hide();
        }
        
    }//GEN-LAST:event_btnGirisYapMousePressed

    private void btnVazgecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVazgecMousePressed
        txtKullaniciAdi.setText("");
        txtSifre.setText("");
    }//GEN-LAST:event_btnVazgecMousePressed

    private void btnVazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVazgecActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVazgecActionPerformed

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
            java.util.logging.Logger.getLogger(GirisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisV().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGirisYap;
    private javax.swing.JButton btnVazgec;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblSifre;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
