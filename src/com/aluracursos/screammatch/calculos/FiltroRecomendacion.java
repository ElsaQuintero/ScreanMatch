package com.aluracursos.screammatch.calculos;
// Clase que realiza filtrado y recomendación de títulos
public class FiltroRecomendacion {
    // Método para filtrar y recomendar títulos según su clasificación
    public void filtra(Clasificacion clasificacion)
    {
        // Realiza la recomendación según la clasificación
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >=2){
            System.out.println("Popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para verlo después");
        }
    }
}
