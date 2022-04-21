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
public class EntradaYsalida {
 public static void main(String []args){
     Scanner entrada = new Scanner(System.in);
     System.out.println("Digite su nombre por favor : ");
     String nombre = entrada.nextLine();
     System.out.println("Digite su edad : ");
     int edad = entrada.nextInt();
       System.out.println("Hola "+nombre +" tienes "+edad+" años");
 }   
}

