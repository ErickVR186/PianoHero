/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import canciones.Perfect;
import canciones.Titanic;
import canciones.Wednesday;
import java.applet.AudioClip;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo extends Thread{
    Titanic lamina;
    Perfect lamina2;
    Wednesday lamina3;
   
    
    int valor;
    
    public Hilo(Titanic lamina){
        this.lamina=lamina;
        valor = 1;
    }
    public Hilo(Perfect lamina2){
        this.lamina2=lamina2;
        valor = 2;
    }
    
    public Hilo(Wednesday lamina3){
        this.lamina3=lamina3;
        valor = 3;
    }
    
    @Override
    public void run(){
        
        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(valor==1){
                lamina.repaint(); 
            }else if(valor == 2){
                lamina2.repaint();
            }else if(valor == 3){
                lamina3.repaint();
            } 
        }
    }
}
