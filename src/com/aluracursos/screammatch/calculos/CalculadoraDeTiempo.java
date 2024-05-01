package com.aluracursos.screammatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

// Clase que calcula el tiempo total de visualización de títulos
public class CalculadoraDeTiempo {
    private int tiempoTotal; // Tiempo total de visualización

    // Método getter para obtener el tiempo total de visualización
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    // Método para incluir un título en el cálculo del tiempo total
    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
