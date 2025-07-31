package com.gtc.pruebagtc.utils;

public enum MensajeRespuesta {
    ESTUDIANTE_CREADO("Estudiante creado"),
    ESTUDIANTE_ACTUALIZADO("Estudiante actualizado"),
    ESTUDIANTE_ELIMINADO("Estudiante eliminado"),
    LISTA_ESTUDIANTES("Lista de estudiantes");

    private final String mensaje;

    MensajeRespuesta(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}

