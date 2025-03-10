package Parcial;

import java.util.Date;

public class VehiculoUsado {
    private String marca;
    private String modelo;
    private String matricula;
    private double precioTasacion;
    private Date fechaEntrega;

    public VehiculoUsado(String marca, String modelo, String matricula, double precioTasacion, Date fechaEntrega) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precioTasacion = precioTasacion;
        this.fechaEntrega = fechaEntrega;
    }

    // apartado de los gets y sets
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public double getPrecioTasacion() { return precioTasacion; }
    public void setPrecioTasacion(double precioTasacion) { this.precioTasacion = precioTasacion; }

    public Date getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(Date fechaEntrega) { this.fechaEntrega = fechaEntrega; }

    @Override
    public String toString() {
        return "VehiculoUsado =\n" +
            "\tmarca=" + marca + ",\n" +
            "\tmodelo=" + modelo + ",\n" +
            "\tmatricula=" + matricula + ",\n" +
            "\tprecioTasacion=" + precioTasacion + ",\n" +
            "\tfechaEntrega=" + fechaEntrega + "\n" +
            "---";
    }
}
