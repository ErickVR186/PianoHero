/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D;

public class Teclas {
    private int x;
    private int y;
    private int ALTO;
    private final int ANCHO=88;
    
    public Teclas(int x, int y, int ALTO){
        this.x=x;
        this.y=y;
        this.ALTO=ALTO;
    }
    public RoundRectangle2D getNotas(){
      return new RoundRectangle2D.Double(x, y, ANCHO, ALTO,15,15);
    }
}
