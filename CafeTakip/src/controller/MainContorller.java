
package controller;

import ServerModel.Bilgisayar;
import java.util.ArrayList;

/**
 *
 * @author Mustafa-Bilgisay
 */
public class MainContorller {
    private ArrayList <Bilgisayar> bilgisayarlar;
    
    private KisiController kisiCont;

    public MainContorller(){
        bilgisayarlar = new ArrayList<Bilgisayar>();
        
        kisiCont = new KisiController();
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
