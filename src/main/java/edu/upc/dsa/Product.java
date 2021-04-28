package edu.upc.dsa;

public class Product {
    double precio;
    String id;
    String description;
    int cantidad;
    String name;
    String pedido;


    public Product(int cantidad, String name) {
        this.cantidad = cantidad;
        this.name = name;
    }

    public Product(String id, String description, double precio) {
        this.id = this.id;
        this.description = this.description;
        this.precio = this.precio;
    }

    public String toString () {
        return id + " " + description + " " + precio;
    }

    public void setPedido(String pedido)
    { 
        this.pedido = pedido;
    }

    public String getpedido () { return pedido; }

}
