package edu.upc.dsa.services;

import edu.upc.dsa.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("/json")
public class PedidoService {
    protected ArrayList<Object> pedidos;

    public PedidoService () {
        pedidos = new ArrayList<>();

        Product p1 = new Product("cafe", "blabla", 2);
        p1.setPedido("Primer pedido");
        pedidos.add(p1);

        Product p2 = new Product("cortado", "blabla", 5);
        p2.setPedido("Segundo pedido");
        pedidos.add(p2);

    }
    @GET
    @Path("/got/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getPedido(@PathParam("id") int id) {
        return (Product) pedidos.get(id);
    }
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getRealizarPedido() {
        Product product = new Product("cafe", "blabla", 2);;
        product.setPedido("blabla");
        return product;
    }


    @POST
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newProduct(Product product){
        pedidos.add(product);
        return Response.status(201).entity("Pedido añadido en la posición "+product).build();
    }
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createProduct(Product product){
        String result = "Producto guardado : " + product;
        return Response.status(201).entity(result).build();
    }

}
