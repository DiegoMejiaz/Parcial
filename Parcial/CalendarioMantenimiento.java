package Parcial;

import java.util.List;

public class CalendarioMantenimiento {
    private Vehiculo vehiculo;
    private List<Mantenimiento> mantenimientosProgramados;

    public CalendarioMantenimiento(Vehiculo vehiculo, List<Mantenimiento> mantenimientosProgramados) {
        this.vehiculo = vehiculo;
        this.mantenimientosProgramados = mantenimientosProgramados;
    }

    // apartado de los gets y sets
    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    public List<Mantenimiento> getMantenimientosProgramados() { return mantenimientosProgramados; }
    public void setMantenimientosProgramados(List<Mantenimiento> mantenimientosProgramados) { this.mantenimientosProgramados = mantenimientosProgramados; }

    @Override
    public String toString() {
        return "CalendarioMantenimiento =\n" +
            "\tvehiculo=" + vehiculo + ",\n" +
            "\tmantenimientosProgramados=" + mantenimientosProgramados + "\n" +
            "---";
    }
}