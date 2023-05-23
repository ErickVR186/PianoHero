/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Locos
 */
public class seleccionadorMenu {
    private int x, y;
    static final int ANCHO = 200, ALTO = 45;
    
    public seleccionadorMenu (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public RoundRectangle2D getSelector(){
        return new RoundRectangle2D.Double(x, y, ANCHO, ALTO, 10,10);
    }
    
    public void moverSelector(Rectangle limites){
        if(EventoTeclado.UP){
            y=y-100;
        }
        if(EventoTeclado.DOWN){
            y=y+100;
        }
    }

    
}
