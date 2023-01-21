package com.SuperMerqueo.Merqueo.repositorios;

import com.SuperMerqueo.Merqueo.modelos.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductosRepositorio extends JpaRepository<Productos, Long> {
    Productos findByNombre (String nombre);
}
