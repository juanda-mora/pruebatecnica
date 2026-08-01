package com.example;

import java.util.Scanner;

import com.example.Entitites.Productos;
import com.example.services.ProductoService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProductoService servicio = new ProductoService();

        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE PRODUCTOS ---");
            System.out.println("1. Crear producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Actualizar producto");
            System.out.println("5. Eliminar producto");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n--- CREAR PRODUCTO ---");

                    System.out.print("ID del producto: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Precio del producto: ");
                    double precio = scanner.nextDouble();

                    System.out.print("Stock del producto: ");
                    int stock = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Categoría del producto: ");
                    String categoria = scanner.nextLine();

                    try {
                        Productos nuevoProducto = new Productos(
                                id,
                                nombre,
                                precio,
                                stock,
                                categoria
                        );

                        servicio.agregarProducto(nuevoProducto);
                        System.out.println("Producto creado correctamente.");

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PRODUCTOS ---");

                    if (servicio.obtenerTodosLosProductos().isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        for (Productos producto : servicio.obtenerTodosLosProductos()) {
                            System.out.println(producto);
                        }
                    }

                    break;

                case 3:
                    System.out.println("\n--- BUSCAR PRODUCTO ---");

                    System.out.print("Ingrese el ID del producto: ");
                    int idBuscar = scanner.nextInt();

                    Productos encontrado = servicio.buscarProducto(idBuscar);

                    if (encontrado != null) {
                        System.out.println("Producto encontrado:");
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }

                    break;

                case 4:
                    System.out.println("\n--- ACTUALIZAR PRODUCTO ---");

                    System.out.print("ID del producto a actualizar: ");
                    int idActualizar = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();

                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();

                    System.out.print("Nuevo stock: ");
                    int nuevoStock = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Nueva categoría: ");
                    String nuevaCategoria = scanner.nextLine();

                    try {

                        Productos productoActualizado = new Productos(
                                idActualizar,
                                nuevoNombre,
                                nuevoPrecio,
                                nuevoStock,
                                nuevaCategoria
                        );

                        boolean actualizado = servicio.actualizarProducto(productoActualizado);

                        if (actualizado) {
                            System.out.println("Producto actualizado correctamente.");
                        } else {
                            System.out.println("No existe un producto con ese ID.");
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 5:
                    System.out.println("\n--- ELIMINAR PRODUCTO ---");

                    System.out.print("Ingrese el ID del producto: ");
                    int idEliminar = scanner.nextInt();

                    servicio.eliminarProducto(idEliminar);

                    System.out.println("Proceso de eliminación completado.");

                    break;

                case 6:
                    System.out.println("Cerrando sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);
        scanner.close();
    }
}
