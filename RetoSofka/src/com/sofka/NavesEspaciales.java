package com.sofka;

public abstract class NavesEspaciales {

    protected String Marca;

    public NavesEspaciales(String marca) {
        this.Marca = marca;
    }

    public String getMarca() {
        return Marca;
    }


    @Override
    public String toString() {
        return "Marca ='" + Marca + '\'';
    }
}
