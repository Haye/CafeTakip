package controller.bilgisayar;

import controller.kisi.CalisanC;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.bilgisayar.Bilgisayar;
import model.kisi.Musteri;
import model.urun.Siparis;
import model.urun.Urun;
import view.AdisyonEklePencereV;
import view.MasaKapatV;

public class BilgisayarC implements BilgisayarI{

    private ArrayList <Bilgisayar> bilgisayarlar;
    
    private TimerTask task;
    
    public void run(){
        
        task = new TimerTask() {
            Date simdi;
            @Override
            public void run() {
                simdi = new Date();
                CalisanC.ana.saatTarihV1.saat(simdi.getHours(), simdi.getMinutes(), simdi.getSeconds());
                
                if(simdi.getSeconds() == 0)
                    masaSureKontrol();
            }
        };
       
        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);
    }

    private void masaSureKontrol(){
        System.out.println("111111");
        for(Bilgisayar b : bilgisayarlar){
            if(b.getDurum() == Bilgisayar.Durum.SURELI_ACIK || b.getDurum() == Bilgisayar.Durum.SINIRSIZ_ACIK){
                if(b.gecenSureyiArtir()){  
                    suresiBitmisDurumaAl(b);
                }
            }else if(b.getDurum() == Bilgisayar.Durum.BEKLEMEDE || b.getDurum() == Bilgisayar.Durum.SURESI_BITMIS_BEKLEMEDE){
                b.gecenBeklemeSuresiniArtir();
            }
        }
        
        if(CalisanC.ana.masalarV1.seciliLabel!=null){
            //dakika geçince seçili masa bilgilerin güncellenmesi için
            CalisanC.ana.masalarV1.seciliMasaDegis(CalisanC.ana.masalarV1.seciliLabel);
        }
    }

    public BilgisayarC() {
        super();
        bilgisayarlar = new ArrayList<Bilgisayar>();
        masaEkle("MustafaS", Bilgisayar.Durum.KAPALI);
        masaEkle("Masa 2", Bilgisayar.Durum.KILITLI);
        masaEkle("Masa 3",Bilgisayar.Durum.KAPALI);
    }

    public boolean masaEkle(String masaAdi, Bilgisayar.Durum durum){
        Bilgisayar b = new Bilgisayar(masaAdi);
        b.setDurum(durum);
        bilgisayarlar.add(b);
        
        //başarılı ise (bilgisayar sayısı 1 arttıysa kontrolü)
        return true;
    }

    @Override
    public boolean masaSil(String masaAdi){
        bilgisayarlar.remove(masaBul(masaAdi));
        //başarılı ise (bilgisayar sayısı 1 azaldıysa kontrolü)
        return true;
    }

    public void durumDegis(String masaAdi, Bilgisayar.Durum durum){
        Bilgisayar b = masaBul(masaAdi);
        b.setDurum(durum);
        CalisanC.ana.masalarV1.durumDegis(masaAdi, durum);
    }
   
    
    public String masaAktar(String kaynakAdi){
        Bilgisayar kaynakPc = masaBul(kaynakAdi);
        
        if(kaynakPc.getAcilisSaati()!=null){
            Object[] possibleValues = mutlakkafe.MutlakKafe.mainCont.getBilgisayarC().kapaliMasaIsimleriGetir();

            Object AktarilacakMasa = JOptionPane.showInputDialog(null,"Aktarılacak Masayı Seçiniz",
                    "Masa Seç",JOptionPane.QUESTION_MESSAGE,null,possibleValues, possibleValues[0]);

            if(AktarilacakMasa!=null){

                Bilgisayar hedefPc = masaBul(AktarilacakMasa.toString());    

                if(hedefPc.getAcilisSaati()==null){
                    kaynakPc.masaAktar(hedefPc);
                    kaynakPc.masaKapat();
                    return AktarilacakMasa.toString();
                }else{
                    JOptionPane.showMessageDialog(null, "Hedef Masa Dolu", "HATA", JOptionPane.ERROR_MESSAGE);  
                    return "";
                }
            }
        }else{
             JOptionPane.showMessageDialog(null, "Masa Zaten Kapalı", "HATA", JOptionPane.ERROR_MESSAGE);  
        }
        return "";
    }
    
    public DefaultTableModel siparisListesi(String masaAdi){
        
    	Bilgisayar b = masaBul(masaAdi);
        DefaultTableModel dtm = new DefaultTableModel();

        if(b!=null){

            dtm.addColumn("Ürün Adı");
            dtm.addColumn("Miktarı");
            dtm.addColumn("Tutarı");

            List<Siparis> siparisList = b.getSiparisler();

            for(Siparis s : siparisList){
                dtm.addRow(new String[]{s.getUrun().getUrunAdi()+ "",
                                        s.getMiktar()+"", 
                                        (s.getMiktar()*s.getUrun().getBirimFiyat())+""
                                        });
            }
        }
    	return dtm;
    }
	
    
    public void masaAc(String masaAdi, int sureSiniri, Musteri musteri){
        Bilgisayar b = masaBul(masaAdi);
        if(b!=null){
            if(sureSiniri==-1){
                b.masaAc();
                durumDegis(masaAdi,Bilgisayar.Durum.SINIRSIZ_ACIK);
            }else{
                b.masaAc(sureSiniri, musteri);
                durumDegis(masaAdi,Bilgisayar.Durum.SURELI_ACIK);
            }
        }
        
    }
    
    
    @Override
    public boolean masaAc(String masaAdi, boolean sinirliMi, Musteri musteri){
    	Bilgisayar b = masaBul(masaAdi);
    	if(b != null){
            if(b.getAcilisSaati() != null){
                JOptionPane.showMessageDialog(null, "Masa Açık", "HATA", JOptionPane.ERROR_MESSAGE);
            }else if(!sinirliMi){
                masaAc(masaAdi, -1, musteri);
            }else{
                try{
                    int sureSiniri = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Süre Sınırlamasını giriniz", "Süreli Masa Aç",
                        JOptionPane.QUESTION_MESSAGE));
                    masaAc(masaAdi, sureSiniri, musteri);
                }catch (Exception e){}
            }
    	}
        
        return true;
    }
    
    
    @Override
    public boolean masaKapat(String masaAdi){
        
        Bilgisayar b = masaBul(masaAdi);
        int sonuc = JOptionPane.showConfirmDialog(null, "Masa Kapatılacak ?", 
                "Masa Kapat", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(sonuc == JOptionPane.YES_OPTION){
            durumDegis(b.getMasaAdi(), Bilgisayar.Durum.KILITLI);
            CalisanC.ana.masaBilgisiV1.init(b);
            
            b.masaKapat();
            return true;
        }
        
        return false;
    }
    
    private void suresiBitmisDurumaAl(Bilgisayar b){
            b.setDurum(Bilgisayar.Durum.SURESI_BITMIS_BEKLEMEDE);
            durumDegis(b.getMasaAdi(), Bilgisayar.Durum.SURESI_BITMIS_BEKLEMEDE);
    }
    
    
    
    
    @Override
    public void masaKapatmaEkraniGoster(String masaAdi){
        Bilgisayar b = masaBul(masaAdi);
    	if(b != null){
            if(b.getAcilisSaati()!=null){
                MasaKapatV masaKapamaEkrani = new MasaKapatV(b);
                masaKapamaEkrani.show();
            }else{
               JOptionPane.showMessageDialog(null, "Masa Zaten Kapalı", "HATA", JOptionPane.ERROR_MESSAGE);                 
            }
        }
    }
    
    
    public void sureUzat(String masaAdi, int sure){
        Bilgisayar b = masaBul(masaAdi);

    	if(b != null){
            if(sure==0){
                try{
                    sure = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Süre Sınırlamasını giriniz", "Süreli Masa Aç",
                            JOptionPane.QUESTION_MESSAGE));
                    if(sure < 0 ){
                        JOptionPane.showMessageDialog(null,"Süre negatif olamaz", "HATA", JOptionPane.ERROR_MESSAGE); 
                        return;
                    }
                }catch(Exception e) {
                    return;
                }
            }
            
            int sonuc = JOptionPane.NO_OPTION;
            if(b.getDurum() == Bilgisayar.Durum.SURESI_BITMIS_BEKLEMEDE){
                sonuc = JOptionPane.showConfirmDialog(null, b.getBeklemeSuresi()+" dk Bekleme Süresi Eklensin mi ?", 
                    "Bekleme Süresi Ekle?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            }
            
            try{
                
                if(b.sureUzat(sure,sonuc == JOptionPane.YES_OPTION)){
                    if(sonuc == JOptionPane.YES_OPTION){
                        JOptionPane.showMessageDialog(null, sure + "dk eklendi", "HATA", JOptionPane.ERROR_MESSAGE); 
                        durumDegis(masaAdi, Bilgisayar.Durum.SURELI_ACIK);
                    }else
                        JOptionPane.showMessageDialog(null, sure + " dk eklendi", "Süre Ekleme Başarılı", JOptionPane.ERROR_MESSAGE); 

                    CalisanC.ana.masalarV1.seciliMasaDegis(CalisanC.ana.masalarV1.seciliLabel);
                }
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Hatalı Süre değeri", "HATA", JOptionPane.ERROR_MESSAGE);   
            }
        }
    }
    
    
    public String[] masaIsimleriGetir(){
        String [] s = new String[bilgisayarlar.size()];
        for(int i=0;i<bilgisayarlar.size();i++){
            s[i] = bilgisayarlar.get(i).getMasaAdi();
        }
        return s;
    }
    
    public String[] kapaliMasaIsimleriGetir(){
        ArrayList<String> s = new ArrayList<>();
        for(int i=0;i<bilgisayarlar.size();i++){
            if(bilgisayarlar.get(i).getAcilisSaati()==null){
                s.add(bilgisayarlar.get(i).getMasaAdi());
            }
        }
        
        String [] ss = new String[s.size()];
        for(int i=0;i<s.size();i++){
            ss[i] = s.get(i);
        }
        return ss;
    }
  
    @Override
    public Bilgisayar masaBul(String masaAdi){
    	for (Bilgisayar b : bilgisayarlar) {
            if(b.getMasaAdi().equals(masaAdi))
                return b;
        }
    	return null;
    }

    public ArrayList<Bilgisayar> getBilgisayarlar() {
        return bilgisayarlar;
    }

    public void setBilgisayarlar(ArrayList<Bilgisayar> bilgisayarlar) {
        this.bilgisayarlar = bilgisayarlar;
    }

    public void adisyonEkleEkraniGoster(String masaAdi) {
        if(masaBul(masaAdi).getAcilisSaati()!=null){
            AdisyonEklePencereV v = new AdisyonEklePencereV(masaAdi);
            v.show();
        }else{
            JOptionPane.showMessageDialog(null, "Kapalı Masaya Adisyon Eklenmez", "HATA", JOptionPane.ERROR_MESSAGE);  
        }
    }
    
    public boolean adisyonEkle(String masaAdi,String urunAdi,int miktar){
        Siparis siparis = new Siparis(new Urun().urunBul(urunAdi), miktar);
       
        Bilgisayar b = masaBul(masaAdi);
        if(b!=null){
            if(mutlakkafe.MutlakKafe.mainCont.getUrunCont().urunSat(siparis.getUrun().getUrunID(), miktar)){
                if(b.adisyonEkle(siparis)){
                 return true;    
                }
            }
        }else{
            //masa olmadan adisyon kes (yoldan geçene)
        }

        return false;
    }
    
    
     public boolean adisyonSil(String masaAdi,String urunAdi,int miktar){       
        Bilgisayar b = masaBul(masaAdi);
        
        if(b!=null){
            if(mutlakkafe.MutlakKafe.mainCont.getUrunCont().urunAl(new Urun().urunBul(urunAdi).getUrunID(), miktar))
                b.adisyonSil(new Siparis(new Urun().urunBul(urunAdi), miktar));
        }
        return false;
    }
        
    
}
