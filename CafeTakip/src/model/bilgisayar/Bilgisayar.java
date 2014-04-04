package model.bilgisayar;

import controller.haberlesme.ClientSoketDinleyiciC;
import model.kisi.Musteri;
import model.urun.*;

import java.util.ArrayList;
import java.util.Date;


public class Bilgisayar {
    /*Süresi dolmuş : suresi_bitmis_beklemede
     *beklemede : süre işlemiyor
     *PC de kilit ekranı var : kilitli
     *PC tamamen kapalı durumda : kapalı
    */
    public static enum Durum {KAPALI, SINIRSIZ_ACIK, SURELI_ACIK, KILITLI, BEKLEMEDE, SURESI_BITMIS_BEKLEMEDE };
    //private Socket client;
    private String masaAdi;
    private Date acilisSaati;
    private Musteri musteri;
    private int sureSiniri, gecenSure, beklemeSuresi;
    private Durum durum;
    private ArrayList <Siparis> siparisler;
    public ClientSoketDinleyiciC client;
 
   
    public Bilgisayar(String masaAdi) {
        super();
        this.masaAdi = masaAdi;
        this.durum = Durum.KAPALI;
        this.gecenSure = 0;
    }

    //!!! detaylı ücret hesaplama işlemi yapılacak
    public float kullanimTutariHesapla(){
        if(this.gecenSure < 15){
            return 0.5f;
        }
        return (this.gecenSure / 15) * 0.5f;
    }
    
    public float adisyonTutariHesapla(){
        float tutar = 0;
        for(int i=0;i<siparisler.size();i++){
            tutar += siparisler.get(i).getMiktar() * siparisler.get(i).getUrun().getBirimFiyat();
        }
        return tutar;
    }
    
    
    public boolean sureUzat(int sure,boolean beklemeSuresiEkle){
        this.sureSiniri += sure;
        if(beklemeSuresiEkle)
            this.gecenSure += this.beklemeSuresi;
        
        this.beklemeSuresi = 0;
        this.durum = Durum.SURELI_ACIK;
        return true;
    }
    
    
    public boolean adisyonEkle(Siparis siparis){
        siparisler.add(siparis);
        return true;
    }
    
    public int gecenDakikaHesapla(){
        return this.gecenSure;
    }
    
    public boolean adisyonSil(Siparis siparis){
        for(int i=0;i<siparisler.size();i++){
            if(siparisler.get(i).getUrun().getUrunAdi().equals(siparis.getUrun().getUrunAdi())){
                if(siparisler.get(i).getMiktar()==siparis.getMiktar()){
                    siparisler.remove(i);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public void masaKapat(){
        setAcilisSaati(null);
        setMusteri(null);
        setSiparisler(null);
        setSureSiniri(0);
        this.gecenSure = 0;
        this.beklemeSuresi = 0;
    }
    
    public void masaAktar(Bilgisayar hedefPc){
        hedefPc.setAcilisSaati(this.getAcilisSaati());
        hedefPc.setMusteri(this.getMusteri());
        hedefPc.setSiparisler(this.getSiparisler());
        hedefPc.setSureSiniri(this.getSureSiniri());
        hedefPc.beklemeSuresi = this.beklemeSuresi;
        hedefPc.durum = this.durum;
        hedefPc.gecenSure = this.gecenSure;
    }
    
    /* masaAc overloadları başlangıç */
    public boolean masaAc(){
        //try { client.masaAc; return true; } catch { return false; }
        acilisSaati = new Date();
        siparisler = new ArrayList<>();
        this.durum = Durum.SINIRSIZ_ACIK;
        return true;
    }
    
    public String acilisZamaniString(){
        return ikiHaneliYazdir(getAcilisSaati().getHours())+":"+ikiHaneliYazdir(getAcilisSaati().getMinutes());
    }
    
    private String ikiHaneliYazdir(int sayi){
        if(Math.abs(sayi)<10)
            return "0"+sayi;
        return Integer.toString(sayi);
        
    }
    
    public int gecenOranHesapla(){
        if(getSureSiniri()!=0){
            return (int)((this.gecenSure*100)/getSureSiniri());
        }
        return 0;
    }
    public boolean masaAc(int sureSiniri,Musteri musteri){
        masaAc();
        this.sureSiniri = sureSiniri;
        this.musteri = musteri;
        this.durum = Durum.SURELI_ACIK;
        
           
        return true;
    }
    /* masaAc overloadları bitiş */
    
    public boolean siparisEkle(Urun urun, int miktar){
    	siparisler.add(new Siparis(urun,miktar));
    	return true;
    }
   
    
    
    public boolean gecenSureyiArtir(){
        this.gecenSure++;
        
        if(sureSiniri==0)
            return false;
        
        if(gecenSure >= sureSiniri)
            return true;
        return false;
    }
    
    public void gecenBeklemeSuresiniArtir(){
        this.beklemeSuresi ++;
    }
    
    /************************************************************************************/
   
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

    public int getBeklemeSuresi() {
        return beklemeSuresi;
    }

    public void setBeklemeSuresi(int beklemeSuresi) {
        this.beklemeSuresi = beklemeSuresi;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }
    
    


}
