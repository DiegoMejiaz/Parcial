package Parcial;

public class Opcion {
    private String nombre;
    private String descripcion;
    private double precio;

    public Opcion(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // el apartado de los gets y sets
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Opcion =\n" +
            "\tnombre=" + nombre + ",\n" +
            "\tdescripcion=" + descripcion + ",\n" +
            "\tprecio=" + precio + "\n" +
            "---";
    }
}