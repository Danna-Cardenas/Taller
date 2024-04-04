/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author DANNA
 */
public class MainCuadrado {


    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(8);
        
        double area = cuadrado.Area();
        
        double perimetro = cuadrado.Perimetro();
        
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        
        
        
    }
}