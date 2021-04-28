package edu.upc.dsa;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class ProductManagerImpl implements ProductManager{

    HashMap<String, User> users;  //Elección de la estructura de datos
    Queue<Order> pendingOrders;
    List<Product> productList;
    private static ProductManagerImpl product;
    List<Product> ordenes;

    public ProductManagerImpl ()
    {
        this.productList = new LinkedList<>();
        this.users = new HashMap<String, User>();
        this.pendingOrders = new LinkedList<>();
        this.ordenes = new LinkedList<>();
    }

    @Override
    public List<Product> getProductByPrize()
    {
        Collections.sort(this.productList, new Comparator <Product>()
                {
            @Override
            public int compare(Product o1, Product o2)
            {
                return Double.compare(o1.precio, o2.precio);
            }

                 }
        );
        return this.productList;

    }
    public static ProductManagerImpl getInstance() //Singletone, entrada a la instancia
    {
        if (product == null) product = new ProductManagerImpl();
        return product;
    }

    public static void delete()
    {
        product = null;
    } //Lo necesitamos para el Singletone


    @Override
    public void newOrder(Order o) {
        this.pendingOrders.add(o); //Añadir el pedido de un cliente

    }

    @Override
    public Order processOrder() { //Servir el pedido en orde ( poll --> el primero)

        Order first = this.pendingOrders.poll();
        //Process (first)
        return null;
    }

    @Override
    public List<Order> getOrderByUser(String idUser)
    {
        return null;
    }

    @Override
    public List<Product> getProductBySales() {
        return null;
    }

    @Override
    public void addProduct(String id, String description, double precio) {
        Product p = new Product (id, description, precio);
        this.productList.add(p);
    }

    public int sizeProducto()
    {
        int ret = this.productList.size();
        return ret;
    }
}
