
package org.example;

import org.example.entidades.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class ProductoController {


    @Autowired
    public Producto productoRepository;

    public ProductoController(Producto productoRepository) {
        this.productoRepository = productoRepository;
    }
    //http://localhost:8080/alumno/crear
    @GetMapping(value = "producto/crear")
    public ResponseEntity<?> crearProducto() {
        Producto nuevoProducto = new Producto(
                "Alimento",
                "Lays",
                234415
        );

    return new ResponseEntity<>(productoRepository.save(nuevoProducto));
    }
}



