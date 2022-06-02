/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Triangulo;

/**
 *
 * @author Carlos
 */
public class Ventana extends JFrame implements MouseMotionListener,MouseWheelListener{

    private JLabel lblBase;
    private Container contenedorPpal;

    private JButton btnCancelar;

    public Ventana() {
        iniciarComponentes();
        setSize(600, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Área Triangulo");
    }

    private void iniciarComponentes() {
        lblBase = new JLabel("Base : ");
        lblBase.setBounds(300, 300, 50, 50);
        btnCancelar = new JButton("Nuevo");
    
        contenedorPpal = getContentPane();

        contenedorPpal.setLayout(null);

        contenedorPpal.add(lblBase);
       

     
        contenedorPpal.add(btnCancelar);
        contenedorPpal.addMouseMotionListener(this);
        //lblBase.addMouseMotionListener(this);
        contenedorPpal.addMouseWheelListener(this);
        

    }


    @Override
    public void mouseDragged(MouseEvent arg0) {
        if (arg0.getSource()==lblBase) {
            lblBase.setBounds(arg0.getX(), arg0.getY(), 50, 50);
        }
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        //System.out.println("x :"+arg0.getX()+ "    y: "+arg0.getY());    
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent arg0) {
        if (arg0.getSource()== contenedorPpal) {
            int y =lblBase.getY();
            int x =lblBase.getX();
            if (arg0.getPreciseWheelRotation()==1.0) {
                
                y+=10;
                lblBase.setBounds(x, y, 50, 50); 
            }else{
               y+=-10;
               lblBase.setBounds(x, y, 50, 50); 
            }
        }
    }
    
    }
    


