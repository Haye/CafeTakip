package controller.bilgisayar;

import model.bilgisayar.Bilgisayar;

public interface BilgisayarI {
	
	/**
     * Gelen masa adına ait masa oluşturur.
     * @param masaAdi: Yeni oluşturulacak masa adı
     * @return Masa başarılı bir şekilde oluşturulursa true
     */
    boolean masaEkle(String masaAdi);
    
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
    public boolean masaAc(String masaAdi);
    
    
    /**
     * Gelen masa adına ait bilgisayarı bulur dönderir (!!private metod olması)
     * @param masaAdi: Kayıtlı masa adı
     * @return Masa adı bulunamazsa null, bulunursa ilgili bilgisayarı dönderir
     */
    Bilgisayar masaBul(String masaAdi);
}
