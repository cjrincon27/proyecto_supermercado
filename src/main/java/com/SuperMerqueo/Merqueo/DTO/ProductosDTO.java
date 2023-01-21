package com.SuperMerqueo.Merqueo.DTO;

import com.SuperMerqueo.Merqueo.modelos.Productos;

import javax.persistence.Entity;
import java.time.LocalDate;


public class ProductosDTO {

    private long id;

    private String nombre;

    private String descripcion;

    private double precio;

    private int stock;

    private String urlImg;

    private double medida;

    private String departamento;

    private String seccion;




    public ProductosDTO(Productos productos) {

        this.id = productos.getId();

        this.nombre = productos.getNombre();

        this.descripcion = productos.getDescripcion();

        this.precio = productos.getPrecio();

        this.stock = productos.getStock();

        this.urlImg = productos.getUrlImg();

        this.medida = productos.getMedida();

        this.departamento = productos.getDepartamento();

        this.seccion = productos.getSeccion();


    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public double getMedida() {
        return medida;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getSeccion() {
        return seccion;
    }
}
