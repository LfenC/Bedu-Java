/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion4.reto1;

/**
 *
 * @author lizet
 */
public class Main {
    public static void main(String[] args) {
        // Se crean dos facturas con el mismo folio
        Factura factura1 = new Factura("FAC001", "Juan Pérez", 1450.00);
        Factura factura2 = new Factura("FAC001", "Comercial XYZ", 1450.00); 
    
        System.out.println(factura1);
        System.out.println(factura2);

        System.out.println("¿Las facturas son iguales?: " + factura1.equals(factura2));
    }
}


/*Factura [folio=FAC001, cliente=Juan Pérez, total=$1450.0]
  Factura [folio=FAC001, cliente=Comercial XYZ, total=$1450.0]
¿Las facturas son iguales?: true

*/