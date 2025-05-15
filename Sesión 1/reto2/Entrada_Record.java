/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion1.reto2;

/**
 *
 * @author lizet
 */
public record Entrada_Record (String nombreEvento, double precioEntrada) { 
    public void mostrarInformacion() {
            System.out.println("Evento: " + nombreEvento + " " + "|" + " "+ "Precio: $" + precioEntrada);
    }  
}

