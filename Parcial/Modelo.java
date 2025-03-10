package Parcial;

import java.util.List;

public class Modelo {
    private String nombre;
    private List<Opcion> opciones;

    public Modelo(String nombre, List<Opcion> opciones) {
        this.nombre = nombre;
        this.opciones = opciones;
    }

    // el apartado de los gets y Sets
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Opcion> getOpciones() { return opciones; }
    public void setOpciones(List<Opcion> opciones) { this.opciones = opciones; }

    @Override
    public String toString() {
        return "Modelo=" +
                "nombre=" + nombre + "\'" +
                ", opciones=" + opciones +
                "---";
    }
}
