package edu.upc.dsa;

import java.util.LinkedList;
import java.util.List;

public class Order {

    List<Product> pedidos;
    String user;

    public Order() {
        this.pedidos = new LinkedList<>();
    }

    public Order(List<Product> pedidos, String user) {
        this.pedidos = pedidos;
        this.user = user;
    }
    public void addProduct (int cantidad, String nombreProducto){
        this.pedidos.add(new Product(cantidad,nombreProducto));
    }

    public List<Product> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Product> pedidos) {
        this.pedidos = pedidos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
