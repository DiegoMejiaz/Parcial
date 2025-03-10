package Parcial;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String cilindrada;
    private double precio;

    public Vehiculo(String marca, String modelo, String cilindrada, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    // Apartado de los gets y sets
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCilindrada() { return cilindrada; }
    public void setCilindrada(String cilindrada) { this.cilindrada = cilindrada; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Vehiculo =\n" +
            "\tmarca=" + marca + "\n" +
            "\tmodelo=" + modelo + "\n" +
            "\tcilindrada=" + cilindrada + "\n" +
            "\tprecio=" + precio + "\n" +
            "---";
    }
}