package com.example.services;

import java.util.ArrayList;

import com.example.entities.Producto;

public class ProductoService {

    private ArrayList<Producto> productos;

    public ProductoService() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {

        for (Producto p : productos) {
            if (p.getIdProducto() == producto.getIdProducto()) {
                throw new IllegalArgumentException("Ya existe un producto con ese ID.");
            }
        }

        productos.add(producto);
    }

    public Producto buscarProducto(int idProducto) {

        for (Producto producto : productos) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }

        return null;
    }

    public boolean actualizarProducto(Producto productoActualizado) {

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getIdProducto() == productoActualizado.getIdProducto()) {

                productos.set(i, productoActualizado);
                return true;
            }
        }

        return false;
    }

    public boolean eliminarProducto(int idProducto) {

        Producto producto = buscarProducto(idProducto);

        if (producto != null) {
            productos.remove(producto);
            return true;
        }

        return false;
    }

    public ArrayList<Producto> obtenerTodosLosProductos() {
        return productos;
    }

}