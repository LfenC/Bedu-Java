/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion5.reto1;

/**
 *
 * @author lizet
 */
public class Operador {
    String name;
    
    public Operador(String name){
        this.name = name;
    }
    public void report(){
        System.out.println("Operador "+ name +" reportándose" );
    }
}
