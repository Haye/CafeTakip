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

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author yetishbey
 */
public class Masalar extends javax.swing.JPanel {
    public ArrayList<JLabel> labeller = new ArrayList<JLabel>();
    /**
     * Creates new form Masalar
     */
    public Masalar() {
        initComponents();
    }

    
    //Açılıştaki masaların labellerini oluşturarak ekler
    public void init(String [] masaAdlari){        
        //FlowLayout için padding değerleri ( _ , Pad1, Pad2)
        FlowLayout layout = new FlowLayout(FlowLayout.TRAILING, 20, 20);
        //Layoutu hangi nesne için kullanacağımız. Direk eklemek için getContntPane().setLayout(_);
        this.setLayout(layout);
        // FlowLayoutun sola veya sağa göre konumlandırmasını sağlar
        this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

         
        
        //Masaların eklenmesi
        for(int i=0; i<masaAdlari.length; i++){
            masaEkle(masaAdlari[i]);
        }

    }
    
    //Program çalışma esnasında kapalı halde yeni bir masa ekler
    public void masaEkle(String masaAdi){
            JLabel jLabel1 = new JLabel();
        
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/kapali.png"))); 
            jLabel1.setText(masaAdi);
            jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            
            //Bilgisayarların etrafına padding ekleme 
            javax.swing.border.Border paddingBorder = javax.swing.BorderFactory.createEmptyBorder(10,10,10,10);
            jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null,paddingBorder));
            
            
            //Mouse listener ekle, tıklandığında jLabelMouseClicked çalışması için
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabelMouseClicked(evt);
                }
             });
            
            
            labeller.add(jLabel1);
            //Oluşturulan labeli konteynırına ekler
            this.add(jLabel1);
    }
    
    private void jLabelMouseClicked(java.awt.event.MouseEvent evt) { 
        //Tıklanılan nesneyi al
        JLabel j = (JLabel) evt.getSource();
        
        //Diğer bilgisayarları eski haline getir
        for(int i=0;i<labeller.size();i++){
            labeller.get(i).setForeground(Color.black);
            labeller.get(i).setOpaque(false);
        }
        //tıklanılan nesnenin arkaplanını gri yap
        j.setOpaque(true);
        j.setForeground(Color.blue);
        j.setBackground(Color.lightGray);
    }
    
    //Program çalışma esnasında bir masayı siler
    public void masaSil(String masaAdi){
            JLabel jLabel1 = masaBul(masaAdi);
        
            labeller.remove(jLabel1); 
            //Silinen labeli konteynırından siler
            this.remove(jLabel1);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
