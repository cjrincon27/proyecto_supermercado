package com.SuperMerqueo.Merqueo.controladores;


import com.SuperMerqueo.Merqueo.DTO.CarritoDTO;
import com.SuperMerqueo.Merqueo.repositorios.CarritoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CarritoControlador {

    @Autowired
    CarritoRepositorio carritoRepositorio;

    @GetMapping("/carrito")
    public List<CarritoDTO> Obtenercarrito(){
        return carritoRepositorio.findAll().stream().map(CarritoDTO::new).collect(Collectors.toList());
    }

}
