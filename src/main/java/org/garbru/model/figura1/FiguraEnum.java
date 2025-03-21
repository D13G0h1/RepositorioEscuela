package org.garbru.model.figura1;

public enum FiguraEnum
{
    CUADRADO(1),
    EQUILATERO(2),
    ISOSCELES(3),
    ESCALENO(4),
    RECTANGULO(5),
    ROMBIODE(6),
    ROMBO(7),
    TRAPECIO(8),
    SALIR(9),
    OPCION_ERRONEA(10);
    private Integer tipo;

    FiguraEnum(Integer tipo)    {this.tipo = tipo;    }

    public Integer getTipo()    {return tipo;    }

    public static FiguraEnum getFiguraEnumById( Integer id )    {
        switch( id )
        {
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
                return ROMBIODE;
            case 7:
                return ROMBO;
            case 8:
                return TRAPECIO;
            case 9:
                return SALIR;
            default:
                return OPCION_ERRONEA;
        }
    }
}
