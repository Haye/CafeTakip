
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
     * Kullanıcıya ait bilgileri getirir.
     * @param kullaniciAdi : Kullanıcı adı
     * @return : Kullanıcı adına karşılık gelen bilgileri 
     *          Kişi nesnesi şeklinde getirir.
     */
    public void bilgileriGetir(String kullaniciAdi);
    
    
    /**
     * Kişi bilgisini siler.
     * @param kullaniciAdi : Kullanıcı Adı
     * @return : Kullanıcı adına karşılık gelen alanı siler.
     *          Ve geriye true dönderir
    */
    public boolean hesapSil(String kullaniciAdi);
    
    
    /**
     * Kişi bilgilerini günceller. 
     * @param Kisi : Yeni kişi bilgisi
     * @param  KullaniciAdi : Kullanıcı adı.
     *                      Eğer güncellenmiş ise eski kullanıcı adı
     * @return : Kullanıcı adına karşılık gelen alanı günceller. 
     *              Ve geriye true dönderir
    */
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi);
    
    
}
