package com.SuperMerqueo.Merqueo.repositorios;

import com.SuperMerqueo.Merqueo.modelos.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarritoRepositorio extends JpaRepository<Carrito, Long> {

}
