package com.sofka;

public class naveTripulada extends NavesEspaciales {

    private int capacidadDePersonas;

    public naveTripulada(String marca, int capacidadDePersonas) {
        super(marca);
        this.capacidadDePersonas = capacidadDePersonas;
    }

    @Override
    public String toString() {
        return "\nNAVE TRIPULADA: \n" +
                "\nCapacidad de personas=" + capacidadDePersonas;
    }
}
