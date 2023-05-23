/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author Locos
 */
public class Reproductor {

    /**
     * @param args the command line arguments
     */
    private BasicPlayer player;
    
    public Reproductor(){
        player = new BasicPlayer();
    }
    public void Play() throws Exception {
        
            player.play();
        
      }

      public void AbrirFichero(URL ruta) throws Exception {
        player.open(ruta);
      }
      /*public void AbrirFichero(File ruta) throws Exception {
          InputStream in = new FileInputStream(ruta);
        player.open(in);
      }*/

      public void Pausa() throws Exception {
        player.pause();
      }

      public void Continuar() throws Exception {
        player.resume();
      }

      public void Stop() throws Exception {
        player.stop();
      }
    
}
