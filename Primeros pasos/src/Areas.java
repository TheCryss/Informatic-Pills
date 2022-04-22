/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose9
 */
import java.util.*;
import javax.swing.*;

public class Areas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elija una opcion \n1- Cuadrado\n2- Rectangulo\n3- Triangulo\n4- Circulo");
        int figura=entrada.nextInt();
        switch(figura)
        {
            case 1:
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del lado"));
                System.out.println("El area del cuadrado es "
                        + Math.pow(lado, 2));
                break;
            case 2:
                int base = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la altura"));
                System.out.println("El area del rectangulo es "+base*altura);
                break;
            case 3:
                 base = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la base"));
                 altura = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la altura"));
                System.out.println("El area del triangulo es "+(base*altura)/2);
                break;
            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del radio"));
                System.out.print("El area del circulo es ");
                System.out.printf("%1.2f",Math.PI*Math.pow(radio, 2));
                break;
            default:
                System.out.println("La opcion no es correcta");
        }
    }
}
