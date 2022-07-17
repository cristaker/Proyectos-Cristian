public class FuncionesOB {

    public static void main(String[] args) {
        precioMasIva();
        multiply(5.7, 6.7);
    }
    public static void precioMasIva(){
        double precio=1500;
        double precioConIva = (precio*0.57);
        System.out.println(precioConIva);
    }

        public static double multiply(Double a, Double b) {
            double c=a*b;
            return c;
        }
    }
