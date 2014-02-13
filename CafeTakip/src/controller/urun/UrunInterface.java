
package controller.urun;

import ServerModel.Urun;
import java.util.List;

/**
 *
 * @author MustafaS
 */
public interface UrunInterface {
    
    
    /**
     * Urun bilgilerini veritabanına ekler
     * @param urun: Urun bilgisinin bulunduğu URUN tipinde nesne.
     */
    public void urunEkle(Urun urun);
    
    
    /**
     * Urün bilgilerinin bulunduğu bir liste oluşturur.
     * @return Ürün listesi
     */
    public List<Urun> urunListesi();
    
    
    /**
     * Gelen ürünNosuna karşılık gelen satırı siler.
     * @param urunNo Urun icin ayırt edici olan alan.
     * @return Kayıt var ise true değilse false döner.
     */
    public boolean urunSil(int urunNo);
    
    
    /**
     * UrunNo ya karşık gelen bilgileri yeni bilgiler ile değiştirir.
     * @param urunNo Urun için ayır edici olan alan.
     * @param yeniUrun Güncelennecek olan bilgiler.
     */
    public void urunGuncelle(int urunNo, Urun yeniUrun);
    
    
    /**
     * Satılan ürünün veritabanındaki bilgileri günceller.
     * @param urunId Ürün için ayırt edici olan alan
     * @param miktar Satılan ürün miktarı.
     */
    public void urunSat(int urunId, int miktar);
    
    
    /**
     * Alınan ürünün veritabanındaki bilgileri günceller.
     * @param urunId Ürün için ayırt edici olan alan
     * @param miktar Alınan ürün miktarı.
     */
    public void urunAl(int urunId, int miktar);
    
}
