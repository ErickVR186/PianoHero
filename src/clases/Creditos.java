/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import principal.Principal;

/**
 *
 * @author Locos
 */
public class Creditos extends JPanel implements MouseListener{
    public JLabel atras;
    public ImageIcon iconoatras;
    public Principal principal;
    
    public Creditos(){
       
        //transparenciaImg2.getContentPane().setsetBackground(new Color(0,0,0,140));
        setBackground(Color.BLACK);
        setBounds(0,0, 1000, 700);
        setLayout(null);
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        
        atras = new JLabel();
        iconoatras = new ImageIcon(getClass().getResource("/imagenes/atras.png"));
        atras.setBounds(40,40, 50, 50);
        atras.setIcon(new ImageIcon(iconoatras.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        add(atras);
        atras.setCursor(new Cursor(HAND_CURSOR));
        atras.addMouseListener(this);
        
        JLabel titulo1 = new JLabel();
        titulo1.setText("Integrantes:");
        titulo1.setBounds(170,60, 700, 55);
        titulo1.setForeground(Color.white);
        titulo1.setFont(new Font ("OCR A Extended", Font.BOLD, 50));
        titulo1.setHorizontalAlignment(0);
        add(titulo1);
        
        JLabel nombre1 = new JLabel();
        nombre1.setText("Castillo Alcantara Liseth");
        nombre1.setBounds(170,140, 700, 35);
        nombre1.setForeground(Color.white);
        nombre1.setFont(new Font ("OCR A Extended", Font.BOLD, 30));
        nombre1.setHorizontalAlignment(0);
        add(nombre1);
              
        JLabel nombre2 = new JLabel();
        nombre2.setText("Hernandez Hernandez Brenda");
        nombre2.setBounds(170,240, 700, 35);
        nombre2.setForeground(Color.white);
        nombre2.setFont(new Font ("OCR A Extended", Font.BOLD, 30));
        nombre2.setHorizontalAlignment(0);
        add(nombre2);
        
        JLabel nombre3 = new JLabel();
        nombre3.setText("Perez Manilla Juan Daniel");
        nombre3.setBounds(170,340, 700, 35);
        nombre3.setForeground(Color.white);
        nombre3.setFont(new Font ("OCR A Extended", Font.BOLD, 30));
        nombre3.setHorizontalAlignment(0);
        add(nombre3);
        
        JLabel nombre4 = new JLabel();
        nombre4.setText("Vicente Romano Erick");
        nombre4.setBounds(170,440, 700, 35);
        nombre4.setForeground(Color.white);
        nombre4.setFont(new Font ("OCR A Extended", Font.BOLD, 30));
        nombre4.setHorizontalAlignment(0);
        add(nombre4);
        
        JLabel nombre5 = new JLabel();
        nombre5.setText("Vidal Ramirez Laura Amairani");
        nombre5.setBounds(170,540, 700, 35);
        nombre5.setForeground(Color.white);
        nombre5.setFont(new Font ("OCR A Extended", Font.BOLD, 30));
        nombre5.setHorizontalAlignment(0);
        add(nombre5);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==atras){
            //mensaje.showMessageDialog(null, "atras");
            this.setVisible(false);
            principal.ventana.fondoImagen.setVisible(true);
            principal.ventana.panelInicio.setVisible(true);
        }
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
