/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion5.reto1;

/**
 *
 * @author lizet
 */
public class Main {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Ana");
        Patrulla patrulla = new Patrulla("Patrulla", "Antonio");
        UnidadBomberos unidadBomberos = new UnidadBomberos("UnidadBomberos", "Carlos");

        ambulancia.iniciateOperation();
        System.out.println();
        
        patrulla.iniciateOperation();
        System.out.println();
        
        unidadBomberos.iniciateOperation();
        
    }
}
