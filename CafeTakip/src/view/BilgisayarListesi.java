/*
        MEVCUT FONKSİYONLAR :

    public void init(String [] masaAdlari); - İlk açılışta masaların oluşturulması
    public void masaEkle(String masaAdi); - Çalışma esnasında masa oluşturma
    public void masaSil(String masaAdi); - Çalışma esnasında masanın silinmesi
    private JLabel masaBul(String masaAdi); - Masanın adından masa Labelini getirir

    public enum Durum {ACIK, KAPALI, SURELI};
    public void durumDegis(String masaAdi, Durum durum); - Masanın görüntüsünü değiştirir.
*/

package view;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JLabel;

public class BilgisayarListesi extends javax.swing.JFrame {

    ArrayList<javax.swing.JLabel> labeller = new ArrayList<javax.swing.JLabel>();
    public BilgisayarListesi(String [] masaAdlari) { 
           
    }
    
    public BilgisayarListesi() {
        
        initComponents();  
        
        //Test 
        String masaAdlari[] = {"Masa 1", "Masa 2", "Masa 3", "Masa 4", "Masa 5","Masa 6"};
        
        init(masaAdlari);
        masaEkle("Sonradan Ekleme");
        durumDegis("Masa 1", Durum.ACIK); 
        durumDegis("Masa 2", Durum.ACIK); 
        durumDegis("Masa 3", Durum.ACIK); 
        durumDegis("Masa 3", Durum.KAPALI); 
        masaSil("Masa 3");
    }

    //Açılıştaki masaların labellerini oluşturarak ekler
    public void init(String [] masaAdlari){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //FlowLayout için padding değerleri ( _ , Pad1, Pad2)
        FlowLayout layout = new FlowLayout(FlowLayout.TRAILING, 20, 20);
        //Layoutu hangi nesne için kullanacağımız. Direk eklemek için getContntPane().setLayout(_);
        jPanel1.setLayout(layout);
        // FlowLayoutun sola veya sağa göre konumlandırmasını sağlar
        jPanel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

         
        
        //Masaların eklenmesi
        for(int i=0; i<masaAdlari.length; i++){
            masaEkle(masaAdlari[i]);
        }

    }
    
    //Program çalışma esnasında kapalı halde yeni bir masa ekler
    public void masaEkle(String masaAdi){
            JLabel jLabel1 = new JLabel();
        
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kapali.png"))); // NOI18N
            jLabel1.setText(masaAdi);
            jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            labeller.add(jLabel1);
            
            //Oluşturulan labeli konteynırına ekler
            jPanel1.add(jLabel1);
    }
    
    
    //Program çalışma esnasında bir masayı siler
    public void masaSil(String masaAdi){
            JLabel jLabel1 = masaBul(masaAdi);
        
            labeller.remove(jLabel1); 
            //Silinen labeli konteynırından siler
            jPanel1.remove(jLabel1);
    }
  
    //Masa isminden masaya ait JLabel nesnesini döndürür
    private JLabel masaBul(String masaAdi){
        for(int i=0;i<labeller.size();i++){
            if(labeller.get(i).getText() == masaAdi){
                return labeller.get(i);
            }
        }
        return null;
    }
    
    
    //Duruma göre masaya ait iconu günceller
    public enum Durum {ACIK, KAPALI, SURELI};
    public void durumDegis(String masaAdi, Durum durum){
        JLabel masaLabel = masaBul(masaAdi);
        if(masaLabel != null) {
            switch(durum) {
                case ACIK:
                    masaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/acik.png"))); 
                break;

                case KAPALI:
                     masaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kapali.png")));      
                break;

                case SURELI:
                     masaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/acik.png")));
                break;
            }
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(615, 300));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Bilgisayarlar"));
        jPanel1.setMaximumSize(new java.awt.Dimension(300, 32767));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(557, 557, 557)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(BilgisayarListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BilgisayarListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BilgisayarListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BilgisayarListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BilgisayarListesi().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
