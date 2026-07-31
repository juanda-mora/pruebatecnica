package com.example.Services;

import java.util.ArrayList;

import com.example.Entitites.Productos;

public class ProductoService {
    
    private ArrayList<Productos> productos;

    public ProductoService() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto) {
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

    public ArrayList<Productos> obtenerTodosLosProductos() {
        return productos;
    }
}
