/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelFondo extends JPanel{
    //Instanciar objetos 
    private Image imagen;
    
    public PanelFondo(){
        
    }
    //Metodo para el fondo con imagen del JPanel       
    public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/imagenes/FondoMenu.jpeg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
