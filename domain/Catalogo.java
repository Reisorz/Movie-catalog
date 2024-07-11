package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {

    ArrayList <Pelicula> arrayCatalogo;

    public Catalogo () {
        arrayCatalogo = new ArrayList<>();
    }

    public void elegirOpcion() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nElige una opción:");
        System.out.println("1 - Listar peliculas");
        System.out.println("2 - Agregar peliculas");
        System.out.println("3 - Buscar pelicula");
        System.out.println("4 - Borrar pelicula");
        System.out.println("5 - Modificar pelicula");
        System.out.println("6 - Salir\n");
        int opcionElegida = Integer.parseInt(scan.nextLine());

        switch (opcionElegida) {
            case 1:
                listarPeliculas();
                break;
            
            case 2:
                
                añadirPelicula();
                break;

            case 3:

                buscarPelicula();
                break;

            case 4:

                borrarPelicula();1
                break;

            case 5:
                
                break;

            case 6:
                
                break;
        
            default:

                break;
        }
    }

    public void listarPeliculas () {
        int i = 0;
        for (Pelicula pelicula : arrayCatalogo) {

            System.out.println(i + "." + " " + pelicula.toString());
            i++;
        }
        elegirOpcion();
    }

    public void añadirPelicula () {
        Scanner scan = new Scanner(System.in);
        Pelicula peliculaAñadir = new Pelicula();
        System.out.println("Escribe el nombre de la película a añadir:");
        peliculaAñadir.setNombre(scan.nextLine());
        System.out.println("Escribe el año de la película a añadir:");
        peliculaAñadir.setYear(Integer.parseInt(scan.nextLine()));
        arrayCatalogo.add(peliculaAñadir);
        System.out.println("Película añadida.");
        elegirOpcion();
    }

    public void buscarPelicula() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el nombre exacto de la película que buscas:");
        String peliculaBuscada = scan.nextLine();
        int i = 0;
        boolean isEncontrada = false;
        for (Pelicula pelicula : arrayCatalogo) {
            if (pelicula.getNombre().toLowerCase().equals(peliculaBuscada.toLowerCase())) {
                System.out.println(i + "." + " " + pelicula.toString());
                isEncontrada = true;
                i++;
            }
        }

        if (isEncontrada == false) {
            System.out.println("\nNo se ha encontrado la película que buscas.");
        }

        elegirOpcion();
    }

    public void borrarPelicula() {
        
    }



}
