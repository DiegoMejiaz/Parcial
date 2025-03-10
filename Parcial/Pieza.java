package Parcial;

public class Pieza {
    private String id;
    private String nombre;
    private String marca;
    private String modelo;
    private double precioCompra;
    private double precioVenta;
    private String tipo;
    private int unidadesExistencia;
    private String descripcion;

    public Pieza(String id, String nombre, String marca, String modelo, double precioCompra, double precioVenta, String tipo, int unidadesExistencia, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.tipo = tipo;
        this.unidadesExistencia = unidadesExistencia;
        this.descripcion = descripcion;
    }

    // apartado de los gets y sets
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPrecioCompra() { return precioCompra; }
    public void setPrecioCompra(double precioCompra) { this.precioCompra = precioCompra; }

    public double getPrecioVenta() { return precioVenta; }
    public void setPrecioVenta(double precioVenta) { this.precioVenta = precioVenta; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getUnidadesExistencia() { return unidadesExistencia; }
    public void setUnidadesExistencia(int unidadesExistencia) { this.unidadesExistencia = unidadesExistencia; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "Pieza =\n" +
            "\tid=" + id + ",\n" +
            "\tnombre=" + nombre + ",\n" +
            "\tmarca=" + marca + ",\n" +
            "\tmodelo=" + modelo + ",\n" +
            "\tprecioCompra=" + precioCompra + ",\n" +
            "\tprecioVenta=" + precioVenta + ",\n" +
            "\ttipo=" + tipo + ",\n" +
            "\tunidadesExistencia=" + unidadesExistencia + ",\n" +
            "\tdescripcion=" + descripcion + "\n" +
            "---";
    }
}