/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author DANNA
 */
public class MainTriangulo {
    
    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo(2, 7, 9);

        System.out.println("Área del triángulo: " + triangulo.area());

        System.out.println("Perímetro del triángulo: " + triangulo.perimetro());

        System.out.println("Hipotenusa del triángulo: " + triangulo.hipotenusa());

    }

    
}
