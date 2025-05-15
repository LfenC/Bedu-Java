/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion1.reto2;

/**
 *
 * @author lizet
 */
public class Principal2 {
    public static void main(String[] args) {
        // instanciar         //construc
    Entrada_Record entrada1 = new Entrada_Record("Concierto", 600.0);
    Entrada_Record entrada2 = new Entrada_Record("Película Flow", 70.0);
    Entrada_Record entrada3 = new Entrada_Record("Presentacion", 200.0);

    entrada1.mostrarInformacion();
    entrada2.mostrarInformacion();
    entrada3.mostrarInformacion();

    }
}
