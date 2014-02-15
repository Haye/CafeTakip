package ServerModel;

import controller.HbmIslemler;
import controller.urun.UrunInterface;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

/**
 *
 * @author MustafaS
 */
public class Urun implements UrunInterface{
    
    private int barkod,stok;
    private float birimFiyat;
    private String urunAdi;
    
    
    
    @Override
    public void urunEkle(Urun urun) {
        
        HbmIslemler hbm = new HbmIslemler();        
        hbm.ekle(urun);
    }

    @Override
    public List<Urun> urunListesi() {
        
        HbmIslemler hbm = new HbmIslemler();
        ArrayList<Urun> list =  (ArrayList<Urun>) hbm.list("from Urun");
        
        return list;
    }

    @Override
    public boolean urunSil(int urunNo) {
        
        HbmIslemler hbm = new HbmIslemler();
        
        try {
            return hbm.sil(urunNo, Urun.class);
        } catch (HibernateException ex) {         
            ex.printStackTrace();
            throw ex;
        }         
    }

    @Override
    public boolean urunGuncelle(int urunNo, Urun yeniUrun) {
        
        HbmIslemler hbm = new HbmIslemler();
        
        try{
            return hbm.guncelle(urunNo, yeniUrun);
        }catch(HibernateException ex){
            ex.printStackTrace();
            throw ex;
        }
    }

    @Override
    public void urunSat(int urunId, int miktar) {
        
        HbmIslemler hbm = new HbmIslemler();
        Urun urun = (Urun) hbm.bilgiGetir(urunId, Urun.class);
        
        int yeniStok = urun.getStok() - miktar;
        
        urun.setStok(yeniStok);
        hbm.guncelle(urunId, urun);
               
    }

    @Override
    public void urunAl(int urunId, int miktar) {
        
        HbmIslemler hbm = new HbmIslemler();        
        Urun urun = (Urun) hbm.bilgiGetir(urunId, Urun.class);
        
        int yeniMiktar = urun.getStok() + miktar;        
        urun.setStok(yeniMiktar);
        hbm.guncelle(urunId, urun);        
    }
    
    
    
    //GETTER AND SETTER
    public int getBarkod() {
        return barkod;
    }

    public void setBarkod(int barkod) {
        this.barkod = barkod;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public float getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(float birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    
    
    
    
}
