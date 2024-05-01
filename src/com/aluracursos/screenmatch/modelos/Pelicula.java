package com.aluracursos.screenmatch.modelos;
import com.aluracursos.screammatch.calculos.Clasificacion;

// La herencia se realiza utilizando la palabra clave "extends".
// Subclase que representa una película
public class Pelicula extends Titulo implements Clasificacion {
    private String director; // Nombre del director de la película

    // Método getter para obtener el nombre del director
    public String getDirector() {
        return director;
    }

    // Método setter para establecer el nombre del director
    public void setDirector(String director) {
        this.director = director;
    }

    // Método de la interfaz Clasificacion para obtener la clasificación de la película
    @Override
    public int getClasificacion() {
        // La clasificación se calcula como la mitad de la media de las evaluaciones
        return (int) (calculaMedia()/2);
    }
}
