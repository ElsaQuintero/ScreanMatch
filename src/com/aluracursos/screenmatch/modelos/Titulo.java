package com.aluracursos.screenmatch.modelos;
// Superclase que representa un título
public class Titulo {
    // Atributos de la clase
    private String nombre; // Nombre del título
    private int fechaDeLanzamiento; // Fecha de lanzamiento del título
    private int duracionEnMinutos; // Duración en minutos del título
    private boolean incluidoEnElPlan; // Indica si el título está incluido en el plan
    private double sumaDeLasEvaluaciones; // Suma de todas las evaluaciones del título
    private int totalDelasEvaluaciones; // Total de evaluaciones realizadas para el título

    // Métodos getters para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    // Métodos setters para establecer los valores de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDelasEvaluaciones(){
        return totalDelasEvaluaciones;
    }

    // Método para mostrar la ficha técnica del título
    public void muestraFichaTecnica(){
        System.out.println("Lo que quieres ver es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: "+ getDuracionEnMinutos());
    }

    // Método para evaluar el título
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;
    }

    // Método para calcular la media de las evaluaciones del título
    public double calculaMedia() {
        return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
    }
//
//    // metodo void (no regresa nada) para mostrar la información de las peliculas
//    public void muestraFichaTecnica(){
//        System.out.println("El nombre de la pelicula es: " + nombre);
//        System.out.println("Su fecha de lanzamiento es: " + getFechaDeLanzamiento());
//        System.out.println("Su duración en minutes es: " + getDuracionEnMinutos());
//    }
//
//    // regresa un dato que es la nota de la pelicula
//    public void evalua(double nota){
//        sumaDeEvaluaciones += nota;
//        totalDeEvaluaciones++;
//    }
//
//    // metodo double (regresa un dato double) se necesita poner return
//    public double calculaMedia(){
//        return sumaDeEvaluaciones / totalDeEvaluaciones;
//    }
}
