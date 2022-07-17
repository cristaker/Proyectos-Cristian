public class FuncionesOB {

    public static void main(String[] args) {
        precioMasIva();
    }
    public static void precioMasIva(){
        double precio=1500;
        double precioConIva = (precio*0.57);
        System.out.println(precioConIva);
    }
}
