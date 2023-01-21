package com.SuperMerqueo.Merqueo.controladores;

import com.SuperMerqueo.Merqueo.DTO.ClienteDTO;
import com.SuperMerqueo.Merqueo.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClienteControlador {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @GetMapping("/clientes")
    public List<ClienteDTO> getClients(){
        return clienteRepositorio.findAll().stream().map(ClienteDTO::new).collect(Collectors.toList());
    }

}
