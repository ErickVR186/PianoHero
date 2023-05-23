/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canciones;

import clases.BaseDeDatos;
import clases.EventoTeclado;
import clases.Inicio;
import clases.ListaCanciones;
import clases.Notas;
import clases.Reproductor;
import clases.Teclas;
import clases.VentanaFinal;
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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import principal.Principal;

public class Perfect extends JPanel implements ActionListener, MouseListener{
    //DO
    Notas do_1 = new Notas(140,-40,40);
    Notas do_2 = new Notas(140,-108,108);
    Notas do_3 = new Notas(140,-104,104);
    //RE
    Notas re_1 = new Notas(228,-40,40);
    Notas re_2 = new Notas(228,-40,40);
    Notas re_3 = new Notas(228,-80,80);
    Notas re_4 = new Notas(228,-80,80);
    Notas re_5 = new Notas(228,-40,40);
    //---------------
    Notas re_6 = new Notas(228,-40,40);
    
    //MI
    Notas mi_1 =new Notas(315, -40, 40);
    Notas mi_2 =new Notas(315, -40, 40);
    Notas mi_3 =new Notas(315, -40, 40);
    Notas mi_4 =new Notas(315, -44, 44);
    //---------------
    Notas mi_5 =new Notas(315, -40, 40);
    Notas mi_6 =new Notas(315, -40, 40);
    
    
    //FA
    Notas fa_1 = new Notas(402,-40,40);
    Notas fa_2 = new Notas(402,-120,120);
    Notas fa_3 = new Notas(402,-40,40);
    Notas fa_4 = new Notas(402,-80, 80);
    Notas fa_5 = new Notas(402,-40,40);
    Notas fa_6 = new Notas(402,-40,40);
    Notas fa_7 = new Notas(402,-40,40);
    Notas fa_8 = new Notas(402,-80,80);
    Notas fa_9 = new Notas(402,-120,120);
    Notas fa_10 = new Notas(402,-40,40);
    Notas fa_11 = new Notas(402,-40,40);
    Notas fa_12 = new Notas(402,-40,40);
    Notas fa_13 = new Notas(402,-40,40);
    Notas fa_14 = new Notas(402,-40,40);
    Notas fa_15 = new Notas(402,-40,40);
    Notas fa_16 = new Notas(402,-80,80);
    Notas fa_17 = new Notas(402,-40,40);
    Notas fa_18 = new Notas(402,-40,40);
    Notas fa_19 = new Notas(402,-40,40);
    Notas fa_20 = new Notas(402,-80,80);
    Notas fa_21 = new Notas(402,-104,104);
    Notas fa_22 = new Notas(402,-80,80);
    Notas fa_23 = new Notas(402,-104,104);
    Notas fa_24 = new Notas(402,-80,80);
    Notas fa_25 = new Notas(402,-40,40);
    Notas fa_26 = new Notas(402,-44,44);
    //---------------
    Notas fa_27 = new Notas(402,-80,80);
    Notas fa_28 = new Notas(402,-40,40);
    Notas fa_29 = new Notas(402,-40,40);
    Notas fa_30 = new Notas(402,-40,40);
    Notas fa_31 = new Notas(402,-40,40);
    Notas fa_32 = new Notas(402,-120,120);
        
    //SOL
    Notas sol_1 = new Notas(489,-120,120);
    Notas sol_2 = new Notas(489,-40,40);
    Notas sol_3 = new Notas(489,-80,80);
    Notas sol_4 = new Notas(489,-40,40);
    Notas sol_5 = new Notas(489,-120,120);
    Notas sol_6 = new Notas(489,-40,40);
    Notas sol_7 = new Notas(489,-40,40);
    Notas sol_8 = new Notas(489,-40,40);
    Notas sol_9 = new Notas(489,-40,40);
    Notas sol_10 = new Notas(489,-40,40);
    Notas sol_11 = new Notas(489,-40,40);
    Notas sol_12 = new Notas(489,-200,200);
    Notas sol_13 = new Notas(489,-40,40);
    Notas sol_14 = new Notas(489,-40,40);
    Notas sol_15 = new Notas(489,-40,40);
    Notas sol_16 = new Notas(489,-40,40);
    Notas sol_17 = new Notas(489,-80,80);
    Notas sol_18 = new Notas(489,-40,40);
    Notas sol_19 = new Notas(489,-40,40);
    Notas sol_20 = new Notas(489,-40,40);
    Notas sol_21 = new Notas(489,-104,104);
    Notas sol_22 = new Notas(489,-104,104);
    Notas sol_23 = new Notas(489,-40,40);
    Notas sol_24 = new Notas(489,-40,40);
    //--------------------------
    Notas sol_25 = new Notas(489,-40,40);
    Notas sol_26 = new Notas(489,-80,80);
    Notas sol_27 = new Notas(489,-40,40);
    Notas sol_28 = new Notas(489,-80,80);
    Notas sol_29 = new Notas(489,-120,120);
    
    //LA
    Notas la_1 = new Notas(577,-40,40);
    Notas la_2 = new Notas(577,-40,40);
    Notas la_3 = new Notas(577,-40,40);
    Notas la_4 = new Notas(577,-40,40);
    Notas la_5 = new Notas(577,-40,40);
    Notas la_6 = new Notas(577,-120,120);
    Notas la_7 = new Notas(577,-40,40);
    Notas la_8 = new Notas(577,-40,40);
    Notas la_9 = new Notas(577,-80,80);
    Notas la_10 = new Notas(577,-40,40);
    Notas la_11 = new Notas(577,-104,104);
    Notas la_12 = new Notas(577,-104,104);
    Notas la_13 = new Notas(577,-80,80);
    Notas la_14 = new Notas(577,-40,40);
    Notas la_15 = new Notas(577,-104,104);
    Notas la_16 = new Notas(577,-80,80);
    Notas la_17 = new Notas(577,-80,80);
    Notas la_18 = new Notas(577,-40,40);
    Notas la_19 = new Notas(577,-60,60);
    Notas la_20 = new Notas(577,-144,144);
    Notas la_21 = new Notas(577,-40,40);
    Notas la_22 = new Notas(577,-40,40);
    Notas la_23 = new Notas(577,-104,104);
    Notas la_24 = new Notas(577,-104,104);
    Notas la_25 = new Notas(577,-80,80);
    Notas la_26 = new Notas(577,-40,40);
    Notas la_27 = new Notas(577,-104,104);
    Notas la_28 = new Notas(577,-104,104);
    Notas la_29 = new Notas(577,-80,80);
    Notas la_30 = new Notas(577,-40,40);
    Notas la_31 = new Notas(577,-104,104);
    Notas la_32 = new Notas(577,-104,104);
    Notas la_33 = new Notas(577,-80,80);
    Notas la_34 = new Notas(577,-104,104);
    Notas la_35 = new Notas(577,-40,40);
    Notas la_36 = new Notas(577,-40,40);
    //----------------------
    Notas la_37 = new Notas(577,-80,80);
    Notas la_38 = new Notas(577,-40,40);
    Notas la_39 = new Notas(577,-80,80);
    Notas la_40 = new Notas(577,-80,80);
    Notas la_41 = new Notas(577,-40,40);
    Notas la_42 = new Notas(577,-120,120);
    
    //SI
    Notas si_1 = new Notas(665,-80,80);
    Notas si_2 = new Notas(665,-40,40);
    Notas si_3 = new Notas(665,-104,104);
    Notas si_4 = new Notas(665,-40,40);
    Notas si_5 = new Notas(665,-104,104);
    Notas si_6 = new Notas(665,-40,40);
    //----------------
    Notas si_7 = new Notas(665,-40,40);
    Notas si_8 = new Notas(665,-40,40);
    Notas si_9 = new Notas(665,-120,120);
    
    //DO2
    Notas do2_1 = new Notas(753,-80,80);
    Notas do2_2 = new Notas(753,-40,40);
    Notas do2_3 = new Notas(753,-40,40);
    Notas do2_4 = new Notas(753,-40,40);
    Notas do2_5 = new Notas(753,-104,104);
    Notas do2_6 = new Notas(753,-80,80);
    Notas do2_7 = new Notas(753,-40,40);
    Notas do2_8 = new Notas(753,-40,40);
    Notas do2_9 = new Notas(753,-40,40);
    Notas do2_10 = new Notas(753,-40,40);
    //-----------------
    Notas do2_11 = new Notas(753,-80,80);
    
    //Teclas del Teclado
    Teclas Do = new Teclas(134,590, 70);
    Teclas Re = new Teclas(222,590, 70);
    Teclas Mi = new Teclas(310,590, 70);
    Teclas Fa = new Teclas(398,590, 70);
    Teclas Sol = new Teclas(486,590, 70);
    Teclas La = new Teclas(574,590, 70);
    Teclas Si = new Teclas(662,590, 70);
    Teclas Do2 = new Teclas(750,590, 70);
    
    //Creacion de instancias de jlabel, jpanel y ImageIcon
    public JLabel pausa, btn_menu, btn_reanudar;
    public JPanel panelPause;
    ImageIcon iconopausa, iconomenu, iconoreanudar;
    
    public Principal principal;
    public Inicio inicio;
    public ListaCanciones panelCanciones;
    public VentanaFinal completado;
    
    Reproductor mi_reproductor = new Reproductor();
    public static boolean checkMusica=true;
    
    public int contadorPuntos=0;
    public String puntos = String.valueOf(contadorPuntos);
    
    public Perfect (){
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

        panelPause = new JPanel(){
            protected void paintComponent(Graphics g)
                {
                    g.setColor( getBackground() );
                    g.fillRect(0, 0, getWidth(), getHeight());
                    super.paintComponent(g);
                }
        };
        
        //Panel de pausa
        panelPause.setSize(1000,700);
        panelPause.setLayout(null);
        panelPause.setOpaque(false);
        panelPause.setBackground(new Color(0,0,0,180));
        panelPause.setVisible(false);
        this.add(panelPause);
        
        //Opciones del menu de pausa
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
        
        
        //Color del Tablero 
        setBackground(new Color(17, 17, 17));          //Color del JPanel(Fondo)
        setLayout(null);
        
        //Pausa Canciones Icono
        pausa = new JLabel();
        iconopausa = new ImageIcon(getClass().getResource("/imagenes/pause.png"));
        pausa.setBounds(20,20, 40, 40);
        pausa.setIcon(new ImageIcon(iconopausa.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        pausa.addMouseListener(this);
        pausa.setCursor(new Cursor(HAND_CURSOR));
        add(pausa);
        
        if(checkMusica == true){
            try {
                //String songName = "Perfect.mp3";
                //String pathToMp3 = System.getProperty("user.dir") + "/" + songName;
                  URL pathToMp3 = getClass().getResource("/canciones/Perfect.wav");
                  //InputStream in = getClass().getResourceAsStream("/canciones/Perfect.mp3");
                  
                  //String ruta = "/canciones/Perfect.mp3";
                mi_reproductor.AbrirFichero(pathToMp3);
                mi_reproductor.Play();
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
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
        
        /*g.setColor( Color.WHITE );
        g.setFont( new Font( "Tahoma", Font.BOLD, 30 ) );
        g.drawString(puntos, 890, 40);*/
        g.setColor( Color.WHITE );
        g.setFont( new Font( "Tahoma", Font.BOLD, 15 ) );
        g.drawString("Score", 870, 20);
        
        g.setColor(Color.white);
        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        drawCenteredString(puntos, 1839, 85, g);
        
        dibujar(g2);
        teclasPiano(g2);
        try {
            actualizar(getBounds());
        } catch (InterruptedException ex) {
            Logger.getLogger(Titanic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  void drawCenteredString(String s, int w, int h, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        int x = (w - fm.stringWidth(s)) / 2;
        int y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent())) / 2);
        g.drawString(s, x, y);
    }
    
    public void dibujar(Graphics2D g){
        //DO
        g.setColor(new Color(162, 255, 0));
        g.fill(do_1.getNotas());
        g.fill(do_2.getNotas());
        g.fill(do_3.getNotas());
        //RE
        g.setColor(new Color(255, 240, 1));
        g.fill(re_1.getNotas());
        g.fill(re_2.getNotas());
        g.fill(re_3.getNotas());
        g.fill(re_4.getNotas());
        g.fill(re_5.getNotas());
        g.fill(re_6.getNotas());
        //MI
        g.setColor(new Color(255, 178, 0));
        g.fill(mi_1.getNotas());
        g.fill(mi_2.getNotas());
        g.fill(mi_3.getNotas());
        g.fill(mi_4.getNotas());
        g.fill(mi_5.getNotas());
        g.fill(mi_6.getNotas());
        //FA
        g.setColor(new Color(255, 102, 0));
        g.fill(fa_1.getNotas());
        g.fill(fa_2.getNotas());
        g.fill(fa_3.getNotas());
        g.fill(fa_4.getNotas());
        g.fill(fa_5.getNotas());
        g.fill(fa_6.getNotas());
        g.fill(fa_7.getNotas());
        g.fill(fa_8.getNotas());
        g.fill(fa_9.getNotas());
        g.fill(fa_10.getNotas());
        g.fill(fa_11.getNotas());
        g.fill(fa_12.getNotas());
        g.fill(fa_13.getNotas());
        g.fill(fa_14.getNotas());
        g.fill(fa_15.getNotas());
        g.fill(fa_16.getNotas());
        g.fill(fa_17.getNotas());
        g.fill(fa_18.getNotas());
        g.fill(fa_19.getNotas());
        g.fill(fa_20.getNotas());
        g.fill(fa_21.getNotas());
        g.fill(fa_22.getNotas());
        g.fill(fa_23.getNotas());
        g.fill(fa_24.getNotas());
        g.fill(fa_25.getNotas());
        g.fill(fa_26.getNotas());
        g.fill(fa_27.getNotas());
        g.fill(fa_28.getNotas());
        g.fill(fa_29.getNotas());
        g.fill(fa_30.getNotas());
        g.fill(fa_31.getNotas());
        g.fill(fa_32.getNotas());
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.draw(fa_2.getNotas());
        g.draw(fa_8.getNotas());
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
        g.fill(sol_13.getNotas());
        g.fill(sol_14.getNotas());
        g.fill(sol_15.getNotas());
        g.fill(sol_16.getNotas());
        g.fill(sol_17.getNotas());
        g.fill(sol_18.getNotas());
        g.fill(sol_19.getNotas());
        g.fill(sol_20.getNotas());
        g.fill(sol_21.getNotas());
        g.fill(sol_22.getNotas());
        g.fill(sol_23.getNotas());
        g.fill(sol_24.getNotas());
        g.fill(sol_25.getNotas());
        g.fill(sol_26.getNotas());
        g.fill(sol_27.getNotas());
        g.fill(sol_28.getNotas());
        g.fill(sol_29.getNotas());
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
        g.fill(la_19.getNotas());
        g.fill(la_20.getNotas());
        g.fill(la_21.getNotas());
        g.fill(la_22.getNotas());
        g.fill(la_23.getNotas());
        g.fill(la_24.getNotas());
        g.fill(la_25.getNotas());
        g.fill(la_26.getNotas());
        g.fill(la_27.getNotas());
        g.fill(la_28.getNotas());
        g.fill(la_29.getNotas());
        g.fill(la_30.getNotas());
        g.fill(la_31.getNotas());
        g.fill(la_32.getNotas());
        g.fill(la_33.getNotas());
        g.fill(la_34.getNotas());
        g.fill(la_35.getNotas());
        g.fill(la_36.getNotas());
        g.fill(la_37.getNotas());
        g.fill(la_38.getNotas());
        g.fill(la_39.getNotas());
        g.fill(la_40.getNotas());
        g.fill(la_41.getNotas());
        g.fill(la_42.getNotas());
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
        //DO2
        g.setColor(new Color(85, 224, 169));
        g.fill(do2_1.getNotas());
        g.fill(do2_2.getNotas());
        g.fill(do2_3.getNotas());
        g.fill(do2_4.getNotas());
        g.fill(do2_5.getNotas());
        g.fill(do2_6.getNotas());
        g.fill(do2_7.getNotas());
        g.fill(do2_8.getNotas());
        g.fill(do2_9.getNotas());
        g.fill(do2_10.getNotas());
        g.fill(do2_11.getNotas());
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2));
        g.draw(do2_8.getNotas());
        g.draw(do2_9.getNotas());
    }
    
    public void teclasPiano(Graphics2D g){
        //DO
        if(EventoTeclado.A == true){
            if((colisionDO(do_1.getNotas()))||(colisionDO(do_2.getNotas()))||
                (colisionDO(do_3.getNotas()))){
                g.setColor(new Color(162, 255, 0));
                g.fill(Do.getNotas());
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Do.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Do.getNotas());
        }
        //RE
        if(EventoTeclado.S == true){
            if((colisionRE(re_1.getNotas()))||(colisionRE(re_2.getNotas()))||
                (colisionRE(re_3.getNotas()))||(colisionRE(re_4.getNotas()))||
                (colisionRE(re_5.getNotas()))||(colisionRE(re_6.getNotas()))){
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
                (colisionMI(mi_5.getNotas()))||(colisionMI(mi_6.getNotas()))){
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
        //FA
        if(EventoTeclado.F == true){
            if((colisionFA(fa_1.getNotas()))||(colisionFA(fa_2.getNotas()))||
                (colisionFA(fa_3.getNotas()))||(colisionFA(fa_4.getNotas()))||
                (colisionFA(fa_5.getNotas()))||(colisionFA(fa_6.getNotas()))||
                (colisionFA(fa_7.getNotas()))||(colisionFA(fa_8.getNotas()))||
                (colisionFA(fa_9.getNotas()))||(colisionFA(fa_10.getNotas()))||
                (colisionFA(fa_11.getNotas()))||(colisionFA(fa_12.getNotas()))||
                (colisionFA(fa_13.getNotas()))||(colisionFA(fa_14.getNotas()))||
                (colisionFA(fa_15.getNotas()))||(colisionFA(fa_16.getNotas()))||
                (colisionFA(fa_17.getNotas()))||(colisionFA(fa_18.getNotas()))||
                (colisionFA(fa_19.getNotas()))||(colisionFA(fa_20.getNotas()))||
                (colisionFA(fa_21.getNotas()))||(colisionFA(fa_22.getNotas()))||
                (colisionFA(fa_23.getNotas()))||(colisionFA(fa_24.getNotas()))||
                (colisionFA(fa_25.getNotas()))||(colisionFA(fa_26.getNotas()))||
                (colisionFA(fa_27.getNotas()))||(colisionFA(fa_28.getNotas()))||
                (colisionFA(fa_29.getNotas()))||(colisionFA(fa_30.getNotas()))||
                (colisionFA(fa_31.getNotas()))||(colisionFA(fa_32.getNotas()))){
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
        //SOL
        if(EventoTeclado.G == true){
            if((colisionSOL(sol_1.getNotas()))||(colisionSOL(sol_2.getNotas()))||
                (colisionSOL(sol_3.getNotas()))||(colisionSOL(sol_4.getNotas()))||
                (colisionSOL(sol_5.getNotas()))||(colisionSOL(sol_6.getNotas()))||
                (colisionSOL(sol_7.getNotas()))||(colisionSOL(sol_8.getNotas()))||
                (colisionSOL(sol_9.getNotas()))||(colisionSOL(sol_10.getNotas()))||
                (colisionSOL(sol_11.getNotas()))||(colisionSOL(sol_12.getNotas()))||
                (colisionSOL(sol_13.getNotas()))||(colisionSOL(sol_14.getNotas()))||
                (colisionSOL(sol_15.getNotas()))||(colisionSOL(sol_16.getNotas()))||
                (colisionSOL(sol_17.getNotas()))||(colisionSOL(sol_18.getNotas()))||
                (colisionSOL(sol_19.getNotas()))||(colisionSOL(sol_20.getNotas()))||
                (colisionSOL(sol_21.getNotas()))||(colisionSOL(sol_22.getNotas()))||
                (colisionSOL(sol_23.getNotas()))||(colisionSOL(sol_24.getNotas()))||
                (colisionSOL(sol_25.getNotas()))||(colisionSOL(sol_26.getNotas()))||
                (colisionSOL(sol_27.getNotas()))||(colisionSOL(sol_28.getNotas()))||
                (colisionSOL(sol_29.getNotas()))){
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
                (colisionLA(la_17.getNotas()))||(colisionLA(la_18.getNotas()))||
                (colisionLA(la_19.getNotas()))||(colisionLA(la_20.getNotas()))||
                (colisionLA(la_21.getNotas()))||(colisionLA(la_22.getNotas()))||
                (colisionLA(la_23.getNotas()))||(colisionLA(la_24.getNotas()))||
                (colisionLA(la_25.getNotas()))||(colisionLA(la_26.getNotas()))||
                (colisionLA(la_27.getNotas()))||(colisionLA(la_28.getNotas()))||
                (colisionLA(la_29.getNotas()))||(colisionLA(la_30.getNotas()))||
                (colisionLA(la_31.getNotas()))||(colisionLA(la_32.getNotas()))||
                (colisionLA(la_33.getNotas()))||(colisionLA(la_34.getNotas()))||
                (colisionLA(la_35.getNotas()))||(colisionLA(la_36.getNotas()))||
                (colisionLA(la_37.getNotas()))||(colisionLA(la_38.getNotas()))||
                (colisionLA(la_39.getNotas()))||(colisionLA(la_40.getNotas()))||
                (colisionLA(la_41.getNotas()))||(colisionLA(la_42.getNotas()))){
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
                (colisionSI(si_9.getNotas()))){
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
        //DO2
        if(EventoTeclado.K == true){
            if((colisionDO2(do2_1.getNotas()))||(colisionDO2(do2_2.getNotas()))||
                (colisionDO2(do2_3.getNotas()))||(colisionDO2(do2_4.getNotas()))||
                (colisionDO2(do2_5.getNotas()))||(colisionDO2(do2_6.getNotas()))||
                (colisionDO2(do2_7.getNotas()))||(colisionDO2(do2_8.getNotas()))||
                (colisionDO2(do2_9.getNotas()))||(colisionDO2(do2_10.getNotas()))||
                (colisionDO2(do2_11.getNotas()))){
                g.setColor(new Color(85, 224, 169));
                g.fill(Do2.getNotas());
                contadorPuntos = contadorPuntos + 10;
                puntos = String.valueOf(contadorPuntos);
            }else{
                g.setColor(new Color(212, 0, 0));
                g.fill(Do2.getNotas());
            }       
        }else{
            g.setColor(new Color(255, 255, 255));
            g.fill(Do2.getNotas());
        }
        
        
        //Teclas Piano
        //g.setColor(Color.WHITE);
        
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
        
        /*
        if(contador==5){
            ventanaF_1.setVisible(false);
        }*/
        //MenuPrincipal ventana = new MenuPrincipal();
        //ventana.ventanaFlotante_1();
        if(panelPause.isVisible() == false){
            try {
                mi_reproductor.Continuar();
            } catch (Exception ex) {
                Logger.getLogger(Titanic.class.getName()).log(Level.SEVERE, null, ex);
            }
            //mensaje.showMessageDialog(null, "prueba");
            do_1.moverx6();
            if(Double.compare(do_1.getNotas().getY(), 5.0)==1){
            re_1.moverx6();
            if(Double.compare(re_1.getNotas().getY(), 5.0)==1){
            fa_1.moverx6();
            if(Double.compare(fa_1.getNotas().getY(), -20.0)==1){
            fa_2.moverx6();
            if(Double.compare(fa_2.getNotas().getY(), 300.0)==1){
            sol_1.moverx6();
            if(Double.compare(sol_1.getNotas().getY(), 10.0)==1){
            la_1.moverx6();
            if(Double.compare(la_1.getNotas().getY(), 240.0)==1){
            sol_2.moverx6();
            if(Double.compare(sol_2.getNotas().getY(), 5.0)==1){
            la_2.moverx6();
            if(Double.compare(la_2.getNotas().getY(), 5.0)==1){
            la_3.moverx6();
            if(Double.compare(la_3.getNotas().getY(), 5.0)==1){
            sol_3.moverx6();
            if(Double.compare(sol_3.getNotas().getY(), 10.0)==1){
            fa_3.moverx6();
            if(Double.compare(fa_3.getNotas().getY(), 5.0)==1){
            fa_4.moverx6();
            if(Double.compare(fa_4.getNotas().getY(), 160.0)==1){
            fa_5.moverx6();
            if(Double.compare(fa_5.getNotas().getY(), 5.0)==1){
            sol_4.moverx6();
            if(Double.compare(sol_4.getNotas().getY(), 5.0)==1){
            la_4.moverx6();
            if(Double.compare(la_4.getNotas().getY(), 5.0)==1){
            sol_5.moverx6();
            if(Double.compare(sol_5.getNotas().getY(), 240.0)==1){
            la_5.moverx6();
            if(Double.compare(la_5.getNotas().getY(), 5.0)==1){
            sol_6.moverx6();
            if(Double.compare(sol_6.getNotas().getY(), 5.0)==1){
            fa_6.moverx6();
            if(Double.compare(fa_6.getNotas().getY(), -20.0)==1){
            la_6.moverx6();
            if(Double.compare(la_6.getNotas().getY(), 240.0)==1){
            do2_1.moverx6();
            if(Double.compare(do2_1.getNotas().getY(), 5.0)==1){
            la_7.moverx6();
            if(Double.compare(la_7.getNotas().getY(), 5.0)==1){
            sol_7.moverx6();
            if(Double.compare(sol_7.getNotas().getY(), -20.0)==1){
            fa_7.moverx6();
            if(Double.compare(fa_7.getNotas().getY(), -20.0)==1){
            fa_8.moverx6();
            if(Double.compare(fa_8.getNotas().getY(), 5.0)==1){
            fa_9.moverx6();
            if(Double.compare(fa_9.getNotas().getY(), 120.0)==1){
            fa_10.moverx6();
            if(Double.compare(fa_10.getNotas().getY(), 5.0)==1){
            sol_8.moverx6();
            if(Double.compare(sol_8.getNotas().getY(), 5.0)==1){
            la_8.moverx6();
            if(Double.compare(la_8.getNotas().getY(), 5.0)==1){
            si_1.moverx6();
            if(Double.compare(si_1.getNotas().getY(), 5.0)==1){
            si_2.moverx6();
            if(Double.compare(si_2.getNotas().getY(), 5.0)==1){
            la_9.moverx6();
            if(Double.compare(la_9.getNotas().getY(), 5.0)==1){
            sol_9.moverx6();
            if(Double.compare(sol_9.getNotas().getY(), 5.0)==1){
            sol_10.moverx6();
            if(Double.compare(sol_10.getNotas().getY(), 5.0)==1){
            fa_11.moverx6();
            if(Double.compare(fa_11.getNotas().getY(), 40.0)==1){
            fa_12.moverx6();
            if(Double.compare(fa_12.getNotas().getY(), 5.0)==1){
            sol_11.moverx6();
            if(Double.compare(sol_11.getNotas().getY(), 5.0)==1){
            la_10.moverx6();
            if(Double.compare(la_10.getNotas().getY(), 5.0)==1){
            sol_12.moverx6();
            if(Double.compare(sol_12.getNotas().getY(), 40.0)==1){
            do2_2.moverx6();
            if(Double.compare(do2_2.getNotas().getY(), 5.0)==1){
            do2_3.moverx6();
            if(Double.compare(do2_3.getNotas().getY(), 5.0)==1){
            do2_4.moverx6();
            if(Double.compare(do2_4.getNotas().getY(), 5.0)==1){
            re_2.moverx6();
            if(Double.compare(re_2.getNotas().getY(), 5.0)==1){
            sol_13.moverx6();
            if(Double.compare(sol_13.getNotas().getY(), 5.0)==1){
            sol_14.moverx6();
            if(Double.compare(sol_14.getNotas().getY(), 5.0)==1){
            la_11.moverx6();
            if(Double.compare(la_11.getNotas().getY(), 10.0)==1){
            la_12.moverx6();
            if(Double.compare(la_12.getNotas().getY(), 10.0)==1){
            la_13.moverx6();
            if(Double.compare(la_13.getNotas().getY(), 40.0)==1){
            la_14.moverx6();
            if(Double.compare(la_14.getNotas().getY(), 5.0)==1){
            sol_15.moverx6();
            if(Double.compare(sol_15.getNotas().getY(), 5.0)==1){
            fa_13.moverx6();
            if(Double.compare(fa_13.getNotas().getY(), 5.0)==1){
            la_15.moverx6();
            if(Double.compare(la_15.getNotas().getY(), 5.0)==1){
            la_16.moverx6();
            if(Double.compare(la_16.getNotas().getY(), 40.0)==1){
            la_17.moverx6();
            if(Double.compare(la_17.getNotas().getY(), 40.0)==1){
            la_18.moverx6();
            if(Double.compare(la_18.getNotas().getY(), 5.0)==1){
            sol_16.moverx6();
            if(Double.compare(sol_16.getNotas().getY(), 5.0)==1){
            fa_14.moverx6();
            if(Double.compare(fa_14.getNotas().getY(), 5.0)==1){
            si_3.moverx6();
            if(Double.compare(si_3.getNotas().getY(), 5.0)==1){
            la_19.moverx6();
            if(Double.compare(la_19.getNotas().getY(), 20.0)==1){
            fa_15.moverx6();
            if(Double.compare(fa_15.getNotas().getY(), 5.0)==1){
            fa_16.moverx6();
            if(Double.compare(fa_16.getNotas().getY(), 40.0)==1){
            do_2.moverx6();
            if(Double.compare(do_2.getNotas().getY(), 5.0)==1){
            la_20.moverx6();
            if(Double.compare(la_20.getNotas().getY(), 5.0)==1){
            si_4.moverx6();
            if(Double.compare(si_4.getNotas().getY(), 5.0)==1){
            la_21.moverx6();
            if(Double.compare(la_21.getNotas().getY(), 5.0)==1){
            sol_17.moverx6();
            if(Double.compare(sol_17.getNotas().getY(), 40.0)==1){
            la_22.moverx6();
            if(Double.compare(la_22.getNotas().getY(), 5.0)==1){
            sol_18.moverx6();
            if(Double.compare(sol_18.getNotas().getY(), 5.0)==1){
            fa_17.moverx6();
            if(Double.compare(fa_17.getNotas().getY(), 5.0)==1){
            la_23.moverx6();
            if(Double.compare(la_23.getNotas().getY(), 5.0)==1){
            la_24.moverx6();
            if(Double.compare(la_24.getNotas().getY(), 5.0)==1){
            la_25.moverx6();
            if(Double.compare(la_25.getNotas().getY(), 40.0)==1){
            la_26.moverx6();
            if(Double.compare(la_26.getNotas().getY(), 5.0)==1){
            sol_19.moverx6();
            if(Double.compare(sol_19.getNotas().getY(), 5.0)==1){
            fa_18.moverx6();
            if(Double.compare(fa_18.getNotas().getY(), 5.0)==1){
            la_27.moverx6();
            if(Double.compare(la_27.getNotas().getY(), 5.0)==1){
            la_28.moverx6();
            if(Double.compare(la_28.getNotas().getY(), 5.0)==1){
            la_29.moverx6();
            if(Double.compare(la_29.getNotas().getY(), 40.0)==1){
            la_30.moverx6();
            if(Double.compare(la_30.getNotas().getY(), 5.0)==1){
            sol_20.moverx6();
            if(Double.compare(sol_20.getNotas().getY(), 5.0)==1){
            fa_19.moverx6();
            if(Double.compare(fa_19.getNotas().getY(), 5.0)==1){
            si_5.moverx6();
            if(Double.compare(si_5.getNotas().getY(), 5.0)==1){
            la_31.moverx6();
            if(Double.compare(la_31.getNotas().getY(), 5.0)==1){
            fa_20.moverx6();
            if(Double.compare(fa_20.getNotas().getY(), 40.0)==1){
            do_3.moverx6();
            if(Double.compare(do_3.getNotas().getY(), 5.0)==1){
            sol_21.moverx6();
            if(Double.compare(sol_21.getNotas().getY(), 104.0)==1){
            do2_5.moverx6();
            if(Double.compare(do2_5.getNotas().getY(), 5.0)==1){
            sol_22.moverx6();
            if(Double.compare(sol_22.getNotas().getY(), 5.0)==1){
            fa_21.moverx6();
            if(Double.compare(fa_21.getNotas().getY(), 104.0)==1){
            fa_22.moverx6();
            if(Double.compare(fa_22.getNotas().getY(), 5.0)==1){
            mi_1.moverx6();
            if(Double.compare(mi_1.getNotas().getY(), 5.0)==1){
            re_3.moverx6();
            if(Double.compare(re_3.getNotas().getY(), 5.0)==1){
            mi_2.moverx6();
            if(Double.compare(mi_2.getNotas().getY(), 5.0)==1){
            la_32.moverx6();
            if(Double.compare(la_32.getNotas().getY(), 104.0)==1){
            do2_6.moverx6();
            if(Double.compare(do2_6.getNotas().getY(), 5.0)==1){
            si_6.moverx6();
            if(Double.compare(si_6.getNotas().getY(), 5.0)==1){
            la_33.moverx6();
            if(Double.compare(la_33.getNotas().getY(), 5.0)==1){
            sol_23.moverx6();
            if(Double.compare(sol_23.getNotas().getY(), 5.0)==1){
            fa_23.moverx6();
            if(Double.compare(fa_23.getNotas().getY(), 104.0)==1){
            fa_24.moverx6();
            if(Double.compare(fa_24.getNotas().getY(), 5.0)==1){
            mi_3.moverx6();
            if(Double.compare(mi_3.getNotas().getY(), 5.0)==1){
            re_4.moverx6();
            if(Double.compare(re_4.getNotas().getY(), 5.0)==1){
            fa_25.moverx6();
            if(Double.compare(fa_25.getNotas().getY(), 5.0)==1){
            la_34.moverx6();
            if(Double.compare(la_34.getNotas().getY(), 104.0)==1){
            do2_7.moverx6();
            if(Double.compare(do2_7.getNotas().getY(), 5.0)==1){
            do2_8.moverx6();
            if(Double.compare(do2_8.getNotas().getY(), 5.0)==1){
            do2_9.moverx6();
            if(Double.compare(do2_9.getNotas().getY(), 5.0)==1){
            re_5.moverx6();
            if(Double.compare(re_5.getNotas().getY(), 5.0)==1){
            mi_4.moverx6();
            if(Double.compare(mi_4.getNotas().getY(), 20.0)==1){
            la_35.moverx6();
            if(Double.compare(la_35.getNotas().getY(), 5.0)==1){
            sol_24.moverx6();
            if(Double.compare(sol_24.getNotas().getY(), 5.0)==1){
            fa_26.moverx6();
            if(Double.compare(fa_26.getNotas().getY(), 20.0)==1){
            la_36.moverx6();
            if(Double.compare(la_36.getNotas().getY(), 5.0)==1){
            do2_10.moverx6();
            if(Double.compare(do2_10.getNotas().getY(), 5.0)==1){
            fa_27.moverx6();
            if(Double.compare(fa_27.getNotas().getY(), 5.0)==1){
            mi_5.moverx6();
            if(Double.compare(mi_5.getNotas().getY(), 5.0)==1){
            re_6.moverx6();
            if(Double.compare(re_6.getNotas().getY(), 5.0)==1){
            mi_6.moverx6();
            if(Double.compare(mi_6.getNotas().getY(), 5.0)==1){
            la_37.moverx6();
            if(Double.compare(la_37.getNotas().getY(), 5.0)==1){
            fa_28.moverx6();
            if(Double.compare(fa_28.getNotas().getY(), 5.0)==1){
            sol_25.moverx6();
            if(Double.compare(sol_25.getNotas().getY(), 5.0)==1){
            la_38.moverx6();
            if(Double.compare(la_38.getNotas().getY(), 5.0)==1){
            do2_11.moverx6();
            if(Double.compare(do2_11.getNotas().getY(), 5.0)==1){
            si_7.moverx6();
            if(Double.compare(si_7.getNotas().getY(), 5.0)==1){
            la_39.moverx6();
            if(Double.compare(la_39.getNotas().getY(), 5.0)==1){
            si_8.moverx6();
            if(Double.compare(si_8.getNotas().getY(), 5.0)==1){
            la_40.moverx6();
            if(Double.compare(la_40.getNotas().getY(), 40.0)==1){
            sol_26.moverx6();
            if(Double.compare(sol_26.getNotas().getY(), 40.0)==1){
            si_9.moverx6();
            if(Double.compare(si_9.getNotas().getY(), 5.0)==1){
            la_41.moverx6();
            if(Double.compare(la_41.getNotas().getY(), 40.0)==1){
            fa_29.moverx6();
            if(Double.compare(fa_29.getNotas().getY(), -20.0)==1){
            sol_27.moverx6();
            if(Double.compare(sol_27.getNotas().getY(), -20.0)==1){
            la_42.moverx6();
            if(Double.compare(la_42.getNotas().getY(), 5.0)==1){
            sol_28.moverx6();
            if(Double.compare(sol_28.getNotas().getY(), 40.0)==1){
            sol_29.moverx6();
            if(Double.compare(sol_29.getNotas().getY(), 5.0)==1){
            fa_30.moverx6();
            if(Double.compare(fa_30.getNotas().getY(), 40.0)==1){
            fa_31.moverx6();
            if(Double.compare(fa_31.getNotas().getY(), 5.0)==1){
            fa_32.moverx6();
            if(fa_32.getNotas().getY()>limites.getMaxY()){
                BaseDeDatos BaseDeDatos = new BaseDeDatos();
                BaseDeDatos.obtenerDatos();
                int PuntajePerfectArchivo = Integer.parseInt(BaseDeDatos.getPerfectPuntuaje());
                if(PuntajePerfectArchivo<contadorPuntos){
                    puntos = String.valueOf(contadorPuntos);
                    BaseDeDatos.setPerfectPuntuaje(puntos);
                    BaseDeDatos.actualizarDatos();
                }
                
                
                this.setVisible(false);
                completado = new VentanaFinal(2, puntos);
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
            
        }else{
            try {
                mi_reproductor.Pausa();
            } catch (Exception ex) {
                Logger.getLogger(Titanic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
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
