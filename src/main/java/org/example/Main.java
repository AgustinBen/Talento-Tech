package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        int opcionUsuario;

        do {
            System.out.println("""
              Menu principal:
                1) Registrar producto
                2) Mostrar productos
                3) Buscar/Actualizar producto
                4) Eliminar producto
                5) Crear un pedido
                6) Listar pedidos
                7) Salir
              
              Elija una opción:
              """);
            opcionUsuario = entrada.nextInt();

            switch (opcionUsuario){
                case 1 -> agregarProducto(productos);
                case 2 -> listarProductos(productos);
                case 3 -> buscarProducto(productos);
                case 4 -> eliminarProducto(productos);
                case 5 -> System.out.println("Crear un pedido...");
                case 6 -> System.out.println("Listar pedidos...");
                case 7 -> System.out.println("Gracias por usar la app!");
                default -> System.out.println("Opcion incorrecta");
            }
        }while (opcionUsuario != 7);
    }

    private static void eliminarProducto(ArrayList<Producto> productos) {
        System.out.println("Eliminar producto...");
        if (productos.isEmpty()) {
            System.out.println("No hay productos para eliminar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del producto a eliminar: ");
        int idEliminar = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == idEliminar) {
                productos.remove(i);
                encontrado = true;
                System.out.println("Producto eliminado correctamente.");
                break;
            }
        }
    }

    /*private static void buscarProducto(ArrayList<Producto> productos) {
        System.out.println("Buscar/Actualizar producto...");
        System.out.println("Buscar/Actualizar producto...");

        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nOpciones de búsqueda:");
        System.out.println("1. Buscar por ID");
        System.out.println("2. Buscar por nombre");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        switch(opcion) {
            case 1:
                System.out.print("Ingrese ID del producto: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                for(Producto p : productos) {
                    if(p.getId() == id) {
                        mostrarDetallesProducto(p);
                        return;
                    }
                }
                System.out.println("Producto no encontrado.");
                break;

            case 2:
                System.out.print("Ingrese nombre del producto: ");
                String nombre = scanner.nextLine();

                for(Producto p : productos) {
                    if(p.getNombre().equalsIgnoreCase(nombre)) {
                        mostrarDetallesProducto(p);
                        return;
                    }
                }
                System.out.println("Producto no encontrado.");
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }*/
    private static void mostrarDetallesProducto(Producto producto) {
        System.out.println("\nDetalles del producto:");
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock() + " unidades");
    }

    private static void listarProductos(ArrayList<Producto> productos) {
        if (productos.isEmpty()){
            System.out.println("No hay productos :(");
        }else {
            for (Producto producto : productos){
                System.out.println("--------------------------------");
                producto.mostrarInfo();
                System.out.println("--------------------------------");
            }
        }
    }

    public static void agregarProducto(ArrayList<Producto> productos){
        Scanner entrada = new Scanner(System.in);
        System.out.println("    --Menu para agregar un producto-- \n");
        System.out.printf("Ingrese el nombre del producto: ");
        String nombre = entrada.nextLine();
        System.out.printf("Ingrese el precio de %s: ", nombre);
        double precio = entrada.nextDouble();
        System.out.printf("Ingrese el stock de %s: ", nombre);
        int stock = entrada.nextInt();
        Producto producto = new Producto(nombre, precio, stock);

        productos.add(producto);

        System.out.println("\n  Producto cargado exitosamente!!  \n");
    }

}