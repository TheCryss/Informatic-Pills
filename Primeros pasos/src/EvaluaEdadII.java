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
public class EvaluaEdadII {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su edad : ");
        int edad = entrada.nextInt();
        
        if (edad<18) {
            System.out.println("Eres un adolecente");
        } else if (edad<40) {
            System.out.println("Eres un joven");
        } else if (edad<65) {
            System.out.println("Eres maduro pero no el de venezuela");
        } else {
            System.out.println("Casi eres un dinosaurio");
        }
    }
}
