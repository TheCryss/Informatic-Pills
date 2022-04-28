/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;
import java.awt.Color;
import javax.swing.*;
import modelo.Contador;
import java.awt.*;
/**
 *
 * @author invitado
 */
public class VentanaContador extends JFrame {
    private JLabel lblBotonX;
    private JLabel lblvalorInicial;
    private JTextField txtContador;
    private Container contenedorPpal;
    //
    public VentanaContador()
    {
        iniciarComponentes();
        setSize(350,150);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Contador X");
    }
    private void iniciarComponentes()
    {
        lblvalorInicial = new JLabel("Valor en que inicia la Cuenta");
        lblBotonX = new JLabel("Boton X");
        txtContador = new JTextField(15);
        txtContador.setEnabled(true);
        txtContador.setBackground(Color.CYAN);
        
        contenedorPpal = getContentPane();
        contenedorPpal.setLayout(new GridLayout(2,1));        
        contenedorPpal.add(lblvalorInicial);
        contenedorPpal.add(txtContador);
                
    }
    
}


