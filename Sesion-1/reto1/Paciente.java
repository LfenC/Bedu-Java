/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion1.reto1;


/**
 *
 * @author lizet
 */
public class Paciente {
    // Caracteristicas del paciente
        String nombrePaciente;
        int edadPaciente;
        String numeroExpediente;
     
    //metodo mostrar informacion
        public void mostrarInformacion() {
        System.out.println("Paciente: " + nombrePaciente);
        System.out.println("Edad: " + edadPaciente );        
        System.out.println( "Expediente: " + numeroExpediente);           
    }
}
