/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import static java.awt.Label.CENTER;
/**
 *
 * @author sandr
 */


public class Ventana extends JFrame {
    
    private JButton botonTextClose = new JButton();
    private JButton botonJugar = new JButton();
    private JButton botonInst = new JButton();
    private JPanel panelFondo = new JPanel();
    private JPanel panelCentral = new JPanel();
    private JLabel etiquetaTitulo;
    private JTextArea instruccionesText = new JTextArea();
    
    
    public Ventana(){
        this.etiquetaTitulo = new JLabel();
    
       this.setSize (640,500);
       this.setTitle("Tamaños");
       setLocationRelativeTo(null);
       setResizable(false);
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       this.getContentPane().add(panelFondo);
       configurarFondo();
       
    }
    
    private void configurarFondo(){
          
         // panelFondo.setLayout(new GridLayout(2 , 2));
          panelFondo.setLayout(null);
          etiquetaTitulo.setVisible(true);
          etiquetaTitulo.setBounds(0, 0, 640, 40);
          etiquetaTitulo.setFont(new Font("tahoma",Font.ITALIC,25));
          etiquetaTitulo.setText("¡¡PRESIONA UN BOTON!!");
          etiquetaTitulo.setForeground(Color.white); 
          etiquetaTitulo.setOpaque(true);
          etiquetaTitulo.setBackground(Color.magenta);
          etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
          panelFondo.setBackground(Color.pink);
          panelFondo.add(etiquetaTitulo);

          
          botonJugar.setVisible(true);
          botonJugar.setBounds(255, 150, 150, 50);
          botonJugar.setFont(new Font("arial",0,17));
          botonJugar.setText("JUGAR");
          botonJugar.setForeground(Color.blue); 
          //etiquetaTitulo.setOpaque(true);
          botonJugar.setBackground(Color.cyan);
          botonJugar.setHorizontalAlignment(SwingConstants.CENTER);
         /* botonJugar.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
                  System.out.println("text");
                 instruccionesText.setVisible(true);
                 botonTextClose.setVisible(true);
              }
          });*/
          panelFondo.add(botonJugar);
          
          
          botonInst.setVisible(true);
          botonInst.setBounds(255, 250, 150, 50);
          botonInst.setFont(new Font("arial",0,13));
          botonInst.setText("INSTRUCCIONES");
          botonInst.setForeground(Color.blue); 
          //etiquetaTitulo.setOpaque(true);
          botonInst.setBackground(Color.cyan);
          botonInst.setHorizontalAlignment(SwingConstants.CENTER);
          botonInst.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
                 
                 instruccionesText.setVisible(true);
                 botonTextClose.setVisible(true);
                 botonJugar.setVisible(false);
                 etiquetaTitulo.setVisible(false);
                 botonInst.setVisible(false);
              }
          });
          panelFondo.add(botonInst);
          
          botonTextClose.setVisible(false);
          botonTextClose.setBounds(420, 400, 200, 50);
          botonTextClose.setFont(new Font("arial",0,15));
          botonTextClose.setText("Volver inicio");
          botonTextClose.setForeground(Color.blue); 
          //etiquetaTitulo.setOpaque(true);
          botonTextClose.setBackground(Color.cyan);
          botonTextClose.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
                  
                 instruccionesText.setVisible(false);
                 botonTextClose.setVisible(false);
                 botonJugar.setVisible(true);
                 etiquetaTitulo.setVisible(true);
                 botonInst.setVisible(true);
              }
          });
          panelFondo.add(botonTextClose);
          
          
          String instText = "MIRA LA FIGURA QUE ESTA A LA\n" 
                  + "IZQUIERDA Y LUEGO ESCOGE DE LAS\n"
                  + "TRES QUE TE DAMOS LA QUE TIENE\n"
                  + "EL MISMO TAMAÑO.";
          
          instruccionesText.setText(instText);
          instruccionesText.setBackground(Color.pink);
          instruccionesText.setFont(new Font("arial",0,25));
          instruccionesText.setBounds(80, 150, 500, 500);
          instruccionesText.setEditable(false);
          panelFondo.add(instruccionesText);
          instruccionesText.setVisible(false);
        
        
    }
    
   
    
}
