
package controller;

import ServerModel.Bilgisayar;
import controller.urun.UrunController;
import java.util.ArrayList;

/**
 *
 * @author MustafaS
 */
public class MainContorller {
    private ArrayList <Bilgisayar> bilgisayarlar;
    
    private KisiController kisiCont;
    private UrunController urunCont;

    public MainContorller(){
        bilgisayarlar = new ArrayList<Bilgisayar>();
        
        kisiCont = new KisiController();
        urunCont = new UrunController();
    }
    
    
    
    public ArrayList<Bilgisayar> getBilgisayarlar() {
        return bilgisayarlar;
    }

    public void setBilgisayarlar(ArrayList<Bilgisayar> bilgisayarlar) {
        this.bilgisayarlar = bilgisayarlar;
    }

    public KisiController getKisiCont() {
        return kisiCont;
    }

    public void setKisiCont(KisiController kisiCont) {
        this.kisiCont = kisiCont;
    }
    
    
    
}
