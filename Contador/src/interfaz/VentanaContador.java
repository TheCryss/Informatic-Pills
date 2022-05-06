/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;
import java.awt.Color;
import javax.swing.*;
import modelo.Contador;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author invitado
 */
public class VentanaContador extends JFrame {
    private JButton btnBotonX;
    private JLabel lblvalorInicial;
    private JTextField txtContador;
    private JLabel lblCuenta;
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
        btnBotonX = new JButton("Boton X");
        lblvalorInicial.setHorizontalAlignment(JLabel.CENTER);
        txtContador = new JTextField(15);
        txtContador.setEnabled(true);
        txtContador.setBackground(Color.CYAN);
        txtContador.setHorizontalAlignment(JTextField.CENTER);
        lblCuenta = new JLabel("UnU");
        lblCuenta.setHorizontalAlignment(JLabel.CENTER);
        contenedorPpal = getContentPane();
        contenedorPpal.setLayout(new GridLayout(4,1));  
        contenedorPpal.add(lblvalorInicial);
        contenedorPpal.add(txtContador);
        contenedorPpal.add(btnBotonX);
        contenedorPpal.add(lblCuenta);   
        
        btnBotonX.addActionListener(new ManejadorEventos());
        btnBotonX.addMouseListener(new ManejadorEventos());
        
    }
    
    private class ManejadorEventos implements ActionListener,MouseListener{
        Contador miContador = new Contador(0); 
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == btnBotonX) {
            int contador = Integer.parseInt(txtContador.getText());
            miContador.setCuenta(contador);
            lblCuenta.setText(  miContador.getCuenta()+"");
            btnBotonX.setEnabled(false);
            txtContador.setEnabled(false);
            //JOptionPane.showMessageDialog(null, "Se Presiono: ");
        } 
    }   

        @Override
        public void mouseClicked(MouseEvent e) {
            //JOptionPane.showMessageDialog(null, "Se Presiono: "+e.getButton());
            if (e.getButton()==1) {
                miContador.aumentarCuenta();
                lblCuenta.setText(  miContador.getCuenta()+"");

            }else if (e.getButton()==3) {
                miContador.disminuirCuenta();
                lblCuenta.setText(  miContador.getCuenta()+"");

            }else if (e.getButton()==2) {
                int input = JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "Reiniciar Cuenta",
				JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if (input==0) {
                    miContador.reinciarCuenta();
                    lblCuenta.setText(  miContador.getCuenta()+"");
                } else {
                    
                }
                
     
            }
 
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
}
    
}



