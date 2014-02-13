
package controller.urun;

import ServerModel.Urun;
import controller.SessionFactory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author MustafaS
 */
public class UrunController implements UrunInterface{

    @Override
    public void urunEkle(Urun urun) {
        Session sesion = SessionFactory
                .getSessionFactory().openSession();
        
        Transaction tr = sesion.beginTransaction();
        
        sesion.save(urun);
        tr.commit();
    }

    @Override
    public List<Urun> urunListesi() {
        return null;
    }

    @Override
    public boolean urunSil(int urunNo) {
        return true;
    }

    @Override
    public void urunGuncelle(int urunNo, Urun yeniUrun) {
        
    }

    @Override
    public void urunSat(int urunId, int miktar) {
        
    }

    @Override
    public void urunAl(int urunId, int miktar) {
        
    }
    
}
