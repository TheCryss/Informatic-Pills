/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose9
 */
public class ManipulaCadenas {
    public static void main(String[] args) {
        String nombre = "Carlos Andres Hernandez Gonzales";
        System.out.println("Mi nombre es: "+nombre);
        System.out.println("Mi nombre tiene: "+nombre.length()+" Letras.");
        System.out.println("La primera letra de mi nombre es la "+nombre.charAt(0));
        System.out.println("La ultima letra de mi nombre es la "+nombre.charAt(nombre.length()-1));
    }
}
