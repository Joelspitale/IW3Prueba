package ar.edu.iua.iw3.web;

import ar.edu.iua.iw3.business.Excepciones.NegocioExcepcion;
import ar.edu.iua.iw3.business.IProductoNegocio;
import ar.edu.iua.iw3.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoRestController {
    @Autowired
    private  IProductoNegocio productoNegocio;
    @GetMapping(value = "/productos")
    public ResponseEntity<List<Producto>> listado() {
        try {
            return new ResponseEntity<List<Producto>>(productoNegocio.listado(), HttpStatus.OK);
        } catch (NegocioExcepcion e) {
            return new ResponseEntity<List<Producto>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    };
}
