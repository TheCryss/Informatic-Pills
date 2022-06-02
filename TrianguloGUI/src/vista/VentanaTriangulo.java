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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
public class VentanaTriangulo extends JFrame{

    private JLabel lblBase;
    private JLabel lblAltura;
    private JLabel lblArea;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtArea;
    private JButton btnCalcular;
    private Container contenedorPpal;

    private JButton btnCancelar;

    public VentanaTriangulo() {
        iniciarComponentes();
        setSize(350, 150);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Área Triangulo");
    }

    private void iniciarComponentes() {
        lblBase = new JLabel("Base : ");
        lblAltura = new JLabel("Altura : ");
        lblArea = new JLabel("Area : ");

        txtBase = new JTextField(0);
        txtBase.setHorizontalAlignment(JTextField.RIGHT);

        txtAltura = new JTextField(15);
        txtAltura.setHorizontalAlignment(JTextField.RIGHT);

        txtArea = new JTextField(1);

        txtArea.setEnabled(false);
        txtAltura.setEnabled(false);
        txtBase.setEnabled(false);
        txtArea.setBackground(Color.YELLOW);
        txtArea.setDisabledTextColor(Color.red);
        txtArea.setHorizontalAlignment(JTextField.RIGHT);

        btnCalcular = new JButton("Calcular");
        btnCancelar = new JButton("Nuevo");
        btnCalcular.setEnabled(false);
        contenedorPpal = getContentPane();

        contenedorPpal.setLayout(new GridLayout(4, 2));

        contenedorPpal.add(lblBase);
        contenedorPpal.add(txtBase);

        contenedorPpal.add(lblAltura);
        contenedorPpal.add(txtAltura);

        contenedorPpal.add(lblArea);
        contenedorPpal.add(txtArea);

        contenedorPpal.add(btnCalcular);
        contenedorPpal.add(btnCancelar);

        //Asignamos al boton el listener (this porque el actionPerformed esta 
        //en la misma clase)
        btnCancelar.requestFocusInWindow();
        btnCalcular.addMouseListener(new MajenadorEventos());
        btnCancelar.addMouseListener(new MajenadorEventos());
        txtBase.addKeyListener(new MajenadorEventos());
        txtAltura.addKeyListener(new MajenadorEventos());
        btnCancelar.addKeyListener(new MajenadorEventos());
    }

    private class MajenadorEventos extends MouseAdapter implements KeyListener{
        public void hacerNuevo()
        {
            txtBase.setText("");
                txtAltura.setText("");
                txtArea.setText("");
                txtArea.setEnabled(false);
                txtBase.setEnabled(true);
                txtAltura.setEnabled(true);
                btnCalcular.setEnabled(true);
                btnCancelar.setEnabled(false);
                    /*JOptionPane.showMessageDialog(this,
                        "Ocurrio algo a un control de la ventana");*/
                btnCancelar.setVisible(false);
                txtBase.requestFocus();
        }
        
        public void calcularNuevo()
        {
                float base = Float.parseFloat(txtBase.getText());
                float altura = Float.parseFloat(txtAltura.getText());
                Triangulo miTriangulo = new Triangulo(base, altura);
                miTriangulo.calcularArea();
                txtArea.setText(miTriangulo.getArea() + "");
                btnCancelar.setVisible(true);
                btnCancelar.setEnabled(true);
                btnCalcular.setEnabled(false); 
                btnCancelar.requestFocusInWindow();
        }
        
        @Override
        public void mouseClicked(MouseEvent e){
            if (e.getSource() == btnCalcular) {
                calcularNuevo();
                
            } else {
                hacerNuevo();
                //btnCancelar.requestFocusInWindow();
                

           }
        }
        

        private void calcularArea()
        {
                float base = Float.parseFloat(txtBase.getText());
                float altura = Float.parseFloat(txtAltura.getText());
                Triangulo miTriangulo = new Triangulo(base, altura);
                miTriangulo.calcularArea();
                txtArea.setText(miTriangulo.getArea() + "");
        }
        @Override
        public void keyTyped(KeyEvent ke) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyPressed(KeyEvent ke) {
            if (ke.getKeyCode()==10) {
                
                if (btnCancelar.isEnabled()) {
                    hacerNuevo();
                } 
                try {
                float base = Float.parseFloat(txtBase.getText());
                txtAltura.requestFocus();
                    if (!txtBase.getText().isBlank() && !txtAltura.getText().isBlank()) {
                        calcularArea();
                        btnCalcular.requestFocusInWindow();
                        if (btnCalcular.isEnabled()) {
                            calcularNuevo();
                        }
                    }
            } catch (Exception e) {
         
            }
            
        }
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    

}
