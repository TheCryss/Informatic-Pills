/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author jose9
 */
public class Programa {
    private float contractValue;
    private float monthQuantity;
    private float ibc;
    private float health;
    private float pension;
    private float total;
    
    public Programa(float contractValue, float monthQuantity)
    {
        this.contractValue=contractValue;
        this.monthQuantity=monthQuantity;
        System.out.println("Se creo objeto");
    }

    public float getValueContract() {
        return contractValue;
    }

    public void setValueContract(float contractValue) {
        this.contractValue = contractValue;
    }

    public float getMonthQuantity() {
        return monthQuantity;
    }

    public void setMonthQuantity(float monthQuantity) {
        this.monthQuantity = monthQuantity;
    }

    public float getIbc() {
        return ibc;
    }

    public void setIbc(float ibc) {
        this.ibc = ibc;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getPension() {
        return pension;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public void calcularIBC()
    {
        ibc= (float)((contractValue/monthQuantity)*0.4) ;

    }
    public void calcularSalud()
    {
        health=(float)(contractValue*0.04);
    }
    
    public void calcularPension()
    {
        pension=(float)(contractValue*0.04);
    }
    public void calcularTotal()
    {
        total=health+pension;
    }
}