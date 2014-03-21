
package controller.kisi;

import java.util.ArrayList;
import java.util.HashMap;
import model.kisi.Musteri;

/**
 *
 * @author MustafaS
 */
public interface MusteriI {
    public static final String UCRET_STANDART = "standart";
    public static final String UCRET_UYE = "uye_ucreti";
    public static final String UCRET_UCRETSIZ = "ucretsiz";
    
    public static final String ODEME_ONCEDEN = "onceden";
    public static final String ODEME_SONRADAN = "sonradan";
    
    
    
    /**
     * HashMap içerisinde gelen değerleri Musteri nesnesi tipine çevirir
     * @param values : Musteri bilgilerinin bulunduğu HashMap nesnesi
     * @return Musteri nesnesini geri donderir
     */
    public Musteri getMusteri(HashMap<String, String> values);
    
    
    /**
     * Kayıtlı olan müşteri bilgilerini liste olarak çeker.
     * @return Musteri nesnesi tipinde arraylist geri dönderir
     */
    public ArrayList<Musteri> musteriListesi();
    
    /**
     * Müşteri bilgilerini veritabanında arar.
     * @param kullaniciAdi : Kullanıcı için ayır edici olan kullanıcı ismi
     * @return :Müşteri bulunursa bilgilerin bulunduğu nesne geri döner. Bulunamazsa null döner
     */
    
    public Musteri musteriAra(String kullaniciAdi);
}
