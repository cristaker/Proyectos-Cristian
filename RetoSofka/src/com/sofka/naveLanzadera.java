package com.sofka;

public class naveLanzadera extends NavesEspaciales {

    private String Destino;

    public naveLanzadera(String marca, String destino) {
        super(marca);
        Destino = destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getDestino() {
        return Destino;
    }

    @Override
    public String toString() {
        return "NAVE LANZADERA: \n" +
                "\nDestino='" + Destino + '\'' +
                '}';
    }
}
