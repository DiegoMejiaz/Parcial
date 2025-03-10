package Parcial;

import java.util.List;

public class PortalCliente {
    private Cliente cliente;
    private List<Mantenimiento> historialMantenimiento;

    public PortalCliente(Cliente cliente, List<Mantenimiento> historialMantenimiento) {
        this.cliente = cliente;
        this.historialMantenimiento = historialMantenimiento;
    }

    // el metodo para poder programar las citas y los pagos
    public void programarCita(Mantenimiento mantenimiento) {
        historialMantenimiento.add(mantenimiento);
    }

    public void realizarPago(double monto) {
        System.out.println("Pago realizado: $" + monto);
    }

    // 
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public List<Mantenimiento> getHistorialMantenimiento() { return historialMantenimiento; }
    public void setHistorialMantenimiento(List<Mantenimiento> historialMantenimiento) { this.historialMantenimiento = historialMantenimiento; }

    @Override
    public String toString() {
        return "PortalCliente =\n" +
            "\tcliente=" + cliente + ",\n" +
            "\thistorialMantenimiento=" + historialMantenimiento + "\n" +
            "---";
    }
}
