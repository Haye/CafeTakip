
package controller.urun;

import ServerModel.Urun;
import controller.HbmIslemler;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author MustafaS
 */
public class UrunController implements UrunInterface{

    
    @Override
    public void urunEkle(Urun urun) {
        try {
            urun.urunEkle(urun);
            
            JOptionPane.showMessageDialog(null,
                    urun.getUrunAdi() + " ürünü eklendi!",
                    "Ekle", JOptionPane.INFORMATION_MESSAGE);
        } catch (HibernateException ex) {
            
            JOptionPane.showMessageDialog(null,
                    urun.getUrunAdi() + " ürünü eklenemiyor!",
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public List<Urun> urunListesi() {
        Urun urun = new Urun();
        return urun.urunListesi();
    }

    @Override
    public boolean urunSil(int urunNo) {
        
        try {
            Urun urun = new Urun();
            if (urun.urunSil(urunNo)) {
                JOptionPane.showMessageDialog(null,
                        urunNo + " no'lu ürün silindi!",
                        "Sil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        urunNo + " no'lu ürün bulunamadı!",
                        "Hata", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, 
                    urunNo + " no'lu ürün silinmesi sırasında hata oluştu!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }finally{
            return false;
        }
    }

    @Override
    public boolean urunGuncelle(int urunNo, Urun yeniUrun) {
        try {
            Urun urun = new Urun();
            if (urun.urunGuncelle(urunNo, yeniUrun)) {
                JOptionPane.showMessageDialog(null,
                        urunNo + " no'lu ürün Güncellendi!",
                        "Güncelleme", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        urunNo + " no'lu ürün bulunamadı!",
                        "Hata", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, 
                    urunNo + " no'lu ürün güncellenmesi sırasında hata oluştu!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }finally{
            return false;
        }
    }

    @Override
    public void urunSat(int urunId, int miktar) {

        if(miktar > 0){
            HbmIslemler hbm = new HbmIslemler();
            
            Urun urun = (Urun) hbm.bilgiGetir(urunId, Urun.class);
            
            if((urun.getStok() - miktar) > 0)
                urun.urunSat(urunId, miktar);
            else
                JOptionPane.showMessageDialog(null, 
                    "Yeterli miktar bulunmamaktadır.!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
        }else
            JOptionPane.showMessageDialog(null, 
                    "Urun miktarı negatif olamaz!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
    }

    @Override
    public void urunAl(int urunId, int miktar) {
        if(miktar > 0){
            Urun urun = new Urun();
            urun.urunAl(urunId, miktar);
        
        }else
            JOptionPane.showMessageDialog(null, 
                    "Urun miktarı negatif olamaz!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
    }

    
    
}
