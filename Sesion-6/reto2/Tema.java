
package com.sesion6.reto2;

/**
 *
 * @author lizet
 */
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;
    
    public Tema (String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }
    
    //ordenamiento natural
    @Override
    public int compareTo(Tema otro){
        return this.titulo.compareTo(otro.titulo);
    }
    
    @Override
    public String toString(){
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}



