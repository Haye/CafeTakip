package controller.kisi;

import java.util.ArrayList;
import java.util.HashMap;
import model.kisi.Calisan;

/**
 *
 * @author Mustafa-Bilgisay
 */
public interface CalisanI {
    
    /**
     * HashMap içerisinde gelen değerleri Calisan nesnesi tipine çevirir
     * @param values : Musteri bilgilerinin bulunduğu HashMap nesnesi
     * @return Calisan nesnesini geri donderir
     */
    public Calisan getCalisan(HashMap<String, String> values);
    
    
    /**
     * Kayıtlı olan calisan bilgilerini liste olarak çeker.
     * @return Calisan nesnesi tipinde arraylist geri dönderir
     */
    public ArrayList<Calisan> calisanListesi();
    
    /**
     * Calisan bilgilerini veritabanında arar.
     * @param kullaniciAdi : Calisan için ayır edici olan kullanıcı ismi
     * @return :Calisan bulunursa bilgilerin bulunduğu nesne geri döner. Bulunamazsa null döner
     */
    public Calisan calisanAra(String kullaniciAdi);
    
}
