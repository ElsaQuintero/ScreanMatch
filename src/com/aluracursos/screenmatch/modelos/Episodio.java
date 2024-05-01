package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screammatch.calculos.Clasificacion;

// Clase que representa un episodio de una serie
public class Episodio implements Clasificacion {
    private int numero; // Número del episodio
    private String nombre; // Nombre del episodio
    private Serie serie; // Serie a la que pertenece el episodio
    private int totalVisualizaciones; // Total de visualizaciones del episodio

    // Métodos getter y setter para los atributos
    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    // Implementación del método de la interfaz Clasificacion para obtener la clasificación del episodio
    @Override
    public int getClasificacion() {
        // Si el episodio tiene más de 100 visualizaciones, su clasificación es 4, de lo contrario es 2
        if (totalVisualizaciones > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
