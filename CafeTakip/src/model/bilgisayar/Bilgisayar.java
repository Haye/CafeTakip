package model.bilgisayar;

import model.kisi.Musteri;
import model.urun.*;

import java.util.ArrayList;
import java.util.Date;


public class Bilgisayar {
    //private Socket client;
    private String masaAdi;
    private Date acilisSaati;
    private Musteri musteri;
    private int sureSiniri;
    private ArrayList <Siparis> siparisler;
 
   
    public Bilgisayar(String masaAdi) {
        super();
        this.masaAdi = masaAdi;
    }

    //!!! detaylı ücret hesaplama işlemi yapılacak
    public float kullanimTutariHesapla(){
        long gecendk =  gecenDakikaHesapla();
        if(gecendk<15){
            return 0.5f;
        }
        return (gecendk/15)*0.5f;
    }
    
    public float adisyonTutariHesapla(){
        float tutar = 0;
        for(int i=0;i<siparisler.size();i++){
            tutar += siparisler.get(i).getMiktar() * siparisler.get(i).getUrun().getBirimFiyat();
        }
        return tutar;
    }
    
    public void masaKapat(){
        setAcilisSaati(null);
        setMusteri(null);
        setSiparisler(null);
        setSureSiniri(0);
    }
    
    public void masaAktar(Bilgisayar hedefPc){
        hedefPc.setAcilisSaati(this.getAcilisSaati());
        hedefPc.setMusteri(this.getMusteri());
        hedefPc.setSiparisler(this.getSiparisler());
        hedefPc.setSureSiniri(this.getSureSiniri());
    }
    
    /* masaAc overloadları başlangıç */
    public boolean masaAc(){
        //try { client.masaAc; return true; } catch { return false; }
        acilisSaati = new Date();
        siparisler = new ArrayList<>();
        return true;
    }
    
    public int gecenOranHesapla(){
        if(getSureSiniri()!=0){
            return (int)((gecenDakikaHesapla()*100)/getSureSiniri());
        }
        return 0;
    }
    public boolean masaAc(int sureSiniri,Musteri musteri){
        masaAc();
        this.sureSiniri = sureSiniri;
        this.musteri = musteri;
        return true;
    }
    /* masaAc overloadları bitiş */
    
    public boolean siparisEkle(Urun urun, int miktar){
    	siparisler.add(new Siparis(urun,miktar));
    	return true;
    }
    
    //geçen süreyi saniye cinsinden dönderir
    public long gecenDakikaHesapla(){
        return (new Date().getTime() - acilisSaati.getTime())/60000;
    }
    
   
    public String getMasaAdi() {
        return masaAdi;
    }

    public void setMasaAdi(String masaAdi) {
        this.masaAdi = masaAdi;
    }

    public Date getAcilisSaati() {
        return acilisSaati;
    }

    public void setAcilisSaati(Date acilisSaati) {
        this.acilisSaati = acilisSaati;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public int getSureSiniri() {
        return sureSiniri;
    }

    public void setSureSiniri(int sureSiniri) {
        this.sureSiniri = sureSiniri;
    }

    public ArrayList<Siparis> getSiparisler() {
        return siparisler;
    }

    public void setSiparisler(ArrayList<Siparis> siparisler) {
        this.siparisler = siparisler;
    }


}
