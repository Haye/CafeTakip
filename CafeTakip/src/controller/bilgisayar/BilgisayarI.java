package controller.bilgisayar;

import model.bilgisayar.Bilgisayar;
import model.kisi.Musteri;

public interface BilgisayarI {
	

    
    /**
     * Gelen isme ait masayı bulur ve siler
     * @param masaAdi: Silinecek masa adı
     * @return Masa başarılı bir şekilde silinirse true
     */
    boolean masaSil(String masaAdi);
	
	
	/**
     * Gelen masa adına ait bilgisayarı bulur ve açar
     * @param masaAdi: Kayıtlı masa adı
     * @return Masa açılma işlemi başarılı ise true döner.
     */
    public boolean masaAc(String masaAdi, boolean sinirliMi, Musteri musteri);
    
   
    /**
     * Gelen masa adına ait bilgisayarı bulur ve kapatma ekranını gösterir
     * @param masaAdi: Kayıtlı masa adı
     */
    public void masaKapatmaEkraniGoster(String masaAdi);
    
     /**
     * Gelen masa adına ait bilgisayarı bulur ve kapatır
     * @param masaAdi: Kayıtlı masa adı
     * @return Masa kapama işlemi başarılı ise true döner.
     */
    public boolean masaKapat(String masaAdi);
    
    
    /**
     * Gelen masa adına ait bilgisayarı bulur dönderir (!!private metod olması)
     * @param masaAdi: Kayıtlı masa adı
     * @return Masa adı bulunamazsa null, bulunursa ilgili bilgisayarı dönderir
     */
    Bilgisayar masaBul(String masaAdi);
}
