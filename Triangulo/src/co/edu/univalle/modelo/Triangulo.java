/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.modelo;

/**
 *
 * @author invitado
 */
public class Triangulo {
    private float hight;
    private float base;
    private float area;

    public Triangulo() {
        this.hight = 0;
        this.base = 0;
        area =0;
    }

    public Triangulo(float hight, float base) {
        this.hight = hight;
        this.base = base;
        area =0;
    }

    public float getHight() {
        return hight;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getArea() {
        return area;
    }

//    public void setArea(float area) {
//        this.area = area;
//    }

    public void calcularArea()
    {
        area=(base*hight)/2;
    }
}
