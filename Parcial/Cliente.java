package Parcial;

public class Cliente {
    private String nombre;
    private String id;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String id, String direccion, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // apartado de los gets y sets
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getid() { return id; }
    public void setid(String id) { this.id = id; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    @Override
    public String toString() {
        return "Cliente \n" +
            "\tnombre=" + nombre + "\n" +
            "\tID=" + id + "\n" +
            "\tdireccion=" + direccion + "\n" +
            "\ttelefono=" + telefono + "\n" +
            "---";
    }
}
