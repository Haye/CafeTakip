
package model.kisi;

import controller.kisi.CalisanI;
import controller.kisi.KisiI;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MustafaS
 */
public class Calisan extends Kisi implements KisiI, CalisanI{
    private String adres;
    private int maas;
    
    public static ArrayList<Calisan> calisanList = new ArrayList<>();

    public Calisan() {
    }

    public Calisan(String adres, int maas, int kisiId, String ad, 
            String soyad, String telefon, String kulAdi, String sifre, int tip, String resimURL) {
        super(kisiId, ad, soyad, telefon, kulAdi, sifre, tip, resimURL);
        this.adres = adres;
        this.maas = maas;
    }
    
    public void kisiEkle(Calisan c){
        super.kisiEkle(c);
        
        calisanList.add(c);
        
    }
    
    public boolean hesapBilgiGuncelle(String kulAdi ,Calisan c){
        super.hesapBilgiGuncelle(kulAdi, c);
        
        for(int i = 0 ; i < calisanList.size() ; i ++)
            if(calisanList.get(i).getKulAdi().equals(kulAdi)){
                calisanList.set(i, c);
                return true;
            }
        return false;
    }
    
    @Override
    public boolean hesapSil(String kullaniciAdi){
        super.hesapSil(kullaniciAdi);
        
        Calisan c = calisanAra(kullaniciAdi);
        
        if(c != null){
            calisanList.remove(c);
            return true;
        }
        return false;
    }
    
     

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public Calisan getCalisan(HashMap<String, String> values) {
        return this;
    }

    @Override
    public ArrayList<Calisan> calisanListesi() {
        return this.calisanListesi();
    }

    @Override
    public Calisan calisanAra(String kullaniciAdi) {
        
        for(int i = 0 ; i < calisanList.size(); i ++)
            if(calisanList.get(i).getKulAdi().equals(kullaniciAdi))
                return calisanList.get(i);
        
        return null;
    }

    
     
     
     
}
