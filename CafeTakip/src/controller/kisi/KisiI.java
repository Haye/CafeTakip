
package controller.kisi;

import model.kisi.Kisi;

/**
 *
 * @author MustafaS
 */
public interface KisiI {
    
    public static final int ADMIN = 1;
    public static final int KASIYER = 2;
    public static final int MUSTERI = 3;
    
    /**
     * Kullanı adı ve şifre alarak kişinin kayıtlı olup olmadığını kontrol eder.
     * @param kullaniciAdi: Kullanı Adı
     * @param sifre : Şifre
     * @return Kullanı adı ve şifre doğru ise true, değilse false
     */
    public boolean girisYap(String kullaniciAdi, String sifre) throws Throwable;
    
    
    /**
     * Kullanıya ait bilgileri getirir.
     * @param kullaniciAdi : Kullanı adı
     * @return : Kullanı adına karşılık gelen bilgileri 
     *          Kişi nesnesi şeklinde getirir.
     */
    public Kisi bilgileriGetir(String kullaniciAdi);
    
    
    /**
     * Kişi bilgisini siler.
     * @param kullaniciAdi : Kullanı Adı
     * @return : Kullanı adına karşılık gelen alanı siler.
     *          Ve geriye true dönderir
    */
    public boolean hesapSil(String kullaniciAdi);
    
    
    /**
     * Kişi bilgilerini günceller. 
     * @param Kisi : Yeni kişi bilgisi
     * @param  KullaniciAdi : Kullanı adı.
     *                      Eğer güncellenmiş ise eski kullanı adı
     * @return : Kullanı adına karşılık gelen alanı günceller. 
    */
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi);
    
    
    /**
     * Kişi bilgilerini ekler. 
     * @param Kisi : Yeni kişi bilgisi
    */
    public void kisiEkle(Kisi k);
}
