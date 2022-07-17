package poo;

public class SmartWatch extends SmartDevice {

    boolean seSumerge;
    double tamaño;

    public SmartWatch(boolean seSumerge, double tamaño) {
        this.seSumerge = seSumerge;
        this.tamaño = tamaño;
    }

    public SmartWatch(String marca, double peso, boolean seSumerge, double tamaño) {
        super(marca, peso);
        this.seSumerge = seSumerge;
        this.tamaño = tamaño;
    }
}
