package com.SuperMerqueo.Merqueo.repositorios;

import com.SuperMerqueo.Merqueo.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
    //Producto findByNombre (String nombre);
}
