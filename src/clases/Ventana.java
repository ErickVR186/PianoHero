/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import canciones.Titanic;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static principal.Principal.ventana;

public class Ventana extends JFrame{
    private int cancion;
    private final int ANCHO=1000, ALTO=700;  //variables para el ancho y altoi de la ventana
    private Titanic lamina;        //Se crear un nuevo objeto del jPanel
    
    public Inicio panelInicio;
    private Hilo hilo;
    
    
    //public ListaCanciones panelCanciones;
    public PanelFondo fondoImagen;
    //private VentanaFinal pantallaC;
    public Ventana(){
        //this.cancion = cancion;
        setTitle("Piano Hero");       //Titulo de la ventana
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/logoIcon.png")).getImage());
        setSize(ANCHO, ALTO);         //tamaño de ventana
        setLocationRelativeTo(null);  //Para central la ventana
        setResizable(false);          //Impedir el tamaño de la ventana
        setFocusable(true); 
        addKeyListener(new EventoTeclado());
        
        fondoImagen = new PanelFondo();
        fondoImagen.setLayout(null);
        fondoImagen.setVisible(true);
        this.getContentPane().add(fondoImagen);
        
        panelInicio = new Inicio();
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);
        fondoImagen.add(panelInicio);
        
        BaseDeDatos Archivo  = new BaseDeDatos();
        Archivo.crearArchivo();
        //Archivo.obtenerDatos();
        //Archivo.actualizarDatos();
        
        /*if(cancion==1){
            ImagenCancion panelFondo = new ImagenCancion();
            add(panelFondo);
            //panelFondo.setVisible(true);
            //add(panelFondo);*/
        
        
        
            /*Este estaba 
            lamina = new Titanic();        //Se agrega el Jpanel en el JFrame(Ventana)
            pantallaC = new VentanaFinal();
            pantallaC.setVisible(false);
            add(pantallaC);
            add(lamina);
            */
            
           
            //NO sirve creo ----->lamina.setVisible(true);
            
            //Si estaba tambien
            //hilo=new Hilo(lamina);
            //hilo.start();
       // }
        
    }
    /*class ImagenCancion extends JPanel{
        private Image imagen;
        
        public void paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/cancionFondo.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }*/
}
