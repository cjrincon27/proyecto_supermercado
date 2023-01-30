package com.SuperMerqueo.Merqueo.controladores;

import com.SuperMerqueo.Merqueo.DTO.CarritoDTO;
import com.SuperMerqueo.Merqueo.modelos.Carrito;
import com.SuperMerqueo.Merqueo.modelos.Producto;
import com.SuperMerqueo.Merqueo.DTO.ProductoDTO;
import com.SuperMerqueo.Merqueo.repositorios.CarritoRepositorio;
import com.SuperMerqueo.Merqueo.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ProductosControlador {

    @Autowired
    ProductoRepositorio productoRepositorio;

    @Autowired
    CarritoRepositorio carritoRepositorio;

    @GetMapping("/productos")
    public List<ProductoDTO> obtenerClientes() {

        return productoRepositorio.findAll().stream().map(ProductoDTO::new).collect(Collectors.toList());

    }

    @PostMapping("/productos")
    public ResponseEntity<Object> agregarProducto (@RequestBody Producto producto) {

        Producto productoAguardar = new Producto(producto.getNombre(), producto.getDescripcion(), producto.getPrecio(), producto.getStock(), producto.getUrlImg(), producto.getMedida(), producto.getDepartamento(), producto.getSeccion());
        productoRepositorio.save(productoAguardar);

        return new ResponseEntity<>("'" + producto.getNombre() + "'" + " fué agregado con éxito!", HttpStatus.CREATED);

    }

    @DeleteMapping("/productos/{id}")
    public ResponseEntity<Object> eliminarProducto (@PathVariable long id) {

        Producto producto = productoRepositorio.findById(id).orElse(null);
        productoRepositorio.deleteById(id);

        return new ResponseEntity<>("'" + producto.getNombre() + "'" + " fué eliminado con éxito!", HttpStatus.OK);

    }

    @GetMapping("/producto")
    public List<ProductoDTO> buscarPorNombre(@RequestParam String nombre) {

        return productoRepositorio.findAll().stream().filter(element -> element.getNombre().toLowerCase().contains(nombre.toLowerCase())).map(ProductoDTO::new).collect(Collectors.toList());

    }

    @GetMapping("/producto/departamento")
    public List<ProductoDTO> obtenerPorDepartamento (@RequestParam String nombreDepartamento) {

        return productoRepositorio.findAll().stream().filter(element -> element.getDepartamento().toLowerCase().contains(nombreDepartamento.toLowerCase())).map(ProductoDTO::new).collect(Collectors.toList());

    }

    @GetMapping("/producto/seccion")
    public List<ProductoDTO> obtenerPorSeccion (@RequestParam String nombreSeccion) {

        return productoRepositorio.findAll().stream().filter(element -> element.getSeccion().toLowerCase().contains(nombreSeccion.toLowerCase())).map(ProductoDTO::new).collect(Collectors.toList());

    }

    @PatchMapping("/compra/{id}")
    public ResponseEntity<Object> compraProducto(@PathVariable Long id, @RequestParam int cantidad) {
        Producto productos = productoRepositorio.findById(id).orElse(null);
        productos.setStock(productos.getStock() - cantidad);
        productoRepositorio.save(productos);

            Carrito carrito = new Carrito(productos.getNombre(), cantidad, productos.getPrecio(), productos.getMedida());
            carritoRepositorio.save(carrito);

        return new ResponseEntity<>("agregado a carrito con exito", HttpStatus.CREATED);

    }
}