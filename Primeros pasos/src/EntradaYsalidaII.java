
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose9
 */
import javax.swing.*;
public class EntradaYsalidaII {
    public static void main(String[] args) {
        String nombre_usuario=JOptionPane.showInputDialog("Digite su nombre por favor: ");
        String edad=JOptionPane.showInputDialog("Digite su edad por favor");
        int edad_usuario = Integer.parseInt(edad);
        System.out.println("Hola "+nombre_usuario+", el proximo año tendras "+(edad_usuario+1)+" años.");
        
        
        
        
    }
    
}
