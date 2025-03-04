package ar.edu.iua.iw3.business;

import ar.edu.iua.iw3.business.Excepciones.NegocioExcepcion;
import ar.edu.iua.iw3.modelo.Producto;

import java.util.List;

public interface IProductoNegocio {
    public List<Producto> listado() throws NegocioExcepcion;
}
