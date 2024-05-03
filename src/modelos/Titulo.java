package src.modelos;

public class Titulo {
    private String titulo;
    private int fechaLanzamiento;
    private String sinopsis;
    private double calificacion;
    private boolean incluidoEnPlanBasico;
    private int tiempoDuracionEnMinutos;
    private static int numeroTitulos = 0;

   // Constructor
    public Titulo(String titulo, 
    int fechaLanzamiento, 
    String sinopsis, 
    double calificacion,  
    boolean incluidoEnPlanBasico,
    int tiempoDuracionEnMinutos){
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.sinopsis = sinopsis;
        this.calificacion = calificacion;
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
        this.tiempoDuracionEnMinutos = tiempoDuracionEnMinutos;
        numeroTitulos++;
   }

   // Metodos
   public String gettitulo(){
    return titulo;
   }
   public void settitulo(String titulo){
    this.titulo = titulo;
   }
   public int getfechaLanzamiento(){
    return fechaLanzamiento;
   }
   public void setFechaLanzamiento(int fechaLanzamiento){
    this.fechaLanzamiento = fechaLanzamiento;
   }
   public String getSinopsis(){
    return sinopsis;
   }
   public void setSinopsis(String sinopsis){
    this.sinopsis = sinopsis;
   }
   public double getCalificacion(){
    return calificacion;
   }
   public void setCalificacion(double calificacion){
    this.calificacion = calificacion;
   }
   public boolean getIncluidoEnPlanBasico(){
    return incluidoEnPlanBasico;
   }
   public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico){
    this.incluidoEnPlanBasico = incluidoEnPlanBasico;
   }

   public int getTiempoDuracionEnMinutos(){
    return tiempoDuracionEnMinutos;
   }

   public void setTiempoDuracionEnMinutos(int tiempoDuracionEnMinutos){
    this.tiempoDuracionEnMinutos = tiempoDuracionEnMinutos;
   }

   public static int getnumeroTitulos(){
    return numeroTitulos;
}

   // Metodo para mostrar informacion de la pelicula
   public void mostrarInformacion(){
    System.out.println("****** FICHA TECNICA ******");
    System.out.println("Titulo: " + titulo + ".");
    System.out.println("Fecha de lanzamiento: " + fechaLanzamiento + ".");
    System.out.println("Calificacion: " + calificacion + ".");
    System.out.println("Tiempo de duracion: " +  tiempoDuracionEnMinutos + " minutos.");
    System.out.println("Sinopsis: " + sinopsis + ".");
    System.out.println("***************************");
   }
}
