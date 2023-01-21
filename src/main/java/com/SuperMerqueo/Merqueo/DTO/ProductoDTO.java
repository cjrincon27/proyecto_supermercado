package com.SuperMerqueo.Merqueo.DTO;

import com.SuperMerqueo.Merqueo.modelos.Producto;


public class ProductoDTO {

    private long id;

    private String nombre;

    private String descripcion;

    private double precio;

    private int stock;

    private String urlImg;

    private double medida;

    private String departamento;

    private String seccion;




    public ProductoDTO(Producto producto) {

        this.id = producto.getId();

        this.nombre = producto.getNombre();

        this.descripcion = producto.getDescripcion();

        this.precio = producto.getPrecio();

        this.stock = producto.getStock();

        this.urlImg = producto.getUrlImg();

        this.medida = producto.getMedida();

        this.departamento = producto.getDepartamento();

        this.seccion = producto.getSeccion();


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
