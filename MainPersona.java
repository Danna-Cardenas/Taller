/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

import java.time.LocalDate;

/**
 *
 * @author DANNA
 */
public class MainPersona {
    
    public static void main(String[] args) {
    
    Persona persona = new Persona(LocalDate.of(2004, 10, 16));
    
    System.out.println("Edad en años: " + persona.getEdad());

    System.out.println("Edad en meses: " + persona.getMeses());

    System.out.println("Edad en días: " + persona.getDias());
  }

    
}
