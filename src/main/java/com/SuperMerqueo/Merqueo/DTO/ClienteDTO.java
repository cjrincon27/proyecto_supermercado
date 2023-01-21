package com.SuperMerqueo.Merqueo.DTO;

import com.SuperMerqueo.Merqueo.modelos.Cliente;

import java.util.Set;
import java.util.stream.Collectors;

public class ClienteDTO {

    private long id;
    private String primerNombre;
    private String apellido;
    private String email;



    public ClienteDTO(Cliente cliente) {

        this.id = cliente.getId();

        this.primerNombre = cliente.getPrimerNombre();

        this.apellido = cliente.getApellido();

        this.email = cliente.getEmail();

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
}
