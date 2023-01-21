package com.SuperMerqueo.Merqueo.DTO;

import com.SuperMerqueo.Merqueo.modelos.Carrito;

import java.util.Set;
import java.util.stream.Collectors;

public class CarritoDTO {

    private long id;

    private String nombreProductoAgregado;

    private int cantidadLlevada;


    private double precio;

    private double medida;

    private Set<ProductoDTO> productos;



    public CarritoDTO(Carrito carrito) {

        this.id = carrito.getId();

        this.nombreProductoAgregado = carrito.getNombreProductoAgregado();


        this.cantidadLlevada = carrito.getCantidadLlevada();


        this.precio = carrito.getPrecio();

        this.medida= carrito.getMedida();


        this.productos= carrito.getProductos().stream().map(ProductoDTO::new).collect(Collectors.toSet());

    }

    public long getId() {
        return id;
    }

    public String getNombreProductoAgregado() {
        return nombreProductoAgregado;
    }


    public int getCantidadLlevada() {
        return cantidadLlevada;
    }



    public double getPrecio() {
        return precio;
    }


}
