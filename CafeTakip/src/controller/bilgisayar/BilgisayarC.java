package controller.bilgisayar;

import java.util.ArrayList;
import java.util.List;
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



    public BilgisayarC() {
        super();
        bilgisayarlar = new ArrayList<Bilgisayar>();
        for( int i  = 0 ; i < 5 ; i ++ )
            this.masaEkle("Masa " + (i + 1));
    }

    @Override 
    public boolean masaEkle(String masaAdi){
        bilgisayarlar.add(new Bilgisayar(masaAdi));
        //başarılı ise (bilgisayar sayısı 1 arttıysa kontrolü)
        return true;
    }

    @Override
    public boolean masaSil(String masaAdi){
        bilgisayarlar.remove(masaBul(masaAdi));
        //başarılı ise (bilgisayar sayısı 1 azaldıysa kontrolü)
        return true;
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
	
    @Override
    public boolean masaAc(String masaAdi, boolean sinirliMi, Musteri musteri){
    	Bilgisayar b = masaBul(masaAdi);
    	if(b != null){
            if(b.getAcilisSaati() != null){
                JOptionPane.showMessageDialog(null, "Masa Açık", "HATA", JOptionPane.ERROR_MESSAGE);
                return false;
            }else if(!sinirliMi && b.masaAc()){
                return true;
            }else{
                try{
                    int sureSiniri = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Süre Sınırlamasını giriniz", "Süreli Masa Aç",
                        JOptionPane.QUESTION_MESSAGE));
                    b.masaAc(sureSiniri, musteri);
                    return true;
                }catch (Exception e){}
            }
    	}
        JOptionPane.showMessageDialog(null, "Masa Açılamadı", "HATA", JOptionPane.ERROR_MESSAGE);                

    	return false;
    }
    
    @Override
    public boolean masaKapat(String masaAdi){
        Bilgisayar b = masaBul(masaAdi);
        b.masaKapat();
        return true;
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
