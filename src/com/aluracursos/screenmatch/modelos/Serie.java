package com.aluracursos.screenmatch.modelos;
// Subclase que representa una serie
public class Serie extends Titulo {

   // Atributos exclusivos para las series
    int temporadas; // Número de temporadas de la serie
    int episodioPorTemporada; // Número de episodios por temporada de la serie
    int minutosPorEpisodio; // Duración en minutos de cada episodio de la serie

    // Método para obtener la duración total de la serie en minutos
    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    // Métodos getter y setter para los atributos exclusivos de las series
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
