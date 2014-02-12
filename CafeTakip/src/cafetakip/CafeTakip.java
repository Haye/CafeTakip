package cafetakip;

import controller.MainContorller;
import view.GirisPaneli;



public class CafeTakip {
    
    public static MainContorller mainCont;
    public static void main(String[] args) {
        mainCont = new MainContorller();

        GirisPaneli g = new GirisPaneli();
        g.show();
    }
    
}
