package api.inventario.models;

public enum Estado {
    ACTIVO("A"),
    INACTIVO("I");

    private final String codigo;

    Estado(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}


