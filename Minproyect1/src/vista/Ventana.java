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
import javax.swing.ImageIcon;
import javax.swing.JTextField;
/**
 *
 * @author sandr
 */


public class Ventana extends JFrame {
    
    private JButton botonTextClose = new JButton();
    private JButton botonJugar = new JButton();
    private JButton botonInst = new JButton();
    private JButton botonGuardar = new JButton();
    private JPanel panelFondo = new JPanel();
    private JPanel panelCentral = new JPanel();
    private JTextArea instruccionesText = new JTextArea();
    private JLabel imagenFondo1 = new JLabel();
    private JLabel imagenFondo2 = new JLabel();
    private JLabel etiquetaTitulo = new JLabel();
    private JLabel nombre = new JLabel();
    private JTextField textNombre = new JTextField();

    
    public Ventana(){
        
    
       this.setSize (640,500);
       this.setTitle("Tamaños");
       setLocationRelativeTo(null);
       setResizable(false);
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       this.getContentPane().add(panelFondo);
       configurarFondo();
       
    }
    
    private void configurarFondo(){
          
          panelFondo.setLayout(null);
          etiquetaTitulo.setVisible(true);
          etiquetaTitulo.setBounds(0, 0, 640, 40);
          etiquetaTitulo.setFont(new Font("tahoma",Font.ITALIC,25));
          etiquetaTitulo.setText("¡¡PRESIONA UN BOTON!!");
          etiquetaTitulo.setForeground(Color.black); 
          etiquetaTitulo.setOpaque(true);
          etiquetaTitulo.setBackground(new Color (86 , 255 , 224));
          etiquetaTitulo.setHorizontalAlignment(SwingConstants.CENTER);
          panelFondo.setBackground(new Color (172 , 255 , 240));
          panelFondo.add(etiquetaTitulo);
          
          
          String instText = "MIRA LA FIGURA QUE ESTA A LA\n" 
                  + "IZQUIERDA Y LUEGO ESCOGE DE LAS\n"
                  + "TRES QUE TE DAMOS LA QUE TIENE\n"
                  + "EL MISMO TAMAÑO.";
          
          instruccionesText.setText(instText);
          instruccionesText.setBackground(new Color (128 , 255 , 232));
          instruccionesText.setFont(new Font("arial",0,25));
          instruccionesText.setBounds(80, 140, 470, 130);
          instruccionesText.setEditable(false);
          panelFondo.add(instruccionesText);
          instruccionesText.setVisible(false);
          
          nombre.setVisible(false);
          nombre.setBounds(0, 0, 130, 40);
          nombre.setFont(new Font("tahoma",Font.ITALIC,15));
          nombre.setText("NOMBRE");
          nombre.setForeground(Color.black); 
          nombre.setOpaque(true);
          nombre.setBackground(new Color (86 , 255 , 224));
          nombre.setHorizontalAlignment(SwingConstants.LEFT);
          panelFondo.add(nombre);
          
          textNombre.setVisible(false);
          textNombre.setBounds(130, 0, 130, 40);
          panelFondo.add(textNombre); 
          
          botonJugar.setVisible(true);
          botonJugar.setBounds(255, 150, 150, 50);
          botonJugar.setFont(new Font("arial",0,17));
          botonJugar.setText("JUGAR");
          botonJugar.setForeground(new Color (7 , 62 , 124)); 
          botonJugar.setBackground(new Color (9 , 255 , 211));
          botonJugar.setHorizontalAlignment(SwingConstants.CENTER);
          botonJugar.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
                 botonGuardar.setVisible(true);
                 nombre.setVisible(true);
                 textNombre.setVisible(true);
                 botonJugar.setVisible(false);
                 etiquetaTitulo.setVisible(false);
                 botonInst.setVisible(false);
                 imagenFondo1.setVisible(false);
              }
          });
          panelFondo.add(botonJugar);
          
          
          botonInst.setVisible(true);
          botonInst.setBounds(255, 250, 150, 50);
          botonInst.setFont(new Font("arial",0,13));
          botonInst.setText("INSTRUCCIONES");
          botonInst.setForeground(new Color (7 , 62 , 124));  
          botonInst.setBackground(new Color (9 , 255 , 211));
          botonInst.setHorizontalAlignment(SwingConstants.CENTER);
          botonInst.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
                 imagenFondo1.setVisible(false);
                 imagenFondo2.setVisible(true); 
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
          botonTextClose.setForeground(new Color (7 , 62 , 124)); 
          botonTextClose.setBackground(new Color (9 , 255 , 211));
          botonTextClose.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
                 imagenFondo1.setVisible(true);
                 imagenFondo2.setVisible(false); 
                 instruccionesText.setVisible(false);
                 botonTextClose.setVisible(false);
                 botonJugar.setVisible(true);
                 etiquetaTitulo.setVisible(true);
                 botonInst.setVisible(true);
              }
          });
          panelFondo.add(botonTextClose);
          
          
          botonGuardar.setVisible(false);
          botonGuardar.setBounds(420, 400, 200, 50);
          botonGuardar.setFont(new Font("arial",0,15));
          botonGuardar.setText("GUARDAR");
          botonGuardar.setForeground(new Color (7 , 62 , 124)); 
          botonGuardar.setBackground(new Color (9 , 255 , 211));
          botonGuardar.addActionListener(new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
                 imagenFondo1.setVisible(false);
                 botonJugar.setVisible(false);
                 etiquetaTitulo.setVisible(false);
                 botonInst.setVisible(false);
                 botonGuardar.setVisible(false);
                 nombre.setVisible(false);
                 textNombre.setVisible(false);
              }
          });
          panelFondo.add(botonGuardar);
          
          imagenFondo1.setVisible(true);
          imagenFondo1.setIcon(new ImageIcon(getClass().getResource("/imagenes/fondo1.png")));
          imagenFondo1.setBounds(3,3,625,480);
          imagenFondo1.setHorizontalAlignment(SwingConstants.CENTER);
          panelFondo.add(imagenFondo1);
          
          imagenFondo2.setVisible(false);
          imagenFondo2.setIcon(new ImageIcon(getClass().getResource("/imagenes/fondo2.png")));
          imagenFondo2.setBounds(3,3,625,480);
          imagenFondo2.setHorizontalAlignment(SwingConstants.CENTER);
          panelFondo.add(imagenFondo2);

          
          
          
          
          
          
          
        
        
    }
    
   
    
}
