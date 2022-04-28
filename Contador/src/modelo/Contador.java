/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author invitado
 */
public class Contador {
    private int cuenta;
    
    public Contador(){
        this.cuenta=0;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    public void aumentarCuenta(){
        cuenta++;
    }
    public void disminuirCuenta()
    {
        cuenta--;
    }
    public void reinciarCuenta()
    {
        cuenta=0;
    }
}
