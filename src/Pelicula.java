package src;

public class Pelicula {

    private String nombrePelicula;
    private int fechaLanzamiento;
    private String sinopsis;
    private double calificacion;
    private boolean incluidoEnPlanBasico;
    private static int numeroPeliculas = 0;

   // Constructor
    public Pelicula(String nombrePelicula, 
    int fechaLanzamiento, 
    String sinopsis, 
    double calificacion,  
    boolean incluidoEnPlanBasico){
        this.nombrePelicula = nombrePelicula;
        this.fechaLanzamiento = fechaLanzamiento;
        this.sinopsis = sinopsis;
        this.calificacion = calificacion;
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;

        numeroPeliculas++;
   }

   // Metodos
   public String getNombrePelicula(){
    return nombrePelicula;
   }
   public void setNombrePelicula(String nombrePelicula){
    this.nombrePelicula = nombrePelicula;
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
   public static int getNumeroPeliculas(){
    return numeroPeliculas;
   }

   // Metodo para calcular el promedio de las calificaciones


   // Metodo para mostrar informacion de la pelicula
   public void mostrarInformacion(){
    System.out.println("Titulo: " + nombrePelicula + ".");
    System.out.println("Fecha de lanzamiento: " + fechaLanzamiento + ".");
    System.out.println("Calificacion: " + calificacion + ".");
    System.out.println("Sinopsis: " + sinopsis + ".");
   }
}
