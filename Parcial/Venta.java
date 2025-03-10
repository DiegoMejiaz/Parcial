package Parcial;

import java.util.Date;
import java.util.List;

public class Venta {
    private Date fechaVenta;
    private String matriculaNuevoVehiculo;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private List<Opcion> opcionesSeleccionadas;
    private VehiculoUsado vehiculoUsado;

    public Venta(Date fechaVenta, String matriculaNuevoVehiculo, Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, List<Opcion> opcionesSeleccionadas, VehiculoUsado vehiculoUsado) {
        this.fechaVenta = fechaVenta;
        this.matriculaNuevoVehiculo = matriculaNuevoVehiculo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.opcionesSeleccionadas = opcionesSeleccionadas;
        this.vehiculoUsado = vehiculoUsado;
    }

    // apartado de los gets y sets
    public Date getFechaVenta() { return fechaVenta; }
    public void setFechaVenta(Date fechaVenta) { this.fechaVenta = fechaVenta; }

    public String getMatriculaNuevoVehiculo() { return matriculaNuevoVehiculo; }
    public void setMatriculaNuevoVehiculo(String matriculaNuevoVehiculo) { this.matriculaNuevoVehiculo = matriculaNuevoVehiculo; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Vendedor getVendedor() { return vendedor; }
    public void setVendedor(Vendedor vendedor) { this.vendedor = vendedor; }

    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    public List<Opcion> getOpcionesSeleccionadas() { return opcionesSeleccionadas; }
    public void setOpcionesSeleccionadas(List<Opcion> opcionesSeleccionadas) { this.opcionesSeleccionadas = opcionesSeleccionadas; }

    public VehiculoUsado getVehiculoUsado() { return vehiculoUsado; }
    public void setVehiculoUsado(VehiculoUsado vehiculoUsado) { this.vehiculoUsado = vehiculoUsado; }

    @Override
    public String toString() {
        return "Venta= \n" +
            "\tfechaVenta=" + fechaVenta + "\n" +
            "\tmatriculaNuevoVehiculo=" + matriculaNuevoVehiculo + "\n" +
            "\tcliente=" + cliente + "\n" +
            "\tvendedor=" + vendedor + "\n" +
            "\tvehiculo=" + vehiculo + "\n" +
            "\topcionesSeleccionadas=" + opcionesSeleccionadas + "\n" +
            "\tvehiculoUsado=" + vehiculoUsado + "\n" +
            "---";
    }
}