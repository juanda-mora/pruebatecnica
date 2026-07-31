package com.example.Services;

import java.util.ArrayList;

import com.example.Entitites.Productos;

public class ProductoService {
    
    private ArrayList<Productos> productos;

    public ProductoService() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto) {
    if (producto.getPrecio() < 0) {
        throw new IllegalArgumentException("El precio no puede ser negativo");
    }

    productos.add(producto);
}

    public void eliminarProducto(int idProducto) {
        productos.removeIf(producto -> producto.getIdProducto() == idProducto);
    }

    public Productos buscarProducto(int idProducto) {
        for (Productos producto : productos) {
            if (producto.getIdProducto() == idProducto) {
                return producto;
            }
        }
        return null; 
    }

    public boolean actualizarProducto(Productos productoActualizado) {

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

    public ArrayList<Productos> obtenerTodosLosProductos() {
        return productos;
    }
}
