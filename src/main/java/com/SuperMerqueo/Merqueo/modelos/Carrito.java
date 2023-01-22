package com.SuperMerqueo.Merqueo.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy = "carrito")
    private Set<Producto> productos = new HashSet<>();



    private String nombreProductoAgregado;


    private int cantidadLlevada;


    private double precio;

    private double medida;



    public Carrito(){}

    public Carrito(String nombreProductoAgregado, int cantidadLlevada, double precio, double medida) {
        this.nombreProductoAgregado = nombreProductoAgregado;
        this.cantidadLlevada = cantidadLlevada;
        this.precio = precio;
        this.medida= medida;


    }

    public long getId() {
        return id;
    }


    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public String getNombreProductoAgregado() {
        return nombreProductoAgregado;
    }

    public void setNombreProductoAgregado(String nombreProductoAgregado) {
        this.nombreProductoAgregado = nombreProductoAgregado;
    }


    public int getCantidadLlevada() {
        return cantidadLlevada;
    }

    public void setCantidadLlevada(int cantidadLlevada) {
        this.cantidadLlevada = cantidadLlevada;
    }



    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }
}
