package com.example.Entitites;

public class Productos {

    //Construcción de la Calse Productos la cual contendra los atributos, constructor, getters y setter propios de la Clase.

    private int idProducto;
    private double precio;
    private int stock;
    private String categoria;

    public Productos(int idProducto, double precio, int stock, String categoria) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


}
