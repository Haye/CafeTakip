
package controller;

import ServerModel.kisi.Kisi;

/**
 *
 * @author MustafaS
 */
public class KisiController implements KisiInterface{

     @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
        return true;
    }

    @Override
    public Kisi bilgileriGetir(String kullaniciAdi) {
        return null;
    }

    @Override
    public boolean hesapSil(String kullaniciAdi) {
        return true;
    }

    @Override
    public boolean hesapBilgiGuncelle(String kullaniciAdi, Kisi kisi) {
        return true;
    }
    
}
