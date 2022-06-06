/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;
import logica.Programa;

import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.Border;



/**
 *
 * @author jose9
 */
public class VentanaPrincipal extends JFrame{
    
    private JButton btnCalcular;
    private JButton btnNuevo;
    private JLabel lblContractValue;
    private JLabel lblMonthQuantity;
    private JLabel lblIBC;
    private JLabel lblHealth;
    private JLabel lblPension;
    private JLabel lblTotal;   
    private JTextField txtContractValue; 
    private JTextField txtMonthQuantity; 
    private JTextField txtIBC; 
    private JTextField txtHealth; 
    private JTextField txtPension; 
    private JTextField txtTotal;
    private JPanel pnlIngresar;
    private JPanel pnlCalculado;
    private Container contenedor;
    private ImageIcon icoBanner;
    private ImageIcon icon;
    private JLabel imgBanner;
    private Programa programa;
    
    public VentanaPrincipal()
    {
        iniciarVentana();
        iniciarComponentes();
    }
        private void iniciarVentana() 
    {
        setSize(700, 750);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Seguridad Social- SOE");
        setResizable(false);
        icon = new ImageIcon(getClass().getResource("/images/icon.png"));
        this.setIconImage(icon.getImage());
    }
        
    class RoundedJTextField extends JTextField {
        private Shape shape;
        public RoundedJTextField(int size) 
        {
            super(size);
            setOpaque(false);
        }
        @Override
        protected void paintComponent(Graphics g) 
        {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 50, 50);
            super.paintComponent(g);
        }
        @Override
        protected void paintBorder(Graphics g) 
        {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 50, 50);
         }

        @Override
        public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
           shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 50, 50);
        }
        return shape.contains(x, y);
        }
     }
            private static class RoundedBorder implements Border {

        private int radius;


        RoundedBorder(int radius) {
            this.radius = radius;
        }


        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        @Override
        public boolean isBorderOpaque() {
            return true;
        }


        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
}

        private void iniciarComponentes()
        {
            icoBanner = new ImageIcon(getClass().getResource("/images/banner.jpg"));
            imgBanner = new JLabel(icoBanner);
            imgBanner.setBounds(-30, 0, 750, 150);
            Image image = (icoBanner).getImage().getScaledInstance(imgBanner.getWidth(), imgBanner.getHeight(), Image.SCALE_SMOOTH);
            icoBanner = new ImageIcon(image);
            imgBanner.setIcon(icoBanner);
            
            
            
            pnlIngresar = new JPanel(new GridLayout(2,2,10,10));
            pnlIngresar.setBackground(Color.white);
            pnlIngresar.setBounds(0, 165, 650, 100);
            lblContractValue = new JLabel("Valor del Contrato");
            lblContractValue.setFont(new Font("Serif", Font.PLAIN, 20));
            lblContractValue.setHorizontalAlignment(SwingConstants.CENTER);
            lblMonthQuantity = new JLabel("Cantidad de Meses");
            lblMonthQuantity.setHorizontalAlignment(SwingConstants.CENTER);
            lblMonthQuantity.setFont(new Font("Serif", Font.PLAIN, 20));
            txtContractValue = new RoundedJTextField(15);
            txtContractValue.setHorizontalAlignment(SwingConstants.CENTER);
            txtMonthQuantity = new RoundedJTextField(15);
            txtMonthQuantity.setHorizontalAlignment(SwingConstants.CENTER);
            pnlIngresar.add(lblContractValue);
            pnlIngresar.add(txtContractValue);
            pnlIngresar.add(lblMonthQuantity);
            pnlIngresar.add(txtMonthQuantity);
            
            btnCalcular= new JButton("Calcular");
            btnCalcular.setBounds(180, 310, 150, 60);
            btnCalcular.setBackground(Color.white);
            btnCalcular.setFont(new Font("Serif", Font.PLAIN, 17));
            btnCalcular.setBorder(new RoundedBorder(40));
            btnNuevo= new JButton("Nuevo");
            btnNuevo.setBounds(370, 310, 150, 60);
            btnNuevo.setBackground(Color.white);
            btnNuevo.setFont(new Font("Serif", Font.PLAIN, 17));
            btnNuevo.setBorder(new RoundedBorder(40));
            
            
            pnlCalculado= new JPanel(new GridLayout(4,2,10,10));
            pnlCalculado.setBackground(Color.white);
            pnlCalculado.setBounds(0, 430, 650,210 );
            lblIBC = new JLabel("IBC");
            lblIBC.setFont(new Font("Serif", Font.PLAIN, 17));
            lblIBC.setHorizontalAlignment(SwingConstants.CENTER);
            lblHealth= new JLabel("Health");
            lblHealth.setFont(new Font("Serif", Font.PLAIN, 17));
            lblHealth.setHorizontalAlignment(SwingConstants.CENTER);
            lblPension = new JLabel("Pension");
            lblPension.setFont(new Font("Serif", Font.PLAIN, 17));
            lblPension.setHorizontalAlignment(SwingConstants.CENTER);
            lblTotal = new JLabel("Total");
            lblTotal.setFont(new Font("Serif", Font.PLAIN, 17));
            lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
            
            txtIBC = new RoundedJTextField(15);
            txtIBC.setHorizontalAlignment(SwingConstants.CENTER);
            txtIBC.setEnabled(false);
            txtHealth = new RoundedJTextField(15);
            txtHealth.setHorizontalAlignment(SwingConstants.CENTER);
            txtHealth.setEnabled(false);
            txtPension = new RoundedJTextField(15);
            txtPension.setHorizontalAlignment(SwingConstants.CENTER);
            txtPension.setEnabled(false);
            txtTotal = new RoundedJTextField(15);
            txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
            txtTotal.setEnabled(false);
            pnlCalculado.add(lblIBC);
            pnlCalculado.add(txtIBC);
            pnlCalculado.add(lblHealth);
            pnlCalculado.add(txtHealth);
            pnlCalculado.add(lblPension);
            pnlCalculado.add(txtPension);
            pnlCalculado.add(lblTotal);
            pnlCalculado.add(txtTotal);
                          
            contenedor = getContentPane();
            contenedor.setLayout(null);
            contenedor.add(btnCalcular);
            contenedor.add(btnNuevo);
            contenedor.add(pnlIngresar);
            contenedor.add(pnlCalculado);
            contenedor.add(imgBanner);
            contenedor.setBackground(Color.white);
            
            btnNuevo.addActionListener(new ManejadorDeEventos());
            btnCalcular.addActionListener(new ManejadorDeEventos());
            
            
            SwingUtilities.updateComponentTreeUI(contenedor);
        }
    private class ManejadorDeEventos implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==btnNuevo) {
                txtContractValue.setText("");
                txtHealth.setText("");
                txtIBC.setText("");
                txtMonthQuantity.setText("");
                txtPension.setText("");
                txtTotal.setText("");
                
            } else {
                try {
                    float contractValue = Float.parseFloat(txtContractValue.getText());
                    float monthQuantity = Float.parseFloat(txtMonthQuantity.getText());
                    programa = new Programa(contractValue,monthQuantity);
                    programa.calcularIBC();
                    txtIBC.setText(String.valueOf(programa.getIbc()));
                    programa.calcularSalud();
                    txtHealth.setText(String.valueOf(programa.getHealth()));
                    programa.calcularPension();
                    txtPension.setText(String.valueOf(programa.getPension()));
                    programa.calcularTotal();
                    txtTotal.setText(String.valueOf(programa.getTotal()));
                    
                } catch (Exception arg0) {
                    
                }
            }
        }

        
        
    }
        
}
