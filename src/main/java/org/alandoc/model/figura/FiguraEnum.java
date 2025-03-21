package org.alandoc.model.figura;

public enum FiguraEnum {
    CUADRADO(1),
    EQUILATERO(2),
    ISOSCELES(3),
    ESCALENO(4),
    RECTANGULO(5),
    PENTAGONO(6),
    HEXAGONO(7),
    CIRCULO(8),
    SALIR(9),
    OPCION_ERRONEA(10);
    private Integer tipo;
    
    FiguraEnum(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public static FiguraEnum getFiguraEnumById( Integer id ){
        switch ( id ) {
            case 1:
                return CUADRADO;
            case 2:
                return EQUILATERO;
            case 3:
                return ISOSCELES;
            case 4:
                return ESCALENO;
            case 5:
                return RECTANGULO;
            case 6:
                return PENTAGONO;
            case 7:
                return HEXAGONO;
            case 8:
                return CIRCULO;
            case 9:
                return SALIR;
            case 10:
            default:
                return OPCION_ERRONEA;
        }
    }
}
