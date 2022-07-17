package poo;

public class SmartPhone extends SmartDevice {

    double DuracionBateria;
    boolean cargador;

    public SmartPhone(double duracionBateria, boolean cargador) {
        DuracionBateria = duracionBateria;
        this.cargador = cargador;
    }

    public SmartPhone(String marca, double peso, double duracionBateria, boolean cargador) {
        super(marca, peso);
        DuracionBateria = duracionBateria;
        this.cargador = cargador;
    }
}
