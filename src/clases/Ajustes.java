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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.*;

import principal.Principal;

import com.fazecast.jSerialComm.SerialPort;

/**
 *
 * @author Locos
 */
public class Ajustes extends JPanel implements ActionListener, MouseListener, ItemListener{
    
    public JLabel conectar, musica, botonConectar, botonCerrar;
    public JCheckBox veriMusic;
    public ImageIcon iconoConectar, iconoCerrar;
    private JComboBox<String> combo1;
    
    public Principal principal;
    
    
    Thread hilo;
    public static boolean valorC;
    public static String valorTecla;
    private static EventoTeclado conexion = new EventoTeclado();
    
    
    
    
    public Ajustes(){
        setOpaque(false);
        //transparenciaImg2.getContentPane().setsetBackground(new Color(0,0,0,140));
        setBackground(new Color(0,0,0,140));
        setBounds(0,0, 1000, 700);
        setLayout(null);
        iniciarComponentes();
        
        PopupMenuListener listener = new PopupMenuListener() {
      boolean initialized = false;

      public void popupMenuCanceled(PopupMenuEvent e) {
      }

      public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
      }

      public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        combo1.removeAllItems();
        SerialPort []portLists = SerialPort.getCommPorts();
        for(SerialPort port : portLists){
            combo1.addItem(port.getSystemPortName());
        }
      }
    };
        combo1.addPopupMenuListener(listener);
        /*
        String[] puertos = conexion.obtenerLista().split(",");
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for(int x=0; x<puertos.length; x++){
            modelo.addElement(puertos[x]);
        }
        combo1.setModel(modelo);*/
    }
    
    
    //Agregar elementos al panel
    public void iniciarComponentes(){
        combo1=new JComboBox<String>();
        combo1.setBounds(250,150,250,50);
        combo1.setFont(new Font("Arial", 1,29));
        add(combo1);
        combo1.addItemListener(this);
        
        botonConectar = new JLabel();
        iconoConectar = new ImageIcon(getClass().getResource("/imagenes/botonConectar.png"));
        botonConectar.setBounds(588,150, 150, 50);
        botonConectar.setIcon(new ImageIcon(iconoConectar.getImage().getScaledInstance(150, 50, Image.SCALE_SMOOTH)));
        botonConectar.setCursor(new Cursor(HAND_CURSOR));
        botonConectar.addMouseListener(this);
        botonConectar.setVisible(true);
        add(botonConectar);
        
        veriMusic =new JCheckBox("Musica");
        veriMusic.setFont(new Font("Arial", 1,22));
        veriMusic.setForeground(Color.white);
        veriMusic.setBounds(250,300,150,50);
        veriMusic.setOpaque(false);
        
        if((Titanic.checkMusica == true)||(Perfect.checkMusica == true)){
            veriMusic.setSelected(true);
        }else{
            veriMusic.setSelected(false);
        }
        veriMusic.setBackground(new Color(0,0,0,0));
        add(veriMusic);
        //veriMusic.addChangeListener(this);
        
        
        botonCerrar = new JLabel();
        iconoCerrar = new ImageIcon(getClass().getResource("/imagenes/cerrarAjustes.png"));
        botonCerrar.setBounds(430,450, 130, 50);
        botonCerrar.setIcon(new ImageIcon(iconoCerrar.getImage().getScaledInstance(130, 50, Image.SCALE_SMOOTH)));
        botonCerrar.setCursor(new Cursor(HAND_CURSOR));
        botonCerrar.addMouseListener(this);
        botonCerrar.setVisible(true);
        add(botonCerrar);
        
    }
    
    public void validarSeleccion(){
        if(veriMusic.isSelected()){
           Titanic.checkMusica =true;
           Perfect.checkMusica =true;
           
        }else{
           Titanic.checkMusica =false;
           Perfect.checkMusica =false;
        }
    }
        
    //Teclado
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    //Mouse
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==botonCerrar){
            //JOptionPane.showMessageDialog(null, "atras");
            
            validarSeleccion();
            
            
            this.setVisible(false);     
            Inicio panelInicio = new Inicio();
            panelInicio.setVisible(true);
            principal.ventana.fondoImagen.add(panelInicio);
            
        }
        if(e.getSource()==botonConectar){
            conexion.conectar(combo1.getSelectedItem().toString());
            Icon Icono = new ImageIcon(getClass().getResource("/imagenes/check.png"));
            JOptionPane.showMessageDialog(null, "Piano conectado", "Mensaje de Advertencia", JOptionPane.INFORMATION_MESSAGE,Icono);
            //JOptionPane.showMessageDialog(null, "Piano Conectado");
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
    
    //ComboBox
    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }

    

    
}
