package ec.ups.edu.Heladeria.entidades.peticiones.Factura;

import com.fasterxml.jackson.annotation.JsonProperty;
import ec.ups.edu.Heladeria.entidades.Pedido;
import javax.persistence.OneToOne;

import java.util.Date;

public class CreaFactura {

    private double total;
    @JsonProperty
    private Date fecha;
    @JsonProperty
    private double subtotal;
    @JsonProperty
    private double iva;
    @JsonProperty
        private long numpedido;
    @JsonProperty
    private long numtargeta;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public long getNumpedido() {
        return numpedido;
    }

    public void setNumpedido(long numpedido) {
        this.numpedido = numpedido;
    }

    public long getNumtargeta() {
        return numtargeta;
    }

    public void setNumtargeta(long numtargeta) {
        this.numtargeta = numtargeta;
    }
}
