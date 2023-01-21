package com.SuperMerqueo.Merqueo.controladores;
import com.SuperMerqueo.Merqueo.DTO.ProductosDTO;
import com.SuperMerqueo.Merqueo.modelos.Productos;
import com.SuperMerqueo.Merqueo.repositorios.ProductosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ProductosControlador {

    @Autowired
    ProductosRepositorio productosRepositorio;

    @GetMapping("/productos")
    public List<ProductosDTO> getClients() {
        return productosRepositorio.findAll().stream().map(ProductosDTO::new).collect(Collectors.toList());
    }


    @PostMapping("/productos")
    public ResponseEntity<Object> agregarProducto(@RequestParam String nombre, @RequestParam String descripcion, @RequestParam double precio, @RequestParam int stock, @RequestParam String urlImg, @RequestParam double medida, @RequestParam String departamento, @RequestParam String seccion) {
        Productos producto = new Productos(nombre, descripcion, precio, stock, urlImg, medida, departamento, seccion);
        productosRepositorio.save(producto);

        return new ResponseEntity<>("'" + nombre + "'" + " fué agregado con éxito!", HttpStatus.CREATED);
    }

    @DeleteMapping("/productos/{id}")
    public ResponseEntity<Object> eliminarProducto(@PathVariable long id) {
        Productos producto = productosRepositorio.findById(id).orElse(null);
        productosRepositorio.deleteById(id);

        return new ResponseEntity<>("'" + producto.getNombre() + "'" + " fué eliminado con éxito!", HttpStatus.OK);
    }

    @GetMapping("/producto")
    public ResponseEntity<Object> buscarProducto(@RequestParam String nombre) {
        Productos producto = productosRepositorio.findByNombre(nombre);
        if (producto == null) {
            return new ResponseEntity<>("No se encontraron productos", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(producto, HttpStatus.OK);
    }


}
