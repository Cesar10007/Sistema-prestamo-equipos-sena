import main.java.Aprendiz;
import main.java.Equipo;
import main.java.InventarioPrestamo;

import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        InventarioPrestamo inventario = new InventarioPrestamo();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Bienvenido, ingrese una opción");
            System.out.println("1. Registrar aprendiz");
            System.out.println("2. Registrar equipo");
            System.out.println("3. listar equipos");
            System.out.println("4. Prestar equipos");
            System.out.println("5. Listar prestamos activos");
            System.out.println("6. Devolver equipo");
            System.out.println("7. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Ingrese el documento del aprendiz: ");
                        String documentoaprendiz = sc.next();
                        System.out.println("Ingrese el nombre del aprendiz: ");
                        String nombreaprendiz = sc.next();
                        System.out.println("Ingrese el ficha del aprendiz: ");
                        String fichaprendiz = sc.next();
                        System.out.println("Ingrese telefono del aprendiz: ");
                        String telefonoaprendiz = sc.next();
                        Aprendiz aprendiz = new Aprendiz(documentoaprendiz, nombreaprendiz, fichaprendiz, telefonoaprendiz);
                        inventario.registrarAprendiz(aprendiz);
                    }catch (IllegalArgumentException e) {
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 2:
                    try{
                        System.out.println("Ingrese el codigo del equipo: ");
                        String codigoequipo = sc.next();
                        sc.nextLine();
                        System.out.println("Ingrese el nombre del equipo: (sea la marca EJEMPLO: SAMSUNG)");
                        String nombreequipo = sc.nextLine();
                        System.out.println("Ingrese la categoria del equipo del equipo: (EJEMPLO: PORTÁTIL, COMPUTADOR)");
                        String categoriaequipo = sc.nextLine();
                        Equipo equipo = new Equipo(codigoequipo, nombreequipo, categoriaequipo);
                        inventario.registrarEquipo(equipo);

                    }catch (IllegalArgumentException e) {
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 3:
                    inventario.listarEquipos();
                    break;
                case 4:
                    try{
                        System.out.println("Ingrese el documento del aprendiz: ");
                        String documentoaprendiz = sc.next();
                        System.out.println("Ingrese el código del equipo: ");
                        String codigoequipo = sc.next();
                        inventario.prestarEquipo(codigoequipo, documentoaprendiz);
                    }catch (IllegalArgumentException e) {
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 5:
                    inventario.listarPrestamosActivos();
                    break;
                case 6:
                    try {
                        System.out.println("Ingrese el id del prestamo: ");
                        int idPrestamo = sc.nextInt();
                        inventario.devolverEquipo(idPrestamo);
                        break;
                    }catch (IllegalArgumentException e) {
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
            }
        }while (opcion != 7);

    }
}