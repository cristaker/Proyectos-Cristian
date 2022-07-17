package com.sofka;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<NavesEspaciales> Naves = new ArrayList<NavesEspaciales>();
    static Scanner Leer = new Scanner(System.in);

    public static void main(String[] args) {

        crearNave();
        mos();

    }
  public static void crearNave(){
        char respuesta;
        int opcion;

        do {
            do {
                System.out.println("Que nave desea crear: ");
                System.out.println("1. Crear Nave Lanzadera");
                System.out.println("2. Crear Nave No Tripulada");
                System.out.println("3. Crear Nave Tripulada");
                System.out.println("opcion: ");
                opcion = Leer.nextInt();
            }while (opcion<1 || opcion>3);

            switch (opcion){
                case 1: crearNaveLanzadera(); //crear nave lanzadera
                    break;
                case 2: crearNaveNoTripulada(); // crear nave no tripulada
                    break;
                case 3: crearNaveTripulada(); // crear nave tripulada
                    break;
            }

            System.out.println("Desea crear una nueva nave espacial (s/n):");
            respuesta = Leer.next().charAt(0);
            System.out.println("");

        }while (respuesta=='s' || respuesta=='S');
  }

  public static void crearNaveLanzadera(){
        int cho;

        do {
            System.out.println("Que nave lanzadera desea crear: ");
            System.out.println("1. Falcon IX");
            System.out.println("2. Delta IV");
            System.out.println("3. Atlas V");
            System.out.println("Opcion: ");
            cho = Leer.nextInt();


        }while(cho<1 || cho>3);

        switch (cho){
            case 1:
                String destino;
                String paisFabricante;

                System.out.println("Ingrese el destino de la nave");
                destino = Leer.nextLine();

                naveLanzadera navelanzadera = new naveLanzadera("Toyota", destino);
                Naves.add(navelanzadera);
                break;

        }

  }

    public static void crearNaveNoTripulada(){
        int capacidadObjetos=0;

        System.out.println("Ingrese la cantidad de objetos que quiere que lleve la nave");
        capacidadObjetos = Leer.nextInt();

        naveNoTripulada navenotripulada = new naveNoTripulada("audi", capacidadObjetos);
        Naves.add(navenotripulada);
    }

    public static void crearNaveTripulada(){
        int capacidadPersonas=0;

        System.out.println("Ingrese la cantidad de personas que quiere que lleve la nave");
        capacidadPersonas = Leer.nextInt();

        naveTripulada navetripulada = new naveTripulada("vodka", capacidadPersonas);
        Naves.add(navetripulada);
    }

    public static void mos(){
        for (int i=0; i<Naves.size();i++){
            System.out.println(Naves.get(i));
        }
    }
}

