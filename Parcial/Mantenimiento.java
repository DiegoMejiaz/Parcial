package Parcial;

import java.util.Date;
import java.util.List;

public class Mantenimiento {
    private Date fechaServicio;
    private String tipoMantenimiento;
    private String descripcion;
    private List<Reparacion> reparaciones;

    public Mantenimiento(Date fechaServicio, String tipoMantenimiento, String descripcion, List<Reparacion> reparaciones) {
        this.fechaServicio = fechaServicio;
        this.tipoMantenimiento = tipoMantenimiento;
        this.descripcion = descripcion;
        this.reparaciones = reparaciones;
    }

    // apartado de los gets y sets
    public Date getFechaServicio() { return fechaServicio; }
    public void setFechaServicio(Date fechaServicio) { this.fechaServicio = fechaServicio; }

    public String getTipoMantenimiento() { return tipoMantenimiento; }
    public void setTipoMantenimiento(String tipoMantenimiento) { this.tipoMantenimiento = tipoMantenimiento; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public List<Reparacion> getReparaciones() { return reparaciones; }
    public void setReparaciones(List<Reparacion> reparaciones) { this.reparaciones = reparaciones; }

    @Override
    public String toString() {
        return "Mantenimiento =\n" +
            "\tfechaServicio=" + fechaServicio + ",\n" +
            "\ttipoMantenimiento=" + tipoMantenimiento + ",\n" +
            "\tdescripcion=" + descripcion + ",\n" +
            "\treparaciones=" + reparaciones + "\n" +
            "---";
    }
}