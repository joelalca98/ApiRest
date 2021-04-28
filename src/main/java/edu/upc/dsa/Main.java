package edu.upc.dsa;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main (String [] args){
        System.out.println("Hola");
        ProductManager pm = new ProductManagerImpl();
        pm.addProduct("Cafe", "cortado",2);
        pm.addProduct("Cafe con Leche", "muy caliente",1);
        pm.addProduct("Coca-Cola", "muy fria",3);

        List<Product> lista = pm.getProductByPrize();
        System.out.println(Arrays.asList(lista.toArray()));
    }
}
