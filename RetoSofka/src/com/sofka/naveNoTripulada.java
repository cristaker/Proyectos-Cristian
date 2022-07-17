package com.sofka;

public class naveNoTripulada extends NavesEspaciales {

    private int capacidadDeObjetos;

    public naveNoTripulada(String marca, int capacidadDeObjetos) {
        super(marca);
        this.capacidadDeObjetos = capacidadDeObjetos;
    }

    @Override
    public String toString() {
        return "\nNAVE NO TRIPULADA: \n" +
                "\nCapacidad de objetos=" + capacidadDeObjetos;
    }
}
