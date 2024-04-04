/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author DANNA
 */
public class Cuadrado {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double Area() {
        return lado * lado;
    }
        
    public double Perimetro() {
        return (this.lado + this.lado)* 2;

    }
}
