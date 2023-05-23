/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

//import static clases.EventoTeclado.conexionArduino;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import clases.Ventana;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Graphics2D;
import principal.Principal;

public class Inicio extends JPanel implements ActionListener, MouseListener{
    //Instanciar objetos 
    private Image imagen;
    public ImageIcon iconoConexion, iconoCreditos;
    public JLabel conexion, salir, play, ajustes, creditos;
    //public JButton salir, play, ajustes;  
    public Principal principal;
    public ListaCanciones panelCanciones;
    public Ajustes configuracion;
   
    
    
    
    seleccionadorMenu Selector1 = new seleccionadorMenu(400,347);
    seleccionadorMenu Selector2 = new seleccionadorMenu(400,447);
    seleccionadorMenu Selector3 = new seleccionadorMenu(400,547);
    
    //Metodo Principal constructor
    public Inicio(){
        //Panel donde se colocan todos los elementos
        setBackground(new Color(0,0,0,140));
        setBounds(0,0, 1000, 700);
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
        
        configuracion = new Ajustes(){
            @Override
            protected void paintComponent(Graphics g)
            {
                g.setColor( getBackground() );
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        };
        configuracion.setVisible(false); 
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(79, 114, 255));
        dibujar(g2);
    }
    
    public void dibujar(Graphics2D g){
        g.fill(Selector1.getSelector());
        g.fill(Selector2.getSelector());
        g.fill(Selector3.getSelector());
    }
   
    
    
    //Agregar elementos al panel
    public void iniciarComponentes(){      
        //Titulo Principal
        JLabel titulo1 = new JLabel();
        titulo1.setText("PIANO HERO");
        titulo1.setBounds(170,100, 700, 150);
        titulo1.setForeground(Color.white);
        titulo1.setFont(new Font ("OCR A Extended", Font.BOLD, 100));
        add(titulo1);
        /*//Titulo Principal2----Forte
        JLabel titulo2 = new JLabel();
        titulo2.setText("Hero");
        titulo2.setBounds(239,160, 400, 150);
        titulo2.setForeground(Color.white);
        titulo2.setFont(new Font ("Bauhaus 93", Font.PLAIN, 80));
        add(titulo2);*/
        
        //Botones
        /*play = new JButton();
        play.setText("JUGAR");
        play.setBounds(700,350, 100, 40);
        add(play);
        play.addActionListener(this);*/
        
        play = new JLabel();
        play.setText("PLAY");
        play.setFont(new Font("Algerian", 1,36));
        play.setForeground(Color.white);
        play.setBounds(450,350, 100, 40);
        add(play);
        play.addMouseListener(this);
        play.setCursor(new Cursor(HAND_CURSOR));
        
        
        /*ajustes = new JButton();
        ajustes.setText("AJUSTES");
        ajustes.setBounds(700,450, 100, 40);
        add(ajustes);
        ajustes.addActionListener(this);*/
        
        ajustes = new JLabel();
        ajustes.setText("AJUSTES");
        ajustes.setFont(new Font("Algerian", 1,36));
        ajustes.setForeground(Color.white);
        ajustes.setBounds(420,450, 200, 40);
        add(ajustes);
        ajustes.addMouseListener(this);
        ajustes.setCursor(new Cursor(HAND_CURSOR));
        
        /* = new JButton();
        salir.setText("SALIR");
        salir.setBounds(700,550, 100, 40);
        add(salir);
        salir.addActionListener(this);*/
        
        salir = new JLabel();
        salir.setText("SALIR");
        salir.setFont(new Font("Algerian", 1,36));
        salir.setForeground(Color.white);
        salir.setBounds(450,550, 150, 40);
        add(salir);
        salir.addMouseListener(this);
        salir.setCursor(new Cursor(HAND_CURSOR));
        
        conexion = new JLabel();
        iconoConexion = new ImageIcon(getClass().getResource("/imagenes/mando_1.png"));
        conexion.setBounds(930,2, 50, 50);
        conexion.setIcon(new ImageIcon(iconoConexion.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))); 
        add(conexion);    
        
        creditos = new JLabel();
        iconoCreditos = new ImageIcon(getClass().getResource("/imagenes/creditos.png"));
        creditos.setBounds(10,610, 50, 50);
        creditos.setIcon(new ImageIcon(iconoCreditos.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))); 
        add(creditos); 
        creditos.addMouseListener(this);
        creditos.setCursor(new Cursor(HAND_CURSOR));
        
        if(EventoTeclado.conexionArduino == true){
            iconoConexion = new ImageIcon(getClass().getResource("/imagenes/mando_1.png"));
            conexion.setIcon(new ImageIcon(iconoConexion.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        }else if(EventoTeclado.conexionArduino == false){
            iconoConexion = new ImageIcon(getClass().getResource("/imagenes/mando_2.png"));
            conexion.setIcon(new ImageIcon(iconoConexion.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        }
        
    }
 
    //Metodos para escuchar al teclado y Mouse
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==salir){
            System.exit(0);
        }
        if(e.getSource()==play){
           this.setVisible(false);     
            panelCanciones.setVisible(true);
            principal.ventana.fondoImagen.add(panelCanciones);
            //principal.ventana.panelCanciones.setVisible(true);
        }
        if(e.getSource()==ajustes){
           this.setVisible(false);     
           configuracion.setVisible(true);
           principal.ventana.fondoImagen.add(configuracion);
            //principal.ventana.panelCanciones.setVisible(true);
        }
        if(e.getSource()==creditos){
           this.setVisible(false);     
           principal.ventana.fondoImagen.setVisible(false);
           Creditos credit = new Creditos();
           credit.setVisible(true);
           principal.ventana.add(credit);
            //principal.ventana.panelCanciones.setVisible(true);
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
