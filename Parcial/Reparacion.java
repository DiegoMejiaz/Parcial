package Parcial;

import java.util.List;

public class Reparacion {
    private String descripcion;
    private List<Pieza> piezasReemplazadas;

    public Reparacion(String descripcion, List<Pieza> piezasReemplazadas) {
        this.descripcion = descripcion;
        this.piezasReemplazadas = piezasReemplazadas;
    }

    // apartado de los gets y sets
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public List<Pieza> getPiezasReemplazadas() { return piezasReemplazadas; }
    public void setPiezasReemplazadas(List<Pieza> piezasReemplazadas) { this.piezasReemplazadas = piezasReemplazadas; }

    @Override
    public String toString() {
        return "Reparacion =\n" +
            "\tdescripcion=" + descripcion + ",\n" +
            "\tpiezasReemplazadas=" + piezasReemplazadas + "\n" +
            "---";
    }
}