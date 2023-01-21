package com.SuperMerqueo.Merqueo.modelos;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String primerNombre;
    private String apellido;
    private String email;
    private String contraseña;

    public Cliente(){

    }

    public Cliente( String primerNombre, String apellido, String email, String contraseña) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.email = email;
        this.contraseña = contraseña;
    }

    public long getId() {
        return id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
