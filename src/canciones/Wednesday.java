/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canciones;

import clases.Notas;
import canciones.Titanic;
import clases.BaseDeDatos;
import clases.EventoTeclado;
import clases.Hilo;

import clases.Inicio;
import clases.ListaCanciones;
import clases.Reproductor;



import clases.Teclas;
import clases.Ventana;
import clases.VentanaFinal;
import java.applet.AudioClip;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import principal.Principal;

public class Wednesday extends JPanel implements ActionListener, MouseListener{
    /*  //DO
    Notas do_1 = new Notas(140,-40,40);
    Notas do_2 = new Notas(140,-40,40);
    Notas do_3 = new Notas(140,-240,240);
    Notas do_4 = new Notas(140,-40,40);
    Notas do_5 = new Notas(140,-40,40);
    Notas do_6 = new Notas(140,-40,40);
    Notas do_7 = new Notas(140,-40,40);
    Notas do_8 = new Notas(140,-40,40);
    Notas do_9 = new Notas(140,-40,40);
    Notas do_10 = new Notas(140,-80,80);
    Notas do_11 = new Notas(140,-40,40);
    Notas do_12 = new Notas(140,-80,80);
    Notas do_13 = new Notas(140,-40,40);
    Notas do_14 = new Notas(140,-40,40);
    Notas do_15 = new Notas(140,-40,40);
    Notas do_16 = new Notas(140,-40,40);
    Notas do_17 = new Notas(140,-80,80);
    Notas do_18 = new Notas(140,-40,40);
    Notas do_19 = new Notas(140,-160,160);
    Notas do_20 = new Notas(140,-40,40);
    Notas do_21 = new Notas(140,-80,80);
    Notas do_22 = new Notas(140,-160,160);
    Notas do_23 = new Notas(140,-40,40);
    Notas do_24 = new Notas(140,-80,80);
    Notas do_25 = new Notas(140,-80,80);*/
    //RE
    Notas re_1 = new Notas(228,-40,40);
    Notas re_2 = new Notas(228,-40,40);
    Notas re_3 = new Notas(228,-40,40);
    Notas re_4 = new Notas(228,-40,40);
    Notas re_5 = new Notas(228,-40,40);
    Notas re_6 = new Notas(228,-40,40);
    Notas re_7 = new Notas(228,-40,40);
    Notas re_8 = new Notas(228,-40,40);
    Notas re_9 = new Notas(228,-40,40);
    Notas re_10 = new Notas(228,-40,40);
    
    //MI
    Notas mi_1 =new Notas(315,-20,20);
    Notas mi_2 =new Notas(315,-60,60);
    Notas mi_3 =new Notas(315,-60,60);
    Notas mi_4 =new Notas(315,-40,40);
    Notas mi_5 =new Notas(315,-40,40);
    Notas mi_6 =new Notas(315,-40,40);
    Notas mi_7 =new Notas(315,-40,40);
    Notas mi_8 =new Notas(315,-40,40);
    Notas mi_9 =new Notas(315,-60,60);
    Notas mi_10 =new Notas(315,-40,40);
    Notas mi_11 =new Notas(315,-20,20);
    Notas mi_12 =new Notas(315,-60,60);
    Notas mi_13 =new Notas(315,-60,60);
    Notas mi_14 =new Notas(315,-40,40);
    Notas mi_15 =new Notas(315,-40,40);
    Notas mi_16 =new Notas(315,-40,40);
    Notas mi_17 =new Notas(315,-40,40);
    Notas mi_18 =new Notas(315,-40,40);
    Notas mi_19 =new Notas(315,-40,40);
    Notas mi_20 =new Notas(315,-60,60);
    Notas mi_21 =new Notas(315,-40,40);
    Notas mi_22 =new Notas(315,-40,40);
    Notas mi_23 =new Notas(315,-40,40);
    Notas mi_24 =new Notas(315,-60,60);
    Notas mi_25 =new Notas(315,-60,60);
    Notas mi_26 =new Notas(315,-40,40);
    Notas mi_27 =new Notas(315,-60,60);
    Notas mi_28 =new Notas(315,-60,60);
    Notas mi_29 =new Notas(315,-40,40);
    Notas mi_30 =new Notas(315,-40,40);
    Notas mi_31 =new Notas(315,-40,40);
    
    /*  //FA
    Notas fa_1 = new Notas(402,-40,40);
    Notas fa_2 = new Notas(402,-40,40);
    Notas fa_3 = new Notas(402,-40,40);
    Notas fa_4 = new Notas(402,-40,40);
    Notas fa_5 = new Notas(402,-40,40);*/
    
    //SOL
    Notas sol_1 = new Notas(489,-40,40);
    Notas sol_2 = new Notas(489,-40,40);
    Notas sol_3 = new Notas(489,-40,40);
    Notas sol_4 = new Notas(489,-60,60);
    Notas sol_5 = new Notas(489,-40,40);
    Notas sol_6 = new Notas(489,-60,60);
    Notas sol_7 = new Notas(489,-40,40);
    Notas sol_8 = new Notas(489,-40,40);
    Notas sol_9 = new Notas(489,-40,40);
    Notas sol_10 = new Notas(489,-40,40);
    Notas sol_11 = new Notas(489,-40,40);
    Notas sol_12 = new Notas(489,-40,40);
    
    //LA
    Notas la_1 = new Notas(577,-40,40);
    Notas la_2 = new Notas(577,-40,40);
    Notas la_3 = new Notas(577,-40,40);
    Notas la_4 = new Notas(577,-60,60);
    Notas la_5 = new Notas(577,-60,60);
    Notas la_6 = new Notas(577,-40,40);
    Notas la_7 = new Notas(577,-40,40);
    Notas la_8 = new Notas(577,-60,60);
    Notas la_9 = new Notas(577,-40,40);
    Notas la_10 = new Notas(577,-20,20);
    Notas la_11 = new Notas(577,-60,60);
    Notas la_12 = new Notas(577,-60,60);
    Notas la_13 = new Notas(577,-40,40);
    Notas la_14 = new Notas(577,-40,40);
    Notas la_15 = new Notas(577,-40,40);
    Notas la_16 = new Notas(577,-40,40);
    Notas la_17 = new Notas(577,-140,140);
    Notas la_18 = new Notas(577,-120,120);
    
    
    //SI
    Notas si_1 = new Notas(665,-40,40);
    Notas si_2 = new Notas(665,-60,60);
    Notas si_3 = new Notas(665,-40,40);
    Notas si_4 = new Notas(665,-40,40);
    Notas si_5 = new Notas(665,-60,60);
    Notas si_6 = new Notas(665,-40,40);
    Notas si_7 = new Notas(665,-40,40);
    Notas si_8 = new Notas(665,-60,60);
    Notas si_9 = new Notas(665,-40,40);
    Notas si_10 = new Notas(665,-60,60);
    Notas si_11 = new Notas(665,-40,40);
    Notas si_12 = new Notas(665,-60,60);
    Notas si_13 = new Notas(665,-40,40);
    Notas si_14 = new Notas(665,-40,40);
    Notas si_15 = new Notas(665,-60,60);
    Notas si_16 = new Notas(665,-60,60);
    Notas si_17 = new Notas(665,-40,40);
    Notas si_18 = new Notas(665,-60,60);
    Notas si_19 = new Notas(665,-40,40);
    Notas si_20 = new Notas(665,-40,40);
    Notas si_21 = new Notas(665,-60,60);
    Notas si_22 = new Notas(665,-40,40);
    
    /*//DO2
    Notas do2_1 = new Notas(753,-180,180);
    */
    
    //int contador=1;
    
    Teclas Do = new Teclas(134,590, 70);
    Teclas Re = new Teclas(222,590, 70);
    Teclas Mi = new Teclas(310,590, 70);
    Teclas Fa = new Teclas(398,590, 70);
    Teclas Sol = new Teclas(486,590, 70);
    Teclas La = new Teclas(574,590, 70);
    Teclas Si = new Teclas(662,590, 70);
    Teclas Do2 = new Teclas(750,590, 70);
    
    public JLabel pausa, btn_menu, btn_reanudar, Puntuaje;
    //public JFrame ventanaPause;
    public JPanel panelPause;
    ImageIcon iconopausa, iconomenu, iconoreanudar;
    
    //public MenuPrincipal ventana;
    public Principal principal;
    public Inicio inicio;
    public ListaCanciones panelCanciones;
    public VentanaFinal completado;
    
    
    
    
    
    //Reproductor mi_reproductor = new Reproductor();
    public static boolean checkMusica=true;
    /*AudioClip sonido;
    private HiloMusica hilo;
    public static boolean valorMusica = false;*/
    public int contadorPuntos=0;
    public String puntos = String.valueOf(contadorPuntos);
    
    //private HiloMusica hilo;
    //public static boolean valorMusica = false;
    public boolean imprimir;
    //JOptionPane mensaje;
    public Wednesday(){
        
        
        panelCanciones = new ListaCanciones(){
            @Override
            protected void paintComponent(Graphics g)
            {
                g.setColor( getBackground() );
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        };
        panelCanciones.setVisible(false);
        /*ventanaPause = new JFrame ();
        ventanaPause.setSize(250,260);
        ventanaPause.setLocationRelativeTo(null);
        ventanaPause.setLayout(null);
        ventanaPause.setResizable(false);
        ventanaPause.setFocusable(true); 
        ventanaPause.setUndecorated(true);*/
        panelPause = new JPanel(){
            protected void paintComponent(Graphics g)
            {
                g.setColor( getBackground() );
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        };
        
        panelPause.setSize(1000,700);
        panelPause.setLayout(null);
        panelPause.setOpaque(false);
        panelPause.setBackground(new Color(0,0,0,180));
        panelPause.setVisible(false);
        this.add(panelPause);
        
        btn_reanudar = new JLabel();
        iconoreanudar = new ImageIcon(getClass().getResource("/imagenes/Reanudar.png"));
        btn_reanudar.setBounds(425,226, 150, 50);
        btn_reanudar.setIcon(new ImageIcon(iconoreanudar.getImage().getScaledInstance(150, 50, Image.SCALE_SMOOTH)));
        btn_reanudar.addMouseListener(this);
        btn_reanudar.setCursor(new Cursor(HAND_CURSOR));
        panelPause.add(btn_reanudar);
        
        btn_menu = new JLabel();
        iconomenu = new ImageIcon(getClass().getResource("/imagenes/Menu.png"));
        btn_menu.setBounds(410,412, 190, 50);
        btn_menu.setIcon(new ImageIcon(iconomenu.getImage().getScaledInstance(190, 50, Image.SCALE_SMOOTH)));
        btn_menu.addMouseListener(this);
        btn_menu.setCursor(new Cursor(HAND_CURSOR));
        panelPause.add(btn_menu);
        
        
        
        setBackground(new Color(17, 17, 17));          //Color del JPanel(Fondo)
        setLayout(null);
        //Pausa Canciones
        pausa = new JLabel();
        iconopausa = new ImageIcon(getClass().getResource("/imagenes/pause.png"));
        pausa.setBounds(20,20, 40, 40);
        pausa.setIcon(new ImageIcon(iconopausa.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        pausa.addMouseListener(this);
        pausa.setCursor(new Cursor(HAND_CURSOR));
        add(pausa);
        
        
        
        /*
        if(Wednesday.checkMusica == true){
            try {
                //String songName = "Titanic.mp3";
                //String pathToMp3 = System.getProperty("user.dir") + "/" + songName;
                URL pathToMp3 = getClass().getResource("/canciones/Titanic.wav");
                mi_reproductor.AbrirFichero(pathToMp3);
                mi_reproductor.Play();
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }*/
        
        
            
        
    }
    
    
    
    public void paintComponent(Graphics g){        //Crear elementos graficos
        super.paintComponent(g);                   //Obtener atributos heredados de clase g
        Graphics2D g2 = (Graphics2D)g;             //Se crea y convierte un elemento de Graphics a Graphics2D con mas funciones                      
        int anchoLinea=4;
        float guiones1[]={10,10};
        
        g.setColor(Color.white);
        g.drawRect(870, 25, 100, 35);
        
        g2.setStroke(new BasicStroke(anchoLinea, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,0,guiones1,0));
        g2.setColor(Color.white);
        g2.drawLine(136, 0, 136, 700);
        g2.drawLine(224, 0, 224, 700);
        g2.drawLine(311, 0, 311, 700);
        g2.drawLine(399, 0, 399, 700);
        g2.drawLine(485, 0, 485, 700);
        g2.drawLine(573, 0, 573, 700);
        g2.drawLine(661, 0, 661, 700);
        g2.drawLine(749, 0, 749, 700);
        g2.drawLine(837, 0, 837, 700);
        
        g.setColor( Color.WHITE );
        g.setFont( new Font( "Tahoma", Font.BOLD, 15 ) );
        g.drawString("Score", 870, 20);
        
        g.setColor(Color.white);
        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        drawCenteredString(puntos, 1839, 85, g);
        
        
        
        
        //BaseDeDatos.titanicPuntuaje = puntos;
        
        
        
        dibujar(g2);
        teclasPiano(g2);
        try {
            actualizar(getBounds());
        } catch (InterruptedException ex) {
            Logger.getLogger(Wednesday.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public  void drawCenteredString(String s, int w, int h, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        int x = (w - fm.stringWidth(s)) / 2;
        int y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent())) / 2);
        g.drawString(s, x, y);
    }

    
    public void dibujar(Graphics2D g){
        /* //DO
        g.setColor(new Color(162, 255, 0));
        g.fill(do_1.getNotas());
        g.fill(do_2.getNotas());
        g.fill(do_3.getNotas());
        g.fill(do_4.getNotas());
        g.fill(do_5.getNotas());
        g.fill(do_6.getNotas());
        g.fill(do_7.getNotas());
        g.fill(do_8.getNotas());
        g.fill(do_9.getNotas());
        g.fill(do_10.getNotas());
        g.fill(do_11.getNotas());
        g.fill(do_12.getNotas());
        g.fill(do_13.getNotas());
        g.fill(do_14.getNotas());
        g.fill(do_15.getNotas());
        g.fill(do_16.getNotas());
        g.fill(do_17.getNotas());
        g.fill(do_18.getNotas());
        g.fill(do_19.getNotas());
        g.fill(do_20.getNotas());
        g.fill(do_21.getNotas());
        g.fill(do_22.getNotas());
        g.fill(do_23.getNotas());
        g.fill(do_24.getNotas());
        g.fill(do_25.getNotas());
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.draw(do_8.getNotas());
        g.draw(do_15.getNotas());
        */
        //RE
        g.setColor(new Color(255, 240, 1));
        g.fill(re_1.getNotas());
        g.fill(re_2.getNotas());
        g.fill(re_3.getNotas());
        g.fill(re_4.getNotas());
        g.fill(re_5.getNotas());
        g.fill(re_6.getNotas());
        g.fill(re_7.getNotas());
        g.fill(re_8.getNotas());
        g.fill(re_9.getNotas());
        g.fill(re_10.getNotas());
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.draw(re_9.getNotas());
        
        //MI
        g.setColor(new Color(255, 178, 0));
        g.fill(mi_1.getNotas());
        g.fill(mi_2.getNotas());
        g.fill(mi_3.getNotas());
        g.fill(mi_4.getNotas());
        g.fill(mi_5.getNotas());
        g.fill(mi_6.getNotas());
        g.fill(mi_7.getNotas());
        g.fill(mi_8.getNotas());
        g.fill(mi_9.getNotas());
        g.fill(mi_10.getNotas());
        g.fill(mi_11.getNotas());
        g.fill(mi_12.getNotas());
        g.fill(mi_13.getNotas());
        g.fill(mi_14.getNotas());
        g.fill(mi_15.getNotas());
        g.fill(mi_16.getNotas());
        g.fill(mi_17.getNotas());
        g.fill(mi_18.getNotas());
        g.fill(mi_19.getNotas());
        g.fill(mi_20.getNotas());
        g.fill(mi_21.getNotas());
        g.fill(mi_22.getNotas());
        g.fill(mi_23.getNotas());
        g.fill(mi_24.getNotas());
        g.fill(mi_25.getNotas());
        g.fill(mi_26.getNotas());
        g.fill(mi_27.getNotas());
        g.fill(mi_28.getNotas());
        g.fill(mi_29.getNotas());
        g.fill(mi_30.getNotas());
        g.fill(mi_31.getNotas());
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        
        g.draw(mi_6.getNotas());
        g.draw(mi_13.getNotas());
        g.draw(mi_16.getNotas());
        g.draw(mi_22.getNotas());
        /* //FA
        g.setColor(new Color(255, 102, 0));
        g.fill(fa_1.getNotas());
        g.fill(fa_2.getNotas());
        g.fill(fa_3.getNotas());
        g.fill(fa_4.getNotas());
        g.fill(fa_5.getNotas()); */
        
        //SOL
        g.setColor(new Color(255, 0, 104));
        g.fill(sol_1.getNotas());
        g.fill(sol_2.getNotas());
        g.fill(sol_3.getNotas());
        g.fill(sol_4.getNotas());
        g.fill(sol_5.getNotas());
        g.fill(sol_6.getNotas());
        g.fill(sol_7.getNotas());
        g.fill(sol_8.getNotas());
        g.fill(sol_9.getNotas());
        g.fill(sol_10.getNotas());
        g.fill(sol_11.getNotas());
        g.fill(sol_12.getNotas());
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.draw(sol_2.getNotas());
        //LA
        g.setColor(new Color(181, 0, 255));
        g.fill(la_1.getNotas());
        g.fill(la_2.getNotas());
        g.fill(la_3.getNotas());
        g.fill(la_4.getNotas());
        g.fill(la_5.getNotas());
        g.fill(la_6.getNotas());
        g.fill(la_7.getNotas());
        g.fill(la_8.getNotas());
        g.fill(la_9.getNotas());
        g.fill(la_10.getNotas());
        g.fill(la_11.getNotas());
        g.fill(la_12.getNotas());
        g.fill(la_13.getNotas());
        g.fill(la_14.getNotas());
        g.fill(la_15.getNotas());
        g.fill(la_16.getNotas());
        g.fill(la_17.getNotas());
        g.fill(la_18.getNotas());
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.draw(la_3.getNotas());
        g.draw(la_5.getNotas());
        g.draw(la_7.getNotas());
        g.draw(la_12.getNotas());
        g.draw(la_15.getNotas());
        
        //SI
        g.setColor(new Color(0, 154, 255));
        g.fill(si_1.getNotas());
        g.fill(si_2.getNotas());
        g.fill(si_3.getNotas());
        g.fill(si_4.getNotas());
        g.fill(si_5.getNotas());
        g.fill(si_6.getNotas());
        g.fill(si_7.getNotas());
        g.fill(si_8.getNotas());
        g.fill(si_9.getNotas());
        g.fill(si_10.getNotas());
        g.fill(si_11.getNotas());
        g.fill(si_12.getNotas());
        g.fill(si_13.getNotas());
        g.fill(si_14.getNotas());
        g.fill(si_15.getNotas());
        g.fill(si_16.getNotas());
        g.fill(si_17.getNotas());
        g.fill(si_18.getNotas());
        g.fill(si_19.getNotas());
        g.fill(si_20.getNotas());
        g.fill(si_21.getNotas());
        g.fill(si_22.getNotas());
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.draw(si_4.getNotas());
        g.draw(si_7.getNotas());
        g.draw(si_11.getNotas());
        g.draw(si_14.getNotas());
        /*//DO2
        g.setColor(new Color(85, 224, 169));
        g.fill(do2_1.getNotas());
        */
        
      
    }
        
    
    public void teclasPiano(Graphics2D g){
        
        /*//DO
        if(EventoTeclado.A == true){
            if((colisionDO(do_1.getNotas()))||(colisionDO(do_2.getNotas()))||
                (colisionDO(do_3.getNotas()))||(colisionDO(do_4.getNotas()))||
                (colisionDO(do_5.getNotas()))||(colisionDO(do_6.getNotas()))||
                (colisionDO(do_7.getNotas()))||(colisionDO(do_8.getNotas()))||
                (colisionDO(do_9.getNotas()))||(colisionDO(do_10.getNotas()))||
                (colisionDO(do_11.getNotas()))||(colisionDO(do_12.getNotas()))||
                (colisionDO(do_13.getNotas()))||(colisionDO(do_14.getNotas()))||
                (colisionDO(do_15.getNotas()))||(colisionDO(do_16.getNotas()))||
                (colisionDO(do_17.getNotas()))||(colisionDO(do_18.getNotas()))||
                (colisionDO(do_19.getNotas()))||(colisionDO(do_20.getNotas()))||
                (colisionDO(do_21.getNotas()))||(colisionDO(do_22.getNotas()))||
                (colisionDO(do_23.getNotas()))||(colisionDO(do_24.getNotas()))||
                (colisionDO(do_25.getNotas()))){
                g.setColor(new Color(162, 255, 0));
                g.fill(Do.getNotas());
                
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
                
                
                //System.out.println(puntos);
                //Puntuaje.setText(puntos);
                //System.out.println(puntos);
                
                
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Do.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Do.getNotas());
            
        }
        */
        //RE
        if(EventoTeclado.S == true){
            if((colisionRE(re_1.getNotas()))||(colisionRE(re_2.getNotas()))||
                (colisionRE(re_3.getNotas()))||(colisionRE(re_4.getNotas()))||
                (colisionRE(re_5.getNotas()))||(colisionRE(re_6.getNotas()))||
                (colisionRE(re_7.getNotas()))||(colisionRE(re_8.getNotas()))||
                (colisionRE(re_9.getNotas()))||(colisionRE(re_10.getNotas()))){
                g.setColor(new Color(255, 240, 1));
                g.fill(Re.getNotas());
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Re.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Re.getNotas());
        }
        //MI
        if(EventoTeclado.D == true){
            if((colisionMI(mi_1.getNotas()))||(colisionMI(mi_2.getNotas()))||
                (colisionMI(mi_3.getNotas()))||(colisionMI(mi_4.getNotas()))||
                (colisionMI(mi_5.getNotas()))||(colisionMI(mi_6.getNotas()))||
                (colisionMI(mi_7.getNotas()))||(colisionMI(mi_8.getNotas()))||
                (colisionMI(mi_9.getNotas()))||(colisionMI(mi_10.getNotas()))||
                (colisionMI(mi_11.getNotas()))||(colisionMI(mi_12.getNotas()))||
                (colisionMI(mi_13.getNotas()))||(colisionMI(mi_14.getNotas()))||
                (colisionMI(mi_15.getNotas()))||(colisionMI(mi_16.getNotas()))||
                (colisionMI(mi_17.getNotas()))||(colisionMI(mi_18.getNotas()))||
                (colisionMI(mi_19.getNotas()))||(colisionMI(mi_20.getNotas()))||
                (colisionMI(mi_21.getNotas()))||(colisionMI(mi_22.getNotas()))||
                (colisionMI(mi_23.getNotas()))||(colisionMI(mi_24.getNotas()))||
                (colisionMI(mi_25.getNotas()))||(colisionMI(mi_26.getNotas()))||
                (colisionMI(mi_27.getNotas()))||(colisionMI(mi_28.getNotas()))||
                (colisionMI(mi_29.getNotas()))||(colisionMI(mi_30.getNotas()))||
                (colisionMI(mi_31.getNotas()))){
                g.setColor(new Color(255, 178, 0));
                g.fill(Mi.getNotas());
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Mi.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Mi.getNotas());
        }
        /*//FA
        if(EventoTeclado.F == true){
            if((colisionFA(fa_1.getNotas()))||(colisionFA(fa_2.getNotas()))||
                (colisionFA(fa_3.getNotas()))||(colisionFA(fa_4.getNotas()))||
                (colisionFA(fa_5.getNotas()))){
                g.setColor(new Color(255, 102, 0));
                g.fill(Fa.getNotas());
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Fa.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Fa.getNotas());
        }
        */
        //SOL
        if(EventoTeclado.G == true){
            if((colisionSOL(sol_1.getNotas()))||(colisionSOL(sol_2.getNotas()))||
                (colisionSOL(sol_3.getNotas()))||(colisionSOL(sol_4.getNotas()))||
                (colisionSOL(sol_5.getNotas()))||(colisionSOL(sol_6.getNotas()))||
                (colisionSOL(sol_7.getNotas()))||(colisionSOL(sol_8.getNotas()))||
                (colisionSOL(sol_9.getNotas()))||(colisionSOL(sol_10.getNotas()))||
                (colisionSOL(sol_11.getNotas()))||(colisionSOL(sol_12.getNotas()))){
                g.setColor(new Color(255, 0, 104));
                g.fill(Sol.getNotas());
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Sol.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Sol.getNotas());
        }
        
        //LA
        if(EventoTeclado.H == true){
            if((colisionLA(la_1.getNotas()))||(colisionLA(la_2.getNotas()))||
                (colisionLA(la_3.getNotas()))||(colisionLA(la_4.getNotas()))||
                (colisionLA(la_5.getNotas()))||(colisionLA(la_6.getNotas()))||
                (colisionLA(la_7.getNotas()))||(colisionLA(la_8.getNotas()))||
                (colisionLA(la_9.getNotas()))||(colisionLA(la_10.getNotas()))||
                (colisionLA(la_11.getNotas()))||(colisionLA(la_12.getNotas()))||
                (colisionLA(la_13.getNotas()))||(colisionLA(la_14.getNotas()))||
                (colisionLA(la_15.getNotas()))||(colisionLA(la_16.getNotas()))||
                (colisionLA(la_17.getNotas()))||(colisionLA(la_18.getNotas()))    ){
                g.setColor(new Color(181, 0, 255));
                g.fill(La.getNotas());
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(La.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(La.getNotas());
        }
        
        //SI
        if(EventoTeclado.J == true){
            if((colisionSI(si_1.getNotas()))||(colisionSI(si_2.getNotas()))||
                (colisionSI(si_3.getNotas()))||(colisionSI(si_4.getNotas()))||
                (colisionSI(si_5.getNotas()))||(colisionSI(si_6.getNotas()))||
                (colisionSI(si_7.getNotas()))||(colisionSI(si_8.getNotas()))||
                (colisionSI(si_9.getNotas()))||(colisionSI(si_10.getNotas()))||
                (colisionSI(si_11.getNotas()))||(colisionSI(si_12.getNotas()))||
                (colisionSI(si_13.getNotas()))||(colisionSI(si_14.getNotas()))||
                (colisionSI(si_15.getNotas()))||(colisionSI(si_16.getNotas()))||
                (colisionSI(si_17.getNotas()))||(colisionSI(si_18.getNotas()))||
                (colisionSI(si_19.getNotas()))||(colisionSI(si_20.getNotas()))||
                (colisionSI(si_21.getNotas()))||(colisionSI(si_22.getNotas()))){
                g.setColor(new Color(0, 154, 255));
                g.fill(Si.getNotas());
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Si.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Si.getNotas());
        }
        /*//DO2
        if(EventoTeclado.K == true){
            if((colisionDO2(do2_1.getNotas()))||(colisionDO2(do2_2.getNotas()))){
                g.setColor(Color.GREEN);
                g.fill(Do2.getNotas());
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Do2.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Do2.getNotas());
        }*/
        
        
        //Teclas Piano
        g.setColor(Color.WHITE);
        g.fill(Do.getNotas());
        //g.fill(Re.getNotas());
        //g.fill(Mi.getNotas());
        g.fill(Fa.getNotas());
        //g.fill(Sol.getNotas());
        //g.fill(La.getNotas());
        //g.fill(Si.getNotas());
        g.fill(Do2.getNotas());   
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.draw(Do.getNotas());
        g.draw(Re.getNotas());
        g.draw(Mi.getNotas());
        g.draw(Fa.getNotas());
        g.draw(Sol.getNotas());
        g.draw(La.getNotas());
        g.draw(Si.getNotas());
        g.draw(Do2.getNotas()); 
    }
    
    
    
    public void actualizar(Rectangle limites) throws InterruptedException{
        
        
        if(panelPause.isVisible() == false){

            /*try {
                mi_reproductor.Continuar();
            } catch (Exception ex) {
                Logger.getLogger(Titanic.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            si_1.mover();      
            if(Double.compare(si_1.getNotas().getY(), -10.0)==1){
            re_1.mover();
            if(Double.compare(re_1.getNotas().getY(), -10.0)==1){
            mi_1.mover();
            if(Double.compare(mi_1.getNotas().getY(), 5.0)==1){
            mi_2.mover();
            if(Double.compare(mi_2.getNotas().getY(), 5.0)==1){
            mi_3.mover();
            if(Double.compare(mi_3.getNotas().getY(), 5.0)==1){
            si_2.mover();
            if(Double.compare(si_2.getNotas().getY(), 5.0)==1){
            si_3.mover();
            if(Double.compare(si_3.getNotas().getY(), -10.0)==1){
            si_4.mover();
            if(Double.compare(si_4.getNotas().getY(), -10.0)==1){
            mi_4.mover();
            if(Double.compare(mi_4.getNotas().getY(), -10.0)==1){
            mi_5.mover();
            if(Double.compare(mi_5.getNotas().getY(), -10.0)==1){
            mi_6.mover();
            if(Double.compare(mi_6.getNotas().getY(), 5.0)==1){
            si_5.mover();
            if(Double.compare(si_5.getNotas().getY(), -10.0)==1){
            si_6.mover();
            if(Double.compare(si_6.getNotas().getY(), -10.0)==1){
            si_7.mover();
            if(Double.compare(si_7.getNotas().getY(), -10.0)==1){
            la_1.mover();
            if(Double.compare(la_1.getNotas().getY(), -10.0)==1){
            mi_7.mover();
            if(Double.compare(mi_7.getNotas().getY(), -10.0)==1){
            sol_2.mover(); 
            if(Double.compare(sol_2.getNotas().getY(), -10.0)==1){
            re_2.mover();
            if(Double.compare(re_2.getNotas().getY(), -10.0)==1){
            mi_8.mover();
            if(Double.compare(mi_8.getNotas().getY(), -10.0)==1){
            re_3.mover();
            if(Double.compare(re_3.getNotas().getY(), 5.0)==1){
            la_2.mover();
            if(Double.compare(la_2.getNotas().getY(), -10.0)==1){ ////
            mi_9.mover();
            ////
            if(Double.compare(mi_9.getNotas().getY(), 5.0)==1){
            si_8.mover();
            if(Double.compare(si_8.getNotas().getY(), 5.0)==1){
            mi_10.mover();
            if(Double.compare(mi_10.getNotas().getY(), -10.0)==1){
            si_9.mover();
            if(Double.compare(si_9.getNotas().getY(), -10.0)==1){
            si_10.mover(); 
            if(Double.compare(si_10.getNotas().getY(), 5.0)==1){
            si_11.mover(); 
            if(Double.compare(si_11.getNotas().getY(), -10.0)==1){
            re_4.mover(); 
            if(Double.compare(re_4.getNotas().getY(), -10.0)==1){
            mi_11.mover(); 
            ///
            if(Double.compare(mi_11.getNotas().getY(), 5.0)==1){ 
            mi_12.mover(); 
            if(Double.compare(mi_12.getNotas().getY(), 5.0)==1){
            mi_13.mover();
            if(Double.compare(mi_13.getNotas().getY(), 5.0)==1){
            si_12.mover();  
            if(Double.compare(si_12.getNotas().getY(), 5.0)==1){
            si_13.mover(); 
            if(Double.compare(si_13.getNotas().getY(), -10.0)==1){
            si_14.mover();
            ////
            if(Double.compare(si_14.getNotas().getY(), -10.0)==1){
            mi_14.mover();
            if(Double.compare(mi_14.getNotas().getY(), -10.0)==1){
            mi_15.mover();
            if(Double.compare(mi_15.getNotas().getY(), -10.0)==1){
            mi_16.mover();
            if(Double.compare(mi_16.getNotas().getY(), -10.0)==1){
            si_15.mover(); 
            if(Double.compare(si_15.getNotas().getY(), 5.0)==1){
            la_3.mover(); 
            if(Double.compare(la_3.getNotas().getY(), -10.0)==1){
            la_4.mover(); 
            if(Double.compare(la_4.getNotas().getY(), 5.0)==1){
            la_5.mover(); 
            ///
            if(Double.compare(la_5.getNotas().getY(), 5.0)==1){
            la_6.mover();
            if(Double.compare(la_6.getNotas().getY(), -10.0)==1){
            la_7.mover();
            if(Double.compare(la_7.getNotas().getY(), -10.0)==1){
            sol_1.mover();
            if(Double.compare(sol_1.getNotas().getY(), -10.0)==1){
            sol_2.mover();
            if(Double.compare(sol_2.getNotas().getY(), -10.0)==1){
            mi_17.mover();
            if(Double.compare(mi_17.getNotas().getY(), -10.0)==1){
            sol_3.mover();
            if(Double.compare(sol_3.getNotas().getY(), -10.0)==1){
            la_8.mover();
            if(Double.compare(la_8.getNotas().getY(), 5.0)==1){
            la_9.mover();
            if(Double.compare(la_9.getNotas().getY(), -10.0)==1){
            sol_4.mover();
            if(Double.compare(sol_4.getNotas().getY(), 5.0)==1){
            mi_18.mover();
            if(Double.compare(mi_18.getNotas().getY(), -10.0)==1){
            sol_5.mover();
            if(Double.compare(sol_5.getNotas().getY(), -10.0)==1){
            la_10.mover();
            if(Double.compare(la_10.getNotas().getY(), 5.0)==1){
            la_11.mover();
            if(Double.compare(la_11.getNotas().getY(), 5.0)==1){
            la_12.mover();
            if(Double.compare(la_12.getNotas().getY(), 5.0)==1){
            sol_6.mover();
            if(Double.compare(sol_6.getNotas().getY(), 5.0)==1){
            mi_19.mover();
            if(Double.compare(mi_19.getNotas().getY(), -10.0)==1){
            sol_7.mover();
            if(Double.compare(sol_7.getNotas().getY(), -10.0)==1){
            la_13.mover();
            if(Double.compare(la_13.getNotas().getY(), -10.0)==1){
            la_14.mover();
            if(Double.compare(la_14.getNotas().getY(), -10.0)==1){
            la_15.mover();
            if(Double.compare(la_15.getNotas().getY(), -10.0)==1){
            mi_20.mover();
            if(Double.compare(mi_20.getNotas().getY(), 5.0)==1){
            mi_21.mover();
            if(Double.compare(mi_21.getNotas().getY(), -10.0)==1){
            mi_22.mover();
            if(Double.compare(mi_22.getNotas().getY(), -10.0)==1){
            re_5.mover();
            if(Double.compare(re_5.getNotas().getY(), -10.0)==1){
            mi_23.mover();
            if(Double.compare(mi_23.getNotas().getY(), -10.0)==1){
            re_6.mover();
            if(Double.compare(re_6.getNotas().getY(), -10.0)==1){
            mi_24.mover();
            if(Double.compare(mi_24.getNotas().getY(), 5.0)==1){
            re_7.mover();
            if(Double.compare(re_7.getNotas().getY(), -10.0)==1){
            re_8.mover();
            if(Double.compare(re_8.getNotas().getY(), -10.0)==1){
            re_9.mover();
            if(Double.compare(re_9.getNotas().getY(), -10.0)==1){
            si_16.mover();
            if(Double.compare(si_16.getNotas().getY(), 5.0)==1){
            mi_25.mover();
            if(Double.compare(mi_25.getNotas().getY(), 5.0)==1){
            re_10.mover();
            if(Double.compare(re_10.getNotas().getY(), -10.0)==1){
            mi_26.mover();
            if(Double.compare(mi_26.getNotas().getY(), -10.0)==1){
            si_17.mover();
            if(Double.compare(si_17.getNotas().getY(), 5.0)==1){
            la_16.mover();
            if(Double.compare(la_16.getNotas().getY(), 5.0)==1){
            mi_27.mover();
            if(Double.compare(mi_27.getNotas().getY(), 5.0)==1){
            mi_28.mover();
            if(Double.compare(mi_28.getNotas().getY(), 10.0)==1){
            si_18.mover();
            if(Double.compare(si_18.getNotas().getY(), 5.0)==1){
            si_19.mover();
            if(Double.compare(si_19.getNotas().getY(), -10.0)==1){
            si_20.mover();
            if(Double.compare(si_20.getNotas().getY(), -10.0)==1){
            mi_29.mover();
            if(Double.compare(mi_29.getNotas().getY(), -10.0)==1){
            mi_30.mover();
            if(Double.compare(mi_30.getNotas().getY(), -10.0)==1){ ////
            mi_31.mover();
            if(Double.compare(mi_31.getNotas().getY(), -10.0)==1){
            si_21.mover();
            if(Double.compare(si_21.getNotas().getY(), 10.0)==1){
            sol_8.mover();
            if(Double.compare(sol_8.getNotas().getY(), -10.0)==1){
            sol_9.mover();
            if(Double.compare(sol_9.getNotas().getY(), -10.0)==1){
            sol_10.mover();
            if(Double.compare(sol_10.getNotas().getY(), -10.0)==1){
            la_17.mover();
            if(Double.compare(la_17.getNotas().getY(), 10.0)==1){
            sol_11.mover();
            if(Double.compare(sol_11.getNotas().getY(), -10.0)==1){
            si_22.mover();
            if(Double.compare(si_22.getNotas().getY(), -10.0)==1){
            sol_12.mover(); 
            if(Double.compare(sol_12.getNotas().getY(), -10.0)==1){
            la_18.mover(); 
            if(la_18.getNotas().getY()>limites.getMaxY()){
                BaseDeDatos BaseDeDatos = new BaseDeDatos();
                BaseDeDatos.obtenerDatos();
                int PuntajeWednesdayArchivo = Integer.parseInt(BaseDeDatos.getWednesdayPuntuaje());
                if(PuntajeWednesdayArchivo<contadorPuntos){
                    puntos = String.valueOf(contadorPuntos);
                    BaseDeDatos.setWednesdayPuntuaje(puntos);
                    BaseDeDatos.actualizarDatos();
                }
                
                this.setVisible(false);
                completado = new VentanaFinal(3, puntos);
                //add(pantalla);
               principal.ventana.add(completado);
                //pantalla.setVisible(true);
                //((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();     // Sirve para cerrar la ventana que se esta utilizando.
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }          
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }            
            }
            }
            }            
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            }
            } 
        }/*else{
            try {
                mi_reproductor.Pausa();
            } catch (Exception ex) {
                Logger.getLogger(Wednesday.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
    }
    
    private boolean colisionDO(RoundRectangle2D m){
        return Do.getNotas().intersects(m.getX(),m.getY(),m.getWidth(),m.getHeight());
    }
    private boolean colisionRE(RoundRectangle2D m){
        return Re.getNotas().intersects(m.getX(),m.getY(),m.getWidth(),m.getHeight());
    }
    private boolean colisionMI(RoundRectangle2D m){
        return Mi.getNotas().intersects(m.getX(),m.getY(),m.getWidth(),m.getHeight());
    }
    private boolean colisionFA(RoundRectangle2D m){
        return Fa.getNotas().intersects(m.getX(),m.getY(),m.getWidth(),m.getHeight());
    }
    private boolean colisionSOL(RoundRectangle2D m){
        return Sol.getNotas().intersects(m.getX(),m.getY(),m.getWidth(),m.getHeight());
    }
    private boolean colisionLA(RoundRectangle2D m){
        return La.getNotas().intersects(m.getX(),m.getY(),m.getWidth(),m.getHeight());
    }
    private boolean colisionSI(RoundRectangle2D m){
        return Si.getNotas().intersects(m.getX(),m.getY(),m.getWidth(),m.getHeight());
    }
    private boolean colisionDO2(RoundRectangle2D m){
        return Do2.getNotas().intersects(m.getX(),m.getY(),m.getWidth(),m.getHeight());
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==pausa){    
            panelPause.setVisible(true);
        }
        if(e.getSource()== btn_reanudar){
            panelPause.setVisible(false);
        }
        if(e.getSource()== btn_menu){
            panelPause.setVisible(false);
            //((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();     // Sirve para cerrar la ventana que se esta utilizando.
            //MenuPrincipal ventanaInicial = new MenuPrincipal();
            //ventanaInicial.setVisible(true);
            //ventanaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(false);
            principal.ventana.fondoImagen.setVisible(true);
            panelCanciones.setVisible(true);
            principal.ventana.fondoImagen.add(panelCanciones);
            
            //principal.ventana.fondoImagen.add(inicio.panelCanciones);
            
            
        }
        panelCanciones.titulos();
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
    
}


