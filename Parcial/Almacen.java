package Parcial;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Pieza> piezas;

    public Almacen() {
        this.piezas = new ArrayList<>();
    }

    // los metodos para poder agregar y retirar piezas
    public void agregarPieza(Pieza pieza) {
        piezas.add(pieza);
    }

    public void retirarPieza(Pieza pieza) {
        piezas.remove(pieza);
    }

    // apartado de los gets y sets
    public List<Pieza> getPiezas() { return piezas; }
    public void setPiezas(List<Pieza> piezas) { this.piezas = piezas; }

    @Override
    public String toString() {
        return "Almacen =\n" +
            "\tpiezas=" + piezas + "\n" +
            "---";
    }
}