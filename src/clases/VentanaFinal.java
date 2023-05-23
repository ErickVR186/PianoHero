/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import canciones.Perfect;
import canciones.Titanic;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import principal.Principal;

public class VentanaFinal extends JPanel implements ActionListener, MouseListener{
    public JLabel portada, btn_reintentar, btn_continuar;
    ImageIcon icono, iconoreintentar, iconocontinuar;
    int cancion;
    String puntos;
    
    public Titanic tablero1;
    public Perfect tablero2;
    public Principal principal;
    public ListaCanciones panelCanciones;
    
    private Hilo hilo;
    BaseDeDatos Archivo  = new BaseDeDatos();
     
    public VentanaFinal(int cancion, String puntos){
        this.cancion = cancion;
        this.puntos = puntos;
        
        setBounds(0,0, 1000, 700);
        setBackground(new Color(42, 42, 42));
        setLayout(null);
        setVisible(true);
        iniciarComponentes();
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
        
    }
    public void iniciarComponentes(){
        Archivo.obtenerDatos();
        
        JLabel copa = new JLabel();
        ImageIcon iconoCopa = new ImageIcon(getClass().getResource("/imagenes/Copa.png"));
        copa.setBounds(465,20, 70, 70);
        copa.setIcon(new ImageIcon(iconoCopa.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        add(copa);
        
        JLabel tituloCancion = new JLabel();
        tituloCancion.setBounds(275,110, 449, 60);
        tituloCancion.setForeground(Color.white);
        tituloCancion.setFont(new Font ("Bauhaus 93", Font.PLAIN, 50));
        
        JLabel tituloArtista = new JLabel();
        tituloArtista.setBounds(418,160, 163, 40);
        tituloArtista.setForeground(Color.white);
        tituloArtista.setFont(new Font ("Bauhaus 93", Font.PLAIN, 30));
        
        JLabel tituloCompletado = new JLabel(); 
        tituloCompletado.setBounds(305,500, 389, 40);
        tituloCompletado.setForeground(Color.white);
        tituloCompletado.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        
        JLabel Puntuaje = new JLabel();
        Puntuaje.setBounds(425,460, 150, 40);
        Puntuaje.setForeground(Color.white);
        Puntuaje.setFont(new Font ("Bauhaus 93", Font.PLAIN, 30));
        Puntuaje.setHorizontalAlignment(0);
        
        if(cancion == 1){
            tituloCancion.setText("My Heart Will Go On");
            tituloArtista.setText("Céline Dion");
            Puntuaje.setText(puntos);
            add(tituloCancion);
            add(tituloArtista);
            add(Puntuaje);
            
            portada = new JLabel();
            icono = new ImageIcon(getClass().getResource("/imagenes/cancion1.jpg"));
            portada.setBounds(400,215, 200, 200);
            portada.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
            add(portada);
            
            tituloCompletado.setText("Canción Completada");
            add(tituloCompletado);
        }
        if(cancion == 2){
            tituloCancion.setText("           Perfect");
            tituloArtista.setText("Ed Sheeran");
            Puntuaje.setText(puntos);
            add(tituloCancion);
            add(tituloArtista);
            add(Puntuaje);
            
            portada = new JLabel();
            icono = new ImageIcon(getClass().getResource("/imagenes/cancion2.jpg"));
            portada.setBounds(400,215, 200, 200);
            portada.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
            add(portada);
            
            tituloCompletado.setText("Canción Completada");
            add(tituloCompletado);
        }
        
        if(cancion == 3){
            tituloCancion.setText("Wednesday Addams");
            tituloArtista.setText("    Netflix");
            Puntuaje.setText(puntos);
            add(tituloCancion);
            add(tituloArtista);
            add(Puntuaje);
            
            portada = new JLabel();
            icono = new ImageIcon(getClass().getResource("/imagenes/cancion3.jpg"));
            portada.setBounds(400,215, 200, 200);
            portada.setIcon(new ImageIcon(icono.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
            add(portada);
            
            tituloCompletado.setText("Canción Completada");
            add(tituloCompletado);
        }
                
        btn_reintentar = new JLabel();
        iconoreintentar = new ImageIcon(getClass().getResource("/imagenes/btn_reintentar.png"));
        btn_reintentar.setBounds(430,550, 140, 40);
        btn_reintentar.setIcon(new ImageIcon(iconoreintentar.getImage().getScaledInstance(140, 40, Image.SCALE_SMOOTH)));
        btn_reintentar.addMouseListener(this);
        btn_reintentar.setCursor(new Cursor(HAND_CURSOR));
        add(btn_reintentar);
        
        btn_continuar = new JLabel();
        iconocontinuar = new ImageIcon(getClass().getResource("/imagenes/btn_continuar.png"));
        btn_continuar.setBounds(450,610, 100, 40);
        btn_continuar.setIcon(new ImageIcon(iconocontinuar.getImage().getScaledInstance(100, 40, Image.SCALE_SMOOTH)));
        btn_continuar.addMouseListener(this);
        btn_continuar.setCursor(new Cursor(HAND_CURSOR));
        add(btn_continuar);
        
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        int titanicPuntuaje = Integer.parseInt(puntos);
        int perfectPuntuaje = Integer.parseInt(puntos);
        
        int[] puntosX1={420, 416, 406, 413, 410, 420, 430, 427, 434, 424};
        int[] puntosY1={425, 435, 435, 443, 455, 449, 455, 443, 435, 435};
        
        int[] puntosX2={460, 456, 446, 453, 450, 460, 470, 467, 474, 464};
        int[] puntosY2={425, 435, 435, 443, 455, 449, 455, 443, 435, 435};
        
        int[] puntosX3={500, 496, 486, 493, 490, 500, 510, 507, 514, 504};
        int[] puntosY3={425, 435, 435, 443, 455, 449, 455, 443, 435, 435};
        
        int[] puntosX4={540, 536, 526, 533, 530, 540, 550, 547, 554, 544};
        int[] puntosY4={425, 435, 435, 443, 455, 449, 455, 443, 435, 435};
        
        int[] puntosX5={580, 576, 566, 573, 570, 580, 590, 587, 594, 584};
        int[] puntosY5={425, 435, 435, 443, 455, 449, 455, 443, 435, 435};
        
        g.setColor(Color.white);
        g.drawPolygon(puntosX1, puntosY1, 10);
        g.drawPolygon(puntosX2, puntosY2, 10);
        g.drawPolygon(puntosX3, puntosY3, 10);
        g.drawPolygon(puntosX4, puntosY4, 10);
        g.drawPolygon(puntosX5, puntosY5, 10);
        if(cancion==1){
            if((titanicPuntuaje>=2340)&&(titanicPuntuaje<=4680)){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
            }else if((titanicPuntuaje>=4680)&&(titanicPuntuaje<=7020)){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
                g.fillPolygon(puntosX2, puntosY2, 10);
            }else if((titanicPuntuaje>=7020)&&(titanicPuntuaje<=9360)){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
                g.fillPolygon(puntosX2, puntosY2, 10);
                g.fillPolygon(puntosX3, puntosY3, 10);
            }else if((titanicPuntuaje>=9360)&&(titanicPuntuaje<=11000)){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
                g.fillPolygon(puntosX2, puntosY2, 10);
                g.fillPolygon(puntosX3, puntosY3, 10);
                g.fillPolygon(puntosX4, puntosY4, 10);
            }else if(titanicPuntuaje>=11000){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
                g.fillPolygon(puntosX2, puntosY2, 10);
                g.fillPolygon(puntosX3, puntosY3, 10);
                g.fillPolygon(puntosX4, puntosY4, 10);
                g.fillPolygon(puntosX5, puntosY5, 10);
            } 
        }
        if(cancion==2){
            if((perfectPuntuaje>=2100)&&(perfectPuntuaje<=4200)){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
            }else if((perfectPuntuaje>=4200)&&(perfectPuntuaje<=6300)){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
                g.fillPolygon(puntosX2, puntosY2, 10);
            }else if((perfectPuntuaje>=6300)&&(perfectPuntuaje<=8400)){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
                g.fillPolygon(puntosX2, puntosY2, 10);
                g.fillPolygon(puntosX3, puntosY3, 10);
            }else if((perfectPuntuaje>=8400)&&(perfectPuntuaje<=10500)){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
                g.fillPolygon(puntosX2, puntosY2, 10);
                g.fillPolygon(puntosX3, puntosY3, 10);
                g.fillPolygon(puntosX4, puntosY4, 10);
            }else if(perfectPuntuaje>=10500){
                g.setColor(Color.yellow);
                g.fillPolygon(puntosX1, puntosY1, 10);
                g.fillPolygon(puntosX2, puntosY2, 10);
                g.fillPolygon(puntosX3, puntosY3, 10);
                g.fillPolygon(puntosX4, puntosY4, 10);
                g.fillPolygon(puntosX5, puntosY5, 10);
            } 
        }
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==btn_continuar){
            this.setVisible(false);
            principal.ventana.fondoImagen.setVisible(true);
            panelCanciones.setVisible(true);
            principal.ventana.fondoImagen.add(panelCanciones);
        }
        if((e.getSource()==btn_reintentar)&&(cancion == 1)){  
            this.setVisible(false);
            tablero1 = new Titanic();
            principal.ventana.add(tablero1);
            hilo=new Hilo(tablero1);
            hilo.start();
        }
        if((e.getSource()==btn_reintentar)&&(cancion == 2)){  
            this.setVisible(false);
            tablero2 = new Perfect();
            principal.ventana.add(tablero2);
            hilo=new Hilo(tablero2);
            hilo.start();
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