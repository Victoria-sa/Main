package cineFilia;


import java.util.Scanner;

public class CineFilia {
      static Scanner lector= new Scanner(System.in);
      static String nombrePeliculaString;
   	private static String nombrePelicula;
		
      
	public static void main(String[] args) {
		menuPrincipal();
	}
		// metodo que muestra el menu principal.
		static void menuPrincipal() {
			System.out.println("+---------------+");
			System.out.println("|  Menu Pricipal|");
			System.out.println("|1. Entradas    |");
			System.out.println("|2. Salir       |");
			System.out.println("|               |");
			System.out.println("+---------------+");
			System.out.println("Indica tu opcion ------>");
			int opcion = lector.nextInt();
			if (opcion == 1) {
				comprarPeliculas();

			} else if (opcion != 1 && opcion != 2) {
				System.out.println("Opcion no valida");
				menuPrincipal();
			}
		}

		static void comprarPeliculas() {
			System.out.println("+---------------------+");
			System.out.println("|    Menu Peliculas   |");
			System.out.println("|                     |");
			System.out.println("|     1.Avatar        |");
			System.out.println("|     2.Megan         |");
			System.out.println("|     3.Operacion     |");
			System.out.println("|     4.Salir         |");
			System.out.println("+---------------------+");
			System.out.println("Indica tu opcion");
			int opcionPelicula = lector.nextInt();
			switch (opcionPelicula) {
			case 1 -> {
				nombrePelicula = "Avatar";
				pagoEntrada(opcionPelicula);
			}
			case 2 -> {
				nombrePelicula = "Megan ";
				pagoEntrada(opcionPelicula);
			}
			case 3 -> {
				nombrePelicula = "Operacion";
				pagoEntrada(opcionPelicula);
			}

			case 4 -> menuPrincipal();
			default -> {
				System.err.println("No es una opcion valida");
				comprarPeliculas();
			}
			}
		}

		static void pagoEntrada(int opcionPelicula) {
			int ninos = 0;
			System.out.println("Ingresa numero de entradas de " + nombrePelicula + " para Adultos");
			int adultos = lector.nextInt() * 6;
			if (opcionPelicula != 2) {
				System.out.println("Ingrese un numero de entradas de " + nombrePelicula + " para ninos");
				ninos = lector.nextInt() * 4;

			}
			ticket(ninos, adultos, opcionPelicula);

		}

		static void ticket(int ninos, int adultos, int opcionPelicula) {

			{
				System.out.println("Pelicula seleccionada:" + nombrePelicula);
				System.out.println("Importe total :" + (adultos + ninos));

				System.out.println("+----------------+");
				System.out.println("|   1.Pagar      |");
				System.out.println("|   2.Recti Peli |");
				System.out.println("|   3.Rect Entrad|");
				System.out.println("|   4. Salir     |");
				System.out.println("+----------------+");
				System.out.println("Indica tu opcion -------->");
				int opcionfinal = lector.nextInt();
				switch (opcionfinal) {

				case 1 -> // desarrollar ticket
				{
					System.out.println("+------------------+");
					System.out.println("|    TICKET        |");
					System.out.println("| PELICULA"+nombrePelicula );
					System.out.println("|  Entrada Adulto" + adultos / 6 + ".." + adultos);
					System.out.println("|  Entrada Nino" + ninos / 4 + ".." + ninos + "€");
					System.out.println("+-------------------");
					menuPrincipal();
				}
				case 2 -> comprarPeliculas();
				case 3 -> pagoEntrada(opcionPelicula);
				case 4 -> menuPrincipal();
				default -> {
					System.out.println("Tu seleccion no es valida");
					ticket(ninos, adultos, opcionPelicula);
				}

				}
			}
			// TODO Auto-generated method stub
		}
	
		
		{ 
	
	
	
	
	
	
	
	
	
	
	// TODO Auto-generated method stub

	}

}
