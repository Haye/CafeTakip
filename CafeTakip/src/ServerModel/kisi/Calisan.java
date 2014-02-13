
package ServerModel.kisi;

import controller.SessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author MustafaS
 */
public class Calisan extends Kisi{
    private String adres;
    private float maas;
    private int tip;
    
    
     @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
         Session sesion = SessionFactory.
                 getSessionFactory().openSession();
         
         Query query = sesion.createQuery("from Kisi "
                        + "where kullaniciAdi = '" + kullaniciAdi 
                        + "' and sifre = '" + sifre + "'");
         
         List calisan = query.list();         
         //
        if(calisan.size() > 0)
            return true; 
        
        return false;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public float getMaas() {
        return maas;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
     
     
     
}
