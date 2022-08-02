package ec.ups.edu.Heladeria.entidades.peticiones.pedido;

import com.fasterxml.jackson.annotation.JsonProperty;
import ec.ups.edu.Heladeria.entidades.Detalle;

import java.util.List;

public class ActualizarPedido {

    @JsonProperty
    private long idPedido;
    @JsonProperty
    private long idCliente;
    @JsonProperty
    private double latitud;
    @JsonProperty
    private double longitud;
    @JsonProperty
    private String estado;
    @JsonProperty
    private double costoEnvio;
    @JsonProperty
    private List<Detalle> detalles;
    @JsonProperty
    private long idTarjeta;

    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    public long getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(long idTarjeta) {
        this.idTarjeta = idTarjeta;
    }
}
