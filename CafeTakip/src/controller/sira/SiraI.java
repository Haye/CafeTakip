package controller.sira;

import java.util.List;

import model.sira.Sira;

public interface SiraI {

	/**
     * Gelen sira nesnesini veritabanına kayıt eder.
     * @param sira : Sira bilgilerinin tutulduğu nesne
     * 
     */
	public boolean ekle(Sira sira);
	
	
	/**
     * Gelen sira nesnesi bilgilerini var olan bilgiler ile değiştirir
     * @param sira : Sira bilgilerinin tutulduğu nesne
     * @param siraID : Sira için ayır edici değişken
     * @return :Sıra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean bilgiGuncelle(Sira sira, int siraID);
	
	
	/**
     * Gelen siraID ye karşılık gelen sira bilgilerini siler
     * @param siraID : Sira için ayır edici değişken
     * @return :Sıra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean sil(int siraID);
	
	
	/**
     * Bütün sira bilgilerini getirir
     * @return :Sira bilgileri util.List tipinde geriye döner
     * 
     */
	public List<Sira> liste();
	
	
	/**
     * Gelen sira ID ye karşılık gelen alanı belirtilen miktar kadar uzatır
     * @param siraID : Sira için ayır edici değişken
     * @param saat : Uzatılacak saat miktarı
     * @param dakika : Uzatılacak dakika miktarı
     * @return :Sıra nesnesi bulunmaz ise : false bulunursa true
     * 
     */
	public boolean sureUzat(int siraID, int saat, int dakika);
	
	
	
	
}
