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

                borrarPelicula();
                break;

            case 5:
                
                modificarPelicula();
                break;

            case 6:
                
                System.out.println("Fin del programa.");
                break;
        
            default:

                System.out.println("Inserta una opción válidad.");
                elegirOpcion();
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
        String peliculaBorrar = scan.nextLine();
        int i = 0;
        boolean isEncontrada = false;
        for (Pelicula pelicula : arrayCatalogo) {
            if (pelicula.getNombre().toLowerCase().equals(peliculaBorrar.toLowerCase())) {
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
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el nombre exacto de la película que desea borrar:");
        String peliculaBorrar = scan.nextLine();
        boolean isEncontrada = false;
        int remove = 0;

        for (int j = 0; j < arrayCatalogo.size(); j++) {
            if (arrayCatalogo.get(j).getNombre().equals(peliculaBorrar)) {
                remove = j;
                isEncontrada = true;
                j++;
            } 
        }

        if (isEncontrada == false) {
            System.out.println("\nNo se ha encontrado la película que deseas borrar.");
        } else if (isEncontrada == true) {
            System.out.println("La película '" + arrayCatalogo.get(remove).getNombre() + "' ha sido borrada.");
            arrayCatalogo.remove(remove);
            
        }

        elegirOpcion();
    }

    public void modificarPelicula() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el nombre exacto de la película que desea modificar:");
        String peliculaModificar = scan.nextLine();

        int i = 0;
        for (Pelicula pelicula : arrayCatalogo) {
            if (pelicula.getNombre().equals(peliculaModificar)) {
                System.out.println("Esta es la película a modificar: " + i + "." + " " + pelicula.toString());
                System.out.println("Escribe el nuevo nombre de la película:");
                pelicula.setNombre(scan.nextLine());
                System.out.println("Escribe el nuevo año de la película:");
                pelicula.setYear(Integer.parseInt(scan.nextLine()));
                System.out.println("Estos son los nuevos datos de la película:");
                System.out.println(i + "." + " " + pelicula.toString());
                break;
            }
        i++;
        }

        elegirOpcion();
    }


}
