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
public class EntradaNumeros {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite un numero por favor");
        double numero= Double.parseDouble(num);
        System.out.print("La raiz de "+numero+" es ");
        System.out.printf("%1.2f",Math.sqrt(numero));
        
    }
}
