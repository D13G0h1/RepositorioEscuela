package org.alandoc.model.figura;

import org.alandoc.vista.Consola;
import org.alandoc.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

public enum TipoEjecutable {
    CONSOLA(1, Consola.getInstance()),
    VENTANA(2, Ventana.getInstance()),
    HISTORIAL(3, null),
    SALIR(4, null),
    OPCION_ERRONEA(5, null);
    private Integer id;
    private Ejecutable ejecutable;

    TipoEjecutable(Integer id, Ejecutable ejecutable) {
        this.id = id;
        this.ejecutable = ejecutable;
    }

    public Integer getId() {
        return id;
    }

    public static TipoEjecutable getTipoEjecutableById(int opcion) {
        switch (opcion) {
            case 1:
                return CONSOLA;
            case 2:
                return VENTANA;
            case 3:
                return HISTORIAL;
            case 4:
                return SALIR;
                case 5:
            default:
                return OPCION_ERRONEA;
        }
    }

    public Ejecutable getEjecutable() {
        return ejecutable;
    }
}