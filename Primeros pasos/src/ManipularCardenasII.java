/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose9
 */
public class ManipularCardenasII {
    public static void main(String[] args) {
        String frase="Hoy es un estupendo día para aprender a programar en JAVA";
        String frase_resumen = frase.substring(0, 29)+ " Irnos a la playa y olvidarnos de todo ..."+" y "+frase.substring(29, frase.length());
        System.out.println(frase_resumen);
        String Alumno1, Alumno2;
        Alumno1 = "Carlos";
        Alumno2 = "Mauricio";
        System.out.println(Alumno1.equalsIgnoreCase(Alumno2));
        System.out.println("El "+Alumno1+" no es igual a "+Alumno2);
    }    
}
