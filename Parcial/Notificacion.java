package Parcial;

import java.util.Date;

public class Notificacion {
    private Cliente cliente;
    private String mensaje;
    private Date fechaNotificacion;

    public Notificacion(Cliente cliente, String mensaje, Date fechaNotificacion) {
        this.cliente = cliente;
        this.mensaje = mensaje;
        this.fechaNotificacion = fechaNotificacion;
    }

    // apartado de los gets y sets
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public Date getFechaNotificacion() { return fechaNotificacion; }
    public void setFechaNotificacion(Date fechaNotificacion) { this.fechaNotificacion = fechaNotificacion; }

    @Override
    public String toString() {
        return "Notificacion =" +
                "cliente=" + cliente +
                ", mensaje='" + mensaje + "\'" +
                ", fechaNotificacion=" + fechaNotificacion +
                "---";
    }
}
