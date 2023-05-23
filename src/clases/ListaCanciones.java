package clases;

import canciones.Perfect;
import canciones.Titanic;
import canciones.Wednesday;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import principal.Principal;

public class ListaCanciones extends JPanel implements ActionListener, MouseListener{
    
    public JLabel portada, atras, prev, next, playCancion_1, playCancion_2, 
            playCancion_3,
            titCancion1,artCancion1, titCancion2, artCancion2, titCancion3, 
            artCancion3, elemPuntuaje_1, 
            elemPuntuaje_2, elemPuntuaje_3;
    public ImageIcon icono, iconoatras, iconoprev, icononext, iconoplayC1, 
            iconoplayC2, iconoplayC3;
    int contador = 1;

    public Inicio inicio;
    public Principal principal;
    public Titanic tablero1;
    public Perfect tablero2;
    public Wednesday tablero3;
    public BaseDeDatos BaseDeDatos;
    private Hilo hilo;
    
    BaseDeDatos Archivo  = new BaseDeDatos();
    
    public ListaCanciones(){
        setOpaque(false);
        
        setBackground(new Color(0,0,0,140));
        setBounds(0,0, 1000, 700);
        setLayout(null); 
        iniciarComponentes();
        
    }
    
    //Agregar elementos al panel
    public void iniciarComponentes(){
        Archivo.crearArchivo();
        Archivo.obtenerDatos();
        
        atras = new JLabel();
        iconoatras = new ImageIcon(getClass().getResource("/imagenes/atras.png"));
        atras.setBounds(40,40, 50, 50);
        atras.setIcon(new ImageIcon(iconoatras.getImage().getScaledInstance
        (50, 50, Image.SCALE_SMOOTH)));
        atras.setCursor(new Cursor(HAND_CURSOR));
        atras.addMouseListener(this);
        //Cancion_1
        titCancion1 = new JLabel();
        titCancion1.setText("My Heart Will Go On");
        titCancion1.setBounds(319,50, 400, 40);
        titCancion1.setForeground(Color.white);
        titCancion1.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        
        artCancion1 = new JLabel();
        artCancion1.setText("Céline Dion");
        artCancion1.setBounds(389,100, 400, 40);
        artCancion1.setForeground(Color.white);
        artCancion1.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        
        elemPuntuaje_1 = new JLabel();
        elemPuntuaje_1.setText(Archivo.getTitanicPuntuaje());
        elemPuntuaje_1.setBounds(425,500, 150, 40);
        elemPuntuaje_1.setForeground(Color.white);
        elemPuntuaje_1.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        elemPuntuaje_1.setHorizontalAlignment(0);
        
        playCancion_1 = new JLabel();
        iconoplayC1 = new ImageIcon(getClass().getResource("/imagenes/play.png"));
        playCancion_1.setBounds(465,540, 70, 70);
        playCancion_1.setIcon(new ImageIcon(iconoplayC1.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        playCancion_1.setCursor(new Cursor(HAND_CURSOR));
        playCancion_1.addMouseListener(this);
        
        //Cancion_2
        titCancion2 = new JLabel();
        titCancion2.setText("Perfect");
        titCancion2.setBounds(430,50, 400, 40);
        titCancion2.setForeground(Color.white);
        titCancion2.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        
        artCancion2 = new JLabel();
        artCancion2.setText(" Ed Sheeran");
        artCancion2.setBounds(404,100, 400, 40);
        artCancion2.setForeground(Color.white);
        artCancion2.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        
        elemPuntuaje_2 = new JLabel();
        elemPuntuaje_2.setText(Archivo.getPerfectPuntuaje());
        elemPuntuaje_2.setBounds(425,500, 150, 40);
        elemPuntuaje_2.setForeground(Color.white);
        elemPuntuaje_2.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        elemPuntuaje_2.setHorizontalAlignment(0);
        
        playCancion_2 = new JLabel();
        iconoplayC2 = new ImageIcon(getClass().getResource("/imagenes/play.png"));
        playCancion_2.setBounds(465,540, 70, 70);
        playCancion_2.setIcon(new ImageIcon(iconoplayC2.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        playCancion_2.setCursor(new Cursor(HAND_CURSOR));
        playCancion_2.addMouseListener(this);
        
        //Cancion_3
        titCancion3 = new JLabel();
        titCancion3.setText("Wednesday Addams");
        titCancion3.setBounds(350,50, 400, 40);
        titCancion3.setForeground(Color.white);
        titCancion3.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        
        artCancion3 = new JLabel();
        artCancion3.setText("Netflix");
        artCancion3.setBounds(454,100, 400, 40);
        artCancion3.setForeground(Color.white);
        artCancion3.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        
        elemPuntuaje_3 = new JLabel();
        elemPuntuaje_3.setText(Archivo.getWednesdayPuntuaje());
        elemPuntuaje_3.setBounds(425,500, 150, 40);
        elemPuntuaje_3.setForeground(Color.white);
        elemPuntuaje_3.setFont(new Font ("Bauhaus 93", Font.PLAIN, 40));
        elemPuntuaje_3.setHorizontalAlignment(0);
                
        playCancion_3 = new JLabel();
        iconoplayC3 = new ImageIcon(getClass().getResource("/imagenes/play.png"));
        playCancion_3.setBounds(465,540, 70, 70);
        playCancion_3.setIcon(new ImageIcon(iconoplayC3.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        playCancion_3.setCursor(new Cursor(HAND_CURSOR));
        playCancion_3.addMouseListener(this);
                
        prev = new JLabel();
        iconoprev = new ImageIcon(getClass().getResource("/imagenes/anterior.png"));
        prev.setBounds(50,310, 60, 60);
        prev.setIcon(new ImageIcon(iconoprev.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH)));
        prev.setCursor(new Cursor(HAND_CURSOR));
        prev.addMouseListener(this);


        portada = new JLabel();
        icono = new ImageIcon(getClass().getResource("/imagenes/cancion1.jpg"));
        portada.setBounds(350,150, 300, 300);
        portada.setIcon(new ImageIcon(icono.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));

        next = new JLabel();
        icononext = new ImageIcon(getClass().getResource("/imagenes/siguiente.png"));
        next.setBounds(880,310, 60, 60);
        next.setIcon(new ImageIcon(icononext.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH)));
        next.setCursor(new Cursor(HAND_CURSOR));
        next.addMouseListener(this);

        add(prev);
        add(portada);
        add(next);
        add(atras);
    }
    public void paint(Graphics g){
        super.paint(g);
        int titanicPuntuaje = Integer.parseInt(Archivo.getTitanicPuntuaje());
        int perfectPuntuaje = Integer.parseInt(Archivo.getPerfectPuntuaje());
        
        int[] puntosX1={420, 416, 406, 413, 410, 420, 430, 427, 434, 424};
        int[] puntosY1={460, 470, 470, 478, 490, 484, 490, 478, 470, 470};
        
        int[] puntosX2={460, 456, 446, 453, 450, 460, 470, 467, 474, 464};
        int[] puntosY2={460, 470, 470, 478, 490, 484, 490, 478, 470, 470};
        
        int[] puntosX3={500, 496, 486, 493, 490, 500, 510, 507, 514, 504};
        int[] puntosY3={460, 470, 470, 478, 490, 484, 490, 478, 470, 470};
        
        int[] puntosX4={540, 536, 526, 533, 530, 540, 550, 547, 554, 544};
        int[] puntosY4={460, 470, 470, 478, 490, 484, 490, 478, 470, 470};
        
        int[] puntosX5={580, 576, 566, 573, 570, 580, 590, 587, 594, 584};
        int[] puntosY5={460, 470, 470, 478, 490, 484, 490, 478, 470, 470};
        
        g.setColor(Color.white);
        g.drawPolygon(puntosX1, puntosY1, 10);
        g.drawPolygon(puntosX2, puntosY2, 10);
        g.drawPolygon(puntosX3, puntosY3, 10);
        g.drawPolygon(puntosX4, puntosY4, 10);
        g.drawPolygon(puntosX5, puntosY5, 10);
        if(contador==1){
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
        if(contador==2){
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
    public void titulos (){
        if(contador==1){
            titCancion2.setVisible(false);
            artCancion2.setVisible(false);
            elemPuntuaje_2.setVisible(false);
            playCancion_2.setVisible(false);
            titCancion3.setVisible(false);
            artCancion3.setVisible(false);
            elemPuntuaje_3.setVisible(false);
            playCancion_3.setVisible(false);
            titCancion1.setVisible(true);
            add(titCancion1);
            artCancion1.setVisible(true);
            add(artCancion1);
            elemPuntuaje_1.setVisible(true);
            add(elemPuntuaje_1);
            playCancion_1.setVisible(true);
            add(playCancion_1);     
        }
        if(contador==2){
            titCancion1.setVisible(false);
            artCancion1.setVisible(false);
            elemPuntuaje_1.setVisible(false);
            playCancion_1.setVisible(false);
            titCancion3.setVisible(false);
            artCancion3.setVisible(false);
            elemPuntuaje_3.setVisible(false);
            playCancion_3.setVisible(false);
            titCancion2.setVisible(true);
            add(titCancion2);
            artCancion2.setVisible(true);
            add(artCancion2);
            elemPuntuaje_2.setVisible(true);
            add(elemPuntuaje_2);
            playCancion_2.setVisible(true);
            add(playCancion_2); 
            
        }
        if(contador==3){
            titCancion1.setVisible(false);
            artCancion1.setVisible(false);
            elemPuntuaje_1.setVisible(false);
            playCancion_1.setVisible(false);
            titCancion2.setVisible(false);
            artCancion2.setVisible(false);
            elemPuntuaje_2.setVisible(false);
            playCancion_2.setVisible(false);
            titCancion3.setVisible(true);
            add(titCancion3);
            artCancion3.setVisible(true);
            add(artCancion3);
            elemPuntuaje_3.setVisible(true);
            add(elemPuntuaje_3);
            playCancion_3.setVisible(true);
            add(playCancion_3); 
        }
    }
    
    //Metodos para escuchar al boton o elementos(etiquetas,etc) y Mouse
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
        
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==atras){
            //mensaje.showMessageDialog(null, "atras");
            this.setVisible(false);
            principal.ventana.panelInicio.setVisible(true);
        }
        if(e.getSource()==next){
            if(contador >=3){//3
                contador = 1;
            }else{
                contador++; 
            }
            
        }
        if(e.getSource() == prev){
            if(contador <=1){
                contador =3;//3
            }else{
                contador--;
            }
        }
        if(e.getSource()==playCancion_1){
            this.setVisible(false);
            principal.ventana.fondoImagen.setVisible(false);
            tablero1 = new Titanic();
            principal.ventana.add(tablero1);
            hilo=new Hilo(tablero1);
            hilo.start();
        }
        if(e.getSource()==playCancion_2){
            this.setVisible(false);
            principal.ventana.fondoImagen.setVisible(false);
            tablero2 = new Perfect();
            principal.ventana.add(tablero2);
            hilo=new Hilo(tablero2);
            hilo.start();
        }
        if(e.getSource()==playCancion_3){
            this.setVisible(false);
            principal.ventana.fondoImagen.setVisible(false);
            tablero3 = new Wednesday();
            principal.ventana.add(tablero3);
            hilo=new Hilo(tablero3);
            hilo.start();
        }
        icono = new ImageIcon(getClass().getResource("/imagenes/cancion"+contador+".jpg"));
        portada.setIcon(new ImageIcon(icono.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
        titulos();
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
