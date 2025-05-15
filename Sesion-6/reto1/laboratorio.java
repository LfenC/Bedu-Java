
package com.sesion6.reto1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author lizet
 */
public class laboratorio {
    //El orden de llegada de las muestras (pueden repetirse si se replican).
    public static void main(String[] args) {
    
    ArrayList<String> muestrasRecibidas = new ArrayList<>();
    muestrasRecibidas.add("Homo sapiens");
    muestrasRecibidas.add("Mus musculus");
    muestrasRecibidas.add("Arabidopsis thaliana");
    muestrasRecibidas.add("Homo sapiens");

    //muestras recibidas
    System.out.println("Orden de llegada de muestras:");
        for (String muestras : muestrasRecibidas) {
            System.out.println("- " + muestras);
        }
           
    // Las especies únicas que han sido procesadas.
    HashSet<String> especiesUnicas = new HashSet<>();
    especiesUnicas.add("Homo sapiens");
    especiesUnicas.add("Mus musculus");
    especiesUnicas.add("Arabidopsis thaliana");
    especiesUnicas.add("Homo sapiens");
    
    //mostrar especies registradas
    System.out.println("Especies registradas (sin duplicados)");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }
         
    // El ID de cada muestra asociado con el nombre del investigador responsable.
    HashMap<String, String> catalogoMuestras = new HashMap<>();
    catalogoMuestras.put("M-001","Dra. López");
    catalogoMuestras.put("M-002", "Dr. Hernández");
    catalogoMuestras.put("M-003", "Dr. Rivera");

    //mostrar el catalogo de muestras
    System.out.println("Catálogo de muestras (ID de muestra -> Investigador):");
    for (Map.Entry<String, String> entrada : catalogoMuestras.entrySet()) {
        System.out.println(entrada.getKey() + " --> " + entrada.getValue());
    }

    String idBuscado = "M-002";
    System.out.println("Investigador responsable de la muestra " + idBuscado + ": " + catalogoMuestras.get(idBuscado));
    }
}
