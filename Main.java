
package centralpacientes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaPacientes central = new ListaPacientes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CENTRAL DE PACIENTES ---");
            System.out.println("1. Agregar paciente");
            System.out.println("2. Buscar paciente por ID");
            System.out.println("3. Eliminar paciente por ID");
            System.out.println("4. Mostrar lista completa");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Clínica: ");
                    String clinica = scanner.nextLine();
                    
                    central.agregar(new Paciente(id, nombre, edad, clinica));
                    System.out.println("Paciente agregado con éxito.");
                    break;

                case 2:
                    System.out.print("ID a buscar: ");
                    String idBuscar = scanner.nextLine();
                    Paciente encontrado = central.buscar(idBuscar);
                    if (encontrado != null) {
                        System.out.println("\nPaciente encontrado:\n" + encontrado);
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("ID a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    if (central.eliminar(idEliminar)) {
                        System.out.println("Paciente eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró ningún paciente con ese ID.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- PACIENTES REGISTRADOS ---");
                    central.mostrarLista();
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        
        scanner.close();
    }
}
