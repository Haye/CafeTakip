
package controller;

import ServerModel.kisi.Kisi;

/**
 *
 * @author Mustafa-Bilgisay
 */
public interface KisiInterface {
    
    /**
     * Kullanıcı adı ve şifre alarak kişinin kayıtlı olup olmadığını kontrol eder.
     * @param kullaniciAdi: Kullanıcı Adı
     * @param sifre : Şifre
     * @return Kullanıcı adı ve şifre doğru ise true, değilse false
     */
    public boolean girisYap(String kullaniciAdi, String sifre);
    
    
    /**
     *
     * @param kullaniciAdi : Kullanıcı adı
     * @return : Kullanıcı adına karşılık gelen bilgileri getirir
     */
    public Kisi bilgileriGetir(String kullaniciAdi);
    
    
    /**
     * 
     * @param kullaniciAdi : Kullanıcı Adı
     * @return : Kullanıcı adına karşılık gelen alanı siler.
     *          Ve geriye true dönderir
    */
    public boolean hesapSil(String kullaniciAdi);
    
    
    /**
     * 
     * @param Kisi : Yeni kişi bilgisi
     * @param  KullaniciAdi : Kullanıcı adı.
     *                      Eğer güncellenmiş ise eski kullanıcı adı
     * @return : Kullanıcı adına karşılık gelen alanı günceller. 
     *              Ve geriye true dönderir
    */
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi);
    
    
}
