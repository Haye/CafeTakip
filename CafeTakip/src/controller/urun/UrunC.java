
package controller.urun;

import model.urun.Urun;
import hibernate.HbmIslemler;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import javax.swing.DefaultListModel;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.kisi.Musteri;

import org.hibernate.HibernateException;

/**
 *
 * @author MustafaS
 */
public class UrunC implements UrunI{

    
    public Urun getUrun(HashMap<String, String> values){
        try {
            int barkod = Integer.parseInt(values.get("barkod"));
            int stok = Integer.parseInt(values.get("stok"));
            double birimFiyat = Double.parseDouble(values.get("birimFiyat"));
            String urunAdi = values.get("urunAdi");
            
            if(urunAdi.equals("") )
                JOptionPane.showMessageDialog(null, 
                        "Urun adı boş olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
            else if(birimFiyat < 0)
                JOptionPane.showMessageDialog(null, 
                        "Urun fiyatı 0'dan küçük olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);
            else if(stok < 0)
                JOptionPane.showMessageDialog(null, 
                        "Stok miktarı 0'dan küçük olamaz!", "Hata", JOptionPane.ERROR_MESSAGE);

           Urun u = new Urun(0, barkod, stok, birimFiyat, urunAdi);
            
           return u;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Geçersiz alan. \n"
                    + "(Barkod, stok veya birim fiyatı karakter içeremez)",
                    "Hata", JOptionPane.ERROR_MESSAGE);
            
            return null;
        }
    }
    
    
    @Override
    public void urunEkle(Urun urun) {

        try {
            urun.urunEkle(urun);

            JOptionPane.showMessageDialog(null,
                    urun.getUrunAdi() + " ürünü eklendi!",
                    "Ekle", JOptionPane.INFORMATION_MESSAGE);
        } catch (HibernateException ex) {

            JOptionPane.showMessageDialog(null,
                    urun.getUrunAdi() + " ürünü eklenemiyor!",
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public List<Urun> urunListesi() {
        Urun urun = new Urun();
        return urun.urunListesi();
    }
    
    public DefaultTableModel urunListesiModel(){
    	
    	DefaultTableModel dtm = new DefaultTableModel();
    	
    	dtm.addColumn("Ürün ID");
    	dtm.addColumn("Ürün Adı");
    	dtm.addColumn("Barkod");
    	dtm.addColumn("Birim Fiyatı");
    	dtm.addColumn("Stok");
    	
    	List<Urun> urunList = urunListesi();
    	
    	for(Urun u : urunList){
    		dtm.addRow(new String[]{u.getUrunID() + "",
                                        u.getUrunAdi(), 
                                        u.getBarkod()+"", 
                                        u.getBirimFiyat() + " TL", 
                                        u.getStok() + ""
                                        });
}
    	
    	return dtm;
    }
    
    public DefaultListModel urunAdiList(){
        DefaultListModel model = new DefaultListModel();
        ArrayList<Urun> list = Urun.urunler;
        for(Urun u : list){
            model.addElement(u.getUrunAdi());
        }
        return model;
        
    }
    

	@Override
    public boolean urunSil(int urunID) {
        int cevap = JOptionPane.showConfirmDialog(null, 
        						urunID + " Ürününü silmek istedğinize emin misiniz?", 
    							"Sil", JOptionPane.YES_NO_OPTION, 
    							JOptionPane.QUESTION_MESSAGE);
        
        if(cevap == JOptionPane.YES_OPTION){
	        try {
	            Urun urun = new Urun();
	            if (urun.urunSil(urunID)) {
	                JOptionPane.showMessageDialog(null,
	                		urunID + " no'lu ürün silindi!",
	                        "Sil", JOptionPane.INFORMATION_MESSAGE);
	                return true;
	            } else {
	                JOptionPane.showMessageDialog(null,
	                		urunID + " no'lu ürün bulunamadı!",
	                        "Hata", JOptionPane.WARNING_MESSAGE);
	            }
	        } catch (HibernateException ex) {
	            JOptionPane.showMessageDialog(null, 
	            		urunID + " no'lu ürün silinmesi sırasında hata oluştu!", 
	                    "Hata", JOptionPane.ERROR_MESSAGE);
	            
	        }
        }
        return false;
    }

    @SuppressWarnings("finally")
    @Override
    public boolean urunGuncelle(int urunID, Urun yeniUrun) {
        try {
            Urun urun = new Urun();
            if (urun.urunGuncelle(urunID, yeniUrun)) {
                JOptionPane.showMessageDialog(null,
                        urunID + " no'lu ürün Güncellendi!",
                        "Güncelleme", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        urunID + " no'lu ürün bulunamadı!",
                        "Hata", JOptionPane.WARNING_MESSAGE);
            }
        } catch (HibernateException ex) {
            JOptionPane.showMessageDialog(null, 
                    urunID + " no'lu ürün güncellenmesi sırasında hata oluştu!", 
                    "Hata", JOptionPane.ERROR_MESSAGE);
        }finally{
            return false;
        }
    }

    @Override
    public boolean urunSat(int urunID, int miktar) {

        if(miktar > 0){
            //HbmIslemler hbm = new HbmIslemler();
            
            //Urun urun = (Urun) hbm.bilgiGetir(urunID, Urun.class);
            Urun urun = new Urun().urunBul(urunID);
            if((urun.getStok() - miktar) >= 0){
                urun.urunSat(urunID, miktar);
                return true;
            }
            else
                JOptionPane.showMessageDialog(null, 
                    "Yeterli miktar bulunmamaktadır.!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
        }else
            JOptionPane.showMessageDialog(null, 
                    "Geçersiz Ürün Miktarı!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        
        return false;
        
    }

    @Override
    public boolean urunAl(int urunID, int miktar) {
        if(miktar > 0){
            Urun urun = new Urun();
            urun.urunAl(urunID, miktar);
            return true;
        }else
            JOptionPane.showMessageDialog(null, 
                    "Urun miktarı negatif olamaz!",
                    "Hata", JOptionPane.ERROR_MESSAGE); 
        return false;
    }

    
    
}
