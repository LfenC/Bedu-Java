/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sesion6.reto2;

import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author lizet
 */
public class Main {
    public static void main(String[] args) {
        
        //se crea la losta concurrente de temas
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Se ordenan los temas alfabeticamente
        Collections.sort(temas);
        System.out.println("Temas ordenados alfabeticamente");
        for(Tema t : temas){
            System.out.println(t);
        }

        //se ordenan los temas por prioridad
        temas.sort(new Comparator<Tema>(){
            @Override
            public int compare(Tema a, Tema b){
                //prioridad ascendente
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        System.out.println("Temas ordenados por prioridad");
        for(Tema t : temas){
            System.out.println(t);
        }


        //se crea el mapa concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
            recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
            recursos.put("Matemáticas básicas", "https://recursos.edu/mate");

        System.out.println("Repositorio de recursos por tema");
        for (String tema : recursos.keySet()){
            System.out.println(tema + " -> " + recursos.get(tema));
        }
    }
}
