
package controller.kisi;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import model.kisi.Calisan;
import model.kisi.Kisi;

import javax.swing.JOptionPane;

import view.AnaEkran;

/**
 *
 * @author MustafaS
 */
public class CalisanC implements KisiI, CalisanI{
    private Calisan kullanici;
    public static AnaEkran ana;
    
    
    @SuppressWarnings("deprecation")
    @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
         if (!kullaniciAdi.isEmpty() && !sifre.isEmpty()) {
             kullanici = new Calisan();
             if (kullanici.girisYap(kullaniciAdi, sifre)) {
                 kullanici.bilgileriGetir(kullaniciAdi);
                 ana = new AnaEkran();
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
    public Kisi bilgileriGetir(String kullaniciAdi) {
        return null;
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
        
        if(kullaniciAdi == null)
            return false;
        
        if(kullaniciAdi.equals("")){
            JOptionPane.showMessageDialog(null, "Kullanici adı boş olamaz!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        int sonuc = JOptionPane.showConfirmDialog(null, kullaniciAdi + 
                " isimli çalışanı silmek istediğinize emin misiniz?", "Kasiyer Sil",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(sonuc == JOptionPane.NO_OPTION)
            return false;
        
        try {
            Calisan c = new Calisan();
            if (c.hesapSil(kullaniciAdi)) {
                JOptionPane.showMessageDialog(null, "Calışan bilgileri silindi!"
                        , "Calisan Sil", JOptionPane.ERROR_MESSAGE);
                return true;
            }
            
            JOptionPane.showMessageDialog(null, kullaniciAdi + " isimli çalışan bulunamadı!",
                   "Hata", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                        "Hata oluştu kişi bilgileri silinemiyor!", "Hata", JOptionPane.ERROR_MESSAGE);
            
        }
        return false;
        
    }

    @Override
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi) {
        int sonuc = JOptionPane.showConfirmDialog(null, kullaniciAdi + 
                " isimli çalışan bilgilerini değiştirmek istediğinize emin misiniz?",
                "Çalışan Güncelle", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(sonuc == JOptionPane.NO_OPTION)
            return false;
        
        if(kullaniciAdi.equals("")){
            JOptionPane.showMessageDialog(null, "Kullanici adı boş olamaz!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try {
            Calisan c = (Calisan) kisi;
            if (c.hesapBilgiGuncelle(kullaniciAdi, c)) {
                JOptionPane.showMessageDialog(null, "Çalışan bilgileri güncellendi!", 
                        ".Çalışan Sil", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
            
            JOptionPane.showMessageDialog(null, kullaniciAdi + " isimli Çalışan bulunamadı!",
                    "Hata", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                        "Hata oluştu kişi bilgileri güncellenemiyor!", "Hata", JOptionPane.ERROR_MESSAGE);
            
        }
        return false;
    }

    
    @Override
    public void kisiEkle(Kisi k) {
        try{
            Calisan c = (Calisan) k;
            
            c.kisiEkle(k);
            
            JOptionPane.showMessageDialog(null, "Kasiyer bilgileri eklendi", 
                    "Kasiyer Ekle", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                        "Hata oluştu Kasiyer bilgileri eklenemiyor", "Hata", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public Calisan getCalisan(HashMap<String, String> values) {
        try {
            String ad = values.get("ad");
            String soyad = values.get("soyad");
            String telefon = values.get("telefon");
            String resimURL = values.get("resimURL");
            String kullaniciAdi = values.get("kullaniciAdi");
            String sifre1 = values.get("sifre1");
            String sifre2 = values.get("sifre2");
            int maas = Integer.parseInt(values.get("maas"));
            String adres = values.get("adres");
            int tip = Integer.parseInt(values.get("tip"));
            
            if(kullaniciAdi.equals(""))
                JOptionPane.showMessageDialog(null, 
                        "Kullanıcı adı boş olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
            else if(sifre1.length() < 4)
                JOptionPane.showMessageDialog(null, 
                        "Şifre en az 4 haneli olmalıdır", "Hata", JOptionPane.ERROR_MESSAGE);
            else if(!sifre1.equals(sifre2))
                JOptionPane.showMessageDialog(null, 
                        "Şifreler uyuşmuyor!", "Hata", JOptionPane.ERROR_MESSAGE);
            else if(maas < 0)
                JOptionPane.showMessageDialog(null, 
                        "Maaş bilgisi 0'dan küçük olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
            else
                return new Calisan(adres, maas, -1, ad, soyad, telefon, 
                        kullaniciAdi, sifre1, tip, resimURL);
            
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Geçersiz alan. \n"
                    + "Maaş alanı karakter içeremez!",
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public DefaultListModel kullaniciAdiList(){
        
        DefaultListModel model = new DefaultListModel();
        
        ArrayList<Calisan> list = calisanListesi();
        
        for(Calisan c : list){
            model.addElement(c.getKulAdi());
        }
        
        return model;
        
    }
    
    
    @Override
    public ArrayList<Calisan> calisanListesi() {
        return Calisan.calisanList;
    }

    @Override
    public Calisan calisanAra(String kullaniciAdi) {
        return null;
    }
    
    
    
    public Calisan getKullanici() {
        return kullanici;
    }

    public void setKullanici(Calisan kullanici) {
        this.kullanici = kullanici;
    }

    


    
}
