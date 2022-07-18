package interfaces;

public class coche {

    String marca;
    String placa;

    public coche() {
    }

    public coche(String marca, String placa) {
        this.marca = marca;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "carro{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
