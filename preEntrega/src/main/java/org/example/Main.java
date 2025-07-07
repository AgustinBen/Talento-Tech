package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcionUsuario;

        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("""
                Menu principal:
                  1) Agregar producto
                  2) Listar productos
                  3) Buscar/Actualizar producto
                  4) Eliminar producto
                  5) Crear un pedido
                  6) Listar pedidos
                  7) Salir
                
                Elija una opción:
                """);
            opcionUsuario = entrada.nextInt();

            switch (opcionUsuario) {
                case 1 -> Menu.agregarProducto();
                case 2 -> Menu.listarProducto();
                case 3 -> Menu.buscarProducto();
                case 4 -> Menu.eliminarProducto();
                case 5 -> Menu.buscarProducto();
                case 6 -> Menu.listarPedido();
                case 7 -> System.out.println("Gracias por usar la app!");
                default -> System.out.println("Opcion incorrecta \n");
            }
        }while(opcionUsuario != 7);

    }
}