package controller;

import controller.bilgisayar.BilgisayarC;
import controller.kisi.CalisanC;
import controller.kisi.MusteriC;
import controller.sira.SiraC;
import controller.urun.UrunC;

public class MainC {
    
    private CalisanC calisanCont;
    private MusteriC musteriCont;
    private UrunC urunCont;
    private SiraC siraCont;
    private BilgisayarC bilgisayarC;


    public MainC(){        
        calisanCont = new CalisanC();
        urunCont = new UrunC();
        siraCont = new SiraC();
        bilgisayarC = new BilgisayarC();
        musteriCont = new MusteriC();
    }
    
    
    
    
    
    /****************************************************/

    public CalisanC getCalisanCont() {
        return calisanCont;
    }

    public UrunC getUrunCont() {
        return urunCont;
    }

    public SiraC getSiraCont() {
            return siraCont;
    }

    public void setUrunCont(UrunC urunCont) {
		this.urunCont = urunCont;
    }

    public BilgisayarC getBilgisayarC() {
            return bilgisayarC;
    }

    public void setBilgisayarC(BilgisayarC bilgisayarC) {
            this.bilgisayarC = bilgisayarC;
    }  

    public MusteriC getMusteriCont() {
        return musteriCont;
    }

    

}
