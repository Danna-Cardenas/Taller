/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author DANNA
 */
public class Circulo {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public double Area() {
        return Math.PI * radio * radio;
    }

    // Método para obtener el perímetro del círculo
    public double Perimetro() {
        return 2 * Math.PI * radio;
    }
    
}
