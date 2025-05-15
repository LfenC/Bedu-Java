/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion5.reto2;

/**
 *
 * @author lizet
 */
public abstract class MetodoPago implements Autenticable {
    //accesible para clases y subclases
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }
    
    //obliga a clases hijas a usar este metodo
    public abstract void procesarPago();
    
    public void mostrarResumen(){
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " - " + "Monto: $" + monto);
    }
    
}
