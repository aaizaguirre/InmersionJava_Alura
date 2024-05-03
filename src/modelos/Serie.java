package src.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    //Constructor
    public Serie(String titulo, int fechaLanzamiento, String sinopsis, double calificacion,
            boolean incluidoEnPlanBasico, int tiempoDuracionEnMinutos, int temporadas, int episodiosPorTemporada, int duracionEnMinutosPorEpisodio) {
                super(titulo, fechaLanzamiento, sinopsis, calificacion, incluidoEnPlanBasico, tiempoDuracionEnMinutos);
                this.temporadas = temporadas;
                this.episodiosPorTemporada = episodiosPorTemporada; 
                this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }
    
    @Override
    public int getTiempoDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

}
