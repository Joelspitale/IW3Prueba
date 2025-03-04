package ar.edu.iua.iw3.business;

import ar.edu.iua.iw3.business.Excepciones.NegocioExcepcion;
import ar.edu.iua.iw3.modelo.Producto;
import ar.edu.iua.iw3.persistencia.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoNegocio implements IProductoNegocio {
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listado() throws NegocioExcepcion {
        //manejo cualquier error que puede ocurrir con mi excepcion
        try {
            return productoRepository.findAll();
        } catch (Exception e) {
            throw new NegocioExcepcion();
        }
    }
}
