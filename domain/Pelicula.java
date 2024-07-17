package domain;

public class Pelicula {
    private int idPeli
    private String nombre;
    private int year;

    public Pelicula(){}

    public Pelicula (String nombre, int year) {
        this.nombre = nombre;
        this.year = year;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return nombre + ", " + year + ".";
    }

    
    
}
