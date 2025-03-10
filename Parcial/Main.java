package Parcial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bienvenida al concesionario
        System.out.println("¡Bienvenido a la Concesionaria de automoviles AUTOLUXURY!");
        System.out.println("Por favor, registrese para continuar.");

        // Registro del cliente
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su ID: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese su direccion: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese su telefono: ");
        String telefono = scanner.nextLine();

        // Crear el cliente
        Cliente cliente = new Cliente(nombre, dni, direccion, telefono);
        System.out.println("\n¡Registro exitoso, " + cliente.getNombre() + "!");

        // Mostrar catálogo de vehiculos
        System.out.println("\nCatalogo de vehiculos disponibles:");
        Vehiculo vehiculo1 = new Vehiculo("Koenigsegg", "Jesko", "5.1L", 35000000);
        Vehiculo vehiculo2 = new Vehiculo("Bugatti", "Chiron SS", "5.0L", 4500000);

        System.out.println("1. " + vehiculo1);
        System.out.println("2. " + vehiculo2);

        // Eleccion del vehiculos
        System.out.print("\nSeleccione el vehiculo que desea comprar (1 o 2): ");
        int opcionVehiculo = scanner.nextInt();
        scanner.nextLine();

        Vehiculo vehiculoSeleccionado = null;
        if (opcionVehiculo == 1) {
            vehiculoSeleccionado = vehiculo1;
        } else if (opcionVehiculo == 2) {
            vehiculoSeleccionado = vehiculo2;
        } else {
            System.out.println("opcion no valida. Saliendo del programa.");
            return;
        }

        System.out.println("\nHa seleccionado el vehiculov: " + vehiculoSeleccionado);

        // Opciones adicionales
        List<Opcion> opciones = new ArrayList<>();
        System.out.println("\nOpciones adicionales disponibles:");
        System.out.println("1. Aire Acondicionado - $1500");
        System.out.println("2. Pintura Metalizada - $1000");
        System.out.println("3. No deseo opciones adicionales");

        System.out.print("Seleccione una opcion (1, 2 o 3): ");
        int opcionAdicional = scanner.nextInt();
        scanner.nextLine();

        if (opcionAdicional == 1) {
            opciones.add(new Opcion("Aire Acondicionado", "Incluye aire acondicionado", 1500.0));
        } else if (opcionAdicional == 2) {
            opciones.add(new Opcion("Pintura Metalizada", "Pintura especial metalizada", 1000.0));
        } else if (opcionAdicional != 3) {
            System.out.println("opcion no valida. No se agregaran opciones adicionales.");
        }

        // Registrar vehiculos usado como parte de pago solo si el usuario lo desea
        System.out.print("\n¿Desea entregar un vehiculos usado como parte de pago? (s/n): ");
        String respuesta = scanner.nextLine();

        VehiculoUsado vehiculoUsado = null;
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese la marca del vehiculos usado: ");
            String marcaUsado = scanner.nextLine();

            System.out.print("Ingrese el modelo del vehiculos usado: ");
            String modeloUsado = scanner.nextLine();

            System.out.print("Ingrese la matricula del vehiculos usado: ");
            String matriculaUsado = scanner.nextLine();

            System.out.print("Ingrese el precio de tasacion del vehiculos usado: ");
            double precioTasacion = scanner.nextDouble();
            scanner.nextLine();

            vehiculoUsado = new VehiculoUsado(marcaUsado, modeloUsado, matriculaUsado, precioTasacion, new Date());
        }

        // Registrar la venta
        Vendedor vendedor = new Vendedor("Diego Mejia", "001", "Avenida 4 vientos", "3107175943");
        Venta venta = new Venta(new Date(), "XYZ789", cliente, vendedor, vehiculoSeleccionado, opciones, vehiculoUsado);

        // Muestra el resumen de la venta
        System.out.println("\n¡Gracias por su compra! Este es el resumen de su venta:");
        System.out.println(venta);

        scanner.close();
    }
}