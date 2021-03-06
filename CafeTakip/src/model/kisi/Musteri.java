package model.kisi;

import controller.kisi.KisiI;
import controller.kisi.MusteriI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author MustafaS
 */
public class Musteri extends Kisi implements KisiI, MusteriI{
    private int kredi;
    private int harcanan;
    private double borc;
    private int indrim;
    private String ucretSecenek;
    private String odemeSecenek;
    private Date bitisTarihi;

    public static ArrayList<Musteri> musteriList  = new ArrayList<>();
    
    public Musteri(){
        
    }
    
    public Musteri(int kredi, int harcanan, double borc, 
            int indrim, String ucretSecenek, String odemeSecenek, String resimURL, 
            Date bitisTarihi, int kisiId, String ad, String soyad, 
            String telefon, String kulAdi, String sifre, int tip) {
        
        super(kisiId, ad, soyad, telefon, kulAdi , sifre, tip, resimURL);
        this.kredi = kredi;
        this.harcanan = harcanan;
        this.borc = borc;
        this.indrim = indrim;
        this.ucretSecenek = ucretSecenek;
        this.odemeSecenek = odemeSecenek;
        
        System.out.println("BitisTarih " + bitisTarihi.toLocaleString());
        
        this.bitisTarihi = bitisTarihi;
        
        
    }

    public void kisiEkle(Musteri m){
        super.kisiEkle(new Kisi(-1, m.getAd(), m.getSoyad(), m.getTelefon(), 
                m.getKulAdi(), m.getSifre(), m.getTip(), m.getResimURL()));
        
        musteriList.add(m);
    }
    
    public boolean hesapBilgiGuncelle(String kulAdi, Musteri m ){
        super.hesapBilgiGuncelle(kulAdi, m);
        
        for(int i = 0 ; i < musteriList.size() ; i ++)
            if(musteriList.get(i).getKulAdi().equals(kulAdi)){
                musteriList.set(i, m);
                return true;
            }
        return false;
    }
    

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    public int getHarcanan() {
        return harcanan;
    }

    public void setHarcanan(int harcanan) {
        this.harcanan = harcanan;
    }

    public double getBorc() {
        return borc;
    }

    public void setBorc(double borc) {
        this.borc = borc;
    }

    public int getIndrim() {
        return indrim;
    }

    public void setIndrim(int indrim) {
        this.indrim = indrim;
    }

    public String getUcretSecenek() {
        return ucretSecenek;
    }

    public void setUcretSecenek(String ucretSecenek) {
        this.ucretSecenek = ucretSecenek;
    }

    public String getOdemeSecenek() {
        return odemeSecenek;
    }

    public void setOdemeSecenek(String odemeSecenek) {
        this.odemeSecenek = odemeSecenek;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(int yil, int ay, int gun) {
        this.bitisTarihi = new Date(yil, ay, gun);
    }

    @Override
    public Musteri getMusteri(HashMap<String, String> values) {
        return this;
    }

    @Override
    public ArrayList<Musteri> musteriListesi() {
        return this.musteriListesi();
    }

    @Override
    public Musteri musteriAra(String kullaniciAdi) {
        
        for(int i = 0 ; i < Musteri.musteriList.size(); i ++)
            if(musteriList.get(i).getKulAdi().equals(kullaniciAdi))
                return musteriList.get(i);
        
        return null;
    }
    
    @Override
   public boolean hesapSil(String kulAdi){
        super.hesapSil(kulAdi);
        
        Musteri m = musteriAra(kulAdi);
        
        if(m != null){
            musteriList.remove(m);
            return true;
        }
       return false;
   }
 
}
