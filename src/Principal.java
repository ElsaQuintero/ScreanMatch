import com.aluracursos.screammatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screammatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

// Clase principal que contiene la lógica principal del programa
public class Principal {
    public static void main(String[] args) {
        // Creación de una instancia de Pelicula
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        // Mostrar la ficha técnica de la película
        miPelicula.muestraFichaTecnica();
        // Evaluar la película
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        // Mostrar el total de evaluaciones y la media de la película
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        // Creación de una instancia de Serie
        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa de Dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        // Mostrar la ficha técnica de la serie y la duración total
        System.out.println(casaDragon.getDuracionEnMinutos());

        // Creación de otra instancia de Pelicula
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        // Creación de una instancia de CalculadoraDeTiempo y cálculo del tiempo total de visualización
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo para ver tus titulos favoritos estas vacaciones "
                + calculadora.getTiempoTotal() + " minutos");

        // Creación de una instancia de FiltroRecomendacion y filtrado de la película y el episodio
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodio);

    }
}

/*
        public class Persona {

            String nombre;
            int edad;

            void cumplirAnhos() {
              edad++;
            }
          }

Para crear una clase, por ejemplo:
            Persona persona1 = new Persona();

Podemos representar realmente a una persona, es decir, llenar los atributos y llamar a los métodos. Por ejemplo:
        Persona persona1 = new Persona();

        persona1.nombre = "Ana";
        persona1.edad = 20;

        System.out.println(persona1.nombre + " tiene " + persona1.edad + " años");

        persona1.cumplirAnhos();

        System.out.println("La edad ahora es: " + persona1.edad);

Podemos agregar más objetos, por ejemplo:
        Persona persona1 = new Persona();

        persona1.nombre = "Ana";
        persona1.edad = 20;

        System.out.println(persona1.nombre + " tiene " + persona1.edad + " años");

        persona1.cumplirAnhos();

        System.out.println("La edad ahora es: " + persona1.edad);

        Persona persona2 = new Persona();

        persona2.nombre = "Carlos";
        persona2.edad = 20;

        System.out.println(persona2.nombre + " tiene " + persona2.edad + " años");

        persona2.cumplirAnhos();

        System.out.println("La edad ahora es: " + persona2.edad);


 */
