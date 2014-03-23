
package model.kisi;

import controller.kisi.KisiI;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MustafaS
 */
public  class Kisi implements KisiI{
    private int kisiId;
    private String ad;
    private String soyad;
    private String telefon;
    private String kulAdi;
    private String sifre;
    private String resimURL;
    private Timestamp kayitTarihi;
    private int tip;
    
    
    public Kisi(){
        
    }

    public Kisi(int kisiId, String ad, String soyad, String telefon, 
            String kulAdi , String sifre, int tip, String resimURL) {
        this.kisiId = kisiId;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.kayitTarihi = suan();
        this.kulAdi = kulAdi;
        this.sifre = sifre;
        this.tip = tip ;
        
    }

    public Timestamp suan(){
        int yil = new Date().getYear() + 1900;
        int ay = new Date().getMonth();
        int gun = new Date().getDay();
        
        int saat = new Date().getHours();
        int dk = new Date().getMinutes();
        int sn = new Date().getSeconds();
        
        
        return Timestamp.valueOf
                (yil + "-" + ay + "-" + gun + " " + saat + ":" + dk + ":" + sn + ".0");
    }
    
    
   @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
         /*
         String hql ="from Kisi "
                 + "where kullaniciAdi = '" + kullaniciAdi 
                 + "' and sifre = '" + sifre + "'";
         
         HbmIslemler hbm = new HbmIslemler();
         List<Kisi> calisan = (List<Kisi>) hbm.list(hql);

        if(calisan.size() > 0)
            return true; 
        */
        if(kullaniciAdi.equals("mutlak") && sifre.equals("123")){
  
            return true;
        }
        return false;
    }
    @Override
    public Kisi bilgileriGetir(String kullaniciAdi) {
        
        this.kisiId = 1;
        this.ad = "Mustafa";
        this.soyad = "Sahin";
        this.telefon = "1234";
        
        return this;
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
        
        return true;
    }

    @Override
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi) {
        return true;
    }

    @Override
    public void kisiEkle(Kisi k) {
        
        
    }
    
    
    public int getKisiId() {
        return kisiId;
    }

    public void setKisiId(int kisiId) {
        this.kisiId = kisiId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Timestamp getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Timestamp kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public String getKulAdi() {
        return kulAdi;
    }

    public void setKulAdi(String kulAdi) {
        this.kulAdi = kulAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
    public String getResimURL() {
        return resimURL;
    }

    public void setResimURL(String resimURL) {
        this.resimURL = resimURL;
    }

    @Override
    public String toString() {
        return "Kisi{" + "kisiId=" + kisiId + ", ad=" + ad + ", "
                + "soyad=" + soyad + ", telefon=" + telefon + ", "
                + "kulAdi=" + kulAdi + ", sifre=" + sifre + ", "
                + "kayitTarihi=" + kayitTarihi + ", tip=" + tip + '}';
    }
    
    
}
