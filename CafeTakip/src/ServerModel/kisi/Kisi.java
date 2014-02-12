
package ServerModel.kisi;

import controller.KisiInterface;

/**
 *
 * @author MustafaS
 */
public class Kisi implements KisiInterface{
    private int kisiId;
    private String ad;
    private String soyad;
    private int telefon;
    private int tip;
    
    public Kisi(){}

    public Kisi(int kisiId, String ad, String soyad, int telefon, int tip) {
        this.kisiId = kisiId;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.tip = tip;
    }

    @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
        
        if(kullaniciAdi.equals("asd") && sifre.equals("123"))
            return true; 
        
        return false;
    }

    @Override
    public void bilgileriGetir(String kullaniciAdi) {
        //String sql = "SELECT * from kisi where kullaniiAdi = '"+ kullaniciAdi +"'";
        //Hilbernate
        this.kisiId = 1;
        this.ad = "Mustafa";
        this.soyad = "Şahin";
        this.telefon = 1234;
        this.tip = 2;
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
        return true;
    }

    @Override
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi) {
        return true;
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

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
    
    
    
}
