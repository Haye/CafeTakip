
package controller;

import ServerModel.kisi.Kisi;
import javax.swing.JOptionPane;
import view.AnaEkran;

/**
 *
 * @author MustafaS
 */
public class KisiController implements KisiInterface{
    private Kisi kullanici;
    
     @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
         if (!kullaniciAdi.isEmpty() && !sifre.isEmpty()) {
             kullanici = new Kisi();
             if (kullanici.girisYap(kullaniciAdi, sifre)) {
                 kullanici.bilgileriGetir(kullaniciAdi);
                 
                 AnaEkran ana = new AnaEkran();
                 ana.show();
                 return true;
             }
              JOptionPane.showMessageDialog(null, "Yanlıs kullanıcı adı sifre",
                        "Hata", JOptionPane.ERROR_MESSAGE);
         }
         else 
             JOptionPane.showMessageDialog(null, "Lütfen alanları doldurunuz.",
                        "Hata", JOptionPane.ERROR_MESSAGE);
         return false;
        
    }

    @Override
    public void bilgileriGetir(String kullaniciAdi) {
        
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
        return true;
    }

    @Override
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi) {
        return true;
    }

    public Kisi getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kisi kullanici) {
        this.kullanici = kullanici;
    }
    
}
