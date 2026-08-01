package com.example.services;

import java.util.ArrayList;

import com.example.entitites.Producto;

public class ProductoService {

    private ArrayList<Producto> productos;

    public ProductoService() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
    if (producto.getPrecio() < 0) {
        throw new IllegalArgumentException("El precio no puede ser negativo");
    }

    productos.add(producto);
}

    public void eliminarProducto(int idProducto) {
        productos.removeIf(producto -> producto.getIdProducto() == idProducto);
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

    if (productoActualizado.getPrecio() < 0) {
        throw new IllegalArgumentException("El precio no puede ser negativo");
    }

    for (int i = 0; i < productos.size(); i++) {
        if (productos.get(i).getIdProducto() == productoActualizado.getIdProducto()) {
            productos.set(i, productoActualizado);
            return true;
        }
    }

    return false;
}


    public ArrayList<Producto> obtenerTodosLosProductos() {
        return productos;
    }
}
