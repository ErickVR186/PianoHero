/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import canciones.Titanic;
import clases.Inicio;
import clases.Ventana;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Principal {
    public static Ventana ventana;
    public static Inicio panelInicio;
    
    public static void main(String[] args) {
       ventana = new Ventana();                                //Se crea la ventana
       ventana.setVisible(true);                                       //Se habilita la ventana 
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         //Dale x se cierra la ventana
    }
}
