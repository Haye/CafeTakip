
package controller.urun;

import model.urun.Urun;
import java.util.List;

/**
 *
 * @author MustafaS
 */
public interface UrunI{
    
    
    /**
     * Urun bilgilerini veritabanına ekler
     * @param urun: Urun bilgisinin bulunduğu URUN tipinde nesne.
     */
    public void urunEkle(Urun urun);
    
    
    /**
     * Urün bilgilerinin bulunduğu bir liste oluıturur.
     * @return ürün listesi
     */
    public List<Urun> urunListesi();
    
    
    /**
     * Gelen ürünNosuna karıılık gelen satırı siler.
     * @param urunAdi Urun icin ayırt edici olan alan.
     * @return Kayıt var ise true değilse false döner.
     */
    public boolean urunSil(int urunID);
    
    
    /**
     * UrunNo ya karıık gelen bilgileri yeni bilgiler ile değiıtirir.
     * @param urunAdi Urun için ayır edici olan alan.
     * @param yeniUrun Güncelennecek olan bilgiler.
     */
    public boolean urunGuncelle(int urunID , Urun yeniUrun);
    
    
    /**
     * Satılan ürünün veritabanındaki bilgileri günceller.
     * @param urunAdi ürün için ayırt edici olan alan
     * @param miktar Satılan ürün miktarı.
     */
    public void urunSat(int urunID, int miktar);
    
    
    /**
     * Alınan ürünün veritabanındaki bilgileri günceller.
     * @param miktar Alınan ürün miktarı.
     */
    public void urunAl(int urunID, int miktar);
    
}
