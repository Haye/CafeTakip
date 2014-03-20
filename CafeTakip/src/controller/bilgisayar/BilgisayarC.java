package controller.bilgisayar;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.bilgisayar.Bilgisayar;

public class BilgisayarC implements BilgisayarI{
	
	private ArrayList <Bilgisayar> bilgisayarlar;
	
	
	
	public BilgisayarC() {
		super();
		bilgisayarlar = new ArrayList<Bilgisayar>();
                for( int i  = 0 ; i < 5 ; i ++ )
                    this.masaEkle("Masa " + (i + 1));
                
	}

	@Override 
	public boolean masaEkle(String masaAdi){
		bilgisayarlar.add(new Bilgisayar(masaAdi));
		//başarılı ise (bilgisayar sayısı 1 arttıysa kontrolü)
		return true;
	}

	@Override
	public boolean masaSil(String masaAdi){
		bilgisayarlar.remove(masaBul(masaAdi));
		//başarılı ise (bilgisayar sayısı 1 azaldıysa kontrolü)
		return true;
	}
	
	
    @Override
    public boolean masaAc(String masaAdi){
    	Bilgisayar b = masaBul(masaAdi);
    	if(b != null){
            if(b.getAcilisSaati() != null){
                JOptionPane.showMessageDialog(null, "Masa Açık", "HATA", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if(b.masaAc()){
                return true;
            }
    	}
        JOptionPane.showMessageDialog(null, "Masa Açılamadı", "HATA", JOptionPane.ERROR_MESSAGE);                

    	return false;
    }
    
    
	@Override
    public Bilgisayar masaBul(String masaAdi){
    	for (Bilgisayar b : bilgisayarlar) {
            if(b.getMasaAdi().equals(masaAdi))
                return b;
        }
    	return null;
    }

    public ArrayList<Bilgisayar> getBilgisayarlar() {
        return bilgisayarlar;
    }

    public void setBilgisayarlar(ArrayList<Bilgisayar> bilgisayarlar) {
        this.bilgisayarlar = bilgisayarlar;
    }
        
    
}
