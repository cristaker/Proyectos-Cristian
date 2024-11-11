package com.parameta.exceptions;

public class FechaVinculacionNulaException extends RuntimeException {
    public FechaVinculacionNulaException(String mensaje) {
        super(mensaje);
    }
}
