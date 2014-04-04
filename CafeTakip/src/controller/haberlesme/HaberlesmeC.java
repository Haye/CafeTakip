package controller.haberlesme;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bilgisayar.Bilgisayar;

/**
 *
 * @author yetishbey
 */
public class HaberlesmeC extends Thread{
    
    ServerSocket srvSoket ;
    int port = 1515;
    
    
    public HaberlesmeC() throws IOException {
        srvSoket = new ServerSocket(port);
    }
    
    
    @Override
    public void run(){
        
        while(true){
            try {
                System.out.println("Soket oluştu");
                Socket soket = srvSoket.accept();
                
                kullaniciGeldi(soket);
                
                
            } catch (IOException ex) {
                Logger.getLogger(HaberlesmeC.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        
    }
    
    
    public void kullaniciGeldi(Socket s ){
        ClientSoketDinleyiciC haber = new ClientSoketDinleyiciC();
        haber.soket = s;
        haber.start();
    }
    
}
