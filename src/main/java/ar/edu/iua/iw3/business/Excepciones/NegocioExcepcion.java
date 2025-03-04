package ar.edu.iua.iw3.business.Excepciones;

public class NegocioExcepcion extends Exception {
   private static final long serialVersionUID = 1L;
    public NegocioExcepcion() {

    }
    public NegocioExcepcion(String message) {
        super(message);
    }

    public NegocioExcepcion(Throwable cause) {
        super(cause);
    }

    public NegocioExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public NegocioExcepcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
