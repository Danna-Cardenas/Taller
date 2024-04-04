/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author DANNA
 */
public class MainCirculo {
    
       public static void main(String[] args) {
       
        Circulo circulo = new Circulo(6);

        double area = circulo.Area();

        double perimetro = circulo.Perimetro();

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}
    

