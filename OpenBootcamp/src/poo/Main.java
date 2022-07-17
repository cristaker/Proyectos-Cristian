package poo;

public class Main {

    public static void main(String[] args) {
        mostrarSmartPhone();
        mostrarSmartWatch();
    }

    public static void mostrarSmartPhone(){

        SmartPhone smarthphone = new SmartPhone("Samsung", 4.5, 2.5, true);
        System.out.println("La marca es: "+smarthphone.marca);
        System.out.println("El peso es: "+smarthphone.peso+" Gramos");
        System.out.println("La duracion de la bateria es: "+smarthphone.DuracionBateria+" Horas");
        System.out.println("¿Trae cargador?"+smarthphone.cargador);

    }

    public static void mostrarSmartWatch(){
        SmartWatch smartwatch = new SmartWatch("Apple", 4.5, true, 6);

        System.out.println("\nLa marca es: "+smartwatch.marca);
        System.out.println("El peso es: "+smartwatch.peso+" Gramos");
        System.out.println("¿Se sumerge bajo el agua? "+smartwatch.seSumerge);
        System.out.println("El tamaño es: "+smartwatch.tamaño);

    }
}
