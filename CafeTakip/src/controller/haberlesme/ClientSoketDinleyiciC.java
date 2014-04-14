package controller.haberlesme;

import controller.bilgisayar.BilgisayarC;
import controller.kisi.CalisanC;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bilgisayar.Bilgisayar;
import org.json.JSONException;
import org.json.JSONObject;

public class ClientSoketDinleyiciC extends Thread{
    
    public static final String MASA_ID = "MasaAdi";
    
    public static final String MESAJ_TIPI = "MesajTipi";
    public static final String MT_MASA_AC = "MasaAc";
    public static final String MT_SIPARIS = "Siparis";
    public static final String MT_SOHBET = "Sohbet";
    public static final String MT_GIRIS_YAP = "GirisYap";
    public static final String MT_MASA_KAPAT = "MasaKapat";
    public static final String MT_SURE_UZAT = "SureUzat";
    public static final String MT_YETKILI_MASA_AC = "YekiliMasaAc";
    public static final String MT_GUC_ACIK = "GucAcik";
    public static final String MT_GUC_KAPALI = "GucKapali";
    
    public static final String ISLEM = "Islem";
    public static final String BILGISAYARI_KAPAT = "Kapat";
    public static final String BILGISAYARI_YENIDEN_BASLAT = "YenidenBaslat";
    public static final String BILGISAYARI_KILITLI = "Kilitli";
    
    
    public static final String CEVAP = "Cevap";
    public static final String ONAY = "Onay";
    public static final String RED = "Red";

    public static final String SOHBET_KIME = "Kime";
    public static final String SOHBET_KIMDEN = "Kimden";
    public static final String SOHBET_MESAJ = "Mesaj";
    
    public static final String SIPARIS_URUN_ADI = "UrunAdi";
    public static final String SIPARIS_MIKTAR = "Miktar";
    
    public static final String GIRIS_KULLANICI_ADI = "KullaniciAdi";
    public static final String GIRIS_SIFRE = "Sifre";
    
    public static final String MASA_AC_SURE = "Sure";
    public static final String MASA_SAATLIK_UCRET = "MasaSaatlikUcret";
    
    public static final int PORT = 1515;

    
    public Socket soket;
    /*
    public void kullaniciGeldi(Socket s){
        this.soket = s;
        this.start();
    }
    */
    @Override
    public void run(){
        
        try {
            System.out.println("Bağlantı Sağlandı");
            mesajBekle();            
        } catch (Exception ex) {
            Logger.getLogger(ClientSoketDinleyiciC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(ClientSoketDinleyiciC.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void mesajBekle() throws Exception, Throwable{
        
        while(true){
            byte[] array = new byte[1024];
            int boyut = soket.getInputStream().read(array);
            
            if(boyut != -1)
                mesajGeldi(new String(array, 0, boyut));
        }
    }
    
    public void mesajGonder(String mesaj) throws IOException {
        soket.getOutputStream().write(mesaj.getBytes());
    }
            
    void mesajGeldi(String mesaj) throws  Exception, Throwable{
        
        System.out.println(mesaj);
        
        JSONObject json =  new JSONObject(mesaj);
        String tip = json.get(MESAJ_TIPI).toString();
                
        switch (tip) {
            case MT_GUC_ACIK:
                gucAc(json);
                break;
                
            case MT_GUC_KAPALI:
                gucKapat(json);
                break;
            
            case MT_GIRIS_YAP:
                girisYap(json);
                break;
                
            case MT_MASA_AC:
                masaAcMaSorgusu(json);
                break;
                
            case MT_SIPARIS:
                siparisEkle(json);
                break;
                
            case MT_SOHBET:
                sohbetMesajGonder(json);
                break;
        }
    }
    
    public void girisYap(JSONObject json) throws Exception{
        
    }
    
    public void masaAcMaSorgusu(JSONObject json) throws Exception, Throwable{
        
        int sure = Integer.parseInt(json.get(MASA_AC_SURE).toString());
        String masaAdi = json.get(MASA_ID).toString();
        String musteriAdi = json.get(GIRIS_KULLANICI_ADI).toString();
        String sifre = json.getString(GIRIS_SIFRE).toString();
        
        
        String mesaj =  masaAdi + "'den Masa Açma İsteği Geldi";
        if(sure != -1)
            mesaj = masaAdi + "'den "+sure+"dk Masa Açma İsteği Geldi";
        if(!musteriAdi.equals(""))
            mesaj = musteriAdi+ " " + musteriAdi;
        
        int sonuc = JOptionPane.showConfirmDialog(null,mesaj, 
                "Masa Açılsın mı", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(sonuc == JOptionPane.YES_OPTION){
            mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaAc(masaAdi, sure, null);
        }else{
            masaAcKomutuGonder(masaAdi,sure,musteriAdi,RED);
        }
    }
    
    public void masaAcKomutuGonder(String masaAdi,int sure, String musteriAdi,String Onay) throws Throwable{
        //{"MasaAdi":"MustafaS","MesajTipi":"MasaAc","Sifre":"","Sure":30,"KullaniciAdi":""}
        JSONObject json = new JSONObject();
        json.put(MASA_ID, masaAdi);
        json.put(MESAJ_TIPI, MT_MASA_AC);
        json.put(GIRIS_SIFRE, "");
        json.put(GIRIS_KULLANICI_ADI, musteriAdi);
        json.put(MASA_AC_SURE,sure);
        json.put(CEVAP, Onay);
        json.put(MASA_SAATLIK_UCRET,"2");
        
        mesajGonder(json.toString());
    }
    
    public void masaKapatKomutuGonder(String masaAdi) throws Throwable{
         JSONObject json = new JSONObject();
         json.put(MASA_ID, masaAdi);
         json.put(MESAJ_TIPI, MT_MASA_KAPAT);
         json.put(ISLEM, BILGISAYARI_KILITLI);    
         
         mesajGonder(json.toString());
    }
    
    
    
    public void gucAc(JSONObject json) throws Exception{
        
        String masaAdi = json.get(MASA_ID).toString();
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaEkle(masaAdi, Bilgisayar.Durum.KILITLI,this);
    }
    
     public void gucKapat(JSONObject json) throws Exception{
         
        String masaAdi = json.get(MASA_ID).toString();
        mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().masaGucKapat(masaAdi);
        this.stop();
    }
    
    
    public void siparisEkle(JSONObject json){
    
    }
    
    public void sohbetMesajGonder(JSONObject json){
    
    }
    
}
