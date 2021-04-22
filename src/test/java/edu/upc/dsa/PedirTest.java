package edu.upc.dsa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PedirTest {
    @Before

    public void SetUp ()
    {
        ProductManagerImpl.getInstance().addProduct("café", "frío", 3);
        ProductManagerImpl.getInstance().addProduct("café", "caliente", 2);
        ProductManagerImpl.getInstance().addProduct("café", "cortado", 5);
    }

    @Test
    public void CrearProducto() //Singletone creado
    {
        ProductManagerImpl.getInstance().addProduct("cocacola", "fría", 10);
        assertEquals(4, ProductManagerImpl.getInstance().sizeProducto());

    }
    @Test
    public void CrarOrden()
    {
        Order order = new Order();
        order.setUser("Cristian");

        order.addProduct(4,"fanta");
        order.addProduct(2, "cocacola");
        ProductManagerImpl.getInstance().newOrder(order);
        ProductManagerImpl.getInstance().processOrder();
    }

    @After
    public void tearDown()
    {
        ProductManagerImpl.delete();
    }

}
