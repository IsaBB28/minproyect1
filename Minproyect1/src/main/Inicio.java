/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author sandr
 */

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;     

 class Inicio extends javax.swing.JFrame {
    
    private JLabel etiquetaTitulo;
    private JButton botonJugar;
    private JButton botonInstrucciones;
    private JPanel panelSuperior;
    private JPanel panelCentral;
    private JDesktopPane jDesktopPane;
    
    public void display1() {
  
    
     initComponents();
    
        add(panelCentral);
        add(panelSuperior, java.awt.BorderLayout.PAGE_START);
        add(jDesktopPane);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    /*System.out.println("prueba panel");*/
     }
    
    
    private void initComponents(){
    System.out.println("ingresando a init components");
    
        etiquetaTitulo = new JLabel();
        etiquetaTitulo.setFont(new java.awt.Font("tahoma", 0,35)); 
        etiquetaTitulo.setText("¡TAMAÑOS!");
        
        botonJugar = new JButton();
        botonJugar.setFont(new java.awt.Font("tahoma", 0,36)); 
        botonJugar.setText("JUGAR");
        botonJugar.setBounds(80, 0, 200, 150);
        botonInstrucciones = new JButton();
        botonInstrucciones.setFont(new java.awt.Font("tahoma", 0,36)); 
        botonInstrucciones.setText("INSTRUCCIONES");
        botonInstrucciones.setBounds(50, 0, 170, 120);
        
        panelSuperior = new JPanel();
        panelSuperior.setBackground(new java.awt.Color(204, 204, 0));
        panelSuperior.add(etiquetaTitulo);
        
        panelCentral = new JPanel();
        panelCentral.setBackground(new java.awt.Color(102, 102, 0));
        panelCentral.setLayout(null);
        panelCentral.add(botonJugar);
        panelCentral.add(botonInstrucciones);
        
        jDesktopPane = new JDesktopPane();
        
        //panelCentral.setLayout(new java.awt.BorderLayout());
        
        panelCentral.setLayout(new java.awt.BorderLayout(3,3));
        panelCentral.add(jDesktopPane,java.awt.BorderLayout.CENTER);
        
    }
    
    
}
