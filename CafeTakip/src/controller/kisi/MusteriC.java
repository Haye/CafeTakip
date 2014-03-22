
package controller.kisi;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.kisi.Kisi;
import model.kisi.Musteri;

/**
 *
 * @author MustafaS
 */
public class MusteriC implements KisiI, MusteriI{

    @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
        
        return false;       
    }

    @Override
    public Kisi bilgileriGetir(String kullaniciAdi) {
        
        if(kullaniciAdi == null){
            //JOptionPane.showMessageDialog(null, "Lütfen bir müşteri seçiniz", 
                    //"Hata", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return musteriAra(kullaniciAdi);
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
    
        if(kullaniciAdi == null)
            return false;
        
        int sonuc = JOptionPane.showConfirmDialog(null, kullaniciAdi + 
                " isimli müşteriyi silmek istediğinize emin misiniz?", "Müşteri Sil",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        
        if(sonuc == JOptionPane.NO_OPTION)
            return false;
        
        if(kullaniciAdi.equals("")){
            JOptionPane.showMessageDialog(null, "Kullanici adı boş olamaz!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try {
            Musteri m = new Musteri();
            if (m.hesapSil(kullaniciAdi)) {
                JOptionPane.showMessageDialog(null, "Müşteri bilgileri silindi!", "Müşteri Sil", JOptionPane.ERROR_MESSAGE);
                return true;
            }
            
            JOptionPane.showMessageDialog(null, kullaniciAdi + " isimli müşteri bulunamadı!",
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
                " isimli müşteri bilgilerini değiştirmek istediğinize emin misiniz?", "Müşteri Güncelle",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(sonuc == JOptionPane.YES_OPTION)
            return false;
        
        if(kullaniciAdi.equals("")){
            JOptionPane.showMessageDialog(null, "Kullanici adı boş olamaz!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        try {
            Musteri m = (Musteri) kisi;
            if (m.hesapBilgiGuncelle(kullaniciAdi, kisi)) {
                JOptionPane.showMessageDialog(null, "Müşteri bilgileri güncellendi!", "Müşteri Sil", JOptionPane.ERROR_MESSAGE);
                return true;
            }
            
            JOptionPane.showMessageDialog(null, kullaniciAdi + " isimli müşteri bulunamadı!",
                    "Hata", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, 
                        "Hata oluştu kişi bilgileri güncellenemiyor!", "Hata", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        return false;
    }

    @Override
    public Musteri getMusteri(HashMap<String, String> values) {
        
        try {
            String ad = values.get("ad");
            String soyad = values.get("soyad");
            String telefon = values.get("telefon");
            String resimURL = values.get("resimURL");
            String kullaniciAdi = values.get("kullaniciAdi");
            String sifre1 = values.get("sifre1");
            String sifre2 = values.get("sifre2");
            int kullanilanSure = Integer.parseInt(values.get("kullanilanSure"));
            int kalanSure = Integer.parseInt(values.get("kalanSure"));
            String bitisTarihi = values.get("bitisTarih");
            double borc = Double.parseDouble(values.get("borc"));
            int indirim = Integer.parseInt(values.get("indirim"));
            String ucretSecenek = values.get("ucretSecenek");
            String odemeSecenek = values.get("odemeSecenek");
        
            
            if(kullaniciAdi.equals(""))
                JOptionPane.showMessageDialog(null, 
                        "Kullanıcı adı boş olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
            else if(sifre1.length() < 4)
                JOptionPane.showMessageDialog(null, 
                        "Şifre en az 4 haneli olmalıdır", "Hata", JOptionPane.ERROR_MESSAGE);
            else if(!sifre1.equals(sifre2))
                JOptionPane.showMessageDialog(null, 
                        "Şifreler uyuşmuyor!", "Hata", JOptionPane.ERROR_MESSAGE);
            else if(kalanSure < 0 )
                JOptionPane.showMessageDialog(null, 
                        "Kalan süre negatif olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
            else
                return new Musteri(kalanSure, kullanilanSure, borc, indirim, ucretSecenek,
                        odemeSecenek, resimURL, bitisTarihi, -1, ad, soyad, telefon, kullaniciAdi, sifre1,MUSTERI);
            
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Geçersiz alan. \n"
                    + "(Kullanılan Sure, Kalan Sure, Borc "
                    + "veya indirim bilgileri karakter içeremez)",
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    @Override
    public void kisiEkle(Kisi k) {
        
        try {
            Musteri m = (Musteri) k;
            
            m.kisiEkle(m);
            
            JOptionPane.showMessageDialog(null, "Müşteri bilgileri eklendi", 
                    "Müşteri Ekle", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                        "Hata oluştu kişi bilgileri eklenemiyor", "Hata", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public DefaultListModel kullaniciAdiList(){
        
        DefaultListModel model = new DefaultListModel();
        
        ArrayList<Musteri> list = musteriListesi();
        
        for(Musteri m : list){
            model.addElement(m.getKulAdi());
        }
        
        return model;
        
    }

    @Override
    public ArrayList<Musteri> musteriListesi() {
        return Musteri.musteriList;
    }

    @Override
    public Musteri musteriAra(String kullaniciAdi) {
        
        if(kullaniciAdi.equals("")){
            JOptionPane.showMessageDialog(null, "Kullanici adı boş olamaz!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        
        Musteri m = new Musteri();
        
        m = m.musteriAra(kullaniciAdi);
        
        if(m == null){
            JOptionPane.showMessageDialog(null, "Kayıtlı müşteri bulunamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return m;
    }
    
}
