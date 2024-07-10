package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {

    ArrayList <Object> arrayCatalogo;

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
                Pelicula peliculaAñadir = new Pelicula();
                System.out.println("Escribe el nombre de la película:");
                peliculaAñadir.setNombre(scan.nextLine());
                System.out.println("Escribe el año de la película:");
                peliculaAñadir.setYear(Integer.parseInt(scan.nextLine()));
                añadirPelicula(peliculaAñadir);
                System.out.println("Película añadida.");
                break;

            case 3:
                
                break;

            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;
        
            default:

                break;
        }


        

    }

    public void añadirPelicula (Pelicula pelicula) {
        arrayCatalogo.add(pelicula);
        elegirOpcion();
    }

    public void listarPeliculas () {
        int i = 0;
        for (Object object : arrayCatalogo) {

            System.out.println(i + "." + " " + object.toString());
            i++;
        }
        elegirOpcion();
    }

}
