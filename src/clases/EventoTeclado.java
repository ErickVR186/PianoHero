/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import gnu.io.CommPortIdentifier;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class EventoTeclado extends KeyAdapter{
    CommPortIdentifier portID;
    Enumeration cuantosPuertos;
    InputStream input = null;
    OutputStream output = null;
    HashMap portMap = new HashMap();
    SerialPort serialPort = null;
    boolean conectado = false;
    
    //public static String teclasPiano="", dato="";
    
    
    public static boolean A,S,D,F,G,H,J,K, conexionArduino, UP, DOWN;
    public static String teclaPiano, puerto;
    private static PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
    private static final SerialPortEventListener listener = new SerialPortEventListener(){
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if(ino.isMessageAvailable()){
                    teclaPiano = ino.printMessage();
                    if(teclaPiano.equals("Do_ON")){
                        A = true;
                    }else{
                        A = false;
                    }
                    if(teclaPiano.equals("Re_ON")){
                        S = true;
                    }else{
                        S = false;
                    }
                    if(teclaPiano.equals("Mi_ON")){
                        D = true;
                    }else{
                        D = false;
                    }
                    if(teclaPiano.equals("Fa_ON")){
                        F = true;
                    }else{
                        F = false;
                    }
                    if(teclaPiano.equals("Sol_ON")){
                        G = true;
                    }else{
                        G = false;
                    }
                    if(teclaPiano.equals("La_ON")){
                        H = true;
                    }else{
                        H = false;
                    }
                    if(teclaPiano.equals("Si_ON")){
                        J = true;
                    }else{
                        J = false;
                    }
                    if(teclaPiano.equals("Do2_ON")){
                        K = true;
                    }else{
                        K = false;
                    }
                }
            } catch (SerialPortException | ArduinoException ex) {
                Logger.getLogger(EventoTeclado.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    };
    
    public EventoTeclado(){
        
    }
    /*public String obtenerLista(){
        cuantosPuertos = CommPortIdentifier.getPortIdentifiers();
        String todo="";
        while(cuantosPuertos.hasMoreElements()){
            CommPortIdentifier solito = (CommPortIdentifier)cuantosPuertos.nextElement();
            if(solito.getPortType()==CommPortIdentifier.PORT_SERIAL){
                portMap.put(solito.getName(), solito);
                todo+=solito.getName()+",";
                System.out.println("Puerto encontrado: "+solito.getName());
                
            }
        }
        return todo;
    }*/
    
    
    public void conectar(String puerto){
        this.puerto = puerto;
        try {
            ino.arduinoRX(puerto, 9600, listener);
            conexionArduino = true;
            System.out.println("Conectado");
            
        } catch (ArduinoException | SerialPortException ex) {
            Logger.getLogger(EventoTeclado.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Arduino : "+ ex);
            conexionArduino = false;
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        int id = e.getKeyCode();
        
        if(id == KeyEvent.VK_A){
            A = true;
        }
        if(id == KeyEvent.VK_S){
            S = true;
        }
        if(id == KeyEvent.VK_D){
            D = true;
        }
        if(id == KeyEvent.VK_F){
            F = true;
        }
        if(id == KeyEvent.VK_G){
            G = true;
        }
        if(id == KeyEvent.VK_H){
            H = true;
        }
        if(id == KeyEvent.VK_J){
            J = true;
        }
        if(id == KeyEvent.VK_K){
            K = true;
        }
        
        if(id == KeyEvent.VK_UP){
            UP = true;
        }
        if(id == KeyEvent.VK_DOWN){
            DOWN = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int id = e.getKeyCode();
        if(id == KeyEvent.VK_A){
            A = false;
        }
        if(id == KeyEvent.VK_S){
            S = false;
        }
        if(id == KeyEvent.VK_D){
            D = false;
        }
        if(id == KeyEvent.VK_F){
            F = false;
        }
        if(id == KeyEvent.VK_G){
            G = false;
        }
        if(id == KeyEvent.VK_H){
            H = false;
        }
        if(id == KeyEvent.VK_J){
            J = false;
        }
        if(id == KeyEvent.VK_K){
            K = false;
        }
        
        if(id == KeyEvent.VK_UP){
            UP = false;
        }
        if(id == KeyEvent.VK_DOWN){
            DOWN = false;
        }
    }
}
