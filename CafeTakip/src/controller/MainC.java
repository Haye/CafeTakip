package controller;

import controller.bilgisayar.BilgisayarC;
import controller.haberlesme.HaberlesmeC;
import controller.kisi.CalisanC;
import controller.kisi.MusteriC;
import controller.sira.SiraC;
import controller.urun.UrunC;
import java.io.IOException;

public class MainC {
    
    private CalisanC calisanCont;
    private MusteriC musteriCont;
    private UrunC urunCont;
    private SiraC siraCont;
    private BilgisayarC bilgisayarC;
    private HaberlesmeC SoketKontrol;


    public MainC() throws Throwable{        
        calisanCont = new CalisanC();
    }
    
    public void girisBasarili() throws Throwable{
        urunCont = new UrunC();
        siraCont = new SiraC();
        bilgisayarC = new BilgisayarC();
        musteriCont = new MusteriC();

        SoketKontrol  = new HaberlesmeC();
        SoketKontrol.start();
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
