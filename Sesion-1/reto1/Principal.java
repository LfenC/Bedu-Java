/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion1.reto1;

import java.util.Scanner;

/**
 *
 * @author lizet
 */
public class Principal {
       public static void main(String[] args) {
           //objeto paciente
        Scanner scanner = new Scanner (System.in); 

            Paciente paciente = new Paciente();
            
            System.out.println("Introduce el nombre del paciente:");
            paciente.nombrePaciente= scanner.nextLine();
            
            System.out.println("Introduce la edad del paciente:");
            paciente.edadPaciente = scanner.nextInt();
            //limpiar el buffer
            scanner.nextLine();
            
            System.out.println("Introduce el numero de expediente:");
            paciente.numeroExpediente = scanner.nextLine();
            
            // Llamar al método mostrarInformacion() del objeto
            System.out.println("Datos recibidos del paciente:" + " " + paciente.nombrePaciente);
            paciente.mostrarInformacion();      
            scanner.close();
        } 
}
